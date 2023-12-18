import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();
		char[] c = sc.next().toCharArray();

		pr.printf("%c%c%c\n", a[0], b[0], c[0]);
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
