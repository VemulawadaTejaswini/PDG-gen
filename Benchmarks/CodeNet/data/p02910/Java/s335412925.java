import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[] s = sc.next().toCharArray();
		int n = s.length;
		
		for (int i = 0; i < n; i++) {
			if (i % 2 == 1 && s[i] == 'R') {
				pr.println("No");
				return;
			} else if (i % 2 == 0 && s[i] == 'L') {
				pr.println("No");
				return;
			}
		}

		pr.println("Yes");
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
