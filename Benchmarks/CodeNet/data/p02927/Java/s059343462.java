import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int m = sc.nextInt();
		int d = sc.nextInt();

		int ans = 0;
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= d; j++) {
				int d1 = j % 10;
				int d2 = j / 10;
				
				if (d1 >= 2 && d2 >= 2 && d1 * d2 == i) {
					ans++;
				}
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
