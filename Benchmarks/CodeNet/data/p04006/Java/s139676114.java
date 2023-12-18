import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static int n;
	static long[] a;
	static long x;
	static HashMap<String,Long> dp = new HashMap<>();

	static long rec(String state) {
		if (dp.containsKey(state)) {
			return dp.get(state);
		}

		long min = Integer.MAX_VALUE;
		int idx = -1;
		for (int i=0; i<n; i++) {
			if (state.charAt(i) == '0' && min > a[i]) {
				min = a[i];
				idx = i;
			}
		}

		if (idx < 0) {
			return 0;
		}

		StringBuilder sb = new StringBuilder(state);
		sb.setCharAt(idx, '1');

		long min2 = Integer.MAX_VALUE;
		int idx2 = -1;
		for (int i=0; i<n; i++) {
			if (state.charAt((i-1+n)%n) == '0' && min2 > a[i]) {
				min2 = a[i];
				idx2 = i;
			}
		}

		StringBuilder sb2 = new StringBuilder(state);
		sb2.insert(0, sb2.charAt(n-1));
		sb2.deleteCharAt(n);
		sb2.setCharAt(idx2, '1');

		long res = Math.min(rec(sb.toString()) + min, rec(sb2.toString()) + min2 + x);
		dp.put(state, res);
		return res;
	}

	static void solve() {
		n = in.nextInt();
		x = in.nextInt();
		a = new long[n];
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<n; i++) {
			a[i] = in.nextInt();
			sb.append("0");
		}
		out.println(rec(sb.toString()));
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