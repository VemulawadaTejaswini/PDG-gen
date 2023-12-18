import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();

		if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
			pr.println(0);
		} else {
			long min = Long.MAX_VALUE;
			min = Math.min(min, a * b);
			min = Math.min(min, b * c);
			min = Math.min(min, c * a);

			pr.println(min);
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
