import java.io.*;
import java.util.*;

class Main {
	static final int M = 1000000007;

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] a = new long[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextLong();
			}
		}

		int[][] dp = new int[n + 1][(1 << n)];
		dp[0][0] = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (1 << n); j++) {
				if (i != Integer.bitCount(j)) continue;
				for (int k = 0; k < n; k++) {
					if ((j & (1 << k)) == 1) continue;
					if (a[i][k] == 1) {
						dp[i + 1][j | (1 << k)] =
								(dp[i + 1][j | (1 << k)] + dp[i][j]) % M;
					}
				}
			}
		}

		System.out.println(dp[n][(1 << n) - 1]);
	}
}
