import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Sum of 4 Integers II
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int[][] dp = new int[4][4001];

		for (int i = 0; i <= 1000; i++) dp[0][i] = 1;

		for (int i = 1; i < 4; i++) {
			for (int j = 0; j <= 1000; j++) {
				for (int k = 4000; k >= 0; k--) {
					if (k - j >= 0) dp[i][k] += dp[i - 1][k - j];
				}
			}
		}

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			System.out.println(dp[3][parseInt(line)]);
		} // end while
	} // end main
}