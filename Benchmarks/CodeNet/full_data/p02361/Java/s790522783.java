import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Task solver = new Task();
		solver.solve(in, out);
		out.close();
	}

	static class Task {
		int V, E, r;

		void solve(InputReader in, PrintWriter out) {
			V = in.nextInt();
			E = in.nextInt();
			r = in.nextInt();
			
			Dijkstra dks = new Dijkstra(V);
			
			for (int i = 0; i < E; ++i) {
				int u = in.nextInt();
				int v = in.nextInt();
				int w = in.nextInt();
				dks.addEdge(u, v, w);
			}

			dks.setDistances(r);

			for (int i = 0; i < V; ++i) {
				int d = dks.getDistance(i);
				out.println(d < 0 ? "INF" : d);
			}
		}
	}

	static class Dijkstra {
		private static int INF = Integer.MAX_VALUE;

		private int[] dst;
		private boolean[] done;
		private List<List<int[]>> nodes;
		private PriorityQueue<int[]> vertexQ;

		public Dijkstra(int n) {
			this.dst = new int[n];
			this.done = new boolean[n];
			this.nodes = new ArrayList<>();
			for (int i = 0; i < n; ++i) {
				nodes.add(new ArrayList<>());
			}
			this.vertexQ = new PriorityQueue<>((u, v) -> u[1] - v[1]);
		}

		private void init() {
			Arrays.fill(dst, INF);
			Arrays.fill(done, false);
			vertexQ.clear();
		}

		public int getDistance(int node) {
			return dst[node] < INF ? dst[node] : -1;
		}

		public void setDistances(int sp) {
			init();

			dst[sp] = 0;
			vertexQ.add(new int[] { sp, dst[sp] });

			while (!vertexQ.isEmpty()) {
				int[] cur = vertexQ.poll();
				int u = cur[0];
				done[u] = true;

				if (dst[u] < cur[1])
					continue;

				for (int[] node : nodes.get(u)) {
					int v = node[0];
					if (done[v])
						continue;
					if (dst[v] > dst[u] + node[1]) {
						dst[v] = dst[u] + node[1];
						vertexQ.add(new int[] { v, dst[v] });
					}
				}
			}
		}

		public void addEdge(int u, int v, int l) {
			nodes.get(u).add(new int[] { v, l });
		}
	}

	static class InputReader {
		static int BUFSIZE = 32768;

		BufferedReader reader;
		StringTokenizer tokenizer;

		InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), BUFSIZE);
			tokenizer = null;
		}

		String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArray(int n) {
			int[] arr = new int[n];
			for (int i = 0; i < n; ++i) {
				arr[i] = nextInt();
			}
			return arr;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] arr = new long[n];
			for (int i = 0; i < n; ++i) {
				arr[i] = nextLong();
			}
			return arr;
		}
	}
}

