import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
	static IO io = new IO();
	public static void main(String[] args) {
		while(true) {
			int r = io.nextInt();
			int c = io.nextInt();
			int q = io.nextInt();
			if (r == 0) {
				break;
			}
			int[][] grid = io.nextIntMatrix(r, c);
			RMQ2D rmq = new RMQ2D(grid);
			for(int qq=0;qq<q;qq++) {
				int r1 = io.nextInt();
				int c1 = io.nextInt();
				int r2 = io.nextInt() + 1;
				int c2 = io.nextInt() + 1;
				io.println(rmq.min(r1, c1, r2, c2));
			}
			io.flush();
			System.gc();
		}
		io.flush();
	}
}
class RMQ2D {
	public static final int INF = Integer.MAX_VALUE;
	int n,m,n2 = 1,m2 = 1;
	int[][] data;
	public RMQ2D (int[][] a) {
		this.n = a.length;
		this.m = a[0].length;
		while(n2 < n) n2 *= 2;
		while(m2 < m) m2 *= 2;
		data = new int[n2*2+1][m2*2+1];
		for(int i=0;i<=n2*2;i++) {
			Arrays.fill(data[i], INF);
		}

		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				data[n2-1+i][m2-1+j] = a[i][j];
			}
			for(int j=m2-2;j>=0;j--) {
				data[n2-1+i][j] = Math.min(data[n2-1+i][j*2+1], data[n2-1+i][j*2+2]);
			}
//			System.out.println(Arrays.toString(data[n2-1+i]));
		}
		for(int i=n2-2;i>=0;i--) {
			for(int j=0;j<=m2*2;j++) {
				data[i][j] = Math.min(data[i*2+1][j], data[i*2+2][j]);
			}
		}
//		System.out.println(Arrays.deepToString(data));
	}

	public int min(int i1,int j1,int i2,int j2) {
		return min(i1,i2,0,0,n2,j1,j2);
	}
	private int min(int a,int b,int k,int l,int r,int j1,int j2) {
		if (r <= a || b <= l) {
			return INF;
		}
		if (a <= l && r <= b) {
			return minRow(k, j1, j2, 0, 0, m2) ;
		}else{
			return Math.min(min(a, b, k*2+1, l, l+r >>> 1, j1, j2), min(a, b, k*2+2, l+r >>> 1, r, j1, j2));
		}
	}
	private int minRow(int ki,int a,int b,int k,int l,int r) {
		if (r <= a || b <= l) {
			return INF;
		}
		if (a <= l && r <= b) {
			return data[ki][k];
		}else{
			return Math.min(minRow(ki, a, b, k*2+1, l, l+r >>> 1), minRow(ki, a, b, k*2+2, l+r >>> 1, r));
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