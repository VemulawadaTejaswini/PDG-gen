package aoj2592;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		IO io = new IO();
		while (true) {
			int n = io.nextInt();
			if (n == 0) {
				break;
			}
			int pw = io.nextInt();
			Tuple[] t = new Tuple[n + 1]; // a + bx
			double a = 0;
			double b = pw;
			for (int i = 0; i < n; i++) {
				double vw = io.nextInt();
				double pf = io.nextInt();
				double vf = io.nextInt();
				double th = io.nextInt();
				t[i] = new Tuple(th / vw, pf * th / vf, -pf * vw / vf);
				if (t[i].a > 0) {
					a += t[i].a;
					b += t[i].b;
					t[i].a *= -1;
					t[i].b *= -1;
				}
			}
			t[n] = new Tuple(0, 0, 0);
			Arrays.sort(t);
			int i = 0;
			double ans = a;
			for (; i < n; i++) {
				if (t[i].x >= 0) {
					ans = Math.min(ans, a + b * t[i].x);
				}
				a += t[i].a;
				b += t[i].b;
			}
			io.println(ans);
		}
		io.flush();

	}

}

class Tuple implements Comparable<Tuple> {
	double x, a, b;

	public Tuple(double x, double a, double b) {
		this.x = x;
		this.a = a;
		this.b = b;
	}

	public int compareTo(Tuple o) {
		return Double.compare(this.x, o.x);
	}

	public String toString() {
		return "(" + x + "," + a + "," + b + ")";
	}
}

class IO {
	private final InputStream in;
	private final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	public IO() { this(System.in);}
	public IO(InputStream source) { this.in = source;}
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
	private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	private void skipNewLine() { while(hasNextByte() && isNewLine(buffer[ptr])) ptr++;}
	public boolean hasNext() { skipUnprintable(); return hasNextByte();}
	public boolean hasNextLine() { skipNewLine(); return hasNextByte();}
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
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else{
				return minus ? -n : n;
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
	public int[] arrayInt(int n) { int[] a = new int[n]; for(int i=0;i<n;i++) a[i] = nextInt(); return a;};
	public long[] arrayLong(int n) { long[] a = new long[n]; for(int i=0;i<n;i++) a[i] = nextLong(); return a;};
	public double[] arrayDouble(int n) { double[] a = new double[n]; for(int i=0;i<n;i++) a[i] = nextDouble(); return a;};
	public void arrayInt(int[]... a) {
		for(int i=0;i<a[0].length;i++) {
			for(int j=0;j<a.length;j++) {
				a[j][i] = nextInt();
			}
		}
	}
	public void println(long x) { out.println(x);}
	public void println(double x) { out.println(x);}
	public void println(String s) { out.println(s);}
	public void println() { out.println(); }
	public void print(long x) { out.print(x); }
	public void print(double x) { out.print(x); }
	public void print(String s) { out.print(s); }
	public void print(char c) {out.print(c);}
	public void flush() {out.flush(); }
}