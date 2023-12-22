import java.util.*;
import java.io.*;

public class Main {

	static void solve (FastScanner in, PrintWriter out, Methods ms) {

		int h = in.nextInt(), w = in.nextInt(), n = in.nextInt();
		char[][] map = new char[h+2][w+2];
		Point[] points = new Point[n+1];
		for (int i=0; i<h+2; i++) {
			for (int j=0; j<w+2; j++) {
				map[i][j] = 'X';
			}
		}
		for (int i=1; i<h+1; i++) {
			String temp = in.next();
			for (int j=1; j<w+1; j++) {
				map[i][j] = temp.charAt(j-1);
				if (map[i][j] == 'S') {
					points[0] = new Point(j, i);
				}
				else if (map[i][j]!='X' && map[i][j]!='.') {
					points[(char)(map[i][j]-'0')] = new Point(j, i);
				}
			}
		}

		//		printCharMap(map);
//		for (int i=0; i<points.length; i++) {
//			out.println(points[i].x + " " + points[i].y);
//		}

		int sum = 0;
		for (int i=0; i<points.length-1; i++) {
			//i=start, i+1=goal
			ArrayDeque<Point> dq = new ArrayDeque<>();
			dq.add(points[i]);
			dq.getFirst().dist = 1;
			
			char[][] tempMap = copyCharMap(map);
			tempMap[dq.getFirst().y][dq.getFirst().x] = 'X';

			loop : while (true) {
				Point p = dq.removeFirst();
				boolean b = false;
				for (int j=0; j<4; j++) {
					int x = p.x + d4[j].x;
					int y = p.y + d4[j].y;
					if (x == points[i+1].x && y == points[i+1].y) {
						sum += p.dist;
						break loop;
					}
					else if (tempMap[y][x] != 'X') {
						dq.add(new Point(x, y));
						dq.getLast().dist = p.dist + 1;
						tempMap[y][x] = 'X';
						b = true;
					}
				}
			}
		}

		out.println(sum);

	}



	static Point[] d4 = {new Point(0, -1), new Point(1, 0), new Point(0, 1), new Point(-1, 0)};

	static class Point {
		int x, y, dist;
		Point (int a, int b) {
			x = a;
			y = b;
		}
	}

	static void printCharMap (char[][] map) {
		for (int i=0; i<map.length; i++) {
			for (int j=0; j<map[0].length; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}

	static char[][] copyCharMap (char[][] map) {
		char[][] a = new char[map.length][map[0].length];
		for (int j=0; j<map.length; j++) {
			for (int k=0; k<map[0].length; k++) {
				a[j][k] = map[j][k];
			}
		}
		return a;
	}



	public static void main(String[] args) {
		FastScanner in = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		Methods ms = new Methods();
		solve(in, out, ms);
		in.close();
		out.close();
	}

	static class Methods {

		public void print (Object... ar) {System.out.println(Arrays.deepToString(ar));}

		public int max (int... ar) {Arrays.sort(ar); return ar[ar.length-1];}

		public int min (int... ar) {Arrays.sort(ar); return ar[0];}

		public long gcd (long a, long b) {return b>0?gcd(b,a%b):a;}

		public long lcm (long a, long b) {return a/gcd(a,b)*b;}

		public long factorial (int i) {
			if (i==1) return 1;
			else return i*factorial(i-1);
		}

		public int manhat (int x1, int y1, int x2, int y2) {
			return Math.abs(x1-x2)+Math.abs(y1-y2);
		}

		public double euclid (double x1, double y1, double x2, double y2) {
			return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
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
