
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] w = new int[N + 1];
		long[] v = new long[N + 1];
		for (int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextLong();
		}

		// dp[i][j]:i番目までの荷物中から重さの合計がj以下になるような価値の最大値
		long[][] dp = new long[N + 1][W + 1];

		for (int i = 1; i < N; i++) {
			for (int j = 1; j <= W; j++) {
				if (j < w[i]) dp[i + 1][j] = dp[i][j];
				else dp[i + 1][j] = Math.max(dp[i][j], dp[i][j - w[i]] + v[i]);
			}
		}
		System.out.println(dp[N][W]);
	}
}
