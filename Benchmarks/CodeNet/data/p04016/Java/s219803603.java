import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		long n = sc.nextLong();
		long s = sc.nextLong();

		if (n < s) {
			pr.println(-1);
			return;
		}
		if (n == s) {
			pr.println(n + 1);
			return;
		}

		long ans = INF;
		for (int b = 2; b < Math.min(n, 1_000_000); b++) {
			if (f(n, b) == s) {
				ans = Math.min(ans, b);
			}
		}

		for (int p = 1; p < Math.min(n, 1_000_000); p++) {
			long b = (n - s)  / p + 1;
			if (p < b && f(n, b) == s) {
				ans = Math.min(ans, b);
			}
		}

		if (ans == INF) {
			pr.println(-1);
		} else {
			pr.println(ans);
		}

	}
	
	static final long INF = Long.MAX_VALUE;

	private static long f(long n, long b) {
		long sum = 0;
		while (n > 0) {
			sum += n % b;
			n /= b;
		}
		
		return sum;
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
