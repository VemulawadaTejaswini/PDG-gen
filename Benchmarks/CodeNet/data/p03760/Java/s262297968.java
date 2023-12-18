import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[] o = sc.next().toCharArray();
		char[] e = sc.next().toCharArray();

		for (int i = 0; i < o.length + e.length; i++) {
			if (i % 2 == 0) {
				pr.print(o[i / 2]);
			} else {
				pr.print(e[i / 2]);
			}
		}
		pr.println();
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
