import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * A New Plan of Aizu Ski Resort
 * PCK2009 ??????9
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int x, y;
			x = parseInt(line.substring(0, line.indexOf(' ')));
			y = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((x | y) == 0) break;

			int[][] course = new int[y][x];
			int[][] dp = new int[y][x];

			for (int i = 0; i < y; i++) {
				words = br.readLine().split(" ");
				for (int j = 0; j < words.length; j++) {
					course[i][j] = parseInt(words[j]);
				}
			}

			for (int i = 0; i < x; i++) {
				if (course[0][i] == 0) dp[0][i] = 1;
			}

			for (int i = 0; i < y; i++) {
				for (int j = 0; j < x; j++) {
					switch (course[i][j]) {
						case 0:
							if (i + 1 < y && j - 1 >= 0 && course[i + 1][j - 1] == 0) {
								dp[i + 1][j - 1] += dp[i][j];
							}
							if (i + 1 < y && course[i + 1][j] != 1) {
								dp[i + 1][j] += dp[i][j];
							}
							if (i + 1 < y && j + 1 < x && course[i + 1][j + 1] == 0) {
								dp[i + 1][j + 1] += dp[i][j];
							}
							break;
						case 1:
							break;
						case 2:
							if (i + 2 < y && course[i + 2][j] != 1) {
								dp[i + 2][j] += dp[i][j];
							} else if (i + 2 >= y) {
								dp[y - 1][j] += dp[i][j];
							}
							break;
					}
				}
			}
			int sum = 0;
			for (int i = 0; i < x; i++) sum += dp[y - 1][i];
			System.out.println(sum);
		}//end while
	}//end main
}