import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		IO io = new IO();
		int n = io.nextInt();
		int m = io.nextInt();
		int[] u = new int[m];
		int[] v = new int[m];
		for(int i=0;i<m;i++) {
			u[i] = io.nextInt() - 1;
			v[i] = io.nextInt() - 1;
		}
		int s = io.nextInt() - 1;
		int t = io.nextInt() - 1;
		Dinic g1 = new Dinic(n);
		for(int i=0;i<m;i++) {
			g1.addEdge(u[i], v[i], 1, (i+1));
			g1.addEdge(v[i], u[i], 1, -(i+1));
		}
		int f = g1.maximumFlow(s, t);
		ArrayList<Integer> ans = new ArrayList<>();
		for(ArrayList<Dinic.Edge> es: g1.g) {
			for(Dinic.Edge e: es) {
				if (e.cap0 != e.cap && e.id < 0) {
					ans.add(-e.id);
				}
			}
		}
		System.out.println(f);
		System.out.println(ans.size());
		for(int x: ans) {
			System.out.println(x);
		}
	}

}
class Dinic {
	public static final int INF = 1 << 29;
	public ArrayList<Edge>[] g;
	private int[] it;
	private int[] level;
	@SuppressWarnings("unchecked")
	public Dinic(int n) {
		g = new ArrayList[n];
		for(int i=0;i<n;i++) {
			g[i] = new ArrayList<>();
		}
		it = new int[n];
		level = new int[n];
	}
	public void addEdge(int from,int to,int cap,int id) {
		g[from].add(new Edge(to,cap,g[to].size(),id));
		g[to].add(new Edge(from,0,g[from].size()-1,0));
	}
	private void bfs(int s) {
		Arrays.fill(level, -1);
		Queue<Integer> q = new ArrayDeque<>();
		level[s] = 0;
		q.offer(s);
		while(!q.isEmpty()) {
			int v = q.poll();
			for(Edge e: g[v]) {
				if (e.cap > 0 && level[e.to] < 0) {
					level[e.to] = level[v] + 1;
					q.offer(e.to);
				}
			}
		}
	}
	private int dfs(int v,int t,int f) {
		if (v == t) {
			return f;
		}
		for(;it[v]<g[v].size();it[v]++) {
			Edge e = g[v].get(it[v]);
			if (e.cap <= 0 || level[v] >= level[e.to]) {
				continue;
			}
			int d = dfs(e.to,t,Math.min(f,e.cap));
			if (d <= 0) {
				continue;
			}
			e.cap -= d;
			g[e.to].get(e.rev).cap += d;
			return d;
		}
		return 0;
	}
	public int maximumFlow(int s,int t) {
		int flow = 0;
		while(true) {
			bfs(s);
			if (level[t] < 0) {
				return flow;
			}
			Arrays.fill(it, 0);
			int f;
			while((f = dfs(s,t,INF)) > 0) {
				flow += f;
			}
		}
	}
	class Edge {
		int to,cap,rev;
		int cap0,id;
		public Edge(int to,int cap,int rev,int id) {
			this.to = to;
			this.cap = cap;
			this.cap0 = cap;
			this.rev = rev;
			this.id = id;
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