import java.util.*;
import java.util.stream.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);

	static void solve() {
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		if (x > y) {
			int t = x;
			x = y;
			y = t;
			t = a;
			a = b;
			b = t;
		}
		if (a + b <= 2*c) {
			out.println((a*x + b*y));
		} else {
			int ans1 = x*(2*c) + (y-x)*b;
			int ans2 = y*(2*c);
			out.println(Math.min(ans1, ans2));
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