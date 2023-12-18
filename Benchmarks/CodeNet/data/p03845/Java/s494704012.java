import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		int[] t = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
			sum += t[i];
		}

		int m = sc.nextInt();
		int[] p = new int[m];
		int[] x = new int[m];
		for (int i = 0; i < m; i++) {
			p[i] = sc.nextInt() - 1;
			x[i] = sc.nextInt();
		}

		for (int i = 0; i < m; i++) {
			pr.println(sum - t[p[i]] + x[i]);
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
