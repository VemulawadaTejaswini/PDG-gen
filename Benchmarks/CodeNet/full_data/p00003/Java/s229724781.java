import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);

	static void solve() {

		int n = in.nextInt();

		while (n-- > 0) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();

			if (a < b) {
				int t = a; a = b; b = t;
			}
			if (a < c) {
				int t = a; a = c; c = t;
			}

			out.println(a*a == b*b + c*c ? "YES" : "NO");
		}
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		solve();
		out.flush();

		long end = System.currentTimeMillis();
		//trace(end-start + "ms");
		in.close();
		out.close();
	}

	static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
}