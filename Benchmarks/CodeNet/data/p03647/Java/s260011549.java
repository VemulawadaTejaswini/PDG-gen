import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
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
		int m = cin.nextInt();
		int[][] abs = new int[m][];
		for (int i = 0; i < abs.length; i++)
			abs[i] = new int[] { cin.nextInt(), cin.nextInt() };

		long millis = System.currentTimeMillis();

		boolean ans = solve(n, m, abs);
		if (ans)
			cout.println("POSSIBLE");
		else
			cout.println("IMPOSSIBLE");

		assert null != cout.format("%d elapsed", System.currentTimeMillis() - millis);
	}

	private static boolean solve(int n, int m, int[][] abs) {
		int[] ships = new int[n + 1];
		for (int[] ab : abs) {
			Arrays.sort(ab);
			if (ab[0] == 1)
				ships[ab[1]] += 1;
			if (ab[1] == n)
				ships[ab[0]] += 1;
		}
		boolean ans = 2 == Arrays.stream(ships).max().getAsInt();
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
	}

}
