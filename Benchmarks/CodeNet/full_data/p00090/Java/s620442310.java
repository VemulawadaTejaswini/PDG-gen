import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);

	static boolean solve() {
		int n = in.nextInt();
		if (n == 0) return false;

		int ans = 1;
		double[] x = new double[n];
		double[] y = new double[n];

		for (int i=0; i<n; i++) {
			String[] s = in.next().split(",");
			x[i] = Double.parseDouble(s[0]);
			y[i] = Double.parseDouble(s[1]);
			int cnt = 1;
			for (int j=0; j<i; j++) {
				if ((x[i]-x[j])*(x[i]-x[j]) + (y[i]-y[j])*(y[i]-y[j]) <= 4) {
					cnt++;
				}
			}
			ans = Math.max(ans, cnt);
		}

		out.println(ans);

		return true;
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		while(solve());
		out.flush();

		long end = System.currentTimeMillis();
		//trace(end-start + "ms");
		in.close();
		out.close();
	}

	static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
}