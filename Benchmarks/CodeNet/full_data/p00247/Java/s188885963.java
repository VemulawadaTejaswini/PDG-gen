
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			w = scanner.nextInt();
			h = scanner.nextInt();
			if ((w | h) == 0)
				break;
			dist = new int[h][w];
			map = new char[h][w];
			for (int i = 0; i < h; i++) {
				char[] cs = scanner.next().toCharArray();
				for (int j = 0; j < w; j++) {
					dist[i][j] = -1;
					char c = cs[j];
					map[i][j] = c;
					if (c == 'S') {
						sy = i;
						sx = j;
						map[i][j] = '.';
					} else if (c == 'G') {
						gy = i;
						gx = j;
						map[i][j] = '.';
					}
				}
			}
			int ID = 1;
			ice = new int[h * w];
			id = new int[h][w];
			ice[0] = INF;
			for (int i = 0; i < h; i++)
				for (int j = 0; j < w; j++) {
					if (id[i][j] == 0 && map[i][j] == 'X') {
						mark(i, j, ID);
						if (ice[ID] == 1)
							map[i][j] = '#';
						ID++;
					}

				}
			Deque<Point> deque = new ArrayDeque<Main.Point>();
			deque.offer(new Point(gy, gx));
			dist[gy][gx] = 0;
			while (!deque.isEmpty()) {
				Point p = deque.poll();
				for (int[] m : move) {
					int ny = p.y + m[0];
					int nx = p.x + m[1];
					if (!isOK(ny, nx))
						continue;
					if (map[ny][nx] != '#' && dist[ny][nx] == -1) {
						dist[ny][nx] = dist[p.y][p.x] + 1;
						deque.offer(new Point(ny, nx));
					}

				}
			}
			ans = dist[sy][sx];
			hit = new int[h * w];
			b = new boolean[h][w];
			b[sy][sx] = true;
			while (!f(sy, sx, 0)) {
				Arrays.fill(hit, 0);
				b = new boolean[h][w];
				b[sy][sx] = true;
				ans++;
			}
			System.out.println(ans);

		}
	}

	private boolean f(int y, int x, int depth) {
		if (ans < depth + dist[y][x])
			return false;
		if (y == gy && x == gx)
			return true;
		for (int[] m : move) {
			int ny = y + m[0];
			int nx = x + m[1];
			if (!isOK(ny, nx))
				continue;
			if (b[ny][nx] || map[ny][nx] == '#')
				continue;
			if (ice[id[ny][nx]] / 2 > hit[id[ny][nx]]) {
				hit[id[ny][nx]]++;
				b[ny][nx] = true;
				if (f(ny, nx, depth + 1))
					return true;
				hit[id[ny][nx]]--;
				b[ny][nx] = false;
			}
		}
		return false;
	}

	private void mark(int i, int j, int ID) {
		ice[ID]++;
		id[i][j] = ID;
		for (int[] m : move) {
			int ny = i + m[0];
			int nx = j + m[1];
			if (!isOK(ny, nx))
				continue;
			if (map[ny][nx] == 'X' && id[ny][nx] == 0)
				mark(ny, nx, ID);
		}
	}

	private boolean isOK(int y, int x) {
		if (0 <= y && y < h && 0 <= x && x < w)
			return true;
		return false;
	}

	int h, w, sx, sy, gx, gy, INF = 1 << 24, ans;
	char[][] map;
	int[][] dist, id;
	int[] ice, hit;
	int[][] move = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };
	boolean[][] b;

	class Point {
		int y, x;

		public Point(int y, int x) {
			super();
			this.y = y;
			this.x = x;
		}

		@Override
		public String toString() {
			return "Point [y=" + y + ", x=" + x + "]";
		}

	}
}