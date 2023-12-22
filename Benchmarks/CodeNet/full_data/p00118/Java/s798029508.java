import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Property Distribution
 */
public class Main {

	static char DISTRIBUTED = '\0';
	static Queue<Integer> xs, ys;
	static int count;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0 0")) {

			int h = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int w = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			// read in.
			char[][] prop = new char[h + 2][w + 2];
			for (int i = 1; i < h + 1; ++i) {
				line = br.readLine();
				for (int j = 1; j < w + 1; ++j) {
					prop[i][j] = line.charAt(j - 1);
				}
			}

			// solve
			xs = new ArrayDeque<Integer>();
			ys = new ArrayDeque<Integer>();
			count = 0;
			for (int i = 1; i < h + 1; ++i) {
				for (int j = 1; j < w + 1; ++j) {
					if (prop[i][j] != DISTRIBUTED) {
						char fruit = prop[i][j];
						xs.add(i);
						ys.add(j);
						while (!xs.isEmpty() && !ys.isEmpty()) {
							distribute(prop, fruit);
						}
						++count;
					}
				}
			}

			// print
			System.out.println(count);
		}
	}

	static void distribute(char[][] prop, char fruit) {

		final int V[] = { 1, -1, 0, 0 };
		final int H[] = { 0, 0, 1, -1 };

		int x, y;
		x = xs.remove();
		y = ys.remove();

		if (prop[x][y] == fruit) {

			prop[x][y] = DISTRIBUTED;

			for (int i = 0; i < 4; ++i) {
				int xv, yh;
				xv = x + V[i];
				yh = y + H[i];
				if (prop[xv][yh] == fruit) {
					xs.add(xv);
					ys.add(yh);
				}
			}
		}
	}
}