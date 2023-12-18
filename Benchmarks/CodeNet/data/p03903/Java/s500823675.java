import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main implements Runnable {
	public static void main(String[] args) {
		new Thread(null, new Main(), "", Runtime.getRuntime().maxMemory()).start();
	}

	public void run() {
		solver();
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
		int cost;

		public Edge(int u_, int v_, int cost_) {
			u = u_;
			v = v_;
			cost = cost_;
		}

		@Override
		public int compareTo(Edge arg0) {
			return Integer.compare(cost, arg0.cost);
		}
	}

	int[] max;

	void dfs(int cur, int par, int src, int ma, ArrayList<Edge>[] g) {
		max[cur] = Math.max(max[cur], ma);
		for (Edge e : g[cur]) {
			if (e.v == par)
				continue;
			dfs(e.v, cur, src, Math.max(ma, e.cost), g);
		}
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		ArrayList<Edge>[] g = new ArrayList[N];
		int[][] es = new int[M][3];
		for (int i = 0; i < g.length; ++i)
			g[i] = new ArrayList();
		for (int i = 0; i < M; ++i) {
			int u = Integer.parseInt(sc.next());
			int v = Integer.parseInt(sc.next());
			int c = Integer.parseInt(sc.next());
			--u;
			--v;
			es[i] = new int[] { u, v, c };
		}
		Arrays.sort(es, new Comparator<int[]>() {
			@Override
			public int compare(int[] arg0, int[] arg1) {
				return Integer.compare(arg0[2], arg1[2]);
			}
		});
		long base = 0;
		{
			DJSet ds = new DJSet(N);
			for (int[] e : es) {
				if (!ds.equiv(e[0], e[1])) {
					base += e[2];
					g[e[0]].add(new Edge(e[0], e[1], e[2]));
					g[e[1]].add(new Edge(e[1], e[0], e[2]));
					ds.union(e[0], e[1]);
				}
			}
		}
		ArrayList<int[]>[] qs = new ArrayList[N];
		for (int i = 0; i < qs.length; ++i)
			qs[i] = new ArrayList();
		PrintWriter pw = new PrintWriter(System.out);
		int Q = Integer.parseInt(sc.next());
		for (int i = 0; i < Q; ++i) {
			int s = Integer.parseInt(sc.next());
			int d = Integer.parseInt(sc.next());
			--s;
			--d;
			if (s > d) {
				s ^= d;
				d ^= s;
				s ^= d;
			}
			qs[s].add(new int[] { d, i });
		}
		max = new int[N];
		long[] ans = new long[Q];
		for (int i = 0; i < N; ++i) {
			Arrays.fill(max, 0);
			dfs(i, -1, i, 0, g);
			for (int[] a : qs[i]) {
				ans[a[1]] = base - max[a[0]];
			}
		}
		for (int i = 0; i < ans.length; ++i)
			pw.println(ans[i]);
		pw.close();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
