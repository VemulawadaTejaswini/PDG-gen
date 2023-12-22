import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A Thief (0-1 Knapsack problem)
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int c = 0;
		while (!(line = br.readLine()).equals("0")) {
			c++;
			int w = parseInt(line);
			int n = parseInt(br.readLine());

			int[] vs = new int[n + 1];
			int[] ws = new int[n + 1];

			for (int i = 1; i < n + 1; i++) {
				line = br.readLine();
				vs[i] = parseInt(line.substring(0, line.indexOf(',')));
				ws[i] = parseInt(line.substring(line.indexOf(',') + 1));
			}

			int[][] dp = new int[2][w + 1];
			for (int i = 1; i < n + 1; i++) {
				for (int j = ws[i]; j < w + 1; j++) {
					dp[0][j] = dp[1][j];
					dp[1][j] = Math.max(dp[0][j - ws[i]] + vs[i], dp[0][j]);
				}
			}

			int maxv = 0;
			int minw = w;
			for (int i = 1; i < w + 1; i++) {
				if (dp[1][i] > maxv) {
					maxv = dp[1][i];
					minw = i;
				}
			}
			System.out.print("Case " + c + ":\n" + maxv + "\n" + minw + "\n");
		}

	}

}