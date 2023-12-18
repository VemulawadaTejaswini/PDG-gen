import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] h = new int[n + 1];
		for (int i = 0; i < n; i++) {
			h[i + 1] = Integer.parseInt(sa[i]);
		}
		br.close();

		long[][] dp = new long[n + 1][n - k + 1];
		for (int i = 1; i <= n; i++) {
			for (int i2 = 1; i2 <= n - k && i2 <= i; i2++) {
				if (i2 == 1) {
					dp[i][i2] = 10000000000000L;
					if (i - i2 <= k) {
						dp[i][i2] = h[i];
					}
				} else {
					long min = 10000000000000L;
					for (int j = i2 - 1; j < i; j++) {
						if (i - i2 <= k) {
							long val = dp[j][i2 - 1] + Math.max(h[i] - h[j], 0);
							min = Math.min(min, val);
						}
					}
					dp[i][i2] = min;
				}
			}
		}
		long ans = 10000000000000L;
		for (int i = n - k; i <= n; i++) {
			ans = Math.min(ans, dp[i][n - k]);
		}
		System.out.println(ans);
	}
}
