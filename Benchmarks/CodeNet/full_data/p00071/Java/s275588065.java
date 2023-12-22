import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	final static int SIZE = 8;
	final static int MARGIN = 3;
	final static char BOMB = 1;
	final static char BOMBED = 0;
	static Deque<int[]> bombs;
	static byte[][] map;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {

			int n = Integer.parseInt(line);

			br.readLine();// 空行スキップ
			for (int i = 0; i < n; ++i) {
				bombs = new ArrayDeque<int[]>();
				map = new byte[SIZE + MARGIN * 2][SIZE + MARGIN * 2];

				for (int j = MARGIN; j < SIZE + MARGIN; ++j) {
					line = br.readLine();
					for (int k = MARGIN; k < SIZE + MARGIN; ++k) {
						map[j][k] = (byte) (line.charAt(k - MARGIN) - '0');
					}
				}

				int x = Integer.parseInt(br.readLine());
				int y = Integer.parseInt(br.readLine());
				x += MARGIN - 1;
				y += MARGIN - 1;

				bombs.offer(new int[] { y, x });
				map[y][x] = BOMBED;
				while (!bombs.isEmpty()) {
					bomb();
				}
				System.out.print(print(i + 1, map));
				br.readLine();// 空行スキップ
			}
		}
	}

	static void bomb() {

		final int[] V = { 1, -1, 0, 0 };
		final int[] H = { 0, 0, 1, -1 };

		int[] yx = bombs.poll();
		int y = yx[0];
		int x = yx[1];

		// map[y][x] = BOMBED;

		for (int i = 0; i < 4; ++i) {
			for (int j = 1; j <= 3; ++j) {
				int yv = y + V[i] * j;
				int xh = x + H[i] * j;
				if (map[yv][xh] == BOMB) {
					bombs.offer(new int[] { yv, xh });
					map[yv][xh] = BOMBED;
				}
			}
		}
	}

	static String print(int n, byte[][] map) {

		StringBuilder sb = new StringBuilder();
		sb.append("Data " + n + ":\n");
		for (int i = MARGIN; i < SIZE + MARGIN; ++i) {
			for (int j = MARGIN; j < SIZE + MARGIN; ++j) {
				sb.append(map[i][j]);
			}
			sb.append("\n");
		}
		return sb.toString();
	}

}