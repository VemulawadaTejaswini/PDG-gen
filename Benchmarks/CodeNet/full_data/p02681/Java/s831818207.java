import java.util.*;
import java.io.*;

public class Main {
	static class FS {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		public long[] readLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}
	}

	static final FS sc = new FS();
	static final PrintWriter out = new PrintWriter(System.out);
	static final int mod = 1000000007;

	public static void main(String[] args) {
		solve();
		out.close();
	}

	static void solve() {

		String s1 = sc.next();
		String s2 = sc.next();
		out.flush();
		boolean ok = true;

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				ok = false;
				break;
			}
			

		}
		out.println(ok == true ? "Yes" : "No");
	}
}
