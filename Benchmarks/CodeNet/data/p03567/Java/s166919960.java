import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[] s = sc.next().toCharArray();
		int n = s.length;

		for (int i = 0; i + 1 < n; i++) {
			if (s[i] == 'A' && s[i + 1] == 'C') {
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
