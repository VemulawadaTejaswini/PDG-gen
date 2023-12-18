import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	int M = 1000000;
	// int N = 10;

	void solve() throws IOException {
		int N = ni();
		int m = ni();

		List<Integer>[] routes = new ArrayList[M + 1];
		for (int i = 0; i < routes.length; i++)
			routes[i] = new ArrayList<Integer>();
		List<Integer>[] stops = new ArrayList[N + 1];
		for (int i = 0; i < stops.length; i++)
			stops[i] = new ArrayList<Integer>();

		for (int i = 0; i < m; i++) {
			int p = ni();
			int q = ni();
			int r = ni();
			routes[r].add(p);
			routes[r].add(q);
			stops[q].add(r);
			stops[p].add(r);
		}
		boolean[] visited = new boolean[N+1];
		boolean[] visited2 = new boolean[M + 1];

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		visited[1] = true;
		int ans = 0;
		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				int j = q.poll();
				if (j == N) {
					out.println(ans);
					return;
				}
				for (int r : stops[j]) {
					if (!visited2[r]) {
						visited2[r] = true;
						for (int j2 : routes[r]) {
							if (!visited[j2])
								q.add(j2);
						}
					}
				}
			}
			ans++;
		}

		out.println(-1);
	}

	public class Pair {
		int x, y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	long iitol(int a, int b) {
		return (long) a << 32 | b;
	}

	class UnionFind {
		private int[] parent;

		public UnionFind(int size) {
			parent = new int[size];
			Arrays.fill(parent, -1);
		}

		public boolean union(int x, int y) {
			x = root(x);
			y = root(y);
			if (x != y) {
				if (parent[y] < parent[x]) {
					int tmp = y;
					y = x;
					x = tmp;
				}
				parent[x] += parent[y];
				parent[y] = x;
				return true;
			}
			return false;
		}

		public boolean isConnected(int x, int y) {
			return root(x) == root(y);
		}

		public int root(int x) {
			return parent[x] < 0 ? x : (parent[x] = root(parent[x]));
		}

		public int size(int x) {
			return -parent[root(x)];
		}

		public ArrayList<ArrayList<Integer>> groups() {
			int n = parent.length;
			ArrayList<ArrayList<Integer>> g = new ArrayList<>();
			HashMap<Integer, Integer> hm = new HashMap<>();
			for (int i = 0; i < n; i++) {
				int r = root(i);
				if (!hm.containsKey(r)) {
					hm.put(r, g.size());
					g.add(new ArrayList<>());
				}
				g.get(hm.get(r)).add(i);
			}
			return g;
		}

		public String toString() {
			return Arrays.toString(parent);
		}
	}

	String ns() throws IOException {
		while (!tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine(), " ");
		}
		return tok.nextToken();
	}

	int ni() throws IOException {
		return Integer.parseInt(ns());
	}

	long nl() throws IOException {
		return Long.parseLong(ns());
	}

	double nd() throws IOException {
		return Double.parseDouble(ns());
	}

	String[] nsa(int n) throws IOException {
		String[] res = new String[n];
		for (int i = 0; i < n; i++) {
			res[i] = ns();
		}
		return res;
	}

	int[] nia(int n) throws IOException {
		int[] res = new int[n];
		for (int i = 0; i < n; i++) {
			res[i] = ni();
		}
		return res;
	}

	long[] nla(int n) throws IOException {
		long[] res = new long[n];
		for (int i = 0; i < n; i++) {
			res[i] = nl();
		}
		return res;
	}

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		tok = new StringTokenizer("");
		Main main = new Main();
		main.solve();
		out.close();
	}
}
