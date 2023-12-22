import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		while (solv(sc)) {
			;
		}

		sc.close();

	}

	private boolean solv(Scanner sc) {
		int w = sc.nextInt();
		int h = sc.nextInt();

		if (w == 0 && h == 0) {
			return false;
		}

		int[][][] m = new int[h + 2][w + 2][4];

		for (int i = 0; i <= h + 1; i++) {
			for (int j = 0; j <= w + 1; j++) {
				Arrays.fill(m[i][j], 1);
			}
		}

		// 読み込みがバグってる
		for (int j = 1; j <= h - 1; j++) {
			for (int i = 1; i <= w - 1; i++) {
				int n = sc.nextInt();
				m[j][i][1] = n;
				m[j][i + 1][3] = n;
			}
			for (int i = 1; i <= w; i++) {
				int n = sc.nextInt();
				m[j][i][2] = n;
				m[j + 1][i][0] = n;
			}
		}
		for (int i = 1; i <= w - 1; i++) {
			int n = sc.nextInt();
			m[h][i][1] = n;
			m[h][i + 1][3] = n;
		}

		Queue<List<Integer>> q = new ArrayDeque<>();
		q.add(Arrays.asList(1, 1));

		int[][] a = new int[h + 1][w + 1];
		int[] dy = { -1, 0, 1, 0 };
		int[] dx = { 0, 1, 0, -1 };

		a[1][1] = 1;

		while (!q.isEmpty()) {
			List<Integer> l = q.poll();
			int y = l.get(0);
			int x = l.get(1);

			if (x == w && y == h) {
				break;
			}

			for (int i = 0; i < 4; i++) {
				if (m[y][x][i] == 0 && a[y + dy[i]][x + dx[i]] == 0) {
					a[y + dy[i]][x + dx[i]] = a[y][x] + 1;
					q.add(Arrays.asList(y + dy[i], x + dx[i]));
				}
			}
		}

		out.println(a[h][w]);

		return true;
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}

