import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		int[] c = new int[n - 1];
		int[] s = new int[n - 1];
		int[] f = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {
			c[i] = sc.nextInt();
			s[i] = sc.nextInt();
			f[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			long t = 0;
			for (int j = i; j < n - 1; j++) {
				if (t > s[j]) {
					t = s[j] + (t - s[j] + f[j] - 1) / f[j] * f[j] + c[j];
				} else {
					t = s[j] + c[j];
				}
			}

			pr.println(t);
		}
		pr.println(0);
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
