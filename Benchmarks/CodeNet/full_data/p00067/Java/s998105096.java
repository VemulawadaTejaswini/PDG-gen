import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/**
 * The Number of Island
 */
public class Main {

	final static int LAND = 1;
	final static int VISITED = -1;

	final static int[] V = { 1, -1, 0, 0 };
	final static int[] H = { 0, 0, 1, -1 };

	static Queue<Integer> xs, ys;
	static int count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (true) {

			// load map
			int[][] map = new int[14][14];

			xs = new ArrayDeque<Integer>();
			ys = new ArrayDeque<Integer>();

			for (int i = 1; i < 12; i++) {
				line = br.readLine();
				for (int j = 1; j < 12; j++) {
					map[i][j] = line.charAt(j) - '0';
				}
			}

			// solve
			count = 0;
			for (int i = 1; i < 12; i++) {
				for (int j = 1; j < 12; j++) {
					if (map[i][j] == LAND) {
						xs.add(i);
						ys.add(j);
						while (!xs.isEmpty() && !ys.isEmpty()) {
							visit(map);
						}
						count++;
					}
				}
			}

			// output.
			System.out.println(count);

			// next map
			line = br.readLine();
			if (line == null) {
				break;
			} else {
				continue;
			}
		}
		//
	}

	public static void visit(int[][] map) {

		int x, y;
		x = xs.remove();
		y = ys.remove();

		map[x][y] = VISITED;

		// next choices
		for (int i = 0; i < 4; i++) {
			int xv, yh;
			xv = x + V[i];
			yh = y + H[i];
			// if (xv >= 0 && xv < 12 && yh >= 0 && yh < 12 && map[xv][yh] ==
			// LAND) {
			if (map[xv][yh] == LAND) {
				xs.add(xv);
				ys.add(yh);
			}
		}
	}
}