import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class Main {
	
	public static double EPS = 1e-9;
	
	public static class Point {
		double x, y;
		
		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		public double norm() {
			return this.x * this.x + this.y * this.y;
		}
		public double abs() {
			return Math.sqrt(this.norm());
		}
		public double cross(Point another) {
			return this.x * another.y - another.x * this.y;
		}
		
		public Point add(Point another) {
			return new Point(this.x + another.x, this.y + another.y);
		}
		public Point subtract(Point another) {
			return new Point(this.x - another.x, this.y - another.y);
		}
		public Point mul(double d) {
			return new Point(this.x * d, this.y * d);
		}
		public Point div(double d) {
			return new Point(this.x / d, this.y / d);
		}
	}
	
	public static class Circle {
		Point p;
		double r;
		
		public Circle (Point p, double r) {
			this.p = p;
			this.r = r;
		}
	}
	
	public static Circle c3(Point a, Point b, Point c) {
		final double A = b.subtract(c).norm();
		final double B = c.subtract(a).norm();
		final double C = a.subtract(b).norm();
		
		final double S = Math.abs(b.subtract(a).cross(c.subtract(a)));
		
		final Point pa = a.mul(A * (B + C - A));
		final Point pb = b.mul(B * (C + A - B));
		final Point pc = c.mul(C * (A + B - C));
		
		final Point p = pa.add(pb).add(pc).div(4 * S * S);
		return new Circle(p, a.subtract(p).abs());
	}
	
	public static Circle c2(Point a, Point b) {
		final Point c = a.add(b).div(2);
		return new Circle(c, a.subtract(c).abs());
	}
	
	public static boolean in_circle(Point p, Circle c) {
		return p.subtract(c.p).norm() <= (c.r * c.r + EPS); 
	}
	
	public static double smallestEnclosingCircle(final int N, Point[] ps) {
		Circle c = c2(ps[0], ps[1]);
		for(int i = 2; i < N; i++) {
			if(in_circle(ps[i], c)) { continue; }
			
			c = c2(ps[0], ps[i]);
			for(int j = 1; j < i; j++) {
				if(in_circle(ps[j], c)) { continue; }
				
				c = c2(ps[j], ps[i]);
				//System.out.println(c.p.x + " " + c.p.y);

				for(int k = 0; k < j; k++) {
					if(in_circle(ps[k], c)) { continue; }
					
					c = c3(ps[i], ps[j], ps[k]);
					//System.out.println(c.p.x + " " + c.p.y);
				}
			}
		}
		
		return c.r;
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			Point[] ps = new Point[N];
			for(int i = 0; i < N; i++) {
				ps[i] = new Point(sc.nextDouble(), sc.nextDouble());
			}
			
			System.out.printf("%.10f\n", smallestEnclosingCircle(N, ps));
		}
	}

	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while(!hasNext()){
				tok = new StringTokenizer(br.readLine());
			}
		}

		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}

		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
		

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) throws IOException {
			final int[] ret = new int[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextInt();
			}
			return ret;
		}

		public long[] nextLongArray(int n) throws IOException {
			final long[] ret = new long[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextLong();
			}
			return ret;
		}

		public void close() throws IOException {
			br.close();
		}
	}
}