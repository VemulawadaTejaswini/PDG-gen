import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			final int s = sc.nextInt() - 1;
			final int g1 = sc.nextInt() - 1;
			final int g2 = sc.nextInt() - 1;
			
			if(n == 0 && m == 0 && s == -1 && g1 == -1 && g2 == -1){
				break;
			}
			
			
			int[][] adj = new int[n][n];
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					if(i != j){
						adj[i][j] = Integer.MAX_VALUE / 4;
					}
				}
			}
			
			for(int i = 0; i < m; i++){
				final int b1 = sc.nextInt() - 1;
				final int b2 = sc.nextInt() - 1;
				final int c = sc.nextInt();
				
				adj[b1][b2] = c;
			}
			
			for(int k = 0; k < n; k++){
				for(int i = 0; i < n; i++){
					for(int j = 0; j < n; j++){
						adj[i][j] = Math.min(adj[i][j], adj[i][k] + adj[k][j]);
					}
				}
			}
			
			int min = Integer.MAX_VALUE;
			
			for(int k = 0; k < n; k++){
				final int s_cost = adj[s][k];
				final int g1_cost = adj[k][g1];
				final int g2_cost = adj[k][g2];
				
				min = Math.min(min, s_cost + g1_cost + g2_cost);
			}
			
			System.out.println(min);
		}
	}
}