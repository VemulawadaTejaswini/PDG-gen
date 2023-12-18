import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		int l1 = 0, l2 = 0, l3 = 0;
		for (int i = 0; i < n; i++) {
			if (p[i] <= a) {
				l1++;
			} else if (p[i] <= b) {
				l2++;
			} else {
				l3++;
			}
		}
		
		pr.println(Math.min(l1, Math.min(l2, l3)));
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
