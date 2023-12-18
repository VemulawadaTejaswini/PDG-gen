import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
			int[] a = new int[3];
			for (int i = 0; i < 3; ++i) a[i] = in.nextInt();
			int f = 0, s = 0;
			for (int i = 0; i < 3; ++i) if (a[i] % 5 == 0) f++; else if (a[i] % 7 == 0) s++;
			if (f == 2 && s == 1) out.println("YES");
			else out.println("NO");
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
