import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[] s = sc.next().toCharArray();

		boolean[] a = new boolean[26];
		for (char c : s) {
			a[c - 'a'] = true;
		}

		for (int i = 0; i < 26; i++) {
			if (!a[i]) {
				pr.println((char)(i + 'a'));
				return;
			}
		}

		pr.println("None");
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
