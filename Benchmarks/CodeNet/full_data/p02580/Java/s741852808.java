import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	static final StdIn in = new StdIn();
	static final PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		int r = in.nextInt(), c = in.nextInt(), m =  in.nextInt();
		int[][] squares = new int[r][c];
		int[][] bombs = new int[r][c];
		for (int i = 0; i < m; ++i) {
			int a = in.nextInt() - 1, b = in.nextInt() - 1;
			bombs[a][b] = -1;
		}
		HashSet<String> visited = new HashSet<>();
		for (int i = 0; i < r; ++i) {
			for (int j = 0; j < c; ++j) {
				visited.clear();
				int max = 0;
				for (int k = 0; k < r; ++k) {
					if (bombs[k][j] == -1) {
						max++;
						visited.add(k + " " + j);
					}
				}
				for (int k = 0; k < c; ++k) {
					if (bombs[i][k] == -1) {
						if (visited.contains(i + " " + k)) continue;
						max++;
					}
				}
				squares[i][j] = max;
			}
		}
//		for (int i = 0; i < r; ++i)
//			out.println(Arrays.toString(squares[i]));
		int ans = 0;
		for (int i = 0; i < r; ++i)
			ans = Math.max(ans, Arrays.stream(squares[i]).max().orElse(0));
		out.println(ans);
		out.close();
	}
	
	private static class Pair {
		int a, b;
		public Pair(int x, int y) {
			a = x;
			b = y;
		}
	}
	
	private static class StdIn {
		private BufferedReader br;
		private StringTokenizer st;
		public StdIn() {
			st = null;
			br = new BufferedReader(new InputStreamReader(System.in), 1 << 20);
		}
		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
	}
}