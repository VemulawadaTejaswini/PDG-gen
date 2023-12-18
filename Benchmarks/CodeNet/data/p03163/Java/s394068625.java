import java.util.Scanner;

/**
 * https://atcoder.jp/contests/dp/tasks/dp_d
 * Knapsack 1
 */
public class Main {
	public static void main(String...args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int w = sc.nextInt();
			int[] u = new int[n];
			long[] v = new long[n];
			for (int i = 0; i < n; i++) {
				u[i] = sc.nextInt();
				v[i] = sc.nextLong();
			}

			long[][] dp = new long[n+1][w+1];
			for (int i = 0; i < n; i++) {
				for (int j = 1; j <= w; j++) {
					dp[i+1][j] = maxdp(dp[i+1][j], dp[i][j]);
					if (u[i] <= j) {
						dp[i+1][j-u[i]] = maxdp(dp[i+1][j-u[i]], dp[i][j] + v[i]);
					}
				}
			}

			long max = Long.MIN_VALUE;
			for (int i = 0; i < n+1; i++) {
				for (int j = 0; j < w+1; j++) {
					if (max < dp[i][j]) {
						max = dp[i][j];
					}
				}
			}
			System.out.println(max);
		}
	}

	public static long maxdp(long a, long b) {
		if (a > b) return a;
		else return b;
	}
}
