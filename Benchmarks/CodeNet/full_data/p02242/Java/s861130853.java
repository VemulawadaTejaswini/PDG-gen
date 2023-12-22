import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main implements Runnable {
	public static void main(String[] args) {
		// long t = System.currentTimeMillis();
		new Thread(null, new Main(), "", Runtime.getRuntime().maxMemory()).start();
		// System.err.println(System.currentTimeMillis() - t);
	}

	class E {
		int s;
		int d;
		int c;

		public E(int s_, int d_, int c_) {
			s = s_;
			d = d_;
			c = c_;
		}
	}

	@SuppressWarnings("unchecked")
	public void run() {
		Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		// int m = sc.nextInt();
		// int r = sc.nextInt();
		// int t = sc.nextInt();
		// ArrayList<E>[] g = new ArrayList[n];
		// for (int i = 0; i < n; ++i) {
		// g[i] = new ArrayList<>();
		// }
		// for (int i = 0; i < m; ++i) {
		// int a = sc.nextInt();
		// int b = sc.nextInt();
		// int c = sc.nextInt();
		// --a;
		// --b;
		// g[a].add(new E(a, b, c));
		// g[b].add(new E(b, a, c));
		// }
		// int[][] dist = new int[n][n];
		// for (int i = 0; i < n; ++i) {
		// for (int j = 0; j < n; ++j) {
		// if (i != j)
		// dist[i][j] = Integer.MAX_VALUE / 3;
		// }
		// }

		int n = sc.nextInt();
		ArrayList<E>[] g = new ArrayList[n];
		for (int i = 0; i < n; ++i)
			g[i] = new ArrayList<>();
		for (int i = 0; i < n; ++i) {
			int u = sc.nextInt();
			int k = sc.nextInt();
			for (int j = 0; j < k; ++j) {
				int v = sc.nextInt();
				int c = sc.nextInt();
				g[u].add(new E(u, v, c));
			}
		}

		int[] dist = dijkstra(0, g);
		for (int i = 0; i < n; ++i) {
			System.out.println(i + " " + dist[i]);
		}
	}

	int[] dijkstra(int src, ArrayList<E>[] g) {
		class State implements Comparable<State> {
			int s;
			int d;

			public State(int s_, int d_) {
				s = s_;
				d = d_;
			}

			public int compareTo(State o) {
				return Integer.compare(d, o.d);
			};

		}

		int n = g.length;
		int[] dist = new int[n];
		Arrays.fill(dist, Integer.MAX_VALUE / 3);
		dist[src] = 0;
		PriorityQueue<State> pq = new PriorityQueue<>();
		pq.add(new State(src, 0));
		while (!pq.isEmpty()) {
			State state = pq.poll();
			if (dist[state.s] < state.d)
				continue;
			for (E e : g[state.s]) {
				if (dist[e.d] > dist[e.s] + e.c) {
					dist[e.d] = dist[e.s] + e.c;
					pq.add(new State(e.d, dist[e.d]));
				}
			}
		}
		return dist;
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}