import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		@SuppressWarnings("unused")
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();

		int max = 0;
		int x = 0;
		for (char c : s) {
			if (c == 'I') {
				x++;
			} else {
				x--;
			}

			max = Math.max(max, x);
		}

		pr.println(max);
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
