import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	
	public static boolean dfs(final int N, int node, int parent, ArrayList<HashSet<Integer>> adj, boolean[] visited, LinkedList<Integer> line){
		visited[node] = true;
		
		for(final int next : adj.get(node)){
			if(next == parent){ continue; }
			if(visited[next]){ continue; }
			
			if(dfs(N, next, node, adj, visited, line)){
				line.add(node);
				return true;
			}
		}
		
		line.add(node);
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		try(Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			
			ArrayList<HashSet<Integer>> adj = new ArrayList<HashSet<Integer>>();
			for(int i = 0; i < N; i++){ adj.add(new HashSet<Integer>()); }
			
			int[] degrees = new int[N];
			for(int i = 0; i < M; i++){
				final int a = sc.nextInt() - 1;
				final int b = sc.nextInt() - 1;
				
				adj.get(a).add(b);
				adj.get(b).add(a);
				degrees[a]++;
				degrees[b]++;
			}
			
			int min_degree = Integer.MAX_VALUE;
			int min_index = -1;
			for(int i = 0; i < N; i++){
				if(min_degree > degrees[i]){
					min_degree = degrees[i];
					min_index = i;
				}
			}
			
			if(min_degree == 0){
				return;
			}else if(min_degree <= 2){
				LinkedList<Integer> list = new LinkedList<Integer>();
				dfs(N, min_index, -1, adj, new boolean[N], list);
				
				//System.out.println(list);
				
				boolean first = true;
				System.out.println(list.size());
				for(final int next : list){
					if(first){
						System.out.print((next + 1));
						first = false;
					}else{
						System.out.print(" " + (next + 1));
					}
				}
				System.out.println();
			}
		}
	}
	
	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;
 
		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}
 
		private void getLine() throws IOException {
			while (!hasNext()) {
				tok = new StringTokenizer(br.readLine());
			}
		}
 
		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}
 
		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
		
		public int[] nextIntArray(int n) throws IOException {
			final int[] ret = new int[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextInt();
			}
			return ret;
		}
		
		public long[] nextLongArray(int n) throws IOException {
			final long[] ret = new long[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextLong();
			}
			return ret;
		}
 
		public void close() throws IOException {
			br.close();
		}
	}
}