/**
 * Brave Force Story
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.Integer.parseInt;

public class Main {

	static final int OFFSET = 30;
	static final int OBSTACLE = -1;
	static final int[] X = {0, 1, 1, 0, -1, -1};
	static final int[] Y = {1, 1, 0, -1, -1, 0};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int t, n;
			t = parseInt(line.substring(0, line.indexOf(' ')));
			n = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((t | n) == 0) break;

			int[][] map = new int[OFFSET * 2 + 1][OFFSET * 2 + 1];

			for (int i = 0; i < n; i++) {
				line = br.readLine();
				int x, y;
				x = parseInt(line.substring(0, line.indexOf(' ')));
				y = parseInt(line.substring(line.indexOf(' ') + 1));
				map[x + OFFSET][y + OFFSET] = OBSTACLE;
			}

			line = br.readLine();
			int sx, sy;
			sx = parseInt(line.substring(0, line.indexOf(' ')));
			sy = parseInt(line.substring(line.indexOf(' ') + 1));
			sx += OFFSET;
			sy += OFFSET;

			int count = 0;
			Deque<int[]> queue = new ArrayDeque<int[]>();
			queue.offer(new int[]{sx, sy, 0});
			map[sx][sy] = OBSTACLE;
			count++;

			while (!queue.isEmpty()) {
				int[] hex = queue.poll();
				for (int i = 0; i < 6; i++) {
					int nx, ny;
					nx = hex[0] + X[i];
					ny = hex[1] + Y[i];
					if (0 <= nx && nx <= 60 && 0 <= ny && ny <= 60 && hex[2] < t && map[nx][ny] != OBSTACLE) {
						queue.offer(new int[]{nx, ny, hex[2] + 1});
						map[nx][ny] = OBSTACLE;
						count++;
					}
				}
			}
			System.out.println(count);
		} // end while
	} // end main
}