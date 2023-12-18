import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) {
		FastScanner cin = new FastScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	private static void solve(FastScanner cin, PrintWriter cout) {
		// 自前の例
		assert Objects.equals(
				solve(4, 5, new int[][] { { 1, 4, 1 }, { 2, 3, 1 }, { 3, 2, 1 }, { 3, 4, 1 }, { 1, 2, 1 } }), "inf");
		// 問題の例
		assert Objects.equals(solve(3, 3, new int[][] { { 1, 2, 4 }, { 2, 3, 3 }, { 1, 3, 5 } }), "7");
		assert Objects.equals(solve(2, 2, new int[][] { { 1, 2, 1 }, { 2, 1, 1 } }), "inf");
		assert Objects.equals(solve(6, 5, new int[][] { { 1, 2, -1000000000 }, { 2, 3, -1000000000 },
				{ 3, 4, -1000000000 }, { 4, 5, -1000000000 }, { 5, 6, -1000000000 } }), "-5000000000");

		int n = cin.nextInt();
		int m = cin.nextInt();
		int[][] abcs = new int[m][];
		for (int i = 0; i < abcs.length; i++)
			abcs[i] = new int[] { cin.nextInt(), cin.nextInt(), cin.nextInt() };

		String ans = solve(n, m, abcs);
		cout.println(ans);
	}

	private static String solve(int n, int m, int[][] abcs) {
		final long UNREACHABLE = Long.MIN_VALUE;
		final int MIN_C = (int) -1e9;

		HashMap<Integer, ArrayList<int[]>> edge = new HashMap<>();
		Arrays.sort(abcs, (abc1, abc2) -> Integer.compare(abc2[2], abc1[2]));
		for (int[] abc : abcs) {
			int from = abc[0] - 1;
			if (!edge.containsKey(from))
				edge.put(from, new ArrayList<>());
			edge.get(from).add(new int[] { abc[1] - 1, -abc[2] - MIN_C });
		}

		long[][] pt = new long[n][n];
		for (long[] p : pt)
			Arrays.fill(p, UNREACHABLE);
		PriorityQueue<long[]> q = new PriorityQueue<long[]>((v, u) -> Long.compare(v[0], u[0]));
		int[] vis = new int[n];
		// 全点対最短経路問題
		for (int from = 0; from < n; from++) {
			// Dijkstra's algorithm
			// (Warshall–Floyd Algorithm isn't suitable, because n is too
			// large.)
			q.clear();
			q.add(new long[] { 0, from, 0 });
			Arrays.fill(vis, 0);
			while (!q.isEmpty()) {
				long[] v = q.poll();
				long cost = v[0];
				int idx = (int) v[1];
				long passedEdges = v[2];
				vis[idx] = 1;
				if (!edge.containsKey(idx))
					continue;
				for (int[] ed : edge.get(idx)) {
					int to = ed[0];
					long ct = cost + ed[1];
					long ne = passedEdges + 1;
					pt[from][to] = Math.max(pt[from][to], -ct - MIN_C * ne);
					if (vis[to] != 0)
						continue;
					q.add(new long[] { ct, to, ne });
				}
			}
		}

		if (pt[0][n - 1] == UNREACHABLE)
			throw new IllegalArgumentException(
					"violated: \"In the given graph, there exists a path from vertex 1 to vertex N.\"");

		int[] positiveCirculted = new int[n];
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (pt[i][j] == UNREACHABLE)
					continue;
				if (pt[j][i] == UNREACHABLE)
					continue;
				if (pt[i][j] + pt[j][i] <= 0)
					continue;
				positiveCirculted[i] = 1;
				positiveCirculted[j] = 1;
			}
		}
		for (int i = 0; i < n; i++) {
			if (pt[0][i] == UNREACHABLE)
				continue;
			if (pt[i][n - 1] == UNREACHABLE)
				continue;
			if (positiveCirculted[i] == 1)
				return "inf";
		}

		String ans = Long.toString(pt[0][n - 1]);
		return ans;
	}

	/**
	 * How to read input in Java — tutorial <br />
	 * By Flatfoot<br />
	 * http://codeforces.com/blog/entry/7018
	 */
	static class FastScanner {
		private BufferedReader br;
		private StringTokenizer st;

		FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new IllegalStateException(e);
				}
			return st.nextToken();
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				throw new IllegalStateException(e);
			}
			return str;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
