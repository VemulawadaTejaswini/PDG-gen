import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0 && h == 0) break;
			long dp[][][] = new long[h][w][2];
			dp[0][0][0] = 1;
			dp[0][0][1] = 1;
			int i = 0;
			int j = 0;
			if(i + 1 < h) {
				dp[i+1][j][0] += dp[i][j][0];
			}
			if(j + 1 < w) {
				dp[i][j+1][1] += dp[i][j][1];
			}
			for(i = 0; i < h; i++) {
				for(j = 0; j < w; j++) {
					if(i == 0 && j == 0) continue;
					if(i+2 < h) {
						dp[i+2][j][0] += dp[i][j][1];
						dp[i+2][j][0] %= 100000;
					}
					if(j+2 < w) {
						dp[i][j+2][1] += dp[i][j][0];
						dp[i][j+2][1] %= 100000;
					}
					if(i + 1 < h) {
						dp[i+1][j][0] += dp[i][j][0];
						dp[i+1][j][0] %= 100000;
					}
					if(j + 1 < w) {
						dp[i][j+1][1] += dp[i][j][1];
						dp[i][j+1][1] %= 100000;
					}
				}
			}
			System.out.println((dp[h-1][w-1][0] + dp[h-1][w-1][1] + dp[h-2][w-1][1] + dp[h-1][w-2][0])%100000);
		}
	}
}