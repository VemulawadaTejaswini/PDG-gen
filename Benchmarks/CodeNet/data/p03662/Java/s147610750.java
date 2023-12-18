

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	static int V;
	static ArrayList<Integer>[] g;
	static int[] size, P, level;

	static void dfs(int u, int p, int depth) {
		size[u]++;
		level[u] = depth;
		for (int v : g[u]) {
			if (v != p) {
				P[v] = u;
				dfs(v, u, depth + 1);
				size[u] += size[v];
			}
		}
	}

	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		V = sc.nextInt();
		g = new ArrayList[V];
		for (int i = 0; i < V; i++)
			g[i] = new ArrayList<>();
		for (int i = 0; i < V - 1; i++) {
			int u = sc.nextInt() - 1, v = sc.nextInt() - 1;
			g[u].add(v);
			g[v].add(u);
		}
		P = new int[V];
		size = new int[V];
		level = new int[V];
		dfs(0, -1, 0);
		// System.err.println(Arrays.toString(size));
		// System.err.println(Arrays.toString(level));
		int nodes = level[V - 1] - level[0] - 1;
		int white = (int) (nodes - Math.ceil(nodes / 2.0));
		int node = V - 1;
		// System.err.println(white);
		while (white-- > 0)
			node = P[node];
		// System.err.println(nodes + " " + node);
		int blackTurns = size[0] - size[node], whiteTurns = size[node];
		out.println(blackTurns > whiteTurns ? "Fennec" : "Snuke");
		out.flush();
		out.close();
	}

	static class MyScanner {
		StringTokenizer st;
		BufferedReader br;

		public MyScanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public MyScanner(String filename) throws IOException {
			br = new BufferedReader(new FileReader(new File(filename)));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public boolean ready() throws IOException {
			return br.ready();
		}
	}
}
