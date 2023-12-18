import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		long[][] dp = new long[n][m + 1];

		for (int i = 0; i < n; i++) {
			long amount = sc.nextLong();
			if (i == 0) {
				dp[i][0] = amount;
			} else {
				dp[i][0] = dp[i - 1][0] + amount;
			}
			for (int j = 1; j < m + 1; j++) {
				if (i == 0) {
					dp[i][j] = (long)(amount / Math.pow(2, j));
				} else {
					long value = Long.MAX_VALUE;
					for (int k = 0; k <= j; k++) {
						long tmp = (j == k) ? dp[i - 1][k] + amount : dp[i - 1][k] + (long)(amount / Math.pow(2, j - k));
						if (tmp < value) {
							value = tmp;
						}
					}
					dp[i][j] = value;
				}
			}
		}

		System.out.println(dp[n - 1][m]);
	}

}