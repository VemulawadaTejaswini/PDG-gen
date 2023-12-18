import java.io.*;
import java.util.*;

public class Main {
	FastScanner in;
	PrintWriter out;

	class Point {
		int x, y;

		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

	}

	class Edge implements Comparable<Edge> {
		int fr, to;
		double cost;

		public Edge(int fr, int to, double cost) {
			super();
			this.fr = fr;
			this.to = to;
			this.cost = cost;
		}

		public int compareTo(Edge arg0) {
			return Double.compare(cost, arg0.cost);
		}
	}

	int[] p;

	int get(int x) {
		return p[x] == x ? x : (p[x] = get(p[x]));
	}

	void unite(int x, int y) {
		p[get(x)] = get(y);
	}

	void solve() {
		int n = in.nextInt();
		Point[] a = new Point[n];
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = new Point(in.nextInt(), in.nextInt());
			c[i] = in.nextInt();
		}
		double[][] dist = new double[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				double dx = a[i].x - a[j].x;
				double dy = a[i].y - a[j].y;
				dist[i][j] = Math.sqrt(dx * dx + dy * dy);
			}
		}
		Edge[] edges = new Edge[n * (n - 1) / 2];
		int it = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				edges[it++] = new Edge(i, j, dist[i][j]);
			}
		}
		Arrays.sort(edges);
		p = new int[n];
		double[] dp = new double[1 << n];
		for (int mask = 1; mask < 1 << n; mask++) {
			for (int i = 0; i < n; i++) {
				p[i] = i;
			}
			double sum = 0;
			for (int i = 0; i < n; i++) {
				if (((1 << i) & mask) != 0) {
					sum += c[i];
				}
			}
			for (Edge e : edges) {
				if (((1 << e.fr) & mask) != 0) {
					if (((1 << e.to) & mask) != 0) {
						if (get(e.fr) != get(e.to)) {
							unite(e.fr, e.to);
							sum -= e.cost;
						}
					}
				}
			}
			dp[mask] = Math.max(0, sum / Integer.bitCount(mask));
		}
		for (int mask = 1; mask < 1 << n; mask++) {
			for (int s = mask; s > 0; s = (s - 1) & mask) {
				dp[mask] = Math.max(dp[mask], Math.min(dp[s], dp[mask ^ s]));
			}
		}
		out.printf("%.12f\n", dp[(1 << n) - 1]);
	}

	void run() {
		try {
			in = new FastScanner(new File("object.in"));
			out = new PrintWriter(new File("object.out"));

			solve();

			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	void runIO() {

		in = new FastScanner(System.in);
		out = new PrintWriter(System.out);

		solve();

		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		public FastScanner(InputStream f) {
			br = new BufferedReader(new InputStreamReader(f));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				String s = null;
				try {
					s = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (s == null)
					return null;
				st = new StringTokenizer(s);
			}
			return st.nextToken();
		}

		boolean hasMoreTokens() {
			while (st == null || !st.hasMoreTokens()) {
				String s = null;
				try {
					s = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (s == null)
					return false;
				st = new StringTokenizer(s);
			}
			return true;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}
	}

	public static void main(String[] args) {
		new Thread(null, new Runnable() {
			public void run() {
				new Main().runIO();
			}
		}, "1", 1 << 26).start();
	}
}