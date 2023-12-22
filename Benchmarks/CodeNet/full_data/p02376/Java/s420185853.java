
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static int INF = 1 << 30;
	static int modP = 1000000007;

	static boolean[] used;

	static class TaskX {
		@SuppressWarnings("unchecked")
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int V = in.nextInt(), E = in.nextInt();
			List<Edge>[] G = Stream.generate(ArrayList::new).limit(V).toArray(List[]::new);
			for (int i = 0; i < E; i++) {
				int u = in.nextInt();
				int v = in.nextInt();
				int c = in.nextInt();
				G[u].add(new Edge(v, c, G[v].size()));
				G[v].add(new Edge(u, 0, G[u].size() - 1));
			}

			int flow = 0;
			while (true) {
				used = new boolean[V];
				int f = dfs(0, V - 1, INF, G);
				if (f == 0) break;
				flow += f;
			}
			out.println(flow);

		}

		static int dfs(int u, int v, int f, List<Edge>[] G) {
			if (u == v) return f;
			used[u] = true;
			for (Edge e : G[u]) {
				if (!used[e.to] && e.cap > 0) {
					int d = dfs(e.to, v, Math.min(f, e.cap), G);
					if (d > 0) {
						e.cap -= d;
						G[e.to].get(e.rev).cap += d;
						return d;
					}
				}
			}
			return 0;
		}

	}
	static class Edge {
		int to, cap, rev;
		public Edge(int to, int cap, int rev) {
			this.to = to;
			this.cap = cap;
			this.rev = rev;
		}
	}


	static class InputReader {
		BufferedReader in;
		StringTokenizer tok;

		public String nextString() {
			while (!tok.hasMoreTokens()) {
				try {
					tok = new StringTokenizer(in.readLine(), " ");
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			return tok.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextString());
		}

		public long nextLong() {
			return Long.parseLong(nextString());
		}

		public double nextDouble() {
			return Double.parseDouble(nextString());
		}

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}

	}

}

