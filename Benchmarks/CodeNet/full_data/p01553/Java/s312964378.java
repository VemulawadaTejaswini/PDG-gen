import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static final int MOD = 1000000007;

	public static void main(String[] args) {
		int N = sc.nextInt();
		long[][] dp = new long[N + 1][N + 1];
		dp[0][0] = 1;
		int idx = 0;
		for (int i = 0; i < N; ++i) {
			char v = sc.next().charAt(0);
			if (v == '-') continue;
			++idx;
			if (v == 'D') {
				for (int j = 0; j < idx; ++j) {
					dp[idx][j] += dp[idx - 1][j] * j % MOD;
					if (j > 0) dp[idx][j - 1] += dp[idx - 1][j] * j * j % MOD;
				}
			} else {
				for (int j = 0; j < idx; ++j) {
					dp[idx][j + 1] += dp[idx - 1][j];
					dp[idx][j] += dp[idx - 1][j] * j % MOD;
				}
			}
		}
		System.out.println(dp[idx][0] % MOD);
	}
}