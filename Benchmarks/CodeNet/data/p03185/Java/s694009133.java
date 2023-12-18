import java.util.*;
import java.io.*;
import java.awt.Point;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws Exception {
		FastIO sc = new FastIO(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		double C = sc.nextLong();
		
		double heights[] = new double[N];
		for(int i = 0; i < N; i++) heights[i] = sc.nextLong();
		
		for(int i = 0; i < N; i++) {
			double cost = 0;
			if(i > 0) cost = query(heights[i]) + heights[i]*heights[i] + C;
			add(new Line(-2*heights[i], cost + heights[i]*heights[i]));
			
			//System.out.println(i + " " + cost);
			
			if(i == N-1) pw.println(Math.round(cost));
		}
		pw.close();
		
	}
	
	static boolean activeQuery = false;
	static TreeSet<Line> hull = new TreeSet<Line>(new Comparator<Line>() {
		public int compare(Line a, Line b) {
			if(!activeQuery) return -Double.compare(a.m, b.m);
			
			return Double.compare(a.left, b.left);
		}
	});
	
	static void add(Line l) {
		Line temp = hull.lower(l);
		if(temp != null && temp.m == l.m) {
			if(temp.b <= l.b) return;
			else hull.remove(temp);
		}
		temp = hull.ceiling(l);
		if(temp != null && temp.m == l.m) {
			if(temp.b <= l.b) return;
			else hull.remove(temp);
		}
		
		hull.add(l);
		Line left = hull.lower(l);
		Line right = hull.higher(l);
		if(left != null && right != null && right.intersection(l) <= right.left) {
			hull.remove(l);
			return;
		}
		Line nextLeft = (left != null) ? hull.lower(left) : null;
		Line nextRight = (right != null) ? hull.higher(right) : null;
		if(left != null) l.left = l.intersection(left);
		if(right != null) right.left = l.intersection(right);
		while(nextLeft != null && left.left >= nextLeft.intersection(l)) {
			hull.remove(left);
			l.left = l.intersection(left = nextLeft);
			nextLeft = hull.lower(left);
		}
		while(nextRight != null && right.intersection(nextRight) <= l.intersection(nextRight)) {
			hull.remove(right);
			nextRight.left = l.intersection(right = nextRight);
			nextRight = hull.higher(right);
		}
	}
	
	static double query(double x) {
		activeQuery = true;
		Line min = hull.floor(new Line(x));
		activeQuery = false;
		return min.m * x + min.b;
	}
	
	static class Line {
		
		double m, b;
		double left;
		
		public Line(double m, double b) {
			this.m = m;
			this.b = b;
		}
		
		public Line(double x) {
			left = x;
		}
		
		public double intersection(Line l) {
			return (l.b-b)/(m-l.m);
		}
		
	}
	
	static class FastIO {

		//Is your Fast I/O being bad?

		InputStream dis;
		byte[] buffer = new byte[1 << 17];
		int pointer = 0;

		public FastIO(String fileName) throws Exception {
			dis = new FileInputStream(fileName);
		}

		public FastIO(InputStream is) throws Exception {
			dis = is;
		}

		int nextInt() throws Exception {
			int ret = 0;

			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			boolean negative = false;
			if (b == '-') {
				negative = true;
				b = nextByte();
			}
			while (b >= '0' && b <= '9') {
				ret = 10 * ret + b - '0';
				b = nextByte();
			}

			return (negative) ? -ret : ret;
		}

		long nextLong() throws Exception {
			long ret = 0;

			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			boolean negative = false;
			if (b == '-') {
				negative = true;
				b = nextByte();
			}
			while (b >= '0' && b <= '9') {
				ret = 10 * ret + b - '0';
				b = nextByte();
			}

			return (negative) ? -ret : ret;
		}

		byte nextByte() throws Exception {
			if (pointer == buffer.length) {
				dis.read(buffer, 0, buffer.length);
				pointer = 0;
			}
			return buffer[pointer++];
		}

		String next() throws Exception {
			StringBuffer ret = new StringBuffer();

			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			while (b > ' ') {
				ret.appendCodePoint(b);
				b = nextByte();
			}

			return ret.toString();
		}

	}
}
