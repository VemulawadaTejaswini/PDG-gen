
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Queue;
public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	static final long INF = Long.MAX_VALUE / 2;
	private static void solve() {
		PrintWriter pr = new PrintWriter(System.out);
		int V = ni();
		int E = ni();
		int[] from = new int[E];
		int[] to = new int[E];
		for(int i=0;i<E;i++){
			from[i] = ni();
			to[i] = ni();
		}
		int[][] g = packD(V, from, to);
		int[][] ig = invGraph(g);
		int[] result = decomposeToSCCNoRec(g, ig);
		int Q = ni();
		while(Q-->0){
			if(result[ni()]==result[ni()]){
				pr.println(1);
			}else{
				pr.println(0);
			}
		}
		pr.flush();
	}
	public static int[][] packD(int n, int[] from, int[] to)
	{
		int[][] g = new int[n][];
		int[] p = new int[n];
		for(int f : from)p[f]++;
		for(int i = 0;i < n;i++)g[i] = new int[p[i]];
		for(int i = 0;i < from.length;i++){
			g[from[i]][--p[from[i]]] = to[i];
		}
		return g;
	}
	public static int[][] invGraph(int[][] g)
	{
		int n = g.length;
		int[] p = new int[n];
		for(int f = 0;f < n;f++){
			for(int t : g[f])p[t]++;
		}
		int[][] r = new int[n][];
		for(int i = 0;i < n;i++)r[i] = new int[p[i]];
		for(int f = n-1;f >= 0;f--){
			for(int t : g[f])r[t][--p[t]] = f;
		}
		return r;
	}
	public static int[] decomposeToSCCNoRec(int[][] g, int[][] ig)
	{
		int n = g.length;
		boolean[] visited = new boolean[n];
		int[] po = new int[n];
		int pop = 0;
		
		int[] stack = new int[n];
		int[] sinds = new int[n];
		int sp = 0;
		for(int i = 0;i < n;i++){
			if(!visited[i]){
				sinds[sp] = 0;
				stack[sp++] = i;
				while(sp > 0){
					int cur = stack[sp-1];
					visited[cur] = true;
					while(sinds[sp-1] < g[cur].length && visited[g[cur][sinds[sp-1]]])sinds[sp-1]++;
					if(sinds[sp-1] == g[cur].length){
						po[pop++] = cur;
						sp--;
					}else{
						stack[sp] = g[cur][sinds[sp-1]];
						sinds[sp] = 0;
						sp++;
					}
				}
			}
		}
		
		int[] ret = new int[n];
		Arrays.fill(visited, false);
		int clus = 0;
		Queue<Integer> q = new ArrayDeque<Integer>();
		for(int i = n - 1;i >= 0;i--){
			if(!visited[po[i]]){
				q.add(po[i]);
				visited[po[i]] = true;
				while(!q.isEmpty()){
					int cur = q.poll();
					ret[cur] = clus;
					for(int k : ig[cur]){
						if(!visited[k]){
							q.add(k);
							visited[k] = true;
						}
					}
				}
				clus++;
			}
		}
		
		return ret;
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