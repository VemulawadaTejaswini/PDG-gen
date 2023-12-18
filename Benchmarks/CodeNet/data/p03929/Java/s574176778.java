import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int k = sc.nextInt();

		int r = n / 11 - 1;
		int m = n % 11 + 11;

		long ret = 0;
		if (r > 0) {
			ret += cnt(13, k) * r;
			ret += cnt(m, k);
		} else {
			ret += cnt(n, k);
		}

		pr.println(ret);
	}

	private static long cnt(int n, int k) {
		long ret = 0;

		int base = (1 + 2 + 3 + 8 + 9 + 10 + 15 + 16 + 17) % 11;
		for (int i = 0; i + 2 < n; i++) {
			for (int j = 0; j + 2 < 7; j++) {
				if ((base + j * 9) % 11 == k) {
					ret++;
				}
			}

			base += 63;
			base %= 11;
		}

		return ret;
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
