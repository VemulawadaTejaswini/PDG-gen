import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		int f = 0;
		int tmp = n;
		while (tmp > 0) {
			f += tmp % 10;
			tmp /= 10;
		}

		if (n % f == 0) {
			pr.println("Yes");
		} else {
			pr.println("No");
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
