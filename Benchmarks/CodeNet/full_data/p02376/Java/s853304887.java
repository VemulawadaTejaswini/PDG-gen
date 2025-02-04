
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	static final long INF = Long.MAX_VALUE / 2;
	int len;
	int[][] up;
	int[] tin;
	int[] tout;
	int time;
	private static void solve() {
		//PrintWriter pr = new PrintWriter(System.out);
		int V = ni();
		int E = ni();
		int[] u = new int[E];
		int[] v = new int[E];
		int[] c = new int[E];
		for(int i=0;i<E;i++){
			u[i] = ni();
			v[i] = ni();
			c[i] = ni();
		}
		int[][][] g = packWD(V, u, v, c);
		System.out.println(maximumFlowDinic(g, 0, V-1));

	}
	public static int maximumFlowDinic(int[][][] g, int source, int sink)
	{
		int n = g.length;
		
		// unweighted invgraph
		int[] p = new int[n];
		for(int i = 0;i < n;i++){
			for(int j = 0;j < g[i].length;j++)p[g[i][j][0]]++;
		}
		int[][] ig = new int[n][];
		for(int i = 0;i < n;i++)ig[i] = new int[p[i]];
		for(int i = n-1;i >= 0;i--){
			for(int j = 0;j < g[i].length;j++){
				ig[g[i][j][0]][--p[g[i][j][0]]] = i;
			}
		}
		
		int[][] f = new int[n][n];
		int[] d = new int[n];
		int[] q = new int[n];
		int ret = 0;
		while(true){
			Arrays.fill(d, -1);
			q[0] = source;
			int r = 1;
			d[source] = 0;
			
			for(int v = 0;v < r;v++){
				int cur = q[v];
				// plus flow
				for(int[] ne : g[cur]){
					int nex = ne[0], w = ne[1];
					if(d[nex] == -1 && w - f[cur][nex] > 0) {
						q[r++] = nex;
						d[nex] = d[cur] + 1;
					}
				}
				// minus flow
				for(int nex : ig[cur]){
					if(d[nex] == -1 && -f[cur][nex] > 0) {
						q[r++] = nex;
						d[nex] = d[cur] + 1;
					}
				}
			}
			if(d[sink] == -1)break;
			int delta = 0;
			while((delta = dfsDinic(d, g, ig, f, source, sink, Integer.MAX_VALUE)) > 0){
				ret += delta;
			}
		}
		
		return ret;
	}
	
	public static int dfsDinic(int[] d, int[][][] g, int[][] ig, int[][] f, int cur, int t, int min)
	{
		if(cur == t){
			return min;
		}else{
			int left = min;
			for(int[] ne : g[cur]){
				int nex = ne[0], w = ne[1];
				if(d[nex] == d[cur]+1 && w-f[cur][nex] > 0){
					int fl = dfsDinic(d, g, ig, f, nex, t, Math.min(left, w-f[cur][nex]));
					if(fl > 0){
						f[cur][nex] += fl;
						f[nex][cur] -= fl;
						left -= fl;
						if(left == 0)return min;
					}
				}
			}
			for(int nex : ig[cur]){
				if(d[nex] == d[cur]+1 && -f[cur][nex] > 0){
					int fl = dfsDinic(d, g, ig, f, nex, t, Math.min(left, -f[cur][nex]));
					if(fl > 0){
						f[cur][nex] += fl;
						f[nex][cur] -= fl;
						left -= fl;
						if(left == 0)return min;
					}
				}
			}
			return min-left;
		}
	}
	public static int[][][] packWD(int n, int[] from, int[] to, int[] w)
	{
		int[][][] g = new int[n][][];
		int[] p = new int[n];
		for(int f : from)p[f]++;
		for(int i = 0;i < n;i++)g[i] = new int[p[i]][2];
		for(int i = 0;i < from.length;i++){
			--p[from[i]];
			g[from[i]][p[from[i]]][0] = to[i];
			g[from[i]][p[from[i]]][1] = w[i];
		}
		return g;
	}
	public static void main(String[] args) throws Exception
	{
		long S = System.currentTimeMillis();
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);

		solve();
		out.flush();
		long G = System.currentTimeMillis();
		tr(G-S+"ms");
	}

	private static boolean eof()
	{
		if(lenbuf == -1)return true;
		int lptr = ptrbuf;
		while(lptr < lenbuf)if(!isSpaceChar(inbuf[lptr++]))return false;

		try {
			is.mark(1000);
			while(true){
				int b = is.read();
				if(b == -1){
					is.reset();
					return true;
				}else if(!isSpaceChar(b)){
					is.reset();
					return false;
				}
			}
		} catch (IOException e) {
			return true;
		}
	}

	private static byte[] inbuf = new byte[1024];
	static int lenbuf = 0, ptrbuf = 0;

	private static int readByte()
	{
		if(lenbuf == -1)throw new InputMismatchException();
		if(ptrbuf >= lenbuf){
			ptrbuf = 0;
			try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
			if(lenbuf <= 0)return -1;
		}
		return inbuf[ptrbuf++];
	}

	private static boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
	//	private static boolean isSpaceChar(int c) { return !(c >= 32 && c <= 126); }
	private static int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }

	private static double nd() { return Double.parseDouble(ns()); }
	private static char nc() { return (char)skip(); }

	private static String ns()
	{
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while(!(isSpaceChar(b))){
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	private static char[] ns(int n)
	{
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while(p < n && !(isSpaceChar(b))){
			buf[p++] = (char)b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}

	private static char[][] nm(int n, int m)
	{
		char[][] map = new char[n][];
		for(int i = 0;i < n;i++)map[i] = ns(m);
		return map;
	}

	private static int[] na(int n)
	{
		int[] a = new int[n];
		for(int i = 0;i < n;i++)a[i] = ni();
		return a;
	}

	private static int ni()
	{
		int num = 0, b;
		boolean minus = false;
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if(b == '-'){
			minus = true;
			b = readByte();
		}

		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private static long nl()
	{
		long num = 0;
		int b;
		boolean minus = false;
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if(b == '-'){
			minus = true;
			b = readByte();
		}

		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private static void tr(Object... o) { if(INPUT.length() != 0)System.out.println(Arrays.deepToString(o)); }
}