import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);

	static void solve() {
		double[] a = new double[4];
		double[] b = new double[4];
		for (int i=0; i<4; i++) {
			a[i] = in.nextDouble();
		}
		for (int i=0; i<4; i++) {
			b[i] = in.nextDouble();
		}

		if (b[0] <= a[0] && a[0] <= b[2] && (b[1] <= a[1] && a[1] <= b[3])) {
			out.println("YES");
		} else if (a[0] <= b[0] && b[0] <= a[2] && (a[1] <= b[1] && b[1] <= a[3])) {
			out.println("YES");
		} else if ((a[0] <= b[0] && b[2] <= a[2] && a[1] <= b[1] && b[3] <= a[3])
			|| (b[0] <= a[0] && a[2] <= b[2] && b[1] <= a[1] && a[3] <= b[3])) {
			out.println("YES");
		} else{
			out.println("NO");
		}
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		while(in.hasNext()) solve();
		out.flush();

		long end = System.currentTimeMillis();
		//trace(end-start + "ms");
		in.close();
		out.close();
	}

	static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
}