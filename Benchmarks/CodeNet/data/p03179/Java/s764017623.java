import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		sc.close();

		int mod = 1000000007;
		long[][] dp = new long[n][n];
		Arrays.fill(dp[0], 1L);
		for (int i = 0; i < n - 1; i++) {
			int end = n - i - 1;
			if (s[i] == '<') {
				long sum = dp[i][end];
				for (int j = end - 1; j >= 0; j--) {
					dp[i + 1][j] = sum;
					sum += dp[i][j];
					sum %= mod;
				}
			} else {
				long sum = 0;
				for (int j = 0; j < end; j++) {
					sum += dp[i][j];
					sum %= mod;
					dp[i + 1][j] = sum;
				}
			}
		}
		System.out.println(dp[n - 1][0]);
	}
}
