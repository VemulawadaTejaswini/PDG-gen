import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastScanner in = new FastScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskB solver = new TaskB();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskB {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int m = in.nextInt();
			List<Integer>[] adj = new List[n];
			for (int i = 0; i < n; i++) {
				adj[i] = new ArrayList<>();
			}
			for (int i = 0; i < m; i++) {
				int a = in.nextInt() - 1;
				int b = in.nextInt() - 1;
				adj[a].add(b);
				adj[b].add(a);
			}
			int k = in.nextInt();
			int[] vs = new int[k];
			int[] ds = new int[k];
			int[] cs = new int[k];
			for (int i = 0; i < k; i++) {
				vs[i] = in.nextInt() - 1;
				ds[i] = in.nextInt();
				cs[i] = in.nextInt();
			}

			final int D = 11;
			int[][] priority = new int[D][n];
			for (int[] arr : priority) {
				Arrays.fill(arr, -1);
			}
			for (int i = 0; i < k; i++) {
				int v = vs[i];
				for (int ttl = 0; ttl <= ds[i]; ttl++) {
					priority[ttl][v] = i;
				}
			}
			PriorityQueue<Item> pq = new PriorityQueue<>();
			for (int ttl = 0; ttl < D; ttl++) {
				for (int i = 0; i < n; i++) {
					if (priority[ttl][i] >= 0) {
						pq.offer(new Item(ttl, i, priority[ttl][i]));
					}
				}
			}
			while (!pq.isEmpty()) {
				Item it = pq.poll();
				int ttl = it.ttl;
				int v = it.v;
				if (priority[ttl][v] != it.priority) {
					continue;
				}
				if (ttl == 0) {
					continue;
				}
				int nttl = ttl - 1;
				for (int u : adj[v]) {
					if (priority[nttl][u] < priority[ttl][v]) {
						priority[nttl][u] = priority[ttl][v];
						pq.offer(new Item(nttl, u, priority[ttl][v]));
					}
				}
			}

			for (int i = 0; i < n; i++) {
				int id = priority[0][i];
				if (id >= 0) {
					out.println(cs[id]);
				} else {
					out.println(0);
				}
			}
		}

		class Item implements Comparable<Item> {
			int ttl;
			int v;
			int priority;

			Item(int ttl, int v, int priority) {
				this.ttl = ttl;
				this.v = v;
				this.priority = priority;
			}

			public int compareTo(Item o) {
				return o.priority - priority;
			}

		}

	}

	static class FastScanner {
		private BufferedReader in;
		private StringTokenizer st;

		public FastScanner(InputStream stream) {
			in = new BufferedReader(new InputStreamReader(stream));
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					String rl = in.readLine();
					if (rl == null) {
						return null;
					}
					st = new StringTokenizer(rl);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}

