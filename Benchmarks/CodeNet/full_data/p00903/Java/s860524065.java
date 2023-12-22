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
			for (int i = 1; i < n - 1; i++) {
				d[i] = sc.nextInt();
				e[i] = sc.nextInt();
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

			long[][] cost = new long[n][n];
			for (int i = 0; i < n; i++)
				Arrays.fill(cost[i], INF);
			cost[n - 1][n - 1] = 0;
			PriorityQueue<State> pq = new PriorityQueue<>();
			pq.add(new State(n - 1, n - 1));
			while (!pq.isEmpty()) {
				State s = pq.poll();
				if (e[s.from] <= e[s.to]) {
					for (Edge edge : g[s.to]) {
						State ns = s.copy();
						if (e[edge.dst] <= e[s.to]) {
							long ncost = cost[s.from][s.to] + edge.cost + d[edge.dst];
							if (ns.setTo(edge.dst))
								ncost -= d[edge.dst];
							if (ncost < cost[ns.from][ns.to]) {
								cost[ns.from][ns.to] = ncost;
								pq.add(ns);
							}
						}
					}
				} else if (e[s.from] > e[s.to]) {
					for (Edge edge : rev[s.from]) {
						State ns = s.copy();
						if (e[edge.dst] <= e[s.from]) {
							long ncost = cost[s.from][s.to] + edge.cost + d[edge.dst];
							if (ns.setFrom(edge.dst))
								ncost -= d[edge.dst];
							if (ncost < cost[ns.from][ns.to]) {
								cost[ns.from][ns.to] = ncost;
								pq.add(ns);
							}
						}
					}
				}
			}
			System.out.println(cost[0][0] == INF ? -1 : cost[0][0]);
		}
	}

	class State implements Comparable<State> {
		int from;
		int to;
		boolean[] arrived = new boolean[n];

		public State(int from, int to) {
			this.from = from;
			this.to = to;
			arrived[this.from] = true;
			arrived[this.to] = true;
		}

		public State(int from, int to, boolean[] arrived) {
			this.from = from;
			this.to = to;
			this.arrived = Arrays.copyOf(arrived, arrived.length);
		}

		boolean setFrom(int from) {
			this.from = from;
			boolean f = arrived[from];
			arrived[from] = true;
			return f;
		}

		boolean setTo(int to) {
			this.to = to;
			boolean f = arrived[to];
			arrived[to] = true;
			return f;
		}

		State copy() {
			return new State(from, to, arrived);
		}

		@Override
		public int compareTo(State o) {
			if (this.from != o.from)
				return Integer.compare(e[this.from], e[o.from]);
			else
				return Integer.compare(e[this.to], e[o.from]);
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