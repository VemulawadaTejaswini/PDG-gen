
import java.awt.Point;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			w = scanner.nextInt();
			h = scanner.nextInt();
			if ((w | h) == 0)
				break;
			n = scanner.nextInt();
			Integer[][] x = new Integer[2][n];
			Integer[][] y = new Integer[2][n];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < 2; j++) {
					x[j][i] = scanner.nextInt();
					y[j][i] = scanner.nextInt();
				}
			h = slove(y);
			w = slove(x);
			boolean[][] map = new boolean[h][w];
			for (int i = 0; i < n; i++) {
				for (int j = y[0][i]; j < y[1][i]; j++)
					for (int k = x[0][i]; k < x[1][i]; k++)
						map[j][k] = true;
			}
			int ans = 0;
			for (int i = 0; i < h; i++)
				for (int j = 0; j < w; j++) {
					if (map[i][j])
						continue;
					ans++;
					map[i][j] = true;
					Deque<Point> deque = new ArrayDeque<Point>();
					deque.push(new Point(j, i));
					while (!deque.isEmpty()) {
						Point p = deque.poll();
						for (int[] m : move) {
							int ny = p.y + m[0];
							int nx = p.x + m[1];
							if (!isOK(ny, nx))
								continue;
							if (map[ny][nx])
								continue;
							map[ny][nx] = true;
							deque.push(new Point(nx, ny));
						}
					}
				}

			System.out.println(ans);
		}
	}

	private boolean isOK(int y, int x) {
		if (0 <= y && y < h && 0 <= x && x < w)
			return true;
		return false;
	}

	private int slove(Integer[][] xy) {
		NavigableSet<Integer> set = new TreeSet<Integer>();
		set.add(0);
		set.add(n);
		set.addAll(Arrays.asList(xy[0]));
		set.addAll(Arrays.asList(xy[1]));
		Integer[] a = set.toArray(new Integer[0]);
		for (int i = 0; i < n; i++)
			for (int j = 0; j < 2; j++)
				xy[j][i] = Arrays.binarySearch(a, xy[j][i]);
		return a.length - 1;
	}

	int w, h, n;
	int[][] move = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };
}