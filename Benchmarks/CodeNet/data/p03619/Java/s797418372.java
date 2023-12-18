import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.AbstractCollection;
import java.util.TreeMap;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.BufferedReader;
import java.util.SortedMap;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastScanner in = new FastScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		ProblemC solver = new ProblemC();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemC {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int x2 = in.nextInt();
			int y2 = in.nextInt();
			int n = in.nextInt();
			int[] x = new int[n];
			int[] y = new int[n];
			for (int i = 0; i < n; i++) {
				x[i] = in.nextInt();
				y[i] = in.nextInt();
			}
			if (x1 > x2) {
				x1 = -x1;
				x2 = -x2;
				for (int i = 0; i < n; i++) {
					x[i] = -x[i];
				}
			}
			if (y1 > y2) {
				y1 = -y1;
				y2 = -y2;
				for (int i = 0; i < n; i++) {
					y[i] = -y[i];
				}
			}

			SortedMap<Integer, Integer> idX = new TreeMap<>();
			SortedMap<Integer, Integer> idY = new TreeMap<>();
			for (int i = 0; i < n; i++) {
				if (x[i] >= x1 && x[i] <= x2 && y[i] >= y1 && y[i] <= y2) {
					idX.put(x[i], i);
					idY.put(y[i], i);
				}
			}

			PriorityQueue<Vertex> pq = new PriorityQueue<>();
			Map<Point, Double> d = new HashMap<>();
			Point s = new Point(x1, y1);
			Point f = new Point(x2, y2);
			d.put(s, 0.0);
			pq.offer(new Vertex(s, 0.0));
			while (!pq.isEmpty()) {
				Vertex ver = pq.poll();
				Point p = ver.p;
				if (d.get(p) != ver.d) {
					continue;
				}
				if (p.equals(f)) {
					break;
				}
				int cx = p.x;
				int cy = p.y;

				if (cx == x2) {
					Point np = f;
					double len = 100 * dist(p, np);
					if (idX.containsKey(cx)) {
						int y3 = y[idX.get(cx)];
						if (y3 >= cy && y3 <= y2) {
							len -= 20;
							len += Math.PI * 10;
						}
					}
					update(pq, d, np, ver.d + len);
				} else if (cy == y2) {
					Point np = f;
					double len = 100 * dist(p, np);
					if (idY.containsKey(cy)) {
						int x3 = x[idY.get(cy)];
						if (x3 >= cx && x3 <= x2) {
							len -= 20;
							len += Math.PI * 10;
						}
					}
					update(pq, d, np, ver.d + len);
				} else {
					if (idX.containsKey(cx)) {
						int y3 = y[idX.get(cx)];
						if (y3 >= cy && y3 <= y2) {
							Point np = new Point(cx + 1, y3);
							double len = 100 * dist(p, np) - 20 + Math.PI * 5;
							update(pq, d, np, ver.d + len);
						}
					}
					if (idY.containsKey(cy)) {
						int x3 = x[idY.get(cy)];
						if (x3 >= cx && x3 <= x2) {
							Point np = new Point(x3, cy + 1);
							double len = 100 * dist(p, np) - 20 + Math.PI * 5;
							update(pq, d, np, ver.d + len);
						}
					}

					{
						SortedMap<Integer, Integer> tm = idX.tailMap(cx + 1);
						int nx = x2;
						if (!tm.isEmpty()) {
							nx = tm.firstKey();
						}
						{
							Point np = new Point(nx, cy);
							double len = 100 * dist(p, np);
							update(pq, d, np, ver.d + len);
						}
					}

					{
						SortedMap<Integer, Integer> tm = idY.tailMap(cy + 1);
						int ny = y2;
						if (!tm.isEmpty()) {
							ny = tm.firstKey();
						}
						{
							Point np = new Point(cx, ny);
							double len = 100 * dist(p, np);
							update(pq, d, np, ver.d + len);
						}
					}
				}
			}
			double ans = d.get(f);
			out.printf("%.15f\n", ans);
		}

		private long dist(Point p1, Point p2) {
			long dx = p1.x - p2.x;
			long dy = p1.y - p2.y;
			return Math.abs(dx) + Math.abs(dy);
		}

		private void update(PriorityQueue<Vertex> pq, Map<Point, Double> d, Point p, double nd) {
			Double cd = d.get(p);
			if (cd != null && Double.compare(cd, nd) <= 0) {
				return;
			}
			d.put(p, nd);
			pq.offer(new Vertex(p, nd));
		}

		class Point {
			int x;
			int y;

			Point(int x, int y) {
				this.x = x;
				this.y = y;
			}

			public int hashCode() {
				return x * 1000000007 + y;
			}

			public boolean equals(Object obj) {
				Point o = (Point) obj;
				return x == o.x && y == o.y;
			}

		}

		class Vertex implements Comparable<Vertex> {
			Point p;
			double d;

			Vertex(Point p, double d) {
				this.p = p;
				this.d = d;
			}

			public int compareTo(Vertex o) {
				return Double.compare(d, o.d);
			}

		}

	}

	static class FastScanner {
		private BufferedReader in;
		private StringTokenizer st;

		public FastScanner(InputStream stream) {
			in = new BufferedReader(new InputStreamReader(stream));
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(in.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}

