import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static final int INF = Integer.MAX_VALUE / 2 - 1;
	public static final int M_MAX = 6;
	public static final int N_MAX = 100;
	public static final int MAX = M_MAX + N_MAX + 2;
	public static final int DP_MAX = M_MAX + 2;
	
	public static int node_num(int n, int m, String in){
		//System.out.println(in);
		
		if("H".equals(in)){
			return 0;
		}else if("D".equals(in)){
			return m + 1;
		}else{
			return Integer.parseInt(in.substring(1)) + (in.charAt(0) == 'L' ? m + 1 : 0);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] adj = new int[MAX][MAX];
		int[][] DP  = new int[1 << DP_MAX][DP_MAX];
		
		while(true){
			final int m = sc.nextInt();
			final int n = sc.nextInt();
			final int k = sc.nextInt();
			final int d = sc.nextInt();
			
			if(n == 0 && m == 0 && k == 0 && d == 0){
				break;
			}
			
			final int max    = n + m + 2; 
			final int home   = 0;
			final int arrive = m + 1;
			
			int[] cals = new int[m + 2];
			for(int i = 0; i < m; i++){
				cals[i + 1] = sc.nextInt();
			}
			
			for(int i = 0; i < max; i++){
				for(int j = 0; j < max; j++){
					adj[i][j] = i == j ? 0 : INF;
				}
			}
			
			for(int i = 0; i < d; i++){
				String in1 = sc.next();
				String in2 = sc.next();
				
				//System.out.println(in1 + " " + in2);
				
				final int from = node_num(n, m, in1);
				final int to   = node_num(n, m, in2);
				final int dist = sc.nextInt();
				
				adj[from][to] = adj[to][from] = dist * k;
			}
			
			for(int t = 0; t < max; t++){
				if(home < t && t < arrive){
					continue;
				}
				
				for(int i = 0; i < max; i++){
					for(int j = 0; j < max; j++){
						adj[i][j] = Math.min(adj[i][j], adj[i][t] + adj[t][j]);
					}
				}
			}
			/*
			for(int i = 0; i < max; i++){
				for(int j = 0; j < max; j++){
					System.out.print(adj[i][j] + " ");
				}
				System.out.println();
			}
			*/
			final int dp_size = m + 2;
			for(int S = 0; S < 1 << dp_size; S++){
				Arrays.fill(DP[S], INF);
			}
			
			DP[1][0] = 0;
			for(int S = 0; S < 1 << dp_size; S++){
				for(int node = 0; node < dp_size; node++){
					if(DP[S][node] >= INF){
						continue;
					}else if((S & (1 << node)) == 0){
						continue;
					}
					
					for(int next = 0; next < dp_size; next++){
						if((S & (1 << next)) != 0){
							continue;
						}
						
						final int next_S = S | (1 << next);
						
						final int cost = DP[S][node] + adj[node][next] - cals[next];
						
						DP[next_S][next] = Math.min(DP[next_S][next], cost);
					}
				}
			}
			/*
			for(int S = 0; S < 1 << dp_size; S++){
				System.out.println(Arrays.toString(DP[S]));
			}
			*/
			System.out.println(DP[(1 << dp_size) - 1][arrive]);
		}
	}
}