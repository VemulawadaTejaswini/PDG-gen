
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		h = scanner.nextInt();
		w = scanner.nextInt();
		n = scanner.nextInt();
		num = new Point[n + 1];
		map = new boolean[h][w];
		for (int i = 0; i < h; i++) {
			char[] chs = scanner.next().toCharArray();
			for (int j = 0; j < w; j++) {
				if (chs[j] == '.')
					continue;
				else if (chs[j] == 'X')
					map[i][j] = true;
				else if (chs[j] == 'S')
					num[0] = new Point(i, j);
				else
					num[chs[j] - '0'] = new Point(i, j);
			}
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans += slove(num[i].y, num[i].x, num[i + 1].y, num[i + 1].x);
		}
		System.out.println(ans);
	}

	private int slove(int sy, int sx, int gy, int gx) {
		Deque<Point> deque = new ArrayDeque<Main.Point>();
		deque.offer(new Point(sy, sx, 0));
		boolean[][] tmpmap = new boolean[h][w];
		tmpmap[sy][sx] = true;
		while (!deque.isEmpty()) {
			Point p = deque.poll();

			for (int[] m : move) {
				int ny = p.y + m[0];
				int nx = p.x + m[1];
				if (!isOK(ny, nx))
					continue;
				if (map[ny][nx])
					continue;
				if (ny == gy && nx == gx) {
					return p.step + 1;
				}
				if (tmpmap[ny][nx])
					continue;
				tmpmap[ny][nx] = true;
				deque.offer(new Point(ny, nx, p.step + 1));
			}
		}
		return -1;
	}

	private boolean isOK(int ny, int nx) {
		if (0 <= ny && ny < h && 0 <= nx && nx < w)
			return true;
		return false;
	}

	int h, w, n;
	Point[] num;
	boolean[][] map;
	int[][] move = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };

	class Point {
		int y, x, step;

		@Override
		public String toString() {
			return "Point [y=" + y + ", x=" + x + ", step=" + step + "]";
		}

		public Point(int y, int x, int step) {
			super();
			this.y = y;
			this.x = x;
			this.step = step;
		}

		public Point(int y, int x) {
			super();
			this.y = y;
			this.x = x;
		}

	}
}