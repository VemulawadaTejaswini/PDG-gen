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
		int n = cin.nextInt();
		int k = cin.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < a.length; i++)
			a[i] = cin.nextInt();

		boolean ans = possible(n, k, a);
		if (ans)
			cout.println("POSSIBLE");
		else
			cout.println("IMPOSSIBLE");
	}

	private static boolean possible(int n, int k, int[] a) {
		int gcd = a[0];
		int m = 0;
		for (int aa : a) {
			gcd = gcd(aa, gcd);
			m = Math.max(m, aa);
		}
		boolean ans = true;
		ans &= k <= m;
		ans &= k % gcd == 0;
		return ans;
	}

	private static int gcd(int a, int b) {
		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}
		return b % a == 0 ? a : gcd(a, b % a);
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
	}

}
