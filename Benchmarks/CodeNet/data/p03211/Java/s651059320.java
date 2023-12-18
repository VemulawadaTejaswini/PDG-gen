import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		String s = sc.next();
		int n = s.length();

		int min = Integer.MAX_VALUE;
		for (int i = 0; i + 3 <= n; i++) {
			String tmp = s.substring(i, i + 3);

			min = Math.min(min, Math.abs(753 - Integer.parseInt(tmp)));
		}

		pr.println(min);
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);
			
		solve();
			
		pr.close();
		sc.close();
	}

	static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
