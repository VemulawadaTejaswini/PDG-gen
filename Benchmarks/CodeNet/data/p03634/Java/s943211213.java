import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

public class Main {
	static class Edge {
		int from;
		int to;
		long cost;
		public Edge(int from, int to, long cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
	}
	static int V;
	static int E;
	static Edge[] edges;
	static long[] d;
	static long INF = Long.MAX_VALUE / 2;
	static void bellman_ford(int sv) {
		d = new long[V];
		Arrays.fill(d, INF);
		d[sv] = 0;
		while (true) {
			boolean update = false;
			for (int i = 0; i < E; i++) {
				int u = edges[i].from;
				int v = edges[i].to;
				long c = edges[i].cost;
				if (d[u] + c < d[v]) {
					d[v] = d[u] + c;
					update = true;
				}
			}
			if (!update) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		V = in.nextInt();
		E = (V - 1) * 2;
		edges = new Edge[E];
		for (int i = 0; i < V - 1; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			long c = in.nextLong();
			edges[i * 2] = new Edge(a, b, c);
			edges[i * 2 + 1] = new Edge(b, a, c);
		}
		int q = in.nextInt();
		int k = in.nextInt() - 1;
		bellman_ford(k);
		for (int i = 0; i < q; i++)
			out.println(d[in.nextInt() - 1] + d[in.nextInt() - 1]);
		out.flush();
	}
	public static class InputReader {
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