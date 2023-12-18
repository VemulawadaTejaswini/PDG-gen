import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		IO io = new IO();
		int n = io.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		io.nextIntArrays(a,b,c);
		System.out.println(String.format("%.10f %.10f", solveHalf(n, a, b, c), solveHalf(n, b, a, c)));
	}
	public static double solveHalf(int n,int[] a,int[] b,int[] c) {
//		System.out.println("----");
		Line[] l = new Line[n];
		for(int i=0;i<n;i++) {
			l[i] = new Line(a[i], b[i], c[i]);
		}
		Arrays.sort(l, (l1,l2) -> Double.compare((double) - l1.a / l1.b, (double) - l2.a / l2.b)); //gosa?
		double left = -1e+10;
		double right = 1e+10;
		double[] d = new double[n];
		for(int k=0;k<90;k++) {
			double x = (right + left) / 2;
//			System.out.println(left + "," + x + "," + right);
			for(int i=0;i<n;i++) {
				d[i] = (double) (l[i].c - l[i].a * x) / l[i].b;
			}
//			System.out.println(Arrays.toString(d));
			int inv = inversion(n, 0, n, d);
//			System.out.println(x + "," + inv);
			if (inv <= n * (n - 1) / 2 / 2) {
				right = x;
			}else{
				left = x;
			}
		}
		return left;
	}
	public static double[] temp = new double[40100];
	public static int inversion(int n,int l,int r,double[] d) {
		if (r - l <= 1) {
			return 0;
		}
		int c = (r + l) / 2;
		int ans = inversion(n, l, c, d) + inversion(n, c, r, d);
		//merge sort + count
		int p = l;
		int q = c;
		for(int i=l;i<r;i++) {
			if (p == c) {
				temp[i] = d[q++];
			}else if(q == r) {
				temp[i] = d[p++];
			}else{
				if (d[p] <= d[q]) { //ayashii
					temp[i] = d[p++];
				}else{
					temp[i] = d[q++];
					ans += (c - p);
				}
			}
		}
		for(int i=l;i<r;i++) {
			d[i] = temp[i];
		}
		return ans;
	}
}
class Line {
	int a,b,c;

	public Line(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String toString() {
		return String.format("y=%.4fx+%.4f", (double)-a/b, (double)c/b);
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

