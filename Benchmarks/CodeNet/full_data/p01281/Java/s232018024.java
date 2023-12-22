import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Tatami
 */
public class Main {

	static int count = 0;
	static int H = 0;
	static int W = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			count = 0;
			H = parseInt(line.substring(0, line.indexOf(' ')));
			W = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((H | W) == 0) break;

			boolean[][] floor = new boolean[H][W];

			solve(floor);

			System.out.println(count);

		} //end while
	} //end main

	static void solve(boolean[][] f) {
		boolean[][] h = new boolean[H][W];//horizon
		boolean[][] v = new boolean[H][W];//vertical

		int y = -1, x = -1;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				h[i][j] = v[i][j] = f[i][j];
				if (y == -1 && !f[i][j]) {
					y = i;
					x = j;
				}
			}
		}
		if (y == -1 && x == -1) {
			count++;
			return;
		}

		//
		if (x + 1 < W && !f[y][x + 1]) {
			h[y][x] = true;
			h[y][x + 1] = true;
			solve(h);
		}

		//
		if (y + 1 < H && !f[y + 1][x]) {
			v[y][x] = true;
			v[y + 1][x] = true;
			solve(v);
		}
	}
}