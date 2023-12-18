import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		// A, T, G, C
		long[][] dp = new long[n + 1][4];
		dp[1] = new long[]{1, 1, 1, 1};
		dp[2] = new long[]{4, 4, 4, 4};
		dp[3] = new long[]{16, 16, 15, 14};
		for (int i = 4; i <= n; i++) {
			// A, T
			long sum = 0;
			for (int j = 0; j < 4; j++) {
				sum += dp[i - 1][j];
			}
			sum = getMod(sum);
			dp[i][0] = sum;
			dp[i][1] = sum;

			// G
			dp[i][2] = getMod(sum - dp[i - 2][0] + dp[i - 3][2]);

			// C
			dp[i][3] = getMod(sum - dp[i - 2][0] - dp[i - 2][2] - dp[i - 3][0] * 3);
		}

		long sum = 0;
		for (int j = 0; j < 4; j++) {
			sum += dp[n][j];
		}
		sum = getMod(sum);
		System.out.println(sum);
	}

	static long getMod(long val) {
		int mod = 1000000007;
		while (val < 0) {
			val += mod;
		}
		return val % mod;
	}
}
