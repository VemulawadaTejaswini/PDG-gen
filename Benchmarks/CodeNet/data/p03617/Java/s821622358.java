import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main{ // 

	public static void main(String args[]) {
		ConsoleScanner cin = new ConsoleScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	static long now() {
		return System.currentTimeMillis();
	}

	static void trace(Object... objects) {
		assert null != System.out.format("trace:%s\n", Arrays.deepToString(objects));
	}

	private static void solve(ConsoleScanner cin, PrintWriter cout) {
		// assert solve(1) == 1;

		int q = cin.nextInt();
		int h = cin.nextInt();
		int s = cin.nextInt();
		int d = cin.nextInt();
		int n = cin.nextInt();

		long start = now();

		long ans = solve(q, h, s, d, n);
		cout.println(ans);

		trace("elapsed", now() - start);
	}

	private static long solve(long q, long h, long s, long d, long n) {
		long m = 4 * n;
		long[][] bottles = { { 1, q, 8 * q }, { 2, h, 4 * h }, { 4, s, 2 * s }, { 8, d, d } };
		Arrays.sort(bottles, Comparator.comparingLong(b -> b[2]));
		long ans = 0;
		for (int i = 0; i < bottles.length; i++) {
			ans += m / bottles[i][0] * bottles[i][1];
			m %= bottles[i][0];
		}
		return ans;
	}

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

}
