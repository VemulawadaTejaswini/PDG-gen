import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		new Main().solver();
	}

	@SuppressWarnings("unchecked")
	void solver() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();

		int[][] dist = new int[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(dist, 1 << 30);
		}

		for (int i = 0; i < m; i++) {
			int u = sc.nextInt(), v = sc.nextInt(), d = sc.nextInt();
			dist[u][v] = d;
			dist[v][u] = d;
		}

		int[] p = new int[l];
		long[] t = new long[l];
		for (int i = 0; i < l; i++) {
			p[l] = sc.nextInt();
			t[l] = sc.nextLong();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					dist[j][k] = Math.min(dist[j][k], dist[j][i] + dist[i][k]);
				}
			}
		}

		ArrayList<Edge>[] g = new ArrayList[2 * n + 2];
		for (int i = 0; i < 2 * n + 2; i++) {
			g[i] = new ArrayList<>();
		}

		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				if (dist[p[i]][p[j]] <= t[j] - t[i]) {
					g[p[i]].add(new Edge(p[i], n + p[j], 1));
				}
			}
		}

		for (int i = 0; i < n; i++) {
			g[2 * n - 1].add(new Edge(2 * n - 1, i, 1));
		}
		for (int i = 0; i < n; i++) {
			g[i + n].add(new Edge(i + n, 2 * n, 1));
		}

		Preflow_Relabel pr = new Preflow_Relabel(2 * n - 1, 2 * n, g);
		System.out.println((n - pr.calc()));
	}

	class Preflow_Relabel {
		int n;
		int s;
		int t;
		ArrayList<Edge>[] g;
		int[][] flow;
		int[][] capacity;
		int[] excess;
		int[] height;
		ArrayDeque<Integer>[] B;

		void global_relabeling() {
			ArrayDeque<Integer> que = new ArrayDeque<>();
			boolean[] arrived = new boolean[n];
			que.add(t);
			while (!que.isEmpty()) {
				int v = que.poll();
				for (Edge e : g[v]) {
					if (residue(e.dst, v) > 0 && (height[v] + 1 < height[e.dst] || !arrived[e.dst])) {
						height[e.dst] = height[v] + 1;
						arrived[e.dst] = true;
					}
				}
			}
		}

		@SuppressWarnings("unchecked")
		public Preflow_Relabel(int s, int t, ArrayList<Edge>[] g) {
			this.g = g;
			this.s = s;
			this.t = t;
			n = g.length;
			flow = new int[n][n];
			capacity = new int[n][n];
			height = new int[n];
			height[s] = n;
			excess = new int[n];
			B = new ArrayDeque[n + 1];
			for (int i = 0; i <= n; i++) {
				B[i] = new ArrayDeque<>();
			}
			B[height[s]].add(s);

			for (int i = 0; i < n; i++) {
				for (Edge e : g[i]) {
					if (e.weight > 0) {
						g[e.dst].add(new Edge(e.dst, e.src, 0));
						capacity[e.src][e.dst] += e.weight;
					} else if (e.weight == 0) {
						continue;
					}
				}
			}
		}

		int b = 0;

		@SuppressWarnings("unchecked")
		int calc() {
			int count = 0;
			for (Edge e : g[s]) {
				excess[s] += e.weight;
				push(s, e.dst);
				B[height[e.dst]].add(e.dst);
			}
			global_relabeling();
			for (b = height[s]; b >= 0;) {
				if (B[b].isEmpty()) {
					b--;
					continue;
				}
				int v = B[b].poll();
				if (excess[v] == 0 || v == t || v == s || height[v] > n) {
					continue;
				}

				for (Edge e : g[v]) {
					if (height[e.src] == height[e.dst] + 1) {
						if (residue(e.src, e.dst) > 0) {
							push(e.src, e.dst);
							if (excess[v] == 0)
								break;
						}
					}
				}
				if (excess[v] > 0) {
					int min = 1 << 30;
					for (Edge e : g[v]) {
						if (residue(e.src, e.dst) > 0) {
							min = Math.min(min, height[e.dst]);
						}
					}
					height[v] = min + 1;
					if (height[v] < n) {
						B[height[v]].add(v);
						if (height[v] > b)
							b = height[v];
					}
				}
				if (++count % n == 0) {
					global_relabeling();
				}
			}
			return excess[t];
		}

		int residue(int s, int t) {
			return capacity[s][t] - flow[s][t];
		}

		void push(int u, int v) {
			int delta = Math.min(excess[u], residue(u, v));
			flow[u][v] += delta;
			flow[v][u] -= delta;
			excess[v] += delta;
			excess[u] -= delta;
			if (v != t && v != s && height[v] < n) {
				B[height[v]].add(v);
				if (b < height[v]) {
					b = height[v];
				}
			}
		}
	}

	class Edge {
		int src;
		int dst;
		int weight;

		Edge(int src, int dst, int weight) {
			this.src = src;
			this.dst = dst;
			this.weight = weight;
		}
	}
}