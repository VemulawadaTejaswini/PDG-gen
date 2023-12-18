import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		long N = sc.nextLong();

		for (int h = 1; h <= 3500; h++) {
			for (int n = 1; n <= 3500; n++) {
				long tmp = N * h * n;
				long tmp2 = 4L * h * n - N * (n + h);

				if (tmp2 > 0 && tmp % tmp2 == 0) {
					pr.printf("%d %d %d\n", h, n, tmp / tmp2);
					return;
				}
			}
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
