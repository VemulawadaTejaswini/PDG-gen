import java.io.*;
import java.util.*;

class Main {
	private static long[] dp;
	private static long[] sum;

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] a = new long[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = sc.nextLong();

		dp = new long[(1 << n)];
		sum = new long[(1 << n)];
		for (int i = 0; i < (1 << n); i++) {
			for (int j = 0; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if ((((i >> j) & 1) == 1) && (((i >> k) & 1) == 1)) {
						sum[i] += a[j][k];
					}
				}
			}
		}
		Arrays.fill(dp, -1);
		for (int i = 0; i < n; i++) dp[(1 << i)] = 0;
		System.out.println(solve((1 << n) - 1));
	}

	private static long solve(int s) {
		if (dp[s] != -1) return dp[s];
		long a = 0;
		for (int t = s; t > 0; t &= s) {
			a = Math.max(a, sum[t] + solve(s - t));
			t--;
		}
		dp[s] = a;
		return dp[s];
	}
}
