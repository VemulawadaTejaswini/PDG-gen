
import java.io.IOException;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int h = scanner.nextInt();
			int w = scanner.nextInt();
			if ((h | w) == 0)
				break;
			StringBuilder b = new StringBuilder();
			for (int i = 0; i < h; i++)
				b.append(scanner.next());
			PriorityQueue<Point> pq = new PriorityQueue<Main.Point>();
			int k = b.indexOf("@");
			int gg = b.indexOf("E");
			gy = gg / w;
			gx = gg % w;
			int md = getMD(k / w, k % w);
			pq.offer(new Point(k / w, k % w, b.toString(), 1, md + 1));
			int ans = -1;
			Set<String> set = new HashSet<String>();
			loop: while (!pq.isEmpty()) {
				Point p = pq.poll();
				String g = p.g;
				int d = p.d;
				int y = p.y;
				int x = p.x;
				int a = y * w + x;
				if (set.contains(g))
					continue;
				set.add(g);
				for (int i = 0; i < 4; i++) {
					int sy = y + dy[i];
					int sx = x + dx[i];
					int aa = sy * w + sx;
					char c = g.charAt(aa);
					if (c == '#' || c == 'w')
						continue;
					if (c == 'E') {
						ans = d;
						break loop;
					}
					if (c == '.') {
						char[] tmp = g.toCharArray();
						tmp[a] = '.';
						tmp[aa] = '@';
						int nmd = getMD(sy, sx);
						pq.offer(new Point(sy, sx, String.valueOf(tmp), d + 1,
								nmd + d + 1));
					}
					if (c == 'c') {
						char[] tmp = g.toCharArray();
						tmp[aa] = '.';
						while (true) {
							int ny = sy + dy[i];
							int nx = sx + dx[i];
							char nc = tmp[ny * w + nx];
							if (nc == '#' || nc == 'c') {
								tmp[sy * w + sx] = 'c';
								break;
							}
							if (nc == 'w') {
								tmp[ny * w + nx] = '.';
								break;
							}
							sy = ny;
							sx = nx;
						}
						pq.offer(new Point(y, x, String.valueOf(tmp), d, p.md));
					}
				}

			}
			System.out.println(ans);
		}
	}

	private int getMD(int i, int j) {
		return Math.abs(i - gy) + Math.abs(j - gx);
	}

	int[] dy = { -1, 0, 0, 1 };
	int[] dx = { 0, -1, 1, 0 };
	int gy;
	int gx;

	class Point implements Comparable<Point> {
		int y, x;
		String g;
		int d, md;

		public Point(int y, int x, String g, int d, int md) {
			super();
			this.y = y;
			this.x = x;
			this.g = g;
			this.d = d;
			this.md = md;
		}

		@Override
		public String toString() {
			return "Point [y=" + y + ", x=" + x + ", g=" + g + ", d=" + d
					+ ", md=" + md + "]";
		}

		@Override
		public int compareTo(Point o) {
			if (md == o.md)
				return o.d - d;
			return md - o.md;
		}

	}
}