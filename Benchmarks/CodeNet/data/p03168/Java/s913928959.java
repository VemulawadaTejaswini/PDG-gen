import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		double p[] = new double[n];
		String str[] = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			p[i] = Double.parseDouble(str[i]);
		}

		double dp[][] = new double[3100][3100];
		dp[0][0] = 1.0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				dp[i + 1][j + 1] += dp[i][j] * p[i];
				dp[i + 1][j] += dp[i][j] * (1 - p[i]);
			}
		}

		double ans = 0.0;
		for (int i = (n + 1) / 2; i <= n; i++) {
			ans += dp[n][i];
		}

		System.out.println(ans);
	}
}
