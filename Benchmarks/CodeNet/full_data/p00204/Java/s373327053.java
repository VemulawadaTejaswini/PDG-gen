import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static double dist(double x, double y) {
		return x*x + y*y;
	}

	static double dot(double[] p1, double[] p2) { return p1[0]*p2[0] + p1[1]*p2[1]; }

	static double norm(double[] p1, double[] p2) {
		return (p1[0] - p2[0])*(p1[0] - p2[0]) + (p1[1] - p2[1])*(p1[1] - p2[1]);
	}

	static double[] project(double[][] l, double[] p) {
		double[] p1 = l[0], p2 = l[1];
		double[] v1 = {p2[0] - p1[0], p2[1] - p1[1]};
		double[] v2 = {p[0] - p1[0], p[1] - p1[1]};
		double r = dot(v1, v2) / norm(p1, p2);
		return new double[]{v1[0]*r + p1[0], v1[1]*r + p1[1]};
	}

	static boolean solve() {
		int R = in.nextInt();
		int n = in.nextInt();
		if (R + n == 0) return false;

		ArrayList<double[]> ps = new ArrayList<>();
		int[] r = new int[n];
		int[] v = new int[n];
		for (int i=0; i<n; i++) {
			ps.add(new double[]{in.nextInt(), in.nextInt(), i});
			r[i] = in.nextInt();
			v[i] = in.nextInt();
		}

		int ans = 0;
		while (true) {
			for (int i=0; i<ps.size(); i++) {
				double[] p = ps.get(i);
				// dump(p, Math.sqrt(dist(p[0], p[1])));
				int idx = (int)p[2];
				double d = Math.sqrt(dist(p[0], p[1])) - v[idx];
				double rad = Math.atan2(p[1], p[0]);
				ps.get(i)[0] = Math.cos(rad) * d;
				ps.get(i)[1] = Math.sin(rad) * d;
				// dump(ps.get(i), d);
			}

			Collections.sort(ps, (a, b) -> Double.compare(dist(a[0], a[1]),dist(b[0], b[1])));
			while (ps.size() > 0) {
				double[] p = ps.get(0);
				double dist = dist(p[0], p[1]);
				if (dist + 1e-10 >= R*R) break;
				ps.remove(0);
				ans++;
			}
			if (ps.size() == 0) {
				break;
			}

			double[][] line = {{0, 0}, ps.get(0)};
			int pos = 0;
			while (pos < ps.size()) {
				double[] q = project(line, ps.get(pos));
				double norm = norm(q, ps.get(pos));
				int idx = (int)ps.get(pos)[2];
				if (norm <= r[idx]*r[idx] + 1e-10) {
					ps.remove(pos);
				} else {
					pos++;
				}
			}
		}

		out.println(ans);

		return true;
	}

	public static void main(String[] args) {
		debug = args.length > 0;
		long start = System.nanoTime();

		while(solve());
		out.flush();

		long end = System.nanoTime();
		dump((end - start) / 1000000 + " ms");
		in.close();
		out.close();
	}

	static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}