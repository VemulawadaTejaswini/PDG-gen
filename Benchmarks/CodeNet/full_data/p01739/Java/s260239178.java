import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	long MODULO = 1_000_000_000 + 7;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] c = new int[n][n];
		int[] excess = new int[n];
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] g = new ArrayList[n];
		for (int i = 0; i < n; ++i) {
			g[i] = new ArrayList<>();
		}

		int[][] u = new int[n][n];
		for (int src = 0; src < n; ++src) {
			int k = sc.nextInt();
			if (k == 0) {
				g[src].add(0);// end?????????????§????0????????????0???????????????
				u[src][0] = 9999;
				--excess[src];
				++excess[0];
				continue;
			}
			for (int i = 0; i < k; ++i) {
				int dst = sc.nextInt();
				--dst;
				int cost = sc.nextInt();
				c[src][dst] = cost;
				g[src].add(dst);
				u[src][dst] = 9999;
				--excess[src];
				++excess[dst];
			}
		}

		solve(n, excess, g, c, u);
	}

	void solve(int n, int[] excess, ArrayList<Integer>[] g, int[][] c, int[][] u) {
		int[][] f = new int[n][n];
		int s = 0;
		for (int src = 0; src < n; ++src) {
			for (int dst : g[src]) {
				// u[src][dst] = 1;
				s += c[src][dst];
			}
		}
		for (int src = 0; src < n; ++src) {
			for (int dst : g[src]) {
				if (!g[dst].contains(src)) {
					g[dst].add(src);
				}
			}
		}
		System.out.println(minCostFlow(n, u, f, c, g, excess) + s);
	}

	int minCostFlow(int n, int[][] u, int[][] f, int[][] c, ArrayList<Integer>[] g, int[] excess) {
		int[] p = new int[n];
		out: for (int i = 0; i < n; ++i) {
			if (excess[i] <= 0) {
				if (i == n - 1)
					break out;
				else
					continue out;
			}
			int[] d = new int[n];
			int[] pre = new int[n];
			Arrays.fill(pre, -1);
			boolean[] vis = new boolean[n];
			Arrays.fill(d, Integer.MAX_VALUE / 16);
			d[i] = 0;
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			pq.add(i);
			while (!pq.isEmpty()) {
				int v = pq.poll();
				if (vis[v])
					continue;
				vis[v] = true;
				for (int dst : g[v]) {
					if (u[v][dst] - f[v][dst] <= 0)
						continue;
					if (c[v][dst] - (p[v] - p[dst]) + d[v] < d[dst]) {
						d[dst] = c[v][dst] - (p[v] - p[dst]) + d[v];
						pq.add(dst);
						pre[dst] = v;
					}
				}
			}
			for (int j = 0; j < n; ++j) {
				p[j] -= d[j];
			}
			for (int j = 0; j < n; ++j) {
				if (excess[j] >= 0)
					continue;
				int ep = Math.min(excess[i], -excess[j]);
				for (int k = j; pre[k] != -1; k = pre[k]) {
					ep = Math.min(ep, u[pre[k]][k] - f[pre[k]][k]);
				}
				for (int k = j; pre[k] != -1; k = pre[k]) {
					f[pre[k]][k] += ep;
					f[k][pre[k]] -= ep;
				}
				excess[i] -= ep;
				excess[j] += ep;
				break;
			}
			i = -1;
		}
		int ans = 0;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				ans += c[i][j] * f[i][j];
			}
		}
		return ans;
	}

	// ?°??´??????¨????????????????????????????????????
	void check(int[][] c, int[] p, int[][] u, int[][] f, int n) {
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (!(u[i][j] - f[i][j] > 0))
					continue;
				if (c[i][j] - (p[i] - p[j]) < 0)
					throw new AssertionError();
			}
		}
		System.out.println("OK");
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}