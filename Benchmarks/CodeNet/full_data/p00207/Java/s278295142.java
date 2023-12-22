import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

/**
 * Block
 */
public class Main {

	static int[][] board;
	final static int BLOCK_WIDTH = 4;
	final static int BLOCK_HEIGHT = 2;
	final static int EMPTY = 0;

	static int w, h;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0 0")) {

			w = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			h = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			board = new int[w + 1][h + 1];

			line = br.readLine();
			int xs = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int ys = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			line = br.readLine();
			int xg = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int yg = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			int n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; ++i) {
				putBlock(br.readLine());
			}

			if (solve(xs, ys, xg, yg)) {
				System.out.println("OK");
			} else {
				System.out.println("NG");
			}

		}

	}

	static void putBlock(String info) {
		StringTokenizer st = new StringTokenizer(info);

		int c, d, x, y;
		c = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());

		putBlock(c, d, x, y);
	}

	static void putBlock(int c, int d, int x, int y) {

		if (d == 0) {
			for (int i = x; i < x + BLOCK_WIDTH; ++i) {
				for (int j = y; j < y + BLOCK_HEIGHT; ++j) {
					// assert board[i][j] == EMPTY;
					board[i][j] = c;
				}
			}
		} else {
			for (int i = x; i < x + BLOCK_HEIGHT; ++i) {
				for (int j = y; j < y + BLOCK_WIDTH; ++j) {
					// assert board[i][j] == EMPTY;
					board[i][j] = c;
				}
			}
		}
	}

	static boolean solve(int xs, int ys, int xg, int yg) {

		final int V[] = { 1, -1, 0, 0 };
		final int H[] = { 0, 0, 1, -1 };

		if (board[xs][ys] != board[xg][yg]) {
			return false;
		}

		int[] next, prev;
		next = new int[] { xs, ys };
		ArrayDeque<int[]> queue = new ArrayDeque<int[]>();
		queue.offer(next);

		while (!queue.isEmpty()) {

			prev = queue.poll();

			int px, py, nx, ny, c;
			px = prev[0];
			py = prev[1];
			c = board[px][py];
			board[px][py] = EMPTY;

			if (px == xg && py == yg) {
				return true;
			}

			for (int i = 0; i < 4; ++i) {
				nx = px + V[i];
				ny = py + H[i];
				if (nx > 0 && nx < w + 1 && ny > 0 && ny < h + 1) {
					if (board[nx][ny] == c) {
						queue.offer(new int[] { nx, ny });
					}
				}
			}
		}

		return false;
	}
}