/**
 * How Many Islands?
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

import static java.lang.Integer.parseInt;

public class Main {

	static final int[] V = {-1, -1, -1, 0, 0, 1, 1, 1};
	static final int[] H = {-1, 0, 1, -1, 1, -1, 0, 1};
	static final char CHECKED = 'C';

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int w = parseInt(line.substring(0, line.indexOf(' ')));
			int h = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((w | h) == 0) break;

			char[][] map = new char[h + 2][w + 2];
			for (int i = 1; i < h + 1; i++) {
				line = br.readLine();
				for (int j = 0; j < w; j++) {
					map[i][j + 1] = line.charAt(j * 2);
				}
			}

			int count = 0;
			for (int i = 1; i < h + 1; i++) {
				for (int j = 1; j < w + 1; j++) {
					if (map[i][j] == '1') {
						Queue<int[]> queue = new ArrayDeque<int[]>();
						queue.offer(new int[]{i, j});
						map[i][j] = CHECKED;
						while (!queue.isEmpty()) {
							int[] curr = queue.poll();
							for (int k = 0; k < V.length; k++) {
								int ny = curr[0] + V[k];
								int nx = curr[1] + H[k];
								if (map[ny][nx] == '1') {
									queue.offer(new int[]{ny, nx});
									map[ny][nx] = CHECKED;
								}
							}
						}
						count++;
					}
				}
			}
			System.out.println(count);
		} //end while
	} //end main
}