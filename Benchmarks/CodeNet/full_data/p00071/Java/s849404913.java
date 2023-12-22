import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {

	final static int SIZE = 8;
	final static int MARGIN = 3;
	final static char BOMB = '1';
	final static char BOMBED = '0';
	static Deque<int[]> bombs;
	static char[][] map;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {

			int n = Integer.parseInt(line);

			br.readLine();
			for (int i = 0; i < n; ++i) {
				bombs = new ArrayDeque<int[]>();
				map = new char[SIZE + MARGIN * 2][SIZE + MARGIN * 2];

				for (int j = MARGIN; j < SIZE + MARGIN; ++j) {
					line = br.readLine();
					for (int k = MARGIN; k < SIZE + MARGIN; ++k) {
						map[j][k] = line.charAt(k - MARGIN);
					}
				}

				int x = Integer.parseInt(br.readLine());
				int y = Integer.parseInt(br.readLine());

				bombs.offer(new int[] { x + MARGIN - 1, y + MARGIN - 1 });
				while (!bombs.isEmpty()) {
					bomb();
				}
				System.out.print(print(i + 1, map));
				br.readLine();
			}
		}
	}

	static void bomb() {

		final int[] V = { 1, -1, 0, 0 };
		final int[] H = { 0, 0, 1, -1 };

		int[] xy = bombs.poll();
		int x = xy[0];
		int y = xy[1];

		map[x][y] = BOMBED;

		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j < 4; ++j) {
				for (int k = 1; k <= 3; ++k) {
					int xv = x + V[j] * k;
					int yh = y + H[k] * k;
					if (map[xv][yh] == BOMB) {
						bombs.offer(new int[] { xv, yh });
						map[xv][yh] = BOMBED;
					}
				}
			}
		}
	}

	static String print(int n, char[][] map) {

		StringBuilder sb = new StringBuilder();
		sb.append("Data " + n + ":\n");
		for (int i = MARGIN; i < SIZE + MARGIN; ++i) {
			sb.append(Arrays.copyOfRange(map[i], MARGIN, SIZE + MARGIN));
			sb.append("\n");
		}

		return sb.toString();
	}

}