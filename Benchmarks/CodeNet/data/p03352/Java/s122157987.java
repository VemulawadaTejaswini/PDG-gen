import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int x = sc.nextInt();

		if (x == 1) {
			pr.println(1);
		} else {
			int max = 0;
			for (int b = 2; b <= x; b++) {
				int tmp = b * b;
				while (tmp <= x) {
					max = Math.max(max, tmp);
					tmp *= b;
				}
			}

			pr.println(max);
		}
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
