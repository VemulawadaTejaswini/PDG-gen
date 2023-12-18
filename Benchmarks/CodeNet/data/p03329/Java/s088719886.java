import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		solve(N);
	}

	static void solve(int n) {
		int a = 1, b = 1;
		int ca = 0, cb = 0;
		while (a < n) {
			a *= 6;
			ca++;
		}
		while (b < n) {
			b *= 9;
			cb++;
		}

		int[][] dp = new int[1 + ca + cb + 1][n + 1];
		for (int i = 0; i < n + 1; i++) {
			dp[0][i] = i;
		}

		a = 6;
		for (int i = 1; i <= ca; i++) {
			for (int j = 0; j < n + 1; j++) {
				dp[i][j] = dp[i - 1][j];
				if (j >= a) {
					dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - a] + 1);
					dp[i][j] = Math.min(dp[i][j], dp[i][j - a] + 1);
				}
			}
			a *= 6;
		}

		b = 9;
		for (int i = ca + 1; i < dp.length; i++) {
			for (int j = 0; j < n + 1; j++) {
				dp[i][j] = dp[i - 1][j];
				if (j >= b) {
					dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - b] + 1);
					dp[i][j] = Math.min(dp[i][j], dp[i][j - b] + 1);
				}
			}
			b *= 9;
		}

		System.out.println(dp[dp.length - 1][n]);
	}
}
