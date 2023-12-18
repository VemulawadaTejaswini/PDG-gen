import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int W = sc.nextInt();
		long[] v = new long[n + 1];
		long[] w = new long[n + 1];
		int wake = 1;
		for (int i = 1; i <= n; i++) {
			v[i] = sc.nextLong();
			w[i] = sc.nextLong();
			if (v[i] > 1000) {
				wake = 1;
			}
			if (w[i] > 1000) {
				wake = 2;
			}
		}
		if (wake == 1) {
			long[][] dp = new long[n + 1][W + 1];
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j <= W; j++) {
					if (j - w[i] < 0) {
						dp[i][j] = dp[i - 1][j];
					} else {
						dp[i][j] = Math.max(dp[i - 1][j - (int) w[i]] + v[i], dp[i - 1][j]);
					}
				}
			}
			System.out.println(dp[n][W]);
		} else {
			long[][] dp = new long[n + 1][200001];
			for (int i = 0; i < n + 1; i++) {
				for (int j = 1; j < 200001; j++) {
					dp[i][j] = W + 1;
				}
			}
			for (int i = 1; i <= n; i++) {
				for (int j = (int)v[i]; j <= 200000; j++) {
					if (W - dp[i - 1][j - (int) v[i]] < w[i]) {
						dp[i][j] = dp[i - 1][j];
					} else {
						dp[i][j] = Math.min(dp[i - 1][j - (int) v[i]] + w[i], dp[i - 1][j]);
					}
				}
			}
			for (int i = 200000; i >= 0; i--) {
				if (dp[n][i] <= W) {
					System.out.println(i);
					break;
				}
			}
		}

	}
}