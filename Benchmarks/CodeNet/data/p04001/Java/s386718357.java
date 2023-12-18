import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		String s = sc.next();
		int n = s.length();

		long ret = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; i + j <= n; j++) {
				long num = Long.parseLong(s.substring(i, i + j));
				ret += num * num(i) * num(n - (i + j));
			}
		}

		pr.println(ret);
	}

	private static long num(int n) {
		if (n == 0) {
			return 1L;
		} else {
			return 1L << n - 1;
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);

		solve();

		pr.close();
		sc.close();
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}
