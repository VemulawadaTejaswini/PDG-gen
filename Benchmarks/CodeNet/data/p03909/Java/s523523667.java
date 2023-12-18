import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static void solve() {
		int h = in.nextInt();
		int w = in.nextInt();
		for (int i=0; i<h; i++) {
			for (int j=0; j<w; j++) {
				String s = in.next();
				if ("snuke".equals(s)) {
					int a = 'A' + j;
					out.print((char)a);
					out.println((i+1));
				}
			}
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