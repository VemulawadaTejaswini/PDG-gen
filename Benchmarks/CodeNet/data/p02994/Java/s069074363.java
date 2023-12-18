import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int l = sc.nextInt();

		int sum = 0;
		int min = Integer.MAX_VALUE;
		int mini = 0;
		for (int i = 0; i < n; i++) {
			sum += l + i;
			if (Math.abs(l + i) < min) {
				min = Math.abs(l + i);
				mini = i;
			}
		}
		
		pr.println(sum - (l + mini));
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
