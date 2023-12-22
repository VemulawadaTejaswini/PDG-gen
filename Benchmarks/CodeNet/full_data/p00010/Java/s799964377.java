import java.util.*;
import java.io.*;

public class Main {

	void solve (FastScanner in, PrintWriter out, Methods ms) {

		int n = in.nextInt();
		for (int i=0; i<n; i++) {
			
			double x1 = in.nextDouble(), y1 = in.nextDouble();
			double x2 = in.nextDouble(), y2 = in.nextDouble();
			double x3 = in.nextDouble(), y3 = in.nextDouble();
			
			double a1 = x2-x1, a2 = x3-x2;
			double b1 = y2-y1, b2 = y3-y2;
			double c1 = -(x2*x2-x1*x1+y2*y2-y1*y1)/2, c2 = -(x3*x3-x2*x2+y3*y3-y2*y2)/2;
			
			double x = (b1*c2-b2*c1)/(a1*b2-a2*b1), y = (a2*c1-a1*c2)/(a1*b2-a2*b1);
			double r = Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
			
			out.println(String.format("%.3f %.3f %.3f", x, y, r));
			
		}

	}



	public static void main(String[] args) {
		Main main = new Main();
		FastScanner in = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		Methods ms = new Methods();
		main.solve(in, out, ms);
		in.close();
		out.close();
	}

	static class Point{
		int y, x;
		Point (int a, int b) {y=a; x=b;}
		int getY() {return y;}
		int getX() {return x;}
	}

	static class Methods {

		public void print (Object... ar) {System.out.println(Arrays.deepToString(ar));}

		public void yesno (PrintWriter out, boolean b) {out.println(b?"Yes":"No");}

		public void YESNO (PrintWriter out, boolean b) {out.println(b?"YES":"NO");}

		public int max (int... ar) {Arrays.sort(ar); return ar[ar.length-1];}

		public int min (int... ar) {Arrays.sort(ar); return ar[0];}

		public long gcd (long a, long b) {return b>0?gcd(b,a%b):a;}

		public long lcm (long a, long b) {return a/gcd(a,b)*b;}

		static int manhat (Point p1, Point p2) {
			return Math.abs(p1.x-p2.x) + Math.abs(p1.y-p2.y);
		}

		static double euclid (Point p1, Point p2) {
			return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y));
		}

		public boolean isPrime (int n) {
			if (n==2) return true;
			if (n<2 || n%2==0) return false;
			for (int i=3; i<=Math.sqrt(n); i+=2) if(n%i==0) return false;
			return true;
		}

	}

	static class FastScanner {

		private InputStream in;
		private byte[] buffer = new byte[1024];
		private  int length = 0, p = 0;

		public FastScanner (InputStream stream) {
			in = stream;
		}

		public boolean hasNextByte () {
			if (p < length) return true;
			else {
				p = 0;
				try {length = in.read(buffer);}
				catch (Exception e) {e.printStackTrace();}
				if (length <= 0) return false;
			}
			return true;
		}

		public int readByte () {
			if (hasNextByte() == true) return buffer[p++];
			return -1;
		}

		public boolean isPrintable (int n) {return 33<=n&&n<=126;}

		public void skip () {
			while (hasNextByte() && !isPrintable(buffer[p])) p++;
		}

		public boolean hasNext () {skip(); return hasNextByte();}

		public String next () {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int t = readByte();
			while (isPrintable(t)) {
				sb.appendCodePoint(t);
				t = readByte();
			}
			return sb.toString();
		}

		public String[] nextArray (int n) {
			String[] ar = new String[n];
			for (int i=0; i<n; i++) ar[i] = next();
			return ar;
		}

		public int nextInt () {return Math.toIntExact(nextLong());}

		public int[] nextIntArray (int n) {
			int[] ar = new int[n];
			for (int i=0; i<n; i++) ar[i] = nextInt();
			return ar;
		}

		public long nextLong () {
			if (!hasNext()) throw new NoSuchElementException();
			boolean minus = false;
			int temp = readByte();
			if (temp == '-') {
				minus = true;
				temp = readByte();
			}
			if (temp<'0' || '9'<temp) throw new NumberFormatException();
			long n = 0;
			while (isPrintable(temp)) {
				if ('0'<=temp && temp<='9') {
					n *= 10;
					n += temp - '0';
				}
				else throw new NumberFormatException();
				temp = readByte();
			}
			return minus? -n : n;
		}

		public long[] nextLongArray (int n) {
			long[] ar = new long[n];
			for (int i=0; i<n; i++) ar[i] = nextLong();
			return ar;
		}

		public double nextDouble () {
			return Double.parseDouble(next());
		}

		public double[] nextDoubleArray (int n) {
			double[] ar = new double[n];
			for (int i=0; i<n; i++) ar[i] = nextDouble();
			return ar;
		}

		public void close () {
			try {in.close();}
			catch(Exception e){}
		}

	}

}
