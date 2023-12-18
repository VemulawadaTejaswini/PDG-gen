import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[] c1 = sc.next().toCharArray();
		char[] c2 = sc.next().toCharArray();
//		int h = 2;
		int w = 3;

		for (int i = 0; i < w; i++) {
			if (c1[i] != c2[w - 1 - i]) {
				pr.println("NO");
				return;
			}
		}

		pr.println("YES");
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
