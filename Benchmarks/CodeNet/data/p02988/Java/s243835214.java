import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		int ans = 0;
		for (int i = 1; i < n - 1; i++) {
			if (p[i - 1] > p[i] && p[i] > p[i + 1]) {
				ans++;
			} else if (p[i - 1] < p[i] && p[i] < p[i + 1]) {
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
