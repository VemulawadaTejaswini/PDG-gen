import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();

		if (a[0] == 'H' && b[0] == 'H') {
			pr.println('H');
		} else if (a[0] == 'D' && b[0] == 'H') {
			pr.println('D');
		} else if (a[0] == 'H' && b[0] == 'D') {
			pr.println('D');
		} else if (a[0] == 'D' && b[0] == 'D') {
			pr.println('H');
		}
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
