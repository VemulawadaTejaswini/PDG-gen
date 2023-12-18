import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) {
		ConsoleScanner cin = new ConsoleScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	private static void solve(ConsoleScanner cin, PrintWriter cout) {
		// assert solve(1) == 1;

		int n = cin.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < a.length; i++)
			a[i] = cin.nextLong();

		long millis = System.currentTimeMillis();

		long ans = solve(n, a);

		cout.println(ans);
		assert null != cout.format("%d elapsed", System.currentTimeMillis() - millis);
	}

	private static long solve(int n, long[] a) {
		long ans = 0;
		long[] opes = new long[n];
		while (true) {
			boolean any = false;
			long sum = 0;
			for (int i = 0; i < n; i++) {
				opes[i] = a[i] / n;
				sum += opes[i];
				any |= opes[i] != 0;
				a[i] %= n;
			}
			for (int i = 0; i < n; i++)
				a[i] += sum - opes[i];

			ans += sum;
			if (!any)
				break;
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
