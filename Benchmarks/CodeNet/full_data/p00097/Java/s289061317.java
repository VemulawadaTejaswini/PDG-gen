import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Sum of Integers II
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		long[][][] dp = new long[101][10][1001];

		dp[0][0][0] = 1;
		dp[0][1][0] = 1;
		for (int i = 100; i > 0; i--) {
			for (int j = 1; j <= 9; j++) {
				for (int k = i; k <= 1000; k++) {
					dp[i][j][k] = dp[i - 1][j - 1][k - i] + dp[i - 1][j][k];
				}
			}
		}

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n, s;
			n = parseInt(line.substring(0, line.indexOf(' ')));
			s = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((n | s) == 0) break;

			System.out.println(dp[100][n][s]);

		} // end while
	} // end main
}