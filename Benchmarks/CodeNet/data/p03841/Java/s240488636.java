import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;

	void solve() throws IOException {
		int n = nextInt();
		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = nextInt() - 1;
		}

		int[] sortedX = x.clone();
		Arrays.sort(sortedX);

		FlowGraph g = new FlowGraph(3 * (n + 1) + 2, 3 * (n + 1),
				3 * (n + 1) + 1);

		// S to first/second
		for (int i = 0; i < n; i++) {
			int pos = Arrays.binarySearch(sortedX, x[i]);
			g.addDirectedEdge(g.S, pos, i);
			g.addDirectedEdge(g.S, (n + 1) + (pos + 1), n - 1 - i);
		}

		for (int i = 1; i <= n; i++) {
			g.addDirectedEdge(i, i - 1, g.INF);
		}

		for (int i = n - 1; i >= 0; i--) {
			g.addDirectedEdge((n + 1) + i, (n + 1) + (i + 1), g.INF);
		}

		for (int i = 0; i <= n; i++) {
			g.addDirectedEdge(i, 2 * (n + 1) + i, g.INF);
			g.addDirectedEdge((n + 1) + i, 2 * (n + 1) + i, g.INF);

			int size = (i == n ? n * n : sortedX[i]) - (i == 0 ? -1 : sortedX[i - 1]) - 1;

			g.addDirectedEdge(2 * (n + 1) + i, g.T, size);
		}

		int flow = g.maxFlow();

		if (flow != n * (n - 1)) {
			out.println("No");
			return;
		}

		out.println("Yes");

		int[] ans = new int[n * n];
		
		for (int i = 0; i < n; i++) {
			ans[x[i]] = i;
		}
		
		int[] ptr = new int[n + 1];
		ptr[0] = 0;
		for (int i = 0; i < n; i++) {
			ptr[i + 1] = sortedX[i] + 1;
		}

		for (int i = 0; i < n * (n - 1); i++) {
			ArrayList<FlowEdge> lst = g.getFlowPath();
			
			FlowEdge first = lst.get(0);
			FlowEdge last = lst.get(lst.size() - 1);
			
			int who;
			
			if (first.to < n + 1) {
				who = first.cap;
			} else {
				who = n - 1 - first.cap;
			}
			
			
			int where = last.rev.to - 2 * (n + 1);
			
//			System.err.println(who + " " + where);
			
			ans[ptr[where]++] = who;
		}
		
		for (int i = 0; i < n * n; i++) {
			out.print((ans[i] + 1) + " ");
		}
		
		out.println();

	}

	static class FlowGraph {
		int N, S, T;
		static final int INF = Integer.MAX_VALUE / 3;

		List<FlowEdge>[] g;

		private int[] dist;
		private Deque<Integer> q;
		private int[] ptr;

		public FlowGraph(int n, int s, int t) {
			N = n;
			S = s;
			T = t;
			g = new List[N];
			for (int i = 0; i < N; i++) {
				g[i] = new ArrayList<>();
			}
			dist = new int[N];
			q = new ArrayDeque<>();
			ptr = new int[N];
		}

		public void addDirectedEdge(int v1, int v2, int cap) {
			FlowEdge e1 = new FlowEdge(v2, cap);
			FlowEdge e2 = new FlowEdge(v1, 0);
			e1.rev = e2;
			e2.rev = e1;
			g[v1].add(e1);
			g[v2].add(e2);
		}

		public void addUndirectedEdge(int v1, int v2, int cap) {
			FlowEdge e1 = new FlowEdge(v2, cap);
			FlowEdge e2 = new FlowEdge(v1, cap);
			e1.rev = e2;
			e2.rev = e1;
			g[v1].add(e1);
			g[v2].add(e2);
		}

		private boolean bfs() {
			Arrays.fill(dist, INF);
			dist[S] = 0;
			q.clear();
			q.add(S);

			while (!q.isEmpty()) {
				int v = q.poll();
				List<FlowEdge> adj = g[v];
				for (int i = 0; i < adj.size(); i++) {
					FlowEdge e = adj.get(i);
					if (e.flow < e.cap && dist[e.to] > dist[v] + 1) {
						dist[e.to] = dist[v] + 1;
						q.add(e.to);
					}
				}
			}
			return dist[T] != INF;
		}

		private int dfs(int v, int curFlow) {
			if (v == T)
				return curFlow;
			List<FlowEdge> adj = g[v];
			for (; ptr[v] < adj.size(); ptr[v]++) {
				FlowEdge e = adj.get(ptr[v]);
				if (dist[e.to] == dist[v] + 1 && e.flow != e.cap) {
					int go = dfs(e.to, Math.min(curFlow, e.cap - e.flow));
					if (go != 0) {
						e.flow += go;
						e.rev.flow -= go;
						return go;
					}
				}
			}
			return 0;
		}

		public int maxFlow() {
			int flow = 0;

			while (bfs()) {
				Arrays.fill(ptr, 0);
				int addFlow;
				do {
					addFlow = dfs(S, INF);
					flow += addFlow;
				} while (addFlow > 0);
			}

			return flow;
		}

		ArrayList<FlowEdge> getFlowPath() {
			ArrayList<FlowEdge> path = new ArrayList<>();
			int v = S;
			while (v != T) {
				for (int i = 0; i < g[v].size(); i++) {
					FlowEdge e = g[v].get(i);
					if (e.flow > 0) {
						e.flow--;
						e.rev.flow++;
						path.add(e);
						v = e.to;
						break;
					}
				}
			}
			return path;
		}
	}

	static class FlowEdge {
		int to;
		int flow, cap;

		int tag;

		FlowEdge rev;

		public FlowEdge(int to, int cap) {
			this.to = to;
			this.cap = cap;
		}
	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				eof = true;
				return null;
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			eof = true;
			return null;
		}
	}

	int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}
}