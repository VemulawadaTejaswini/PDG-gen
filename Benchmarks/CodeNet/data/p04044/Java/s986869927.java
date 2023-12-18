import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	private static final FastIn in = new FastIn();
	private static final PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		Solver sol = new Solver();
		sol.solve();
		out.close();
	}
	private static final class Solver {
		public void solve() {
			int n = in.nextInt(), l = in.nextInt();
			String[] s = new String[n];
			for (int i = 0; i < n; ++i) s[i] = in.next();
			Arrays.sort(s);
			for (int i = 0; i < n; ++i)
				out.print(s[i]);
			out.println();
		}
	}
	private static final class FastIn {
		private BufferedReader br;
		private StringTokenizer st;
		public FastIn() {
			br = new BufferedReader(new InputStreamReader(System.in), 1 << 20);
			st = null;
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
