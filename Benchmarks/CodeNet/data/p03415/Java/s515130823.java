import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[][] c = new char[3][];
		c[0] = sc.next().toCharArray();
		c[1] = sc.next().toCharArray();
		c[2] = sc.next().toCharArray();

		pr.print(c[0][0]);
		pr.print(c[1][1]);
		pr.print(c[2][2]);
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
