import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s = br.readLine().toCharArray();
		br.close();

		int mod = 1000000007;
		int n = s.length;
		long[][] dp = new long[n + 1][13];
		dp[0][0] = 1;
		for (int i = 0; i < n; i++) {
			if (s[i] == '?') {
				for (int j = 0; j < 13; j++) {
					for (int d = 0; d < 10; d++) {
						int next = (j * 10 + d) % 13;
						dp[i + 1][next] += dp[i][j];
						dp[i + 1][next] %= mod;
					}
				}
			} else {
				int d = s[i] - '0';
				for (int j = 0; j < 13; j++) {
					int next = (j * 10 + d) % 13;
					dp[i + 1][next] += dp[i][j];
					dp[i + 1][next] %= mod;
				}
			}
		}
		System.out.println(dp[n][5]);
	}
}
