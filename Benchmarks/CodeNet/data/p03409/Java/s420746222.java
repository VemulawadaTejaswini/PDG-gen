import java.io.*;
import java.util.*;

class Main {

	static class Dinic {
		private List<Edge>[] g;
		private int[] level;
		private int[] iterator;

		class Edge {
			int to;
			int cap;
			int residualId;

			public Edge(int to, int cap, int residualId) {
				this.to = to;
				this.cap = cap;
				this.residualId = residualId;
			}
		}

		public Dinic(int n) {
			g = new ArrayList[n];
			level = new int[n];
			iterator = new int[n];
			for (int i = 0; i < g.length; i++) {
				g[i] = new ArrayList<>();
			}
		}

		public void addEdge(int from, int to, int cap) {
			g[from].add(new Edge(to, cap, g[to].size()));
			g[to].add(new Edge(from, 0, g[from].size() - 1)); // residual path
		}

		public long maxFlow(int s, int t) {
			long flow = 0;
			while (true) {
				bfs(s);
				if (level[t] < 0) break;
				Arrays.fill(iterator, 0);
				while (true) {
					long f = dfs(s, t, Long.MAX_VALUE);
					if (f == 0) break;
					flow += f;
				}
			}
			return flow;
		}

		private void bfs(int s) {
			Arrays.fill(level, -1);
			Queue<Integer> q = new LinkedList<>();
			level[s] = 0;
			q.offer(s);
			while (!q.isEmpty()) {
				int v = q.poll();
				for (int i = 0; i < g[v].size(); i++) {
					Edge e = g[v].get(i);
					if (e.cap > 0 && level[e.to] < 0) {
						level[e.to] = level[v] + 1;
						q.offer(e.to);
					}

				}
			}
		}

		private long dfs(int s, int t, long f) {
			if (s == t) return f;
			for (int i = iterator[s]; i < g[s].size(); i = ++iterator[s]) {
				Edge e = g[s].get(i);
				if (e.cap > 0 && level[s] < level[e.to]) {
					long d = dfs(e.to, t, Math.min(e.cap, f));
					if (d > 0) {
						e.cap -= d;
						g[e.to].get(e.residualId).cap += d;
						return d;
					}
				}
			}
			return 0;
		}
	}

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Dinic dinic = new Dinic(n * 2 + 2);
		for (int i = 0; i < n; i++) {
			dinic.addEdge(2 * n, i, 1);
			dinic.addEdge(i + n, 2 * n + 1, 1);
		}

		int[][] a = new int[n][2];
		int[][] b = new int[n][2];
		for (int i = 0; i < n; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i][0] = sc.nextInt();
			b[i][1] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][0] < b[j][0] && a[i][1] < b[j][1]) {
					dinic.addEdge(i, n + j, 1);
				}
			}
		}

		System.out.println(dinic.maxFlow(2 * n, 2 * n + 1));
	}
}
