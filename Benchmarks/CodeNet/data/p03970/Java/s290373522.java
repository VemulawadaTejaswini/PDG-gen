import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[] s = sc.next().toCharArray();
		char[] cf = "CODEFESTIVAL2016".toCharArray();

		int ret = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] != cf[i]) {
				ret++;
			}
		}

		pr.println(ret);
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
