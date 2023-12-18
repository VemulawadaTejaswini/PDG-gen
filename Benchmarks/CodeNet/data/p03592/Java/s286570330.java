import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				int tmp = i * m + j * n - i * j * 2;
				if (tmp == k) {
					pr.println("Yes");
					return;
				}
			}
		}

		pr.println ("No");
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
