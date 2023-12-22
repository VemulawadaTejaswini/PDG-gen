import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
	static int BIG = 205;
	
	static int[] dx = {0,1,1,0,-1,-1};
	static int[] dy1 = {1,0,-1,-1,-1,0};
	static int[] dy2 = {1,1,0,-1,0,1};
	public static void main(String[] args) {
		IO io = new IO();
		int sx = io.nextInt();
		int sy = io.nextInt();
		int gx = io.nextInt();
		int gy = io.nextInt();
		int n = io.nextInt();
		HashSet<Integer> obs = new HashSet<>();
		for(int i=0;i<n;i++) {
			int x = io.nextInt();
			int y = io.nextInt();
			obs.add(encode(x, y));
		}
		int lx = io.nextInt();
		int ly = io.nextInt();
		Graph g = new Graph(BIG * BIG * 6);
		for(int cx=-lx;cx<=lx;cx++) {
			for(int cy=-ly;cy<=ly;cy++) {
				if (obs.contains(encode(cx,cy))) continue;
				for(int t=0;t<6;t++) {
					for(int k=0;k<7;k++) {
						int nx;
						int ny;
						if (k == 6) {
							nx = cx;
							ny = cy;
						}else{
							nx = cx + dx[k];
							ny = cy + ((cx & 1) == 0 ? dy1[k] : dy2[k]);
						}
						if (nx < -lx || nx > lx || ny < -ly || ny > ly || obs.contains(encode(nx,ny))) continue;
//						System.out.println(cx + "," + cy + "," + t + "->" + nx + "," + ny + "," + ((t+1)%6) + ":" + (Math.abs(cx * cy * t) % 6 == k ? 0 : 1));
						g.addEdge(encode(cx,cy,t), encode(nx,ny,(t+1)%6), Math.abs(cx * cy * t) % 6 == k ? 0 : 1);
					}
				}
			}
		}
		int[] dist = g.minDistQueue(encode(sx,sy,0));
		int ans = Graph.INF;
		for(int i=0;i<6;i++) {
			ans = Math.min(ans, dist[encode(gx, gy, i)]);
		}
		System.out.println(ans == Graph.INF ? -1 : ans);
	}
	
	public static int encode(int x,int y) {
		return (x + 100) * BIG + (y + 100);
	}
	public static int encode(int x,int y,int t) {
		return encode(x,y) + t * BIG * BIG;
	}

}
class Graph {
	public static final int INF = 1<<29;
	int n;
	ArrayList<Edge>[] graph;

	@SuppressWarnings("unchecked")
	public Graph(int n) {
		this.n = n;
		this.graph = new ArrayList[n];
		for(int i=0;i<n;i++) {
			graph[i] = new ArrayList<Edge>();
		}
	}
	
	public void addBidirectionalEdge(int from,int to,int cost) {
		addEdge(from,to,cost);
		addEdge(to,from,cost);
	}
	public void addEdge(int from,int to,int cost) {
		graph[from].add(new Edge(to, cost));
	}
	
	//O(E) all cost is 0 or 1
	public int[] minDistQueue(int s) {
		int[] d = new int[n];
		Arrays.fill(d, INF);
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		q.add(s);
		d[s] = 0;
		while(!q.isEmpty()) {
			int v = q.pollFirst();
			for(Edge e:graph[v]) {
				int u = e.to;
				if (d[v] + e.cost < d[u]) {
					d[u] = d[v] + e.cost;
					if (e.cost == 0) {
						q.addFirst(u);
					}else{
						q.addLast(u);
					}
				}
			}
		}
		return d;
	}

	class Edge {
		int to;
		int cost;
		public Edge(int to,int cost) {
			this.to = to;
			this.cost = cost;
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