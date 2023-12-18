import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		long[][] dp = new long[n + 1][t + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= t; j++) {
				dp[i + 1][j] = dp[i][j];
				if (j > 0) dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i + 1][j - 1]);

				if (j - a[i] >= 0) {
					dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j - a[i]] + b[i]);
				}
			}
		}

		long answer = dp[n][t];
		answer = Math.max(answer, dp[n - 1][t] + b[n - 1]);
		System.out.println(answer);
	}
}
