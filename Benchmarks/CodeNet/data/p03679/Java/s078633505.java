import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (b - a > x) {
			pr.println("dangerous");
		} else if (b - a > 0) {
			pr.println("safe");
		} else {
			pr.println("delicious");
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
