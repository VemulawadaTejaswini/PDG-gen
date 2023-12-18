import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[] s1 = sc.next().toCharArray();
		char[] s2 = sc.next().toCharArray();
		char[] s3 = sc.next().toCharArray();

		StringBuilder ret = new StringBuilder();
		ret.append(s1[0]);
		ret.append(s2[0]);
		ret.append(s3[0]);

		pr.println(ret.toString().toUpperCase());
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
