import java.util.*;
import java.io.*;

public class Main {

	long INF = Long.MAX_VALUE / 3;

	class Graph {
		int n;

		class Edge {
			int from;
			int to;
			long cost;

			public Edge(int from, int to, long cost) {
				super();
				this.from = from;
				this.to = to;
				this.cost = cost;
			}
		}

		List<Edge>[] graph;
		int m;

		public Graph(int n, List<Edge>[] graph, int m) {
			super();
			this.n = n;
			this.graph = graph;
			this.m = m;
		}

		public Graph(int n) {
			this.n = n;
			graph = new List[n];
			for (int i = 0; i < n; i++) {
				graph[i] = new ArrayList<>();
			}
		}

		long get(int x, int y) {
			long[] dp = new long[n];
			Arrays.fill(dp, INF);
			dp[0] = 0;
			for (int i = 0; i < n; i++) {
				for (Edge e : graph[i]) {
					dp[e.to] = Math.min(dp[e.to], dp[i] + (e.cost == -1e9 ? x : (e.cost == -2e9 ? y : e.cost)));
				}
			}
			return dp[n - 1];
		}

		void addEdge(int from, int to, long min) {
			m++;
			graph[from].add(new Edge(from, to, min));
		}

		void print() {
			out.println(n + " " + m);
			for (int i = 0; i < n; i++) {
				for (Edge e : graph[i]) {
					out.println((e.from + 1) + " " + (e.to + 1) + " "
							+ (e.cost == -1e9 ? "X" : (e.cost == -2e9 ? "Y" : e.cost)));
				}
			}
			out.println(1 + " " + n);
		}
	}

	int max = 17;

	List<Integer>[] graph;

	void solve() {
		int a = in.nextInt(), b = in.nextInt();
		int[][] d = new int[a][b];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				d[i][j] = in.nextInt();
			}
		}
		Graph g = new Graph(a * b + 1);
		long[][] min = new long[a][b];
		for (long[] i : min) {
			Arrays.fill(i, INF);
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (i + 1 < a) {
					g.addEdge(i * b + j, (i + 1) * b + j, (int) -1e9);
				}
				if (j + 1 < b) {
					g.addEdge(i * b + j, i * b + j + 1, (int) -2e9);
				}

				// for (int p = 0; p < a; p++) {
				// for (int q = 0; q < a; q++) {
				// long path = (p + 1) * i + (q + 1) * j;
				// min[i][j] = Math.min(min[i][j], d[p][q] - path);
				// }
				// }
				int p = a - i - 1;
				int q = b - j - 1;
				if (p < a && q < b) {
					g.addEdge(i * b + j, g.n - 1, d[p][q] - (p + 1) * i - (q + 1) * j);
				}
			}
		}

		for (int p = 0; p < a; p++) {
			for (int q = 0; q < b; q++) {
				if (g.get(p + 1, q + 1) != d[p][q]) {
//					System.err.println(p + " " + q + " " + g.get(p + 1, q + 1) + " " + d[p][q]);
					out.println("Impossible");
					return;
				}
			}
		}
		out.println("Possible");
		g.print();
	}

	FastScanner in;
	PrintWriter out;

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
