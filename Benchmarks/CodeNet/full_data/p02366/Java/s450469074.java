
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
	private static void solve() {
		int V = ni();
		int E = ni();
		int[] map = new int[2*E];
		for(int i=0;i<E;i++){
			map[2*i] = ni();
			map[2*i+1] = ni();
		}
		int[] result = enumArticulationPoints(packUE(map));
		Arrays.sort(result);
		for(int i:result){
			System.out.println(i);
		}
	}
	public static int[][] packUE(int... es)
	{
		int n = 0;
		for(int q : es){
			n = Math.max(n, q);
		}
		n++;
		int m = es.length;
		
		int[][] g = new int[n][];
		int[] p = new int[n];
		for(int i = 0;i < m;i++)p[es[i]]++;
		for(int i = 0;i < n;i++)g[i] = new int[p[i]];
		for(int i = 0;i < m;i+=2){
			g[es[i]][--p[es[i]]] = es[i+1];
			g[es[i+1]][--p[es[i+1]]] = es[i];
		}
		return g;
	}
	public static int[] enumArticulationPoints(int[][] g)
	{
		int n = g.length;
		ArticDatum datum = new ArticDatum();
		datum.g = g;
		datum.low = new int[n];
		datum.ord = new int[n];
		Arrays.fill(datum.ord, -1);
		datum.depth = new int[n];
		datum.artics = new int[n];
		datum.ap = 0;

		for(int i = 0;i < n;i++){
			if(datum.ord[i] == -1){
				datum.dfsCounter = 0;
				dfsArtic(i, datum);
			}
		}
		return Arrays.copyOf(datum.artics, datum.ap);
	}

	private static class ArticDatum
	{
		public int[][] g;
		public int[] low, ord;
		public int[] depth;
		public int[] artics;
		public int ap;
		public int dfsCounter;
	}

	private static void dfsArtic(int cur, ArticDatum d){
		d.low[cur] = d.ord[cur] = d.dfsCounter++;
		boolean isArtic = false;
		for(int i = 0;i < d.g[cur].length;i++){
			int e = d.g[cur][i];
			if(d.ord[e] == -1){
				// ????¨?????????????????????????
				d.depth[e] = d.depth[cur]+1;
				dfsArtic(e, d);
				d.low[cur] = Math.min(d.low[cur], d.low[e]);
				if(d.ord[cur] == 0){
					// root
					if(i >= 1)isArtic = true;
				}else if(d.low[e] >= d.ord[cur]){
					// children of cur cannot climb higher than cur without passing through cur
					isArtic = true;
				}
			}else if(d.depth[e] < d.depth[cur] - 1){
				// cur-e is back edge
				d.low[cur] = Math.min(d.low[cur], d.ord[e]);
			}
		}
		if(isArtic)d.artics[d.ap++] = cur;
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