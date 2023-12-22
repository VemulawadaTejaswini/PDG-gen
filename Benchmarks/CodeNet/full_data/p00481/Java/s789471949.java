
import java.io.IOException;
import java.util.PriorityQueue;
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
		PriorityQueue<Point> pq = new PriorityQueue<Point>();
		int md = getMd(sy, sx, gy, gx);
		pq.offer(new Point(sy, sx, 0, md));
		boolean[][] tmpmap = new boolean[h][w];
		while (!pq.isEmpty()) {
			Point p = pq.poll();
			if (p.y == gy && p.x == gx) {
				return p.step;
			}
			if (tmpmap[p.y][p.x])
				continue;
			tmpmap[p.y][p.x] = true;
			for (int[] m : move) {
				int ny = p.y + m[0];
				int nx = p.x + m[1];
				if (!isOK(ny, nx))
					continue;
				if(map[ny][nx])
					continue;
				int nstep = p.step + 1;
				int nmd = getMd(ny, nx, gy, gx) + nstep;
				pq.offer(new Point(ny, nx, nstep, nmd));

			}
		}
		return -1;
	}

	private boolean isOK(int ny, int nx) {
		if (0 <= ny && ny < h && 0 <= nx && nx < w)
			return true;
		return false;
	}

	private int getMd(int y1, int x1, int y2, int x2) {
		return Math.abs(y1 - y2) + Math.abs(x1 - x2);
	}

	int h, w, n;
	Point[] num;
	boolean[][] map;
	int[][] move = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };

	class Point implements Comparable<Point> {
		int y, x, step, md;

		@Override
		public String toString() {
			return "Point [y=" + y + ", x=" + x + ", step=" + step + ", md="
					+ md + "]";
		}

		public Point(int y, int x, int step, int md) {
			super();
			this.y = y;
			this.x = x;
			this.step = step;
			this.md = md;
		}

		public Point(int y, int x) {
			super();
			this.y = y;
			this.x = x;
		}

		@Override
		public int compareTo(Point o) {
			if (md == o.md)
				return o.step - this.step;
			return this.md - o.md;
		}

	}
}