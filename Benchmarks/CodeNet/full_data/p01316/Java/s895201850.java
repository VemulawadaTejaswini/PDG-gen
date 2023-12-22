import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static int INF = (int) 1e9;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0) {
				break;
			}
			int[] c = new int[m];
			for(int i=0;i<m;i++) {
				c[i] = sc.nextInt();
			}
			int[] x = new int[n];
			for(int i=0;i<n;i++) {
				x[i] = sc.nextInt();
			}
			int[][] dp = new int[n+1][256];
			for(int i=0;i<=n;i++) {
				Arrays.fill(dp[i], INF);
			}
			dp[0][128] = 0;
			for(int i=0;i<n;i++) {
				for(int j=0;j<256;j++) {
					if (dp[i][j] >= INF) {
						continue;
					}
					for(int k=0;k<m;k++) {
						int to = j + c[k];
						if (to < 0) {
							to = 0;
						}else if(to >= 256) {
							to = 255;
						}
						int diff = (x[i] - to) * (x[i] - to);
						dp[i+1][to] = Math.min(dp[i+1][to],dp[i][j] + diff);
					}
				}
			}
			int min = INF;
			for(int i=0;i<256;i++) {
				min = Math.min(min,dp[n][i]);
			}
			System.out.println(min);
		}
	}

}