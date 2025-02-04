import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main implements Runnable {
	static int INF = 1 << 29;
	static IO io = new IO();
	public static void main(String[] args) {
		new Thread(null, new Main(), "", 1024L * 1024 * 48).start();
	}
	
	public void run() {
		while(solve());
		io.flush();
	}
	
	int n;
	int q;
	int[] parent;
	ArrayList<Integer>[] child;
	int[] firstMarked;
	int[] ma;
	ArrayDeque<Integer> stack;
	
	@SuppressWarnings("unchecked")
	public boolean solve() {
		n = io.nextInt();
		q = io.nextInt();
		if (n == 0) {
			return false;
		}
		child = new ArrayList[n];
		parent = new int[n];
		parent[0] = -1;
		for(int i=0;i<n;i++) {
			child[i] = new ArrayList<>();
		}
		for(int i=0;i<n-1;i++) {
			int p = io.nextInt() - 1;
			parent[i+1] = p;
			child[p].add(i+1);
		}
		char[] qType = new char[q];
		int[] qVal = new int[q];
		for(int i=0;i<q;i++) {
			qType[i] = io.nextChar();
			qVal[i] = io.nextInt() - 1;
		}
		firstMarked = new int[n];
		Arrays.fill(firstMarked, INF);
		firstMarked[0] = -1;
		for(int i=0;i<q;i++) {
			if (qType[i] == 'M') {
				firstMarked[qVal[i]] = Math.min(firstMarked[qVal[i]], i);
			}
		}
		stack = new ArrayDeque<>();
		ma = new int[n];
		dfs(0);
		UnionFind uf = new UnionFind(n);
		for(int i=0;i<n;i++) {
			uf.union(ma[i], i);
		}
		long sum = 0;
		for(int i=q-1;i>=0;i--) {
			if (qType[i] == 'Q') {
				sum += uf.get(qVal[i]) + 1;
			}else{
				if (parent[qVal[i]] >= 0 && firstMarked[qVal[i]] == i) {
					uf.union(parent[qVal[i]], qVal[i]);
				}
			}
		}
		io.println(sum);
		return true;
	}
	

	public void dfs(int v) {
		if (firstMarked[v] < INF) {
			stack.push(v);
		}
		ma[v] = stack.peek();
		for(int c: child[v]) {
			dfs(c);
		}
		if (firstMarked[v] < INF) {
			stack.pop();
		}
	}

}
class UnionFind {
	private int[] parent;
	private int[] data;
	public UnionFind(int size) {
		parent = new int[size];
		data = new int[size];
		for(int i=0;i<size;i++) {
			data[i] = i;
		}
		Arrays.fill(parent, -1);
	}
	public boolean union(int x,int y) {
		x = root(x);
		y = root(y);
		if (x!=y) {
			int nData = data[x];
			if (parent[y] < parent[x]) {
				int tmp = y;
				y = x;
				x = tmp;
			}
			data[x] = nData;
			parent[x] += parent[y];
			parent[y] = x;
			return true;
		}
		return false;
	}
	public boolean isConnected(int x,int y) {
		return root(x)==root(y);
	}
	public int root(int x) {
		return parent[x] < 0 ? x : (parent[x] = root(parent[x]));
	}
	public int size(int x) {
		return -parent[root(x)];
	}
	public int get(int x) {
		return data[root(x)];
	}
	public ArrayList<ArrayList<Integer>> groups() {
		int n = parent.length;
		ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++) {
			int r = root(i);
			if (!hm.containsKey(r)) {
				hm.put(r, g.size());
				g.add(new ArrayList<Integer>());
			}
			g.get(hm.get(r)).add(i);
		}
		return g;
	}
	public String toString() {
		return Arrays.toString(parent);
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