import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solver();
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
				g[src].add(new Edge(src, dst, cost));
				rev[dst].add(new Edge(dst, src, cost));
			}

			long[][][] cost = new long[n][n][1024];
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
					long ncost = cost[s.from][s.to][s.vis()] + edge.cost + d[edge.dst];
					if (ns.visited(edge.dst))
						ncost -= d[edge.dst];

					if (e[s.from] < e[s.to])
						ns.setTo(edge.dst);
					else
						ns.setFrom(edge.dst);

					if (ncost < cost[ns.from][ns.to][ns.vis()]) {
						cost[ns.from][ns.to][ns.vis()] = ncost;
						if (e[s.from] < e[ns.from] || e[s.to] < e[ns.to])
							throw new AssertionError();
						pq.add(ns);
					}

				}
			}
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
		int visF = 0;
		int visT = 0;

		public State(int from, int to) {
			this.from = from;
			this.to = to;
			visF |= 1 << shrink[from];
			visT |= 1 << shrink[to];
		}

		public State(int from, int to, int visF, int visT) {
			this.from = from;
			this.to = to;
			this.visF = visF;
			this.visT = visT;
		}

		void setFrom(int from) {
			if (e[this.from] != e[from]) {
				if (e[this.from] == e[this.to])
					visT |= visF;
				visF = 0;
			}
			visF |= 1 << shrink[from];
			this.from = from;
		}

		void setTo(int to) {
			if (e[this.to] != e[to]) {
				if (e[this.from] == e[this.to])
					visF |= visT;
				visT = 0;
			}
			visT |= 1 << shrink[to];
			this.to = to;
		}

		boolean visited(int k) {
			if (e[k] < e[to] && e[k] < e[from])
				return false;
			if (e[to] == e[from] && e[k] == e[to]) {
				return (((visF | visT) >> shrink[k]) & 1) == 1;
			} else if (e[from] == e[k]) {
				return ((visF >> shrink[k]) & 1) == 1;
			} else if (e[to] == e[k])
				return ((visT >> shrink[k]) & 1) == 1;
			else
				return false;
		}

		int vis() {
			if (e[from] == e[to])
				return visF | visT;
			else if (e[from] < e[to])
				return visT;
			else
				return visF;
		}

		State copy() {
			return new State(from, to, visF, visT);
		}

		@Override
		public int compareTo(State o) {
			return -Integer.compare(Math.max(e[this.from], e[this.to]),Math.max(e[o.from], e[o.to]));
		}
	}

	long INF = 1L << 60;

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