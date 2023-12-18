
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	static FastReader input = new FastReader();
	static PrintWriter out = new PrintWriter(System.out);
	static String s, t;

	static int[][] memo;
	static boolean[][] visited;

	public static int lcs(int i, int j) {
		if (i >= s.length() || j >= t.length())
			return 0;

		if (visited[i][j])
			return memo[i][j];

		if (s.charAt(i) == t.charAt(j)) {
			visited[i][j] = true;
			return memo[i][j] = 1 + lcs(i + 1, j + 1);
		}

		visited[i][j] = true;
		int x = lcs(i + 1, j);
		int y = lcs(i, j + 1);
		int best = Math.max(x, y);
		return memo[i][j] = best;

	}

	public static int lcs1(int i, int j) {

		if (i >= s.length() || j >= t.length())
			return 0;

		if (s.charAt(i) == t.charAt(j)) {
			visited[i][j] = true;
			System.out.print(s.charAt(i));
			return 1 + lcs1(i + 1, j + 1);
		}

		visited[i][j] = true;

		int x = lcs(i + 1, j);
		int y = lcs(i, j + 1);

		int optimal = lcs(i, j);

		if (optimal == x) {

			return lcs1(i + 1, j);
		} else {
			return lcs1(i, j + 1);
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		s = input.next();
		t = input.next();

		memo = new int[s.length()][t.length()];

		visited = new boolean[s.length()][t.length()];

		lcs(0, 0);
		lcs1(0, 0);
		out.flush();

	}
}

class FastReader {
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
