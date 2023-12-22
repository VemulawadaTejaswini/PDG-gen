import java.util.Scanner;

public class Main {
	static boolean[][] black;
	static int[][] count;
	static int W, H;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		while (true) {
			W = s.nextInt();
			H = s.nextInt();

			if (W == 0 && H == 0)
				break;

			char[][] field = new char[H][W];
			black = new boolean[H][W];
			count = new int[H][W];

			for (int i = 0; i < H; i++) {
				String str = s.next();
				field[i] = str.toCharArray();
			}

			int x = 0, y = 0;

			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (field[i][j] == '.')
						black[i][j] = true;
					else if (field[i][j] == '@') {
						black[i][j] = true;
						x = j;
						y = i;
					} else
						black[i][j] = false;
				}
			}

			Search(x, y);

			// for (int i = 0; i < H; i++) {
			// for (int j = 0; j < W; j++) {
			// // System.out.print(field[i][j]);
			// System.out.print(black[i][j]);
			// }
			// System.out.println();
			// }

			int ans = 0;

			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					ans += count[i][j];
				}
			}

			System.out.println(ans);

		}
		s.close();
	}

	public static void Search(int x, int y) {
		int[] dx = { 1, 0, -1, 0 };
		int[] dy = { 0, 1, 0, -1 };

		black[y][x] = false;
		count[y][x] = 1;

		for (int i = 0; i < dx.length; i++) {
			int sx = x + dx[i];
			int sy = y + dy[i];

			if (sx < W && sy < H && sx >= 0 && sy >= 0)
				if (black[sy][sx])
					Search(sx, sy);
		}
	}
}