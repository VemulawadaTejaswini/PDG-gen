import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

public class Main {

	public static long SMAX = 1_00000_00000L;
	public static long SMAX_SQRT = 1_00000L;
	
	public static void main(String[] args) {
		ArrayList<Long> cube = new ArrayList<>();
		for(long i=1;;i++) {
			long c = i * i * i;
			if (c > SMAX) break;
			cube.add(c);
		}
		ArrayList<Integer> primes = primeList((int) SMAX_SQRT);
		
		HashMap<Long,Long> map = new HashMap<>();
		HashMap<Long,Integer> count = new HashMap<>();
		
		IO io = new IO();
		int n = io.nextInt();
		boolean containsCube = false;
		for(int i=0;i<n;i++) {
			long x = io.nextLong();
			for(long c:cube) {
				if (c == 1) continue;
				while(x % c == 0) {
					x /= c;
				}
			}
			if (x == 1) {
				containsCube = true;
				continue;
			}
			Integer c = count.get(x);
			count.put(x, c == null ? 1 : c + 1);
			if (map.containsKey(x)) continue;
			long y = x;
			long z = 1;
			for(int p:primes) {
				int exp = 0;
				while(y % p == 0) {
					y /= p;
					exp++;
				}
				if (exp == 1) {
					z *= p * p;
				}else if(exp == 2) {
					z *= p;
				}
			}
			if (y != 1) {
				map.put(x,-1L);
			}else{
				if (x < z) {
					map.put(x,z);
				}else{
					map.put(x,-2L);
				}
			}
		}
//		System.out.println(count);
//		System.out.println(map);
		int ans = containsCube ? 1 : 0;
		for(Entry<Long, Long> e:map.entrySet()) {
			long c = e.getValue();
			if (c >= -1) {
				int a = count.get(e.getKey());
				int b = c == -1 ? 0 : count.getOrDefault(e.getValue(),0);
				ans += Math.max(a, b);
			}
		}
		System.out.println(ans);
	}
	
	public static boolean[] isPrimeArray(int max) {
		boolean[] isPrime = new boolean[max+1];
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		for(int i=2;i*i<=max;i++) {
			if (isPrime[i]) {
				int j = i * 2;
				while(j<=max) {
					isPrime[j] = false;
					j += i;
				}
			}
		}
		return isPrime;
	}
	
	public static ArrayList<Integer> primeList(int max) {
		boolean[] isPrime = isPrimeArray(max);
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		for(int i=2;i<=max;i++) {
			if (isPrime[i]) {
				primeList.add(i);
			}
		}
		return primeList;
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

