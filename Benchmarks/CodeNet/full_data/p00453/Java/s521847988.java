import java.util.*;
import java.math.*;
import java.io.*;
 
class Main {
	static final int INF = 2 << 29;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;
			int[] K = new int[n+2];
			int[][] map1 = new int[n+2][];
			int[][] map2 = new int[n+2][];
			int[][][] dp = new int[n+2][][];
			int KMax = 0;
			for(int i = 0; i < n; i++) {
				K[i+1] = sc.nextInt();
				KMax = Math.max(K[i+1], KMax);
				map1[i+1] = new int[K[i+1]];
				map2[i+1] = new int[K[i+1]];
				for(int j = 0; j < K[i+1]; j++) {
					map2[i+1][j] = sc.nextInt();
					map1[i+1][j] = sc.nextInt();
				}
			}
			map1[0] = new int[KMax];
			map2[0] = new int[KMax];
			map1[n+1] = new int[KMax];
			map2[n+1] = new int[KMax];
			for(int i = 0; i < KMax; i++) {
				map2[0][i] = 0;
				map2[n+1][i] = 0;
				map1[0][i] = i+1;
				map1[n+1][i] = i+1;
			}
			K[0] = KMax;
			K[n+1] = KMax;
			for(int i = 0; i < n+2; i++) {
				dp[i] = new int[K[i]][m+1];
			}
			
			for(int i = 0; i < n+2; i++) {
				for(int j = 0;j < dp[i].length; j++) {
					Arrays.fill(dp[i][j], INF);
				}
			}
			for(int i = 0; i < dp[0].length; i++) {
				dp[0][i][m] = 0;
			}
			
			for(int i = 0; i < n+1; i++) {
				for(int j = 0; j < dp[i].length; j++) {
					for(int k = m; k >= 0; k--) {
						for(int l = 0; l < dp[i+1].length; l++) {
							if(i == 0 || i == n) {
								dp[i+1][l][k]   = Math.min(0 + dp[i][j][k],dp[i+1][l][k]);
							}
							else {
								dp[i+1][l][k]   = Math.min(dp[i+1][l][k], (map1[i][j] + map1[i+1][l])*Math.abs(map2[i][j] - map2[i+1][l]) + dp[i][j][k]);
							}
						}
						if(i != n && k != 0)
						for(int l = 0; l < dp[i+2].length; l++) {
							if(i == 0 || i == n-1) {
								dp[i+2][l][k-1]  = Math.min(0 + dp[i][j][k],dp[i+2][l][k-1]);
							}
							else {
								dp[i+2][l][k-1]  = Math.min(dp[i+2][l][k-1], (map1[i][j] + map1[i+2][l])*Math.abs(map2[i][j] - map2[i+2][l]) + dp[i][j][k]);
							}
						}
					}
				}
			}
			int max = dp[n+1][0][0];
			for(int i = 0; i < KMax; i++) {
				for(int j = m; j >= 0; j--) {
					max = Math.min(max, dp[n+1][i][j]);
				}
			}
			System.out.println(max);
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}
}
             
        