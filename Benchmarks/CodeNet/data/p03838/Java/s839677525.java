import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static void solve() {
		int x = in.nextInt();
		int y = in.nextInt();

		int ans = Integer.MAX_VALUE;

		int a = y - x;
		if (a >= 0) ans = Math.min(ans, a);

		a = y + x;
		if (a >= 0) ans = Math.min(ans, a + 1);

		a = x - y;
		if (a >= 0) ans = Math.min(ans, a + 2);

		a = -y - x;
		if (a >= 0) ans = Math.min(ans, a + 1);

		out.println(ans);
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