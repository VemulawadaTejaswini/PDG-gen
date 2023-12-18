import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int k = sc.nextInt();

		for (int i = 0; i < n; i++) {
			if (s[i] != s[k - 1]) {
				s[i] = '*';
			}
		}
		
		pr.println(s);
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
