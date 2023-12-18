import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static long rec(long l, long x) {
		if (l%x == 0) {
			return l*2;
		}
		if (l - x > x) {
			return rec(l - x, x) + l*2;
		}
		return rec(x, l-x) + l*2;
	}

	static void solve() {
		long n = in.nextLong();
	 	long x = in.nextLong();
	 	long ans = 0;
	 	out.println((rec(Math.max(x, n-x), Math.min(n-x,x))+x));
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