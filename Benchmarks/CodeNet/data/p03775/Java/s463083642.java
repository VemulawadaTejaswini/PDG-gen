import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		long n = sc.nextLong();

		int min = Integer.MAX_VALUE;
		for (long a = 1; a * a <= n; a++) {
			if (n % a != 0) {
				continue;
			}

			long b = n / a;

			min = Math.min(min, Math.max(Long.toString(a).length(), Long.toString(b).length()));
		}

		pr.println(min);
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
