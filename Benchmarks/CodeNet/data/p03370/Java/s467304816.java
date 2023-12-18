import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int x = sc.nextInt();

		int[] m = new int[n];
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			m[i] = sc.nextInt();
			min = Math.min(min, m[i]);
			sum += m[i];
		}

		pr.println(n + (x - sum) / min);
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(INPUT == null ? System.in : new ByteArrayInputStream(INPUT.getBytes()));
		pr = new Printer(System.out);

		solve();

//		pr.close();
		pr.flush();
//		sc.close();
	}

	static String INPUT = null;

	private static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
