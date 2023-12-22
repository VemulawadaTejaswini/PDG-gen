import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		long cur = System.currentTimeMillis();
		new Main().solver();
//		System.err.println(System.currentTimeMillis() - cur);
	}

	int[] e;
	int n;
	int[] shrink;

	@SuppressWarnings("unchecked")
	void solver() {

		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0)
				break;
			int[] d = new int[n];
			e = new int[n];
			ArrayList<Edge>[] g = new ArrayList[n];
			ArrayList<Edge>[] rev = new ArrayList[n];
			for (int i = 0; i < n; i++) {
				g[i] = new ArrayList<>();
				rev[i] = new ArrayList<>();
			}
			shrink = new int[n];
			int[] num = new int[1001];
			for (int i = 1; i < n - 1; i++) {
				d[i] = sc.nextInt();
				e[i] = sc.nextInt();
				shrink[i] = num[e[i]]++;
			}
			e[0] = 0;
			e[n - 1] = 1000;
			for (int i = 0; i < m; i++) {
				int src = sc.nextInt() - 1;
				int dst = sc.nextInt() - 1;
				int cost = sc.nextInt();
				if (e[src] >= e[dst])
					g[src].add(new Edge(src, dst, cost));
				if (e[src] <= e[dst])
					rev[dst].add(new Edge(dst, src, cost));
			}

			int[][][] cost = new int[n][n][1024];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					Arrays.fill(cost[i][j], INF);
			cost[n - 1][n - 1][1] = 0;
			PriorityQueue<State> pq = new PriorityQueue<>();
			pq.add(new State(n - 1, n - 1));
			while (!pq.isEmpty()) {
				State s = pq.poll();
				for (Edge edge : e[s.from] < e[s.to] ? g[s.to] : rev[s.from]) {
					if (e[edge.src] < e[edge.dst]) {
						continue;
					}
					State ns = s.copy();
					int ncost = cost[s.from][s.to][s.vis] + edge.cost + d[edge.dst];
					if (ns.visited(edge.dst))
						ncost -= d[edge.dst];

					if (e[s.from] < e[s.to])
						ns.setTo(edge.dst);
					else
						ns.setFrom(edge.dst);

					if (ncost < cost[ns.from][ns.to][ns.vis]) {
						cost[ns.from][ns.to][ns.vis] = ncost;
						pq.add(ns);
					}

				}
			}
//			System.out.println(Runtime.getRuntime().totalMemory() / 1000);
			long ans = INF;
			for (int i = 0; i < 1024; i++) {
				ans = Math.min(ans, cost[0][0][i]);
			}
			 System.out.println(ans == INF ? -1 : ans);
		}
	}

	class State implements Comparable<State> {
		int from;
		int to;
		int vis;

		public State(int from, int to) {
			vis = 0;
			this.from = from;
			this.to = to;
			if (e[from] >= e[to])
				vis |= 1 << shrink[from];
			if (e[to] >= e[from])
				vis |= 1 << shrink[to];
		}

		public State(int from, int to, int vis) {
			this.from = from;
			this.to = to;
			this.vis = vis;
		}

		void setFrom(int from) {
			if (e[from] == e[this.from]) {
				vis |= 1 << shrink[from];
			} else if (e[this.from] == e[to]) {

			} else if (e[from] > e[to]) {
				vis = 1 << shrink[from];
			} else if (e[from] == e[to]) {
				vis = 1 << shrink[from] | 1 << shrink[to];
			} else if (e[from] < e[to]) {
				vis = 1 << shrink[to];
			}
			this.from = from;
		}

		void setTo(int to) {
			if (e[to] == e[this.to]) {
				vis |= 1 << shrink[to];
			} else if (e[this.to] == e[from]) {

			} else if (e[to] > e[from]) {
				vis = 1 << shrink[to];
			} else if (e[from] == e[to]) {
				vis = 1 << shrink[from] | 1 << shrink[to];
			} else if (e[to] < e[from]) {
				vis = 1 << shrink[from];
			}
			this.to = to;
		}

		boolean visited(int k) {
			if (e[k] != e[to] && e[k] != e[from])
				return false;
			if (e[to] == e[from] || (e[k] == e[to] && e[to] > e[from]) || (e[k] == e[from] && e[from] > e[to])) {
				return ((vis >> shrink[k]) & 1) == 1;
			} else if (k == to || k == from) {
				return true;
			} else {
				return false;
			}
		}

		State copy() {
			return new State(from, to, vis);
		}

		@Override
		public int compareTo(State o) {
			return -Integer.compare(Math.max(e[this.from], e[this.to]), Math.max(e[o.from], e[o.to]));
		}
	}

	int INF = 1 << 30;

	class Edge {
		int src;
		int dst;
		int cost;

		Edge(int src, int dst, int cost) {
			this.src = src;
			this.dst = dst;
			this.cost = cost;
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}