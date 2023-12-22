import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);

	public Main() {
		while (true) {
			int N = in.nextInt();
			int M = in.nextInt();
			if (N == 0 && M == 0) break;
			int[][] dp = new int[N+1][256];
			int[] c = new int[M];
			
			for (int i = 0; i < M; i++) {
				c[i] = in.nextInt();
			}
			
			for (int i = 0; i < dp.length; i++) 
				for (int j = 0; j < dp[i].length; j++) 
					dp[i][j] = Integer.MAX_VALUE;
			
			dp[0][128] = 0;
			
			for (int i = 0; i < N; i++) {
				int next = in.nextInt();
				for (int j = 0; j < 256; j++) {
					if (dp[i][j] != Integer.MAX_VALUE) {
						for (int k = 0; k < c.length; k++) {
							int dif = j + c[k];
							if (dif < 0) dif = 0;
							else if (dif >= 256) dif = 255;						
							int x = (next - dif) * (next - dif);
							dp[i+1][dif] = Math.min(dp[i+1][dif], dp[i][j] + x);
						}
					}
				}
			}
			
			int ans = Integer.MAX_VALUE;
			for (int i = 0; i < 256; i++) {
				ans = Math.min(ans, dp[N][i]);
			}
			System.out.println(ans);
			
		}
 	}
	
	public static void main(String[] args) {
		new Main();
	}
}