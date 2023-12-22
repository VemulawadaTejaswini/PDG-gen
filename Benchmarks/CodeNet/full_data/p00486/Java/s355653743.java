import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
	static IO io = new IO();
	public static void main(String[] args) {
		io.nextLong(); //w
		io.nextLong(); //h
		int n = io.nextInt();
		House[] h = new House[n];
		House[] hx = new House[n];
		House[] hy = new House[n];
		for(int i=0;i<n;i++) {
			int x = io.nextInt();
			int y = io.nextInt();
			h[i] = hx[i] = hy[i] = new House(x,y,i);
		}
		if (n == 1) {
			System.out.println(0);
			System.out.println(h[0].x + " " + h[0].y);
			return;
		}
		Arrays.sort(hx, new Comparator<House>() {
			public int compare(House h0, House h1) {
				return Long.signum(h0.x - h1.x);
			}
		});
		Arrays.sort(hy, new Comparator<House>() {
			public int compare(House h0, House h1) {
				return Long.signum(h0.y - h1.y);
			}
		});
		for(int i=0;i<n;i++) {
			hx[i].rx = i;
			hy[i].ry = i;
		}
//		System.out.println(Arrays.toString(h));
//		System.out.println(Arrays.toString(hx));
//		System.out.println(Arrays.toString(hy));
		int mid = (n - 1) / 2;
		long min = Long.MAX_VALUE;
		long minX = -1;
		long minY = -1;
		long[] sumx = new long[3];
		Arrays.fill(sumx, Long.MAX_VALUE);
		for(int i=0;i<3;i++) {
			int i2 = mid - 1 + i;
			if (i2 < 0 || i2 >= n) {
				continue;
			}
			sumx[i] = 0;
			for(int j=0;j<n;j++) {
				sumx[i] += Math.abs(hx[j].x - hx[i2].x);
			}
		}
		long[] sumy = new long[3];
		Arrays.fill(sumy, Long.MAX_VALUE / 4);
		for(int i=0;i<3;i++) {
			int i2 = mid - 1 + i;
			if (i2 < 0 || i2 >= n) {
				continue;
			}
			sumy[i] = 0;
			for(int j=0;j<n;j++) {
				sumy[i] += Math.abs(hy[j].y - hy[i2].y);
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				long sx = hx[mid-1+i].x;
				long sy = hy[mid-1+j].y;
				long max = 0;
				for(int k=0;k<n;k++) {
					max = Math.max(max,Math.abs(h[k].x-sx) + Math.abs(h[k].y-sy));
				}
				long sum = 2 * (sumx[i] + sumy[j]) - max;
				if (sum < min) {
					min = sum;
					minX = sx;
					minY = sy;
				}
			}
		}
		System.out.println(min);
		System.out.println(minX + " " + minY);
	}
	static int comp(long x1,long y1,long x2,long y2) {
		if (x1 != x2) {
			return Long.signum(x1 - x2);
		}
		return Long.signum(y1 - y2);
	}
	static class House {
		long x;
		long y;
		int rx;
		int ry;
		int id;
		public House(long x,long y,int id) {
			this.x = x;
			this.y = y;
			this.id = id;
		}
		public String toString() {
			return "[" + x + "," + y + "],[" + rx + "," + ry + "]:" + id;
		}
	}

}
class IO extends PrintWriter {
	private final InputStream in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	public IO() { this(System.in);}
	public IO(InputStream source) { super(System.out); this.in = source;}
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		}else{
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}
	private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	private static boolean isNewLine(int c) { return c == '\n' || c == '\r';}
	public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
	public boolean hasNextLine() { while(hasNextByte() && isNewLine(buffer[ptr])) ptr++; return hasNextByte();}
	public String next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public char[] nextCharArray(int len) {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		char[] s = new char[len];
		int i = 0;
		int b = readByte();
		while(isPrintableChar(b)) {
			if (i == len) {
				throw new InputMismatchException();
			}
			s[i++] = (char) b;
			b = readByte();
		}
		return s;
	}
	public String nextLine() {
		if (!hasNextLine()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(!isNewLine(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)){
				return minus ? -n : n;
			}else{
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
			throw new NumberFormatException();
		}
		return (int) nl;
	}
	public char nextChar() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		return (char) readByte();
	}
	public double nextDouble() { return Double.parseDouble(next());}
	public int[] nextIntArray(int n) { int[] a = new int[n]; for(int i=0;i<n;i++) a[i] = nextInt(); return a;}
	public long[] nextLongArray(int n) { long[] a = new long[n]; for(int i=0;i<n;i++) a[i] = nextLong(); return a;}
	public double[] nextDoubleArray(int n) { double[] a = new double[n]; for(int i=0;i<n;i++) a[i] = nextDouble(); return a;}
	public void nextIntArrays(int[]... a) { for(int i=0;i<a[0].length;i++) for(int j=0;j<a.length;j++) a[j][i] = nextInt();}
	public int[][] nextIntMatrix(int n,int m) { int[][] a = new int[n][]; for(int i=0;i<n;i++) a[i] = nextIntArray(m); return a;}
	public char[][] nextCharMap(int n,int m) { char[][] a = new char[n][]; for(int i=0;i<n;i++) a[i] = nextCharArray(m); return a;}
	public void close() { super.close(); try {in.close();} catch (IOException e) {}}
}