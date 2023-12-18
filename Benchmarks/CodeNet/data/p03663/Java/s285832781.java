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
		// 二分法
		// ただし初期のleft, rightが特殊

		// Nより小さい桁ではYYY...NNN
		// Nより同じ桁では全てY
		// Nより大きい桁ではNNN...YYY

		long l = 10;
		for (; l <= (long) 1e11; l *= 10) {
			cout.println("? " + l);
			cout.flush();
			String ans = cin.next();
			if ("N".equals(ans))
				break;
		}
		if (l == (long) 1e12) {
			// The answer is always Y if N = 1
			cout.println("! 1");
			return;
		}
		long r = l * 10 - 1;
		while (l + 1 != r) {
			long m = (l + r) / 2;
			cout.println("? " + m);
			cout.flush();
			String ans = cin.next();
			switch (ans) {
			case "Y":
				r = m;
				break;
			case "N":
				l = m;
				break;
			default:
				throw new IllegalStateException();
			}
		}
		long N = r / 10;
		cout.println("! " + N);
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
