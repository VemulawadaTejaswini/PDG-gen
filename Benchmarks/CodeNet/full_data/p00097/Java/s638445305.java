import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Sum of Integers II - Accepted
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		long[][] dp = new long[10][1001];

		dp[0][0] = 1;
		dp[1][0] = 1;

		for (int i = 1; i <= 100; i++) {
			for (int j = 9; j >= 1; j--) {
				for (int k = i; k <= 1000; k++) {
					dp[j][k] += dp[j - 1][k - i];
				}
			}
		}

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n, s;
			n = parseInt(line.substring(0, line.indexOf(' ')));
			s = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((n | s) == 0) return;

			System.out.println(dp[n][s]);
		}
	}
}