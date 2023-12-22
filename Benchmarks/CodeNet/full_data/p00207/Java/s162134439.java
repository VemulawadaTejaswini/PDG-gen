import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int w, h;
		while ((w = in.nextInt()) != 0 && (h = in.nextInt()) != 0) {
			int xs = in.nextInt();
			int ys = in.nextInt();
			int xg = in.nextInt();
			int yg = in.nextInt();
			int[][] b = new int[w + 1][h + 1];
			int n = in.nextInt();
			while (n-- > 0) {
				setBlock(b, in.nextInt(), in.nextInt(), in.nextInt(),
						in.nextInt());
			}
			String ans;
			if (b[xs][ys] == b[xg][yg]) {
				solid(b, b[xs][ys], xs, ys, xg, yg);
				ans = b[xs][ys] == b[xg][yg] ? "OK" : "NG";
			} else {
				ans = "NG";
			}
			System.out.println(ans);
		}

	}

	static void setBlock(int[][] b, int c, int d, int x, int y) {
		b[x][y] = b[x + 1][y] = b[x][y + 1] = b[x + 1][y + 1] = c;
		if (d == -1) {
			return;
		} else if (d == 0) {
			setBlock(b, c, -1, x + 2, y);
		} else if (d == 1) {
			setBlock(b, c, -1, x, y + 2);
		}
	}

	static void solid(int[][] b, int c, int x, int y, int xg, int yg) {
		if (b[x][y] == c) {
			b[x][y] = -1;
			if (x == xg && y == yg) {
				return;
			}
			solid(b, c, x + 1, y, xg, yg);
			solid(b, c, x - 1, y, xg, yg);
			solid(b, c, x, y + 1, xg, yg);
			solid(b, c, x, y - 1, xg, yg);
		} else {
			return;
		}
	}
}