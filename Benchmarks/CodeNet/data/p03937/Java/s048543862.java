import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int H, W;
	char[][] A;
	char[][] p;

	boolean check(char[][] p) {
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (A[i][j] != p[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	boolean dfs(int h, int w) {
		if (h == H - 1 && w == W - 1) {
			if (check(p)) {
				return true;
			} else {
				return false;
			}
		}

		// 右
		if (w != W - 1) {
			w++;
			p[h][w] = '#';

			boolean b = dfs(h, w);
			if (b) {
				return true;
			}

			p[h][w] = '.';
			w--;
		}

		// 下
		if (h != H - 1) {
			h++;
			p[h][w] = '#';

			boolean b = dfs(h, w);
			if (b) {
				return true;
			}

			p[h][w] = '.';
			h--;
		}

		return false;

	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		H = sc.nextInt();
		W = sc.nextInt();
		A = new char[H][W];
		for (int i = 0; i < H; i++) {
			String s = sc.next();
			A[i] = s.toCharArray();
		}
		sc.close();

		p = new char[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				p[i][j] = '.';
			}
		}
		int w = 0, h = 0;
		p[h][w] = '#';

		if (dfs(h, w)) {
			out.println("Possible");
		} else {
			out.println("Impossible");
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
