import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] s = new int[n + 1];
		for (int i = 0; i < n; i++) {
			s[i + 1] = Integer.parseInt(sa[i]);
		}
		sa = br.readLine().split(" ");
		int[] t = new int[m + 1];
		for (int i = 0; i < m; i++) {
			t[i + 1] = Integer.parseInt(sa[i]);
		}
		br.close();

		long[][] dp = new long[n + 1][m + 1];
		long[][] sum = new long[n + 1][m + 1];
		dp[0][0] = 1;
		for (int i = 0; i <= n; i++) {
			sum[i][0] = 1;
		}
		for (int j = 0; j <= m; j++) {
			sum[0][j] = 1;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (s[i] == t[j]) {
					dp[i][j] = sum[i - 1][j - 1];
				}
				sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + dp[i][j];
				if (sum[i][j] < 0) {
					sum[i][j] += 1000000007;
				}
				sum[i][j] %= 1000000007;
			}
		}
		System.out.println(sum[n][m]);
	}
}
