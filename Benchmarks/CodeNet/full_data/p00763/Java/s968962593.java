import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static final int MAX_DIST = 20000;
	public static final int INF = Integer.MAX_VALUE / 2 - 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			final int c = sc.nextInt();
			final int s = sc.nextInt() - 1;
			final int g = sc.nextInt() - 1;
			
			if(n == 0){
				break;
			}
			
			int[][][] dists = new int[c][n][n];
			for(int i = 0; i < c; i++){
				for(int j = 0; j < n; j++){
					for(int k = 0; k < n; k++){
						dists[i][j][k] = INF;
					}
				}
			}
			
			for(int i = 0; i < m; i++){
				final int from = sc.nextInt() - 1;
				final int to = sc.nextInt() - 1;
				final int dist = sc.nextInt();
				final int company = sc.nextInt() - 1;
				//System.out.println(from + " " + to + " " + dist + " " + company);
				dists[company][from][to] = Math.min(dists[company][from][to], dist);
				dists[company][to][from] = Math.min(dists[company][to][from], dist);
			}
			
			for(int company = 0; company < c; company++){
				for(int i = 0; i < n; i++){
					for(int j = 0; j < n; j++){
						for(int k = 0; k < n; k++){
							dists[company][i][j] = Math.min(dists[company][i][j], dists[company][i][k] + dists[company][k][j]);
						}
					}
				}
			}
			
			int[] points = new int[c];
			for(int i = 0; i < c; i++){
				final int p = sc.nextInt();
				points[i] = p;
			}
			
			int[][] prices = new int[c][MAX_DIST];
			for(int company = 0; company < c; company++){
				final int p = points[company];
				
				int[] width = new int[p + 1];
				int[] price = new int[p];
				
				for(int j = 1; j < p; j++){
					width[j] = sc.nextInt();
				}
				width[p] = MAX_DIST + 1;
				
				for(int j = 0; j < p; j++){
					price[j] = sc.nextInt();
				}
				
				int cnt = 0;
				for(int dist = 1; dist < MAX_DIST; dist++){
					prices[company][dist] = prices[company][dist - 1] + price[cnt];
				
					if(dist == width[cnt + 1]){
						cnt++;
					}
				}
			}
			
			int[][] costs = new int[n][n];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					costs[i][j] = INF;
				}
			}
			
			for(int company = 0; company < c; company++){
				for(int i = 0; i < n; i++){
					for(int j = 0; j < n; j++){
						if(dists[company][i][j] < INF){
							costs[i][j] = Math.min(costs[i][j], prices[company][dists[company][i][j]]);
						}
					}
				}
			}
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					for(int k = 0; k < n; k++){
						costs[i][j] = Math.min(costs[i][j], costs[i][k] + costs[k][j]);
					}
				}
			}
			
			System.out.println(costs[s][g] >= INF ? -1 : costs[s][g]);
		}
		
		sc.close();
	}
}