import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[] s = sc.next().toCharArray();
		int n = s.length;

		char[] keyence = "keyence".toCharArray();

		int j = 0;
		for (int i = 0; i < n && j < keyence.length; i++) {
			if (s[i] == keyence[j]) {
				j++;
			}
		}
		
		if (j == keyence.length) {
			pr.println("YES");
		} else {
			pr.println("NO");
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

	static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
