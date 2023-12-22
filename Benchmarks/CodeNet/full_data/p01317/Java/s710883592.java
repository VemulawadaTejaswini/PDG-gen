import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static final int INF = Integer.MAX_VALUE / 2 - 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			System.gc();
			
			int[][] land_adj = new int[n][n];
			int[][] sea_adj = new int[n][n];
			
			for(int i = 0; i < n; i++){
				for(int j = i + 1; j < n; j++){
					land_adj[i][j] = land_adj[j][i] = INF;
					sea_adj[i][j] = sea_adj[j][i] = INF;
				}
			}
			
			for(int i = 0; i < m; i++){
				final int x = sc.nextInt() - 1;
				final int y = sc.nextInt() - 1;
				final int cost = sc.nextInt();
				final String str = sc.next();
				
				if("L".equals(str)){
					land_adj[x][y] = land_adj[y][x] = Math.min(land_adj[x][y], cost);
				}else{
					sea_adj[x][y] = sea_adj[y][x] = Math.min(sea_adj[x][y], cost);
				}
			}
			
			for(int k = 0; k < n; k++){
				for(int i = 0; i < n; i++){
					for(int j = 0; j < n; j++){
						land_adj[i][j] = Math.min(land_adj[i][j], land_adj[i][k] + land_adj[k][j] >= INF ? INF : (land_adj[i][k] + land_adj[k][j]));
						sea_adj[i][j] = Math.min(sea_adj[i][j], sea_adj[i][k] + sea_adj[k][j] >= INF ? INF : (sea_adj[i][k] + sea_adj[k][j]));
					}
				}
			}
			
			final int r = sc.nextInt();
			
			int[] purpos_place = new int[r];
			for(int i = 0; i < r; i++){
				purpos_place[i] = sc.nextInt() - 1;
			}
			
			int[][] time_dp  = new int[r][n];
			for(int i = 0; i < r; i++){
				for(int j = 0; j < n; j++){
					time_dp[i][j] = Integer.MAX_VALUE;;
				}
			}
			
			time_dp[0][purpos_place[0]] = 0;
			
			for(int pur = 1; pur < r; pur++){
				for(int boat_place = 0; boat_place < n; boat_place++){
					if(time_dp[pur-1][boat_place] == Integer.MAX_VALUE){
						continue;
					}
					
					for(int next_boat = 0; next_boat < n; next_boat++){
						final int move_to_boat = land_adj[purpos_place[pur-1]][boat_place];
						final int ride_boat = sea_adj[boat_place][next_boat];
						final int move_to_next = land_adj[next_boat][purpos_place[pur]];
						
						if(ride_boat >= INF){
							continue;
						}else if(move_to_next >= INF){
							continue;
						}
						
						//System.out.println(pur + " " + boat_place + " " + next_boat + " " + (time_dp[pur-1][boat_place] + move_to_boat + ride_boat + move_to_next));
						
						time_dp[pur][next_boat] = Math.min(time_dp[pur][next_boat],
								time_dp[pur-1][boat_place] + move_to_boat + ride_boat + move_to_next);
					}
					
					if(land_adj[purpos_place[pur-1]][purpos_place[pur]] < INF){
						time_dp[pur][boat_place] = Math.min(time_dp[pur][boat_place],
								time_dp[pur-1][boat_place] + land_adj[purpos_place[pur-1]][purpos_place[pur]]);
					}
					
				}
			}
			
			//for(int i = 0; i < r; i++){
			//	System.out.println(Arrays.toString(time_dp[i]));
			//}
			
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < n; i++){
				min = Math.min(min, time_dp[r-1][i]);
			}
			
			System.out.println(min);
		}

	}

}