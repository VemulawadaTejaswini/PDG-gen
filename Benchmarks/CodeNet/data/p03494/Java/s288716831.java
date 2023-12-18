import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int cnt = 0;
			while (a[i] % 2 == 0) {
				a[i] /= 2;
				cnt++;
			}

			min = Math.min(min, cnt);
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
