import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static void solve() {
		int n = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i=0; i<n; i++) {
			a[i] = b[i] = in.nextInt();
		}
		Arrays.sort(b);
		int ans = 0;
		for (int i=0; i<n; i++) {
			if (i%2 != Arrays.binarySearch(b, a[i])%2) {
				ans++;
			}
		}
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