
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	static FastReader input = new FastReader();
	static PrintWriter out = new PrintWriter(System.out);
	
	static int n, maxW;
	static int[][] memo;
	static int[] w, v;
	static boolean[][] visited;
	static final int INF = (int) 1e9 + 10;

	static int solve(int i, int value) {

		if (value < 0)
			return INF;

		if (i >= n) {
			if (value != 0)
				return INF;

			else
				return 0;

		}

		if (visited[i][value])
			return memo[i][value];

		visited[i][value] = true;

		return memo[i][value] = Math.min(w[i] + solve(i + 1, value - v[i]), solve(i + 1, value));

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		n = input.nextInt();
		maxW = input.nextInt();

		memo = new int[n + 10][1000 + 10];
		visited = new boolean[n + 10][1000 + 10];

		w = new int[n];
		v = new int[n];

		for (int i = 0; i < n; i++) {
			w[i] = input.nextInt();
			v[i] = input.nextInt();
		}

		for (int i = (int) 1e3; i >= 0; i--) {
			if (solve(0, i) <= maxW) {
				System.out.println(i);
				break;
			}
		}

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
