import java.util.*;
import java.util.stream.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);

	static void solve() {
		int n = in.nextInt();
		int x = in.nextInt();
		int[] m = new int[n];
		int sum = 0;
		int min = 100000;
		for (int i=0; i<n; i++) {
			m[i] = in.nextInt();
			sum += m[i];
			min = Math.min(min, m[i]);
		}
		x -= sum;
		out.println((n + x / min));
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