import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static class Island implements Comparable<Island>{
		int island;
		int sink;
		
		public Island(int island, int sink) {
			super();
			this.island = island;
			this.sink = sink;
		}

		@Override
		public int compareTo(Island o) {
			return o.sink - this.sink;
		}
	}
	
	public static int prim(boolean[] treed, boolean[] sinked, int[] costs, final int N, int[][] adj){
		int sum = 0;
		
		while(true){
			Arrays.fill(costs, Integer.MAX_VALUE);
			
			for(int from = 0; from < N; from++){
				if(!treed[from]){
					continue;
				}
				
				for(int to = 0; to < N; to++){
					if(from == to){
						continue;
					}else if(treed[to]){
						continue;
					}else if(!sinked[to]){
						continue;
					}
					
					costs[to] = Math.min(costs[to], adj[from][to]);
				}
			}
			
			int min = Integer.MAX_VALUE;
			int min_pos = -1;
			for(int node = 0; node < N; node++){
				if(min > costs[node]){
					min = costs[node];
					min_pos = node;
				}
			}
			
			if(min_pos == -1){
				break;
			}else{
				treed[min_pos] = true;
				sum += min;
			}
		}
		
		for(int i = 0; i < N; i++){
			if(treed[i] != sinked[i]){
				return 0;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			
			if(N == 0 && M == 0){
				break;
			}
			
			PriorityQueue<Island> queue = new PriorityQueue<Main.Island>();
			for(int i = 0; i < N; i++){
				queue.add(new Island(i, sc.nextInt()));
			}
			
			int[][] adj = new int[N][N];
			for(int i = 0; i < N; i++){
				for(int j = 0; j < N; j++){
					adj[i][j] = Integer.MAX_VALUE;
				}
			}
			
			for(int i = 0; i < M; i++){
				final int a = sc.nextInt() - 1;
				final int b = sc.nextInt() - 1;
				final int c = sc.nextInt();
				
				adj[a][b] = adj[b][a] = c;
			}
			
			int cost = 0;
			boolean[] sinked = new boolean[N];
			boolean[] treed  = new boolean[N];
			int[] costs = new int[N];
			while(!queue.isEmpty()){
				int prev_time = -1;
				boolean first_time = true;
				
				
				while(!queue.isEmpty() && (prev_time == -1 || prev_time == queue.peek().sink)){
					final Island sink = queue.poll();
					sinked[sink.island] = true;
					prev_time = sink.sink;
					
					if(cost == 0 && first_time){
						first_time = false;
						treed[sink.island] = true;
					}
					
				}
				
				final int ret = prim(treed, sinked, costs, N, adj);
				//System.out.println(Arrays.toString(sinked) + " " + Arrays.toString(treed));
				
				if(ret == 0){
					Arrays.fill(treed, false);
					cost = 0;
				}else{
					cost += ret;
				}
			}
			
			System.out.println(cost);
		}
	}

}