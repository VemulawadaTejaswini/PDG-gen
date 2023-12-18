import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();

		Set<Integer> ts = new TreeSet<>();
		for (int i = a; i <= a + k - 1 && i <= b; i++) {
			ts.add(i);
		}
		for (int i = Math.max(a, b - k + 1); i <= b; i++) {
			ts.add(i);
		}

		for (int e : ts) {
			pr.println(e);
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
