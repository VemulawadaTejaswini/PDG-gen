import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[] n = sc.next().toCharArray();

		int nn = n.length;

		for (int i = 0; i < nn / 2; i++) {
			if (n[i] != n[nn - 1 - i]) {
				pr.println("No");
				return;
			}
		}

		pr.println("Yes");
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
