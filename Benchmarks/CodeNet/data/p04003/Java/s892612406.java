import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	int M = 1000000;
	// int N = 10;

	@SuppressWarnings("unchecked")
	void solve() throws IOException {
		int N = ni();
		int m = ni();

		Set<Integer>[] routes = new Set[M + 1];
		for (int i = 0; i < routes.length; i++)
			routes[i] = new HashSet<Integer>();
		Set<Integer>[] stops = new Set[N + 1];
		for (int i = 0; i < stops.length; i++)
			stops[i] = new HashSet<Integer>();

		for (int i = 0; i < m; i++) {
			int p = ni();
			int q = ni();
			int r = ni();
			routes[r].add(p);
			routes[r].add(q);
			stops[q].add(r);
			stops[p].add(r);
		}
		boolean[] visited = new boolean[N + 1];
		boolean[] visited2 = new boolean[M + 1];

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		visited[1] = true;
		int ans = 1;
		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				int j = q.poll();
				for (int r : stops[j]) {
					if (!visited2[r]) {
						visited2[r] = true;
						for (int j2 : routes[r]) {
							if (j2 == N) {
								out.println(ans);
								return;
							}
							if (!visited[j2]){
								q.add(j2);
								visited[j2] = true;
							}
						}
					}
				}
			}
			ans++;
		}

		out.println(-1);
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
