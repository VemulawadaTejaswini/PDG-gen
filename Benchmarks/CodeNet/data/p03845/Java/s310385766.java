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
		int[] t = new int[n];
		int sum = 0;
		for (int i=0; i<n; i++) {
			t[i]= in.nextInt();
			sum += t[i];
		}
		
		int m = in.nextInt();
		int[] p = new int[m];
		int[] x = new int[m];
		for (int i=0; i<m; i++) {
			p[i] = in.nextInt() - 1;
			x[i] = in.nextInt();
		}
		
		for (int i=0; i<m; i++) {
			out.println((sum - t[p[i]] + x[i]));
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