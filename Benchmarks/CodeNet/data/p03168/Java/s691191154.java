import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		double[] p = new double[n];
		sa = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			p[i] = Double.parseDouble(sa[i]);
		}
		br.close();

		double[][] dp = new double[n + 1][n + 1];
		dp[0][0] = 1;
		for (int i = 1; i <= n; i++) {
			double pi = p[i - 1];
			dp[i][0] = dp[i - 1][0] * (1 - pi);
			for (int j = 1; j <= i; j++) {
				dp[i][j] = dp[i - 1][j - 1] * pi
						+ dp[i - 1][j] * (1 - pi);
			}
		}

		double ans = 0;
		for (int i = n / 2 + 1; i <= n; i++) {
			ans += dp[n][i];
		}
		System.out.println(ans);
	}
}
