import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		char[] s = sc.next().toCharArray();

		int n = s.length;

		if (n == a + b + 1) {
			boolean flag = true;
			for (int i = 0; i < n; i++) {
				if (i < a) {
					if (s[i] < '0' || s[i] > '9') {
						flag = false;
					}
				} else if (i == a) {
					if (s[i] != '-') {
						flag = false;
					}
				} else {
					if (s[i] < '0' || s[i] > '9') {
						flag = false;
					}
				}
			}

			if (flag) {
				pr.println("Yes");
				return;
			}
		}

		pr.println("No");
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
