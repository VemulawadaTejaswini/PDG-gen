import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * A First Grader
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line);

			int[] ns = new int[n - 1];
			int ans;
			long[][] dp = new long[n - 1][21];

			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n - 1; i++) {
				ns[i] = parseInt(st.nextToken());
			}
			ans = parseInt(st.nextToken());
			//
			dp[0][ns[0]] = 1;
			for (int i = 1; i < ns.length; i++) {
				for (int j = 0; j < 21; j++) {
					if (dp[i - 1][j] != 0) {
						int p, m;
						p = j + ns[i];
						m = j - ns[i];
						if (p <= 20) dp[i][p] = dp[i - 1][j] + 1;
						if (m >= 0 && m <= 20) dp[i][m] = dp[i - 1][j] + 1;
					}
				}
			}
			System.out.println(dp[n - 2][ans]);
		} //end while
	} //end main
}