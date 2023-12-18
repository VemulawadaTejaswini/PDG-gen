import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solver();
	}

	class DJSet {
		int[] upper;

		public DJSet(int n) {
			upper = new int[n];
			Arrays.fill(upper, -1);
		}

		int root(int x) {
			return upper[x] < 0 ? x : (upper[x] = root(upper[x]));
		}

		boolean equiv(int x, int y) {
			return root(x) == root(y);
		}

		void union(int x, int y) {
			x = root(x);
			y = root(y);
			if (x == y)
				return;
			if (upper[x] < upper[y]) {
				x ^= y;
				y ^= x;
				x ^= y;
			}
			upper[y] += upper[x];
			upper[x] = y;
		}
	}

	class Edge implements Comparable<Edge> {
		int u, v;
		long cost;

		public Edge(int u_, int v_, long cost_) {
			u = u_;
			v = v_;
			cost = cost_;
		}

		@Override
		public int compareTo(Edge arg0) {
			return Long.compare(cost, arg0.cost);
		}
	}

	long[][] max;

	void dfs(int cur, int par, int src, ArrayList<Edge>[] g) {
		for (Edge e : g[cur]) {
			if (e.v == par)
				continue;
			max[src][e.v] = Math.max(max[src][e.v], e.cost);
			dfs(e.v, cur, src, g);
		}
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		Edge[] es = new Edge[M];
		ArrayList<Edge>[] g = new ArrayList[N];
		max = new long[N][N];
		for (int i = 0; i < max.length; ++i)
			for (int j = 0; j < max[i].length; ++j)
				max[i][j] = -Long.MAX_VALUE / 3;
		for (int i = 0; i < g.length; ++i)
			g[i] = new ArrayList();
		for (int i = 0; i < M; ++i) {
			int u = Integer.parseInt(sc.next());
			int v = Integer.parseInt(sc.next());
			long c = sc.nextLong();
			--u;
			--v;
			es[i] = new Edge(u, v, c);
		}
		Arrays.sort(es);
		DJSet ds = new DJSet(N);
		long ans = 0;
		for (Edge e : es) {
			if (!ds.equiv(e.u, e.v)) {
				ans += e.cost;
				g[e.u].add(new Edge(e.u, e.v, e.cost));
				g[e.v].add(new Edge(e.v, e.u, e.cost));
				ds.union(e.u, e.v);
			}
		}
		for (int i = 0; i < N; ++i) {
			dfs(i, -1, i, g);
		}
		PrintWriter pw = new PrintWriter(System.out);
		int Q = Integer.parseInt(sc.next());
		for (int i = 0; i < Q; ++i) {
			int s = Integer.parseInt(sc.next());
			int d = Integer.parseInt(sc.next());
			--s;
			--d;
			pw.println(ans - max[s][d]);
		}
		pw.close();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
