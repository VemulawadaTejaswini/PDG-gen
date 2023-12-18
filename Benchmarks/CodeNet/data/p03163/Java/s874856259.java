import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int N = sc.nextInt(), W = sc.nextInt();
			int[] v = new int[N], w = new int[N];
			for(int i = 0; i < N; i++) {
				w[i] = sc.nextInt();
				v[i] = sc.nextInt();
			}
			long[][] dp = new long[N + 1][W + 1];
			for(int i = 0; i <= N; i++) {
				for(int j = 0; j <= W; j++) {
					dp[i][j] = -1;
				}
			}
			dp[0][0] = 0;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j <= W; j++) {
					if(dp[i][j] != -1) {
						dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j]);
						if(j + w[i] <= W) {
							dp[i + 1][j + w[i]] = Math.max(dp[i][j] + (long)v[i], dp[i + 1][j + w[i]]);
						}
					}
				}
			}
			long ans = 0;
			for(int i = 0; i <= W; i++) ans = Math.max(ans, dp[N][i]);
			System.out.println(ans);
		}
	}
}
