import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static void solve() {
		int a = in.nextInt();
		int b = in.nextInt();
		if (a > 0) {
			out.println("Positive");
		} else if (a <= 0 && 0 <= b) {
			out.println("Zero");
		} else if (b < 0) {
			out.println((b-a)%2 == 1 ? "Positive" : "Negative");
		}
	}

	public static void main(String[] args) {
		debug = args.length > 0;
		long start = System.nanoTime();

		solve();
		out.flush();

		long end = System.nanoTime();
		dump((end - start) / 1000000 + " ms");
		in.close();
		out.close();
	}

	static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}