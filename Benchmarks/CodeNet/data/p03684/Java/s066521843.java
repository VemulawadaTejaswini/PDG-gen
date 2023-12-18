import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt(), x[] = new int[n], y[] = new int[n];
		Integer[] indices = new Integer[n];
		for (int i = 0; i < n; i++) {
			indices[i] = i;
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		Arrays.sort(indices, Comparator.comparingInt(i -> x[i]));
		edge[] edges = new edge[2 * (n - 1)];
		for (int i = 0; i + 1 < n; i++)
			edges[i] = new edge(indices[i], indices[i + 1], x[indices[i + 1]] - x[indices[i]]);
		Arrays.sort(indices, Comparator.comparingInt(i -> y[i]));

		for (int i = 0; i + 1 < n; i++)
			edges[i + n - 1] = new edge(indices[i], indices[i + 1], y[indices[i + 1]] - y[indices[i]]);
		DSU dsu = new DSU(n);
		Arrays.sort(edges, (a, b) -> a.c - b.c);
		long ans = 0;
		for (edge edge : edges)
			if (dsu.union(edge.u, edge.v))
				ans += edge.c;
		out.println(ans);
		out.close();

	}

	static class DSU {
		int[] p, r;

		DSU(int n) {
			p = new int[n];
			r = new int[n];
			for (int i = 0; i < n; i++)
				p[i] = i;
		}

		boolean union(int x, int y) {
			x = findSet(x);
			y = findSet(y);
			if (x == y)
				return false;
			if (r[x] > r[y]) {
				p[y] = x;
			} else {
				p[x] = y;
				if (r[x] == r[y])
					r[y]++;
			}
			return true;

		}

		int findSet(int x) {
			if (p[x] == x)
				return x;
			else
				return p[x] = findSet(p[x]);
		}
	}

	static class edge {
		int u, v, c;

		edge(int x, int y, int z) {
			u = x;
			v = y;
			c = z;
		}
	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		Scanner(String fileName) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(fileName));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		String nextLine() throws IOException {
			return br.readLine();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		boolean ready() throws IOException {
			return br.ready();
		}

	}

}