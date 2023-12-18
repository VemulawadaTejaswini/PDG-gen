import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static FastReader input = new FastReader();
	static PrintWriter out = new PrintWriter(System.out);

	static int n, m;
	static ArrayList<Integer>[] g;
	static boolean[] gVisited;
	static int[] memo;
	static boolean[] mVisited;

	static int dfs(int s) {

		if (g[s].size() == 0) {
			return 0;
		}

		if (gVisited[s]) {
			return memo[s];
		}

		gVisited[s] = true;

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < g[s].size(); i++) {
			int n = g[s].get(i);
			max = Math.max(max, 1 + dfs(n));
		}

		return memo[s] = max;

	}

	public static void main(String[] args) throws IOException {

		n = input.nextInt();
		m = input.nextInt();

		gVisited = new boolean[n + 1];
		g = new ArrayList[n + 1];
		memo = new int[n + 1];
		mVisited = new boolean[n + 1];

		for (int i = 0; i <= n; i++) {
			g[i] = new ArrayList<>();
		}

		for (int i = 0; i < m; i++) {
			g[input.nextInt()].add(input.nextInt());
		}

		int max = Integer.MIN_VALUE;

		for (int i = 1; i < gVisited.length; i++) {
			if (!gVisited[i]) {
				max = Math.max(dfs(i), max);
			}
		}

		System.out.println(max);

	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreElements()) {
				st = new StringTokenizer(br.readLine());
			}
			return st.nextToken();
		}

		int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		String nextLine() throws IOException {
			String str = "";
			str = br.readLine();
			return str;
		}
	}

}