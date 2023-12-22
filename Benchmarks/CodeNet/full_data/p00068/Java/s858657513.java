import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	void solve() {
		int n = sc.nextInt();
		if (n == 0) return;
		P[] ps = new P[n];
		for (int i = 0; i < n; i++) {
			String[] ss = sc.next().split(",");
			ps[i] = new P(Double.parseDouble(ss[0]), Double.parseDouble(ss[1]));
		}
		P[] con = convexHull(ps);
		System.out.println(ps.length - con.length);
	}

	final double EPS = 1e-10;

	static class P implements Comparable<P> {
		double x, y;
		public P(double x, double y) {
			this.x = x;
			this.y = y;
		}
		public int compareTo(P o) {
			return x != o.x ? Double.compare(x, o.x) : Double.compare(y, o.y);
		}
		public String toString() {
			return "(" + x + "," + y + ")";
		}
		public double abs() {return sqrt(x * x + y * y); }
		public double abs2() {return (x * x + y * y); }
		public double arg() { return atan2(y, x); } // (-pi 〜 pi)
		public double dist(P o) {return this.sub(o).abs(); }
		public P mul(double k) {return new P(x * k, y * k);}
		public P div(double k) {return new P(x / k, y / k);}
		public P add(P o) {return new P(x + o.x, y + o.y);}
		public P sub(P o) {return new P(x - o.x, y - o.y);}
		public P mul(P o) {return new P(x * o.x - y * o.y,  x * o.y + y * o.x); }
		public P div(P o) {return new P(x * o.x + y * o.y, -x * o.y + y * o.x).div(o.abs2()); }
		public double dot(P o) {return x * o.x + y * o.y;} // a b sin(t)
		public double det(P o) {return x * o.y - y * o.x;} // a b cos(t)
		public P normal() { return this.div(this.abs()); }
		public P rot90() { return new P(-y, x); }
		public static P polar(double d, double rad) {return new P(d * Math.cos(rad), d * Math.sin(rad));}
	}
	P[] convexHull(P[] ps) {
		int n = ps.length;
		if (n <= 1) return ps;
		sort(ps);
		int k = 0;
		P[] qs = new P[n * 2];
		for (int i = 0; i < n; qs[k++] = ps[i++]) {
			while (k > 1 && qs[k-1].sub(qs[k-2]).det(ps[i].sub(qs[k-1])) < EPS) k--;
		}
		for (int i = n-2, t = k; i >= 0; qs[k++] = ps[i--]) {
			while (k > t && qs[k-1].sub(qs[k-2]).det(ps[i].sub(qs[k-1])) < EPS) k--;
		}
		return copyOf(qs, k-1);
	}
	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	MyScanner sc = null;
	PrintWriter out = null;
	public void run() throws Exception {
		sc = new MyScanner(System.in);
		out = new PrintWriter(System.out);
		for (;sc.hasNext();) {
			solve();
			out.flush();
		}
		out.close();
	}

	class MyScanner {
		String line;
		BufferedReader reader;
		StringTokenizer tokenizer;

		public MyScanner(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}
		public void eat() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					line = reader.readLine();
					if (line == null) {
						tokenizer = null;
						return;
					}
					tokenizer = new StringTokenizer(line);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
		public String next() {
			eat();
			return tokenizer.nextToken();
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		public boolean hasNext() {
			eat();
			return (tokenizer != null && tokenizer.hasMoreElements());
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++) a[i] = nextInt();
			return a;
		}
	}
}