import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static boolean f(int n, int m) {
		int p = n;
		for (int i=m; i>=1; i--) {
			if (p >= i) p -= i;
		}
		return p == 0;
	}

	static void f2(int n, int m) {
		int p = n;
		for (int i=m; i>=1; i--) {
			if (p >= i) {
				p -= i;
				System.out.println(i);
			}
		}
	}

	static void solve() {
		int n = in.nextInt();
		int l = -1, r = n;
		while (r - l > 1) {
			int m = (l+r)/2;
			if (f(n, m)) r = m;
			else l = m;
		}

		f2(n,r);
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