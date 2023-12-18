import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

	public static void main(String args[]) {
		FastScanner cin = new FastScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	private static void solve(FastScanner cin, PrintWriter cout) {
		assert solve(8, "))))((((").equals("(((())))(((())))");
		assert solve(3, "())").equals("(())");
		assert solve(6, ")))())").equals("(((()))())");
		int n = cin.nextInt();
		String s = cin.next();
		String ans = solve(n, s);
		cout.println(ans);
	}

	private static String solve(int n, String s) {
		int[] dep = new int[s.length() + 1];
		int d = 0;
		dep[0] = d;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				d += 1;
			} else if (c == ')') {
				d -= 1;
			} else {
				throw new IllegalArgumentException();
			}
			dep[i + 1] = d;
		}
		int mind = Arrays.stream(dep).min().getAsInt();
		List<Integer> modDep = Arrays.stream(dep).map(x -> x - mind).boxed().collect(Collectors.toList());
		modDep.add(0, 0);
		modDep.add(0);

		StringBuilder ans = new StringBuilder();
		for (int i = 1; i < modDep.size(); i++) {
			int prev = modDep.get(i - 1);
			int cur = modDep.get(i);
			for (int j = 0; j < cur - prev; j++)
				ans.append('(');
			for (int j = 0; j < prev - cur; j++)
				ans.append(')');
		}
		return ans.toString();
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
