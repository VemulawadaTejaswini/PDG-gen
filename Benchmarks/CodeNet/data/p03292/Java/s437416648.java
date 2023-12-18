import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();

		int min = Integer.MAX_VALUE;
		min = Math.min(min, Math.abs(a2 - a1) + Math.abs(a3 - a2));
		min = Math.min(min, Math.abs(a3 - a1) + Math.abs(a2 - a3));
		min = Math.min(min, Math.abs(a1 - a2) + Math.abs(a3 - a1));
		min = Math.min(min, Math.abs(a3 - a2) + Math.abs(a1 - a3));
		min = Math.min(min, Math.abs(a1 - a3) + Math.abs(a2 - a1));
		min = Math.min(min, Math.abs(a2 - a3) + Math.abs(a1 - a2));

		pr.println(min);
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
