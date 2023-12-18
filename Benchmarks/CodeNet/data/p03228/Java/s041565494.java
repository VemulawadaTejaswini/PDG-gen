import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();

		for (int i = 0; i < k; i++) {
			if (i % 2 == 0) {
				a = a / 2;
				b += a;
			} else {
				b = b / 2;
				a += b;
			}
		}
		
		pr.printf("%d %d%n", a, b);
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
