
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int w = scanner.nextInt();
			int h = scanner.nextInt();
			if ((w | h) == 0)
				break;
			int f = scanner.nextInt();
			int m = scanner.nextInt();
			int o = scanner.nextInt();
			int[][] map = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					map[i][j] = scanner.nextInt();
				}
			}
			boolean flag = true;

			PriorityQueue<Point> pq = new PriorityQueue<Point>();

			for (int i = 0; i < w; i++) {
				boolean[][] b = new boolean[h][w];
				pq.offer(new Point(0, i, 0, o - 1, b));
			}
			while (!pq.isEmpty()) {
				Point point = pq.poll();
				int y = point.y;
				int x = point.x;
				if (point.o == 0)
					continue;

				if (y == h) {
					System.out.println(point.cost);
					flag = false;
					break;
				}

				point.b[y][x] = true;
				if (map[y][x] <= 0)
					point.cost -= map[y][x];
				else
					point.o = Math.min(map[y][x] + point.o, m);
				if (point.cost > f)
					continue;

				for (int r = 0; r < 3; r++) {
					int[] mo = move[r];
					int ny = mo[0] + y;
					int nx = mo[1] + x;
					if (nx < 0 || w <= nx)
						continue;
					boolean[][] nb = new boolean[h][w];
					for (int i = 0; i < h; i++)
						nb[i] = Arrays.copyOf(point.b[i], w);

					if (r == 1 && point.y == h - 1) {
						pq.offer(new Point(ny, nx, point.cost, point.o, nb));
					} else if(!point.b[ny][nx]){
						pq.offer(new Point(ny, nx, point.cost, point.o - 1, nb));
					}
				}
			}
			if (flag)
				System.out.println("NA");
		}
	}

	int[][] move = { { 0, -1 }, { 1, 0 }, { 0, 1 } };

	class Point implements Comparable<Point> {
		int y;
		int x;
		int cost;
		int o;
		boolean[][] b;

		public Point(int y, int x, int cost, int o, boolean[][] b) {
			super();
			this.y = y;
			this.x = x;
			this.cost = cost;
			this.o = o;
			this.b = b;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < b.length; i++) {
				builder.append(Arrays.toString(b[i])).append('\n');
			}
			return "Point [y=" + y + ", x=" + x + ", cost=" + cost + ", o=" + o
					+ ", b=\n" + builder + "]";
		}

		@Override
		public int compareTo(Point o) {
			return this.cost - o.cost;
		}

	}
}