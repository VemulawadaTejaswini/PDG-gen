import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}

		long diff = Long.MAX_VALUE;
		int diffi = 0;
		for (int i = 0; i < n; i++) {
			long tmp = t * 1_000 - h[i] * 6;
			tmp = Math.abs(a * 1000 - tmp);
			
//			pr.println(tmp);
			
			if (tmp < diff) {
				diff = tmp;
				diffi = i;
			}
		}
		
		pr.println(diffi + 1);
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
