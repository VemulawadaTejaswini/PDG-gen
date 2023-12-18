import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int[] xx = new int[n];
		for (int i = 0; i < n; i++) {
			xx[i] = sc.nextInt();
		}
		Arrays.sort(xx);

		int[] yy = new int[m];
		for (int i = 0; i < m; i++) {
			yy[i] = sc.nextInt();
		}
		Arrays.sort(yy);

		for (int i = x + 1; i <= y; i++) {
			if (i > xx[n - 1] && i <= yy[0]) {
				pr.println("No War");
				return;
			}
		}

		pr.println("War");
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
