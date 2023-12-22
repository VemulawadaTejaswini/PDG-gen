import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static class UnionFind{
		int size;
		int[] dat;
		
		public UnionFind(int n){
			size = n;
			dat = new int[n];
			clear();
		}
		
		public int find(int x){
			if(dat[x] == x){
				return x;
			}else{
				return dat[x] = find(dat[x]);
			}
		}
		
		public void union(int x, int y){
			if(same(x, y)){
				return;
			}else{
				dat[find(y)] = find(x);
			}
		}
		
		public boolean same(int x, int y){
			return find(x) == find(y);
		}
		
		public final void clear(){
			for(int i = 0; i < size; i++){
				dat[i] = i;
			}
		}
	}
	
	public static class Edge implements Comparable<Edge>{
		int from, to, cost;
		
		public Edge(int from, int to, int cost){
			this.from = from;
			this.to = to;
			this.cost = cost;
		}

		@Override
		public int compareTo(Edge arg0) {
			return this.cost - arg0.cost;
		}		
	}

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			
			ArrayList<Edge> list = new ArrayList<Edge>();
			for(int i = 0; i < m; i++){
				list.add(new Edge(sc.nextInt() - 1, sc.nextInt() - 1, sc.nextInt()));
			}
			
			Collections.sort(list);
			
			UnionFind uf = new UnionFind(n);
			int min = Integer.MAX_VALUE;
			for(int start = 0; start < m; start++){
				uf.clear();
				
				int min_cost = Integer.MAX_VALUE, max_cost = Integer.MIN_VALUE;
				int count = 0;
				for(int cur = start; cur < m && count < n - 1; cur++){
					Edge edge = list.get(cur);
					
					//System.out.println(edge.from + " " + edge.to + " " + edge.cost + " " + uf.find(edge.from) + " " + uf.find(edge.to));
					
					if(!uf.same(edge.from, edge.to)){
						uf.union(edge.from, edge.to);
						count++;
						min_cost = Math.min(min_cost, edge.cost);
						max_cost = Math.max(max_cost, edge.cost);
					}
				}
				
				//System.out.println(min_cost + " " + max_cost);
				
				if(count == n - 1){
					min = Math.min(min, max_cost - min_cost);
				}
			}
			
			System.out.println(min == Integer.MAX_VALUE ? -1 : min);
		}
	}

}