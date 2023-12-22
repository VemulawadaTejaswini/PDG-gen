import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public static int dfs(final int n, int cur, int prev, int[][] adj, boolean do_back){	
		int count = 0;
		int sum_cost = 0;
		
		int max_adj = 0;
		int max_adj_pos = -1;
		int max_adj_cost = 0;
		
		for(int next = 0; next < n; next++){
			if(next != prev && adj[cur][next] > 0){
				final int cost = dfs(n, next, cur, adj, true) + adj[cur][next] * 2;
				sum_cost += cost;
				count++;
				
				if(cost > 0 && max_adj < adj[cur][next]){
					max_adj = adj[cur][next];
					max_adj_pos = next;
					max_adj_cost = cost;
				}
			}
		}
		
		if(max_adj_pos >= 0){
			sum_cost -= max_adj_cost;
			sum_cost += dfs(n, max_adj_pos, cur, adj, false) + adj[cur][max_adj_pos] * 2;
		}
		
		//System.out.println(cur + " " + prev + " " + sum_cost + " " + max_adj + " " + count);
		
		if(count == 0){
			return -2 * adj[prev][cur];
		}else{
			return sum_cost - (do_back ? 0 : max_adj);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			final int N = sc.nextInt();
			
			if(N == 0){
				break;
			}
			
			int[][] adj = new int[N][N];
			for(int i = 0; i < N - 1; i++){
				final int from = sc.nextInt() - 1;
				final int to = sc.nextInt() - 1;
				final int cost = sc.nextInt();
				
				adj[from][to] = adj[to][from] = cost;
			}
			
			System.out.println(dfs(N, 0, -1, adj, false));
			
		}
	}

}