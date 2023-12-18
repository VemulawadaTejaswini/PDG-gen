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
			int n = in.nextInt();
			if (n / 10 == 1 || n / 100 == 1 || n / 1000 == 1 || n / 10000 == 1 || n / 100000 == 1) {
				out.println(1);
			} else {
				int ans = 0;
				while (n != 0) {
					ans += n % 10;
					n /= 10;
				}
				out.println(ans);
			}
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
