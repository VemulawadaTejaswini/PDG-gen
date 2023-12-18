import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
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

		int n = cin.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < a.length; i++)
			a[i] = cin.nextInt();

		long start = now();

		String ans = solve(n, a);
		cout.println(ans);

		trace("elapsed", now() - start);
	}

	private static String solve(int n, int[] a) {
		int m4 = 0;
		int m2 = 0;
		for (int x : a)
			if (x % 4 == 0)
				m4 += 1;
			else if (x % 2 == 0)
				m2 += 1;
		int cur = 0;
		if (m4 > 0)
			cur += 2 * m4 + 1;
		if (cur >= n)
			return "Yes";
		cur -= 1;
		if (m2 == 1)
			return "No";
		cur += m2;
		if (cur >= n)
			return "Yes";
		return "No";
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
