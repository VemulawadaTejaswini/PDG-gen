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
			long[][] dp = new long[N + 1][100001];
			for(int i = 0; i <= N; i++) {
				for(int j = 0; j <= 100000; j++) {
					dp[i][j] = W + 1;
				}
			}
			dp[0][0] = 0;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j <= 100000; j++) {
					if(dp[i][j] != W + 1) {
						dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j]);
						dp[i + 1][j + v[i]] = Math.min(dp[i][j] + (long)w[i], dp[i + 1][j + v[i]]);
					}
				}
			}
			long ans = 0;
			for(int i = 0; i <= 100000; i++) {
				if(dp[N][i] != W + 1) ans = Math.max(ans, i);
			}
			System.out.println(ans);
		}
	}
}
