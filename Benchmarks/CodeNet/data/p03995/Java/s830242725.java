import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main implements Runnable{


	public static void main(String[] args) {
		new Thread(null, new Main(), "", 1024L * 1024 * 128).start();
	}
	
	@SuppressWarnings("unchecked")
	public void run() {
		IO io = new IO();
		int h = io.nextInt();
		int w = io.nextInt();
		int n = io.nextInt();
		Pair[] p = new Pair[n];
		for(int i=0;i<n;i++) {
			p[i] = new Pair(io.nextInt() - 1, io.nextInt() - 1, io.nextInt());
		}
		ArrayList<Edge>[] g = new ArrayList[w];
		UnionFind uf = new UnionFind(w);
		for(int i=0;i<w;i++) {
			g[i] = new ArrayList<>();
		}
		Arrays.sort(p, (p1,p2)->{
			if (p1.i != p2.i) return Integer.compare(p1.i, p2.i);
			return Integer.compare(p1.j, p2.j);
		});
		for(int i=0;i<n;i++) {
			int j=i;
			while(j < n - 1 && p[j+1].i == p[j].i) {
				j++;
			}
			for(int k=i;k<j;k++) {
				int u = p[k].j;
				int v = p[k+1].j;
				int c = p[k+1].a - p[k].a;
				g[u].add(new Edge(v, c));
				g[v].add(new Edge(u, -c));
				uf.union(u, v);
			}
			
			i = j;
		}
		boolean[] used = new boolean[w];
		long[] col = new long[w];
		for(ArrayList<Integer> s: uf.groups()) {
			int start = s.get(0);
			used[start] = true;
			col[start] = 0;
			dfs(start,g,used,col);
			long min = Long.MAX_VALUE;
			for(int v: s) {
				min = Math.min(min, col[v]);
			}
			if (min < 0) {
				for(int v: s) {
					col[v] += -min;
				}
			}
		}
//		System.out.println(Arrays.toString(col));
		for(int v=0;v<w;v++) {
			for(Edge e: g[v]) {
				if (col[v] + e.val != col[e.to]) {
					System.out.println("No");
					return;
				}
			}
		}
		long[] row = new long[h];
		Arrays.fill(row, -1);
		for(int i=0;i<n;i++) {
			long r = p[i].a - col[p[i].j];
			if (r < 0 || (row[p[i].i] != -1 && row[p[i].i] != r)) {
				System.out.println("No");
				return;
			}
			row[p[i].i] = r;
		}
		System.out.println("Yes");
	}
	
	static void dfs(int v, ArrayList<Edge>[] g,boolean[] used, long[] val) {
		for(Edge e: g[v]) {
			if (!used[e.to]) {
				used[e.to] = true;
				val[e.to] = val[v] + e.val;
				dfs(e.to, g, used, val);
			}
		}
	}

}
class Pair {
	int i,j,a;

	public Pair(int i, int j, int a) {
		super();
		this.i = i;
		this.j = j;
		this.a = a;
	}
	
}
class Edge {
	int to;
	long val;
	
	public Edge(int to, long val) {
		super();
		this.to = to;
		this.val = val;
	}
	
}
class UnionFind {
	private int[] parent;
	public UnionFind(int size) {
		parent = new int[size];
		Arrays.fill(parent, -1);
	}
	public boolean union(int x,int y) {
		x = root(x);
		y = root(y);
		if (x!=y) {
			if (parent[y] < parent[x]) {
				int tmp = y;
				y = x;
				x = tmp;
			}
			parent[x] += parent[y];
			parent[y] = x;
			return true;
		}
		return false;
	}
	public boolean isConnected(int x,int y) {
		return root(x)==root(y);
	}
	private int root(int x) {
		return parent[x] < 0 ? x : (parent[x] = root(parent[x]));
	}
	public int size(int x) {
		return -parent[root(x)];
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

