import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.function.LongSupplier;

public class Main{ // 

	static class ConsoleScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			try {
				while (!st.hasMoreElements())
					st = new StringTokenizer(br.readLine());
				return st.nextToken();
			} catch (IOException e) {
				throw new AssertionError(e);
			}
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

	static LongSupplier now = new LongSupplier() {
		private long t = System.currentTimeMillis();

		@Override
		public long getAsLong() {
			long a = t;
			t = System.currentTimeMillis();
			long ans = t - a;
			return ans;
		}
	};

	public static void main(String args[]) {
		ConsoleScanner cin = new ConsoleScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	static int tr(Object... objects) {
		System.out.println("tr:" + Arrays.deepToString(objects));
		return 0;
	}

	private static void solve(ConsoleScanner cin, PrintWriter cout) {
		// assert solve(1) == 1;

		int a = cin.nextInt();
		int b = cin.nextInt();
		int c = cin.nextInt();
		int d = cin.nextInt();
		int e = cin.nextInt();
		int f = cin.nextInt();

		now.getAsLong();

		String ans = solve(a, b, c, d, e, f);
		cout.println(ans);

		assert 0 == tr("elapsed", now.getAsLong());
	}

	private static String solve(int a, int b, int c, int d, int e, int f) {
		int[] ans = { 100 * a, 0 };
		double max = 0;
		for (int i = 0; 100 * i * b <= f; i++)
			for (int j = 0; 100 * (i * b + j * a) <= f; j++) {
				if (i + j == 0)
					continue;

				int w100 = i * b + j * a;

				for (int s = 0; 100 * w100 + s * d <= f; s++)
					for (int t = 0; 100 * w100 + s * d + t * c <= f; t++) {
						int sug = s * d + t * c;
						if (w100 * e < sug)
							break;
						double dens = sug / (100.0 * w100 + sug);
						if (max < dens) {
							max = dens;
							ans = new int[] { 100 * w100 + sug, sug };
						}
					}
			}

		return ans[0] + " " + ans[1];
	}

}
