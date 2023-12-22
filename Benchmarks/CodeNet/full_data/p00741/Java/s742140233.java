import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	void dfs(int w, int h, int[][] c, int x, int y, boolean[][] v) {
		if (v[y][x] || c[y][x] == 0) {
			return;
		}
		v[y][x] = true;

		for (int dx = -1; dx <= 1; dx++) {
			for (int dy = -1; dy <= 1; dy++) {
				if (x + dx >= 0 && x + dx < w && y + dy >= 0 && y + dy < h) {
					dfs(w, h, c, x + dx, y + dy, v);
				}
			}
		}

	}

	void solv(int w, int h, int[][] c) {
		boolean[][] v = new boolean[h][w];

		int ans = 0;
		for (int y = 0; y < h; y++) {
			for (int x = 0; x < w; x++) {
				if (!v[y][x] && c[y][x] == 1) {
					ans++;
					dfs(w, h, c, x, y, v);
				}
			}
		}

		out.println(ans);

	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		while (true) {

			int w = sc.nextInt();
			int h = sc.nextInt();

			if (w == 0 && h == 0) {
				break;
			}

			int[][] c = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					c[i][j] = sc.nextInt();
				}
			}

			solv(w, h, c);
		}
		sc.close();
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}

