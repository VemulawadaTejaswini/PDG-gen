import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int[] abc = new int[3];
		for (int i = 0; i < 3; i++) {
			abc[i] = sc.nextInt();
		}
		Arrays.sort(abc);

		int k = sc.nextInt();

		abc[2] <<= k;

		pr.println(abc[2] + abc[1] + abc[0]);
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
