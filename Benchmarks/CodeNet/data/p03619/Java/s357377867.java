import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.BufferedReader;
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

			Map<Integer, Integer> idX = new HashMap<>();
			Map<Integer, Integer> idY = new HashMap<>();
			for (int i = 0; i < n; i++) {
				if (x[i] >= x1 && x[i] <= x2 && y[i] >= y1 && y[i] <= y2) {
					idX.put(x[i], i);
					idY.put(y[i], i);
				}
			}

			int[] interestingX = new int[idX.size()];
			int[] interestingY = new int[idY.size()];
			int ptr = 0;
			for (int cx : idX.keySet()) {
				interestingX[ptr++] = cx;
			}
			ptr = 0;
			for (int cy : idY.keySet()) {
				interestingY[ptr++] = cy;
			}
			Arrays.sort(interestingX);
			Arrays.sort(interestingY);


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
					boolean okX = false;
					if (idX.containsKey(cx)) {
						int y3 = y[idX.get(cx)];
						if (y3 >= cy && y3 <= y2) {
							okX = true;
							Point np = new Point(cx + 1, y3);
							double len = 100 * dist(p, np) - 20 + Math.PI * 5;
							update(pq, d, np, ver.d + len);
						}
					}
					boolean okY = false;
					if (idY.containsKey(cy)) {
						int x3 = x[idY.get(cy)];
						if (x3 >= cx && x3 <= x2) {
							okY = true;
							Point np = new Point(x3, cy + 1);
							double len = 100 * dist(p, np) - 20 + Math.PI * 5;
							update(pq, d, np, ver.d + len);
						}
					}

					if (!okX || !okY) {
						int id = Arrays.binarySearch(interestingX, cx + 1);
						if (id < 0) {
							id = ~id;
						}
						int nx = x2;
						if (id < interestingX.length) {
							nx = interestingX[id];
						}

						id = Arrays.binarySearch(interestingY, cy + 1);
						if (id < 0) {
							id = ~id;
						}
						int ny = y2;
						if (id < interestingY.length) {
							ny = interestingY[id];
						}

						{
							Point np = new Point(nx, ny);
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

