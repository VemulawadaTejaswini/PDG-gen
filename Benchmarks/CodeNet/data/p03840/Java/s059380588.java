import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static void solve() {
		int[] a = new int[7];
		for (int i=0; i<7; i++) {
			a[i] = in.nextInt();
		}
		long ans = a[1]*2;

		int p = Math.min(a[3], a[4]);
		int q = Math.min(a[0], p);

		ans += q*6;
		ans += (p - q)*4;
		ans += (a[0] - q)/2*4;

		out.println(ans/2);
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