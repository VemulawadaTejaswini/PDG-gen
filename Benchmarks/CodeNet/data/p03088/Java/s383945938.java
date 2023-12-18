import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		long[] dp = new long[n + 1];
		dp[0] = 1;
		dp[1] = 4;
		dp[2] = 16;
		dp[3] = 61;
		for (int i = 4; i <= n; i++) {
			// A, T
			dp[i] = getMod(dp[i - 1] * 2);
			// G
			dp[i] += getMod(dp[i - 1] - dp[i - 3]);
			// C
			dp[i] += getMod(dp[i - 1] - getMod(dp[i - 3] * 2) - getMod(dp[i - 4] * 2));
		}
		System.out.println(dp[n]);
	}

	static long getMod(long val) {
		int mod = 1000000007;
		while (val < 0) {
			val += mod;
		}
		return val % mod;
	}
}
