import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Lagrange's Four-Square Theorem
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		//2^15 = 32768
		//sqrt(32768) = 181.01...
		int[] vs = new int[182];
		int[][] dp = new int[32769][4];

		for (int i = 1; i < 182; i++) {
			vs[i] = i * i;
			dp[vs[i]][0] = 1;
		}

		for (int i = 181; i >= 1; i--) {
			for (int j = 1; j < 4; j++) {
				for (int k = vs[i]; k < 32769; k++) {
					if (dp[k][j - 1] > 0 && k + vs[i] < 32769) {
						dp[k + vs[i]][j] += dp[k][j - 1];
					}
				}
			}
		}

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			int sum = 0;
			for (int i = 0; i < 4; i++) {
				sum += dp[n][i];
			}
			System.out.println(sum);

		} //end while
	}//end main
}