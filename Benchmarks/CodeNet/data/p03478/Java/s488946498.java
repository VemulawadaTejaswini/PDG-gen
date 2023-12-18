import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int ans = 0;
		for (int i = 1; i <= n; i++) {
			int sum = 0;
			int tmp = i;
			while (tmp > 0) {
				sum += tmp % 10;
				tmp /= 10;
			}

			if (sum >= a && sum <= b) {
				ans += i;
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

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}
