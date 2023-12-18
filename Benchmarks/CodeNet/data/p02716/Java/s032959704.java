import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		long ans = Long.MIN_VALUE;
		if (n % 2 == 0) {
			long[] b0 = new long[n + 2];
			long[] b1 = new long[n + 2];
			for (int i = 0; i < n - 1; i+=2) {
				b0[i + 2] = b0[i] + a[i];
			}
			for (int i = 0; i < n - 1; i+=2) {
				b1[i + 2] = b1[i] + a[i + 1];
			}

			for (int i = 0; i < n; i++) {
				long val0 = b0[(i + 1) / 2 * 2] - b0[0];
				long val1 = b1[n] - b1[(i + 1) / 2 * 2];
				long val = val0 + val1;
				ans = Math.max(ans, val);
			}
		} else {
			long[][] dp = new long[n][3];
			dp[0][0] = a[0];
			dp[1][0] = a[0];
			dp[2][0] = a[0] + a[2];
			dp[1][1] = a[1];
			dp[2][1] = a[1];
			dp[2][2] = a[2];
			for (int i = 3; i < n; i++) {
				if (i % 2 == 0) {
					dp[i][0] = dp[i - 2][0] + a[i];
					dp[i][1] = dp[i - 1][1];
					dp[i][2] = Math.max(dp[i - 2][2], dp[i - 3][1]) + a[i];
				} else {
					dp[i][0] = dp[i - 1][0];
					dp[i][1] = Math.max(dp[i - 2][1], dp[i - 3][0]) + a[i];
					dp[i][2] = dp[i - 1][2];
				}
			}
//			for (int i = 0; i < dp.length; i++) {
//				for (int j = 0; j < dp[i].length; j++) {
//					System.out.print(dp[i][j] + "\t");
//				}
//				System.out.println();
//			}
			for (int i = 0; i < 3; i++) {
				ans = Math.max(ans, dp[n - 3 + i][i]);
			}
		}
		System.out.println(ans);
	}
}
