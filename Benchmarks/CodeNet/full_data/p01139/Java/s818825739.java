import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.Integer.parseInt;

/**
 * Surrounding Area
 */
public class Main {

	static final int BLACK = 1;
	static final int WHITE = 2;
	static final int[][] HV = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int w, h;
			w = parseInt(line.substring(0, line.indexOf(' ')));
			h = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((w | h) == 0) break;

			char[][] map = new char[h + 2][w + 2];
			int[][] check = new int[h + 2][w + 2];

			for (int i = 1; i <= h; i++) {
				line = br.readLine();
				for (int j = 1; j <= w; j++) {
					map[i][j] = line.charAt(j - 1);
					if (map[i][j] == 'B' || map[i][j] == 'W') {
						check[i][j] = BLACK | WHITE;
					}
				}
			}

			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= w; j++) {
					if (map[i][j] == 'B' || map[i][j] == 'W') {
						int marker = 0;
						if (map[i][j] == 'B') {
							marker = BLACK;
						} else {
							marker = WHITE;
						}
						Deque<int[]> queue = new ArrayDeque<>();
						queue.offer(new int[]{i, j});
						while (!queue.isEmpty()) {
							int[] p = queue.poll();
							for (int k = 0; k < HV.length; k++) {
								int ny = p[0] + HV[k][0];
								int nx = p[1] + HV[k][1];
								if (1 <= ny && ny <= h
										&& 1 <= nx && nx <= w
										&& map[ny][nx] == '.'
										&& (check[ny][nx] & marker) == 0) {
									queue.offer(new int[]{ny, nx});
									check[ny][nx] |= marker;
								}
							}
						}
					}
				}
			}

			int black = 0;
			int white = 0;
			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= w; j++) {
					if (check[i][j] == BLACK) {
						black++;
					} else if (check[i][j] == WHITE) {
						white++;
					}
				}
			}
			System.out.println(black + " " + white);

		} //end while
	} //end main
}