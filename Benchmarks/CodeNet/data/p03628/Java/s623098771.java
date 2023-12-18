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
		char[][] s = new char[2][];
		s[0] = cin.next().toCharArray();
		s[1] = cin.next().toCharArray();

		long start = now();

		long ans = solve(n, s);
		cout.println(ans);

		trace("elapsed", now() - start);
	}

	private static long solve(int n, char[][] s) {
		// 縦
		// a
		// a
		// または横
		// aa
		// bb
		// のいずれかを横方向に組み合わせてできている
		final long MOD = 1000000007;
		long ans = s[0][0] == s[1][0] ? 3 : 6;
		int start = s[0][0] == s[1][0] ? 1 : 2;
		long[][] m = { { 2, 2 }, { 1, 3 } };
		for (int i = start; i < n; i++) {
			int pre = s[0][i - 1] == s[1][i - 1] ? 0 : 1;
			int cur = s[0][i] == s[1][i] ? 0 : 1;
			ans *= m[pre][cur];
			ans %= MOD;
			i += cur;
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
