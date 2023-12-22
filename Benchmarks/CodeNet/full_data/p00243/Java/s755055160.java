
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
			map = new char[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++)
					map[i][j] = scanner.next().charAt(0);
			}
			int wh = h * w;

			PriorityQueue<Point> pq = new PriorityQueue<Point>();
			char[][] tmp = new char[h][w];
			for (int i = 0; i < h; i++) {
				tmp[i] = Arrays.copyOf(map[i], w);
			}
			char ch = map[0][0];
			int rr = ch == 'R' ? 0 : ch == 'G' ? 1 : 2;
			pq.offer(new Point(0, 0, rr, tmp));
			int ans = 0;
			while (!pq.isEmpty()) {
				Point point = pq.poll();
				if (point.md == wh) {
					ans = point.count;
					break;
				}
				for (int r = 0; r < 3; r++) {
					if (r == point.r)
						continue;
					char[][] tmpMap = new char[h][w];
					for (int i = 0; i < h; i++) {
						tmpMap[i] = Arrays.copyOf(point.map[i], w);
					}
					int md = slove(r, tmpMap);
					pq.offer(new Point(md, point.count + 1, r, tmpMap));
				}
			}
			System.out.println(ans);

		}
	}

	private int slove(int r, char[][] tmpMap) {
		char c = tmpMap[0][0];
		char a = iro[r];
		dfs(0, 0, a, tmpMap, c);
		boolean[][] b = new boolean[h][w];
		Deque<int[]> deque = new ArrayDeque<int[]>();
		deque.push(new int[] { 0, 0 });
		b[0][0] = true;
		int count = 1;
		loop: while (!deque.isEmpty()) {
			int[] yx = deque.peek();
			for (int[] mo : move) {
				int ny = yx[0] + mo[0];
				int nx = yx[1] + mo[1];
				if (ny < 0 || h <= ny || nx < 0 || w <= nx
						|| tmpMap[ny][nx] != a)
					continue;
				if (b[ny][nx])
					continue;
				b[ny][nx] = true;
				count++;
				deque.push(new int[] { ny, nx });
				continue loop;
			}
			deque.poll();
		}
		return count;
	}

	private void dfs(int y, int x, char a, char[][] tmpMap, char c) {
		tmpMap[y][x] = a;
		for (int[] m : move) {
			int ny = m[0] + y;
			int nx = m[1] + x;
			if (ny < 0 || h <= ny || nx < 0 || w <= nx || tmpMap[ny][nx] != c)
				continue;
			dfs(ny, nx, a, tmpMap, c);

		}
	}

	char[] iro = { 'R', 'G', 'B' };
	int h, w;
	char[][] map;
	int[][] move = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };

	class Point implements Comparable<Point> {
		int md, count, r;
		char[][] map;

		public Point(int md, int count, int r, char[][] map) {
			super();
			this.md = md;
			this.count = count;
			this.r = r;
			this.map = map;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < map.length; i++) {
				builder.append(Arrays.toString(map[i])).append('\n');
			}
			return "Point [md=" + md + ", count=" + count + ", r=" + r
					+ ", map=\n" + builder + "]";
		}

		@Override
		public int compareTo(Point o) {
			if (this.count == o.count)
				return o.md - this.md;
			return this.count - o.count;
		}
	}
}