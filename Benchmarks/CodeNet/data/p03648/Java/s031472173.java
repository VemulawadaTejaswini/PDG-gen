import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Main {

	public static void main(String args[]) {
		ConsoleScanner cin = new ConsoleScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	private static void solve(ConsoleScanner cin, PrintWriter cout) {
		// for (int i = 0; i < 105; i++)
		// cout.println(solve(i));

		long k = cin.nextLong();

		long millis = System.currentTimeMillis();

		String ans = solve(k);

		cout.println(ans);
		assert null != cout.format("elapsed %d", System.currentTimeMillis() - millis);
	}

	private static String solve(long k) {
		int n = 50;
		long[] a = LongStream.range(0, n).toArray();
		long x = k / n;
		for (int i = 0; i < n; i++)
			a[i] += n * x - k + x;
		long mod = k % n;
		for (int i = 0; i < mod; i++)
			a[i] += n + 1;
		String ans = Integer.toString(n) + System.lineSeparator()
				+ Arrays.stream(a).mapToObj(Long::toString).collect(Collectors.joining(" "));
		assert null != System.out.format("%s\r\n", ans);
		assert k == check(n, a);
		return ans;
	}

	private static long check(int n, long[] a) {
		// E: Judge ver. AC
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
		assert null != System.out.format("check %d\r\n", ans);
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
