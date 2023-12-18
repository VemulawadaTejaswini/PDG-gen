import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		IO io = new IO();
		int n = io.nextInt();
		int d = io.nextInt();
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<n;i++) {
			int x = io.nextInt();
			int y = io.nextInt();
			int h = (x % d) * 1000 + (y % d);
			int count = hm.getOrDefault(h, 0);
			hm.put(h, count + 1);
		}
		int l = 0;
		int r = 110000000;
		while(l + 1 < r) {
			int c = (l + r) / 2;
			if (check(n, d, hm, c)) {
				r = c;
			}else{
				l = c;
			}
		}
		System.out.println(r);
	}
	public static boolean check(int n, int d, HashMap<Integer,Integer> hm, long a) {
		int big = 0;
		for(int c : hm.values()) {
			while(big * big < c) {
				big++;
			}
		}
		LOOP: for(int x=0;x<d;x++) {
			HashSet<Integer> hs = new HashSet<>();
			for(Map.Entry<Integer,Integer> e: hm.entrySet()) {
				int p = e.getKey();
				int x2 = p / 1000;
				int y2 = p % 1000;
				int x3 = (x2 - x + d) % d;
				//int y3 = (y2 - y + d) % d;

				int count = e.getValue();
				long shorter = (int) Math.sqrt(count);
				long longer = shorter;
				if (shorter * longer < count) {
					longer++;
					if (shorter * longer < count) {
						shorter++;
					}
				}
				long x4l = x3 + d * (longer - 1);
				long x4s = x3 + d * (shorter - 1);
				if (x4s > a) {
					continue LOOP;
				}else if(x4l > a) {
					if (longer == big) {
						hs.add(y2);
					}
				}else{

				}
			}
			if (hs.size() <= 1) {
				return true;
			}
			ArrayList<Integer> al = new ArrayList<>(hs);
			al.sort(null);
			int max = al.get(0) - al.get(al.size()-1) + d;
			for(int i=0;i<al.size()-1;i++) {
				max = Math.max(al.get(i+1) - al.get(i), max);
			}
			if (d * big - max <= a) return true;
		}
		return false;
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

