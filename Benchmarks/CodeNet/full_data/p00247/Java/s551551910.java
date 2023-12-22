
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.PriorityQueue;
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
			int[][] map = new int[h][w];
			Point s = new Point();
			Point g = new Point();
			for (int i = 0; i < h; i++) {
				String str = scanner.next();
				for (int j = 0; j < w; j++) {
					char now = str.charAt(j);
					if (now == 'S') {
						s.y = i;
						s.x = j;
						map[i][j] = -1;
					} else if (now == 'G') {
						g.y = i;
						g.x = j;
						map[i][j] = -1;
					} else if (now == '#')
						map[i][j] = 0;
					else if (now == '.')
						map[i][j] = -1;
					else
						map[i][j] = -2;
				}
			}
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j] != -2)
						continue;
					int a = slove(i, j, map, -2);
					for (int k = 0; k < h; k++)
						for (int l = 0; l < w; l++)
							if (map[k][l] == -3)
								map[k][l] = a;

				}
			}
			PriorityQueue<Point> pq = new PriorityQueue<Point>();
			int[][] tmpMap = map.clone();
			int md = Math.abs(s.y - g.y) + Math.abs(s.x - g.x);
			boolean[][] b = new boolean[h][w];
			b[s.y][s.x] = true;
			pq.offer(new Point(s.y, s.x, 0, md, tmpMap, b));
			int ans = 0;
			while (!pq.isEmpty()) {
				Point point = pq.poll();
				if (point.y == g.y && point.x == g.x) {
					ans = point.step;
					break;
				}
				for (int[] mo : move) {
					int ny = point.y + mo[0];
					int nx = point.x + mo[1];
					if (!isOK(ny, nx))
						continue;
					if (point.map[ny][nx] == 0)
						continue;
					if (point.b[ny][nx])
						continue;
					int[][] tmp = new int[h][w];
					for (int i = 0; i < h; i++)
						tmp[i] = Arrays.copyOf(point.map[i], w);
					if (tmp[ny][nx] != -1) {
						slove(ny, nx, tmp, tmp[ny][nx]);
					}
					boolean[][] tb = new boolean[h][w];
					for(int i = 0;i<h;i++)
						tb[i] = Arrays.copyOf(point.b[i], w);
					tb[ny][nx] = true;
					int nmd = Math.abs(ny - g.y) + Math.abs(nx - g.x);
					pq.offer(new Point(ny, nx, point.step + 1, nmd + point.step
							+ 1, tmp, tb));
				}
			}
			System.out.println(ans);

		}
	}

	private int slove(int y, int x, int[][] map, int k) {
		Deque<Point> deque = new ArrayDeque<Main.Point>();
		int count = 1;
		deque.push(new Point(y, x));
		loop: while (!deque.isEmpty()) {
			Point point = deque.peek();
			map[point.y][point.x] = k - 1;
			for (int[] m : move) {
				int ny = point.y + m[0];
				int nx = point.x + m[1];
				if (!isOK(ny, nx))
					continue;
				if (map[ny][nx] != k)
					continue;
				deque.push(new Point(ny, nx));
				count++;
				continue loop;
			}
			deque.poll();
		}
		return count / 2;
	}

	boolean isOK(int y, int x) {
		if (0 <= y && y < h && 0 <= x && x < w)
			return true;
		return false;
	}

	int w, h;
	int[][] move = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };

	class Point implements Comparable<Point> {
		int y, x;
		int step, md;
		int[][] map;
		boolean[][] b;

		public Point(int y, int x, int step, int md, int[][] map, boolean[][] b) {
			super();
			this.y = y;
			this.x = x;
			this.step = step;
			this.md = md;
			this.map = map;
			this.b = b;
		}

		Point() {
		}

		public Point(int y, int x) {
			super();
			this.y = y;
			this.x = x;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			for (int[] m : map)
				builder.append(Arrays.toString(m)).append('\n');
			for (boolean[] bb : b)
				builder.append(Arrays.toString(bb)).append('\n');
			return "Point [y=" + y + ", x=" + x + ", step=" + step + ", md="
					+ md + ", map=\n" + builder + "]";
		}

		@Override
		public int compareTo(Point o) {
			if(this.md==o.md)
				return o.step-this.step;
			return this.md - o.md;
		}

	}
}