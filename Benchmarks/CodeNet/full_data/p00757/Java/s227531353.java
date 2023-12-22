import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
	static IO io = new IO();
	static int[][] u = null;
	static Pair[] memo = new Pair[1<<20];
	static int need = 0;
	public static void main(String[] args) {
		while(true) {
			int h = io.nextInt();
			int w = io.nextInt();
			int s = io.nextInt();
			if (h == 0) {
				break;
			}
			int sum = 0;
			u = new int[h+1][w+1];
			for(int i=1;i<=h;i++) {
				for(int j=1;j<=w;j++) {
					u[i][j] = io.nextInt();
					sum += u[i][j];
				}
			}
			for(int i=1;i<=h;i++) {
				for(int j=1;j<=w;j++) {
					u[i][j] += u[i][j-1];
				}
			}
			for(int j=1;j<=w;j++) {
				for(int i=1;i<=h;i++) {
					u[i][j] += u[i-1][j];
				}
			}
			need = sum - s;
			Arrays.fill(memo, null);
			Pair ans = dfs(pack(0,0,h-1,w-1));
			io.println(ans.groups + " " + (s - sum + ans.maxmin));
		}
		io.flush();
	}
	static final Pair NEGINF = new Pair(-1,-1);
	private static Pair dfs(int pack) {
		if (memo[pack] != null) {
			return memo[pack];
		}
		int i1 = pack & 0x1F;
		int j1 = pack >> 5 & 0x1F;
		int i2 = pack >> 10 & 0x1F;
		int j2 = pack >> 15 & 0x1F;
		int sum = u[i2+1][j2+1] - u[i1][j2+1] - u[i2+1][j1] + u[i1][j1];
//		System.out.println(i1 + "," + j1 + "," + i2 + "," + j2 + ": " + sum);
		if (sum < need) {
//			System.out.println(i1 + "," + j1 + "," + i2 + "," + j2 + ": -INF");
			return memo[pack] = NEGINF;
		}
		Pair p = new Pair(1,sum);
		for(int i=i1;i<i2;i++) {
			p = p.max(dfs(pack(i1,j1,i,j2)).add(dfs(pack(i+1,j1,i2,j2))));
		}
		for(int j=j1;j<j2;j++) {
			p = p.max(dfs(pack(i1,j1,i2,j)).add(dfs(pack(i1,j+1,i2,j2))));
		}
//		System.out.println(i1 + "," + j1 + "," + i2 + "," + j2 + ": " + p);
		return memo[pack] = p;
	}
	static int pack(int i1,int j1,int i2,int j2) {
		return i1 | j1 << 5 | i2 << 10 | j2 << 15;
	}
	static class Pair {
		int groups, maxmin;
		public Pair(int groups,int maxmin) {
			this.groups = groups;
			this.maxmin = maxmin;
		}
		public String toString() {
			return "(" + groups + "," + maxmin + ")";
		}
		public Pair max(Pair p) {
			if (groups > p.groups) {
				return this;
			}else if(groups < p.groups) {
				return p;
			}
			if (maxmin >= p.maxmin) {
				return this;
			}else{
				return p;
			}
		}
		public Pair add(Pair p) {
			return new Pair(groups + p.groups, Math.min(maxmin, p.maxmin));
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