import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);

	static void solve() {

		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();

		while (in.hasNext()) {
			int x = in.nextInt();
			if (x != 0) stack.addLast(x);
			else out.println(stack.pollLast());
			out.flush();
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