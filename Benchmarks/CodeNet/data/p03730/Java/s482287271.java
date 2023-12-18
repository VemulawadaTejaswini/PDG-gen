import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) {
		FastScanner cin = new FastScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	private static void solve(FastScanner cin, PrintWriter cout) {
		assert solve(7, 5, 1) == true;
		assert solve(2, 2, 1) == false;
		assert solve(1, 100, 97) == true;
		assert solve(40, 98, 58) == true;
		assert solve(77, 42, 36) == false;
		int a = cin.nextInt();
		int b = cin.nextInt();
		int c = cin.nextInt();
		boolean ans = solve(a, b, c);
		if (ans)
			cout.println("YES");
		else
			cout.println("NO");

	}

	private static boolean solve(int a, int b, int c) {
		HashSet<Integer> set = new HashSet<>();
		int num = 0;
		int mod;
		do {
			num += a;
			mod = num % b;
			if (mod == c)
				return true;
			if (set.contains(mod))
				break;
			set.add(mod);
		} while (true);
		return false;
	}

	/**
	 * How to read input in Java — tutorial <br />
	 * By Flatfoot<br />
	 * http://codeforces.com/blog/entry/7018
	 */
	static class FastScanner {
		private BufferedReader br;
		private StringTokenizer st;

		FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new IllegalStateException(e);
				}
			return st.nextToken();
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				throw new IllegalStateException(e);
			}
			return str;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
