import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

/**
 * Baby Tree
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n, m;
			n = parseInt(line.substring(0, line.indexOf(' ')));
			m = parseInt(line.substring(line.indexOf(' ') + 1));
			if (n == 0 && m == 0) break;

			double[][] vs = new double[n][n];
			double[][] dp = new double[m][n];

			for (int i = 0; i < n; i++) {
				String[] words = br.readLine().split(" ");
				for (int j = 0; j < n; j++) {
					vs[i][j] = parseDouble(words[j]);
				}
			}

			// solve
			Arrays.fill(dp[0], 1);

			for (int i = 1; i < m; i++) {
				for (int j = 0; j < n; j++) {
					for (int k = 0; k < n; k++) {
						dp[i][k] = Math.max(dp[i][k], dp[i - 1][j] * vs[j][k]);
					}
				}
			}

			double max = 0;
			for (int i = 0; i < n; i++) {
				max = Math.max(max, dp[m - 1][i]);
			}
			System.out.println(String.format("%.2f", max));

		} //ene while
	}//end main
}