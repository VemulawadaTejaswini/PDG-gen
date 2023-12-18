import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		boolean[][] s = new boolean[h][w];
		for (int i = 0; i < h; i++) {
			String text = sc.next();
			for (int j = 0; j < w; j++) {
				s[i][j] = text.substring(j, j + 1).equals(".");
			}
		}
		sc.close();

		int max = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				max = Math.max(max, calc(s, i, j));
			}
		}

		System.out.println(max);
	}

	private static int calc(boolean[][] s, int x, int y) {
		if (!s[x][y]) {
			return 0;
		}

		int h = s.length;
		int w = s[0].length;
		int[][] c = new int[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				c[i][j] = Integer.MAX_VALUE;
			}
		}
		c[x][y] = 0;
		check(s, c, x, y);
		int max = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (c[i][j] != Integer.MAX_VALUE) {
					max = Math.max(max, c[i][j]);
				}
			}
		}
		return max;
	}

	private static void check(boolean[][] s, int[][] c, int x, int y) {
		int h = c.length;
		int w = c[0].length;
		int[] xs = new int[] { x + 1, x - 1, x, x };
		int[] ys = new int[] { y, y, y + 1, y - 1 };

		for (int i = 0; i < xs.length; i++) {
			int x2 = xs[i];
			int y2 = ys[i];
			if (x2 >= 0 && x2 < h && y2 >= 0 && y2 < w && s[x2][y2] && c[x][y] + 1 < c[x2][y2]) {
				c[x2][y2] = c[x][y] + 1;
				check(s, c, x2, y2);
			}
		}
	}
}
