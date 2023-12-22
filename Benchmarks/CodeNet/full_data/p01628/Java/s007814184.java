import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
 
 
public class Main{
	
	public static class Edge implements Comparable<Edge> {
		int fst, snd, hi;
		
		public Edge(int fst, int snd, int hi) {
			super();
			this.fst = fst;
			this.snd = snd;
			this.hi = hi;
		}

		@Override
		public int compareTo(Edge arg0) {
			return this.hi - arg0.hi;
		}
		
		@Override
		public String toString(){
			return this.fst + " " + this.snd + " " + this.hi;
		}
	}
	
	public static int[] result(ArrayList<Edge> edges, final int N, final int height){
		int[][] amida = new int[height][N];
		for(int i = 0; i < N; i++){
			amida[0][i] = i;
		}
		
		int prev = -1;
		for(Edge edge : edges){
			final int hi = edge.hi;
			final int fst = edge.fst;
			final int snd = edge.snd;
			
			if(prev == -1){
				prev = hi;
			}else if(prev != hi){
				for(int i = 0; i < N; i++){
					amida[hi][i] = amida[prev][i];
				}
				prev = hi;
			}
			
			int tmp = amida[hi][fst];
			amida[hi][fst] = amida[hi][snd];
    		amida[hi][snd] = tmp;
		}
		/*
		for(int i = 0; i < height; i++){
			System.out.println(Arrays.toString(amida[i]));
		}
		*/
		return amida[height-1];
	}
	
	
	public static boolean check(ArrayList<Edge> edges){
		int prev = -1;
		HashSet<Integer> set = new HashSet<Integer>();
		for(Edge edge : edges){
			if(prev == -1 || edge.hi != prev){
				//System.out.println(edge.hi);
				prev = edge.hi;
				set.clear();
			}
			
			//System.out.println(set + " " +  edge.fst + " " + edge.snd + "(:" + edge.hi);
			if(set.contains(edge.fst) || set.contains(edge.snd)){
				return false;
			}
			set.add(edge.fst);
			set.add(edge.snd);
		}
		
		return true;
	}
	
	public static ArrayList<Edge> normalize(ArrayList<Edge> edges){
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(Edge edge : edges){
			set.add(edge.hi);
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		for(Edge edge : edges){
			edge.hi = Collections.binarySearch(list, edge.hi);
		}
		
		return edges;
	}
	
	public static boolean is_correct(final int N, int[] result, int[] answer){
		for(int i = 0; i < N; i++){
			if(result[i] != answer[i]){
				return false;
			}
		}
		
		return true;
	}
	
	public static int get_height(ArrayList<Edge> edges){
		int max = Integer.MIN_VALUE;
		
		for(Edge edge : edges){
			max = Math.max(max, edge.hi);
		}
		
		return max + 1;
	}
	
	public static int dfs(final int deep, final int M, final int N, final int prev, ArrayList<Edge> edges, int[] answer){
		if(deep >= M){
			ArrayList<Edge> copy = new ArrayList<Main.Edge>(edges);
			Collections.sort(copy);
			
			if(!check(copy)){
				return M;
			}
			copy = normalize(copy);
			
			final int height = get_height(copy);
			if(!is_correct(N, result(copy, N, height), answer)){
				//System.out.println("NO");
				return M;
			}
			//System.out.println(copy + " : " + height);
			//System.out.println(Arrays.toString(answer) + " " + Arrays.toString(result(copy, N, height)));
			//System.out.println("OK");
			
			return height;
		}else{
			int min = M;
			
			for(int hi = 0; hi <= prev; hi++){
				edges.get(deep).hi = hi;
				min = Math.min(min, dfs(deep + 1, M, N, hi + 1, edges, answer));
			}
			
			return min;
		}
		
	}
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	final int N = sc.nextInt();
    	final int M = sc.nextInt();
    	
    	ArrayList<Edge> edges = new ArrayList<Edge>();
    	
    	for(int i = 0; i < M; i++){
    		final int fst = sc.nextInt() - 1;
    		final int snd = fst + 1;
    		
    		edges.add(new Edge(fst, snd, i));
    	}
    	
    	int[] answer = result(edges, N, M);
    	System.out.println(dfs(0, M, N, 0, edges, answer));
    }
     
}