import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();

		int ans = 0;
		for (int i = 0, size = s.length; i < size; i++) {
			if (s[i] == t[i]) {
				ans++;
			}
		}

		pr.println(ans);
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
