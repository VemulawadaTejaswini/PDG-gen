import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();
		char[] c = sc.next().toCharArray();
		
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] != b[i] && b[i] != c[i] && c[i] != a[i]) {
				ans += 2;
			} else if (a[i] == b[i] && b[i] == c[i]) {
				
			} else {
				ans += 1;
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
