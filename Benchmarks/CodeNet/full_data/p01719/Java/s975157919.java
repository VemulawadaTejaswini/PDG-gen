import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Invest Master
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int n, d, x;
		n = parseInt(st.nextToken());
		d = parseInt(st.nextToken());
		x = parseInt(st.nextToken());

		int[][] price = new int[d][n];

		for (int i = 0; i < d; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				price[i][j] = parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < d - 1; i++) {
			int[] dp = new int[x + 1];
			for (int j = 0; j <= x; j++) {
				dp[j] = j;
			}
			for (int j = 0; j < n; j++) {
				for (int k = 0; k <= x; k++) {
					if (k >= price[i][j]) {
						dp[k] = Math.max(dp[k], dp[k - price[i][j]] + price[i + 1][j]);
					}
				}
			}
			x = dp[x];
		}

		System.out.println(x);
	}
}