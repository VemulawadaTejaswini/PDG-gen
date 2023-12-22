import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Get Many Persimmon Trees
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int N = parseInt(line);
			if (N == 0) break;

			int W, H;
			line = br.readLine();
			W = parseInt(line.substring(0, line.indexOf(' ')));
			H = parseInt(line.substring(line.indexOf(' ') + 1));

			int[][] field = new int[W + 1][H + 1];
			for (int i = 0; i < N; i++) {
				int x, y;
				line = br.readLine();
				x = parseInt(line.substring(0, line.indexOf(' ')));
				y = parseInt(line.substring(line.indexOf(' ') + 1));
				field[x][y] = 1;
			}
			for (int i = 1; i <= W; i++) {
				for (int j = 1; j <= H; j++) {
					field[i][j] = field[i][j] + field[i - 1][j] + field[i][j - 1] - field[i - 1][j - 1];
				}
			}

			int S, T;
			line = br.readLine();
			S = parseInt(line.substring(0, line.indexOf(' ')));
			T = parseInt(line.substring(line.indexOf(' ') + 1));

			//solve
			int max = 0;
			for (int i = S; i <= W; i++) {
				for (int j = T; j <= H; j++) {
					max = Math.max(max, field[i][j] - field[i - S][j] - field[i][j - T] + field[i - S][j - T]);
				}
			}
			System.out.println(max);

		} //end while
	} //end main
}