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
	
	static void solve()
	{
		int n = ni();
		int[] from = new int[n-1];
		int[] to = new int[n-1];
		for(int i = 0;i < n-1;i++){
			from[i] = ni()-1;
			to[i] = ni()-1;
		}
		char[] s = ns(n);
		
		int[][] g = packU(n, from, to);
		int[][] pars = parents3(g, 0);
		int[] par = pars[0], ord = pars[1], dep = pars[2];
		
		Ranking[] down = new Ranking[n];
		Ranking[] dia = new Ranking[n];
		long[] udia = new long[n];
		for(int i = 0;i < n;i++){
			down[i] = new Ranking(3);
			dia[i] = new Ranking(5);
		}
		int ct = 1; // all black
		for(int i = n-1;i >= 0;i--){
			int cur = ord[i];
			down[cur].query(0, cur);
			
			dia[cur].query(down[cur].min[0]+down[cur].min[1], down[cur].argmin[0]<<32|down[cur].argmin[1]);
			dia[cur].query(down[cur].min[0]+down[cur].min[2], down[cur].argmin[0]<<32|down[cur].argmin[2]);
			dia[cur].query(down[cur].min[1]+down[cur].min[2], down[cur].argmin[1]<<32|down[cur].argmin[2]);
			dia[cur].query(down[cur].min[0], 999999L<<32|down[cur].argmin[0]);
			dia[cur].query(down[cur].min[1], 999999L<<32|down[cur].argmin[1]);
			dia[cur].query(0L, 999999L<<32|cur);
			for(int e : g[cur]){
				if(par[cur] != e){
					dia[cur].query(dia[e].min[0], 999999L<<32|e);
				}
			}
			if(i > 0){
				long v = -down[cur].min[0] + 1;
				down[par[cur]].query(-v, cur);
			}
//			tr(cur, dia[cur].min, down[cur].min);
			if(i > 0 && -dia[cur].min[0] == -down[cur].min[0]){
				ct++;
			}
		}
//		tr(down);
//		tr(dia);
		long[] downs = new long[n];
		for(int i = 0;i < n;i++){
			downs[i] = -down[i].min[0];
		}
		long[] ups = new long[n];
		
//		tr("zero", ct);
		for(int i = 1;i < n;i++){
			int cur = ord[i];
			long v = -down[par[cur]].min[0] == -down[cur].min[0] + 1 ? 
					-down[par[cur]].min[1] + 1 : -down[par[cur]].min[0] + 1;
			down[cur].query(-v, par[cur]);
			ups[cur] = v;
			
			udia[cur] = udia[par[cur]];
			
			for(int p = 0;p < 5;p++){
				if(dia[par[cur]].argmin[p]>>>32 == cur)continue;
				if((int)dia[par[cur]].argmin[p] == cur)continue;
				udia[cur] = Math.max(udia[cur], -dia[par[cur]].min[p]);
//				tr(cur, p, udia[cur], dia[par[cur]].argmin[p]>>>32, (int)dia[par[cur]].argmin[p]);
				break;
			}
			for(int p = 0;p < 3;p++){
				if(down[par[cur]].argmin[p] != cur){
					for(int q = p+1;q < 3;q++){
						if(down[par[cur]].argmin[q] != cur){
//							tr("hit", cur, p, q, down[par[cur]]);
							udia[cur] = Math.max(udia[cur], -down[par[cur]].min[p]-down[par[cur]].min[q]);
						}
					}
				}
			}
		}
		
		for(int i = 1;i < n;i++){
			int cur = ord[i];
			for(int p = 0;p < 3;p++){
				if(down[par[cur]].argmin[p] != cur){
					if(-down[par[cur]].min[p] == udia[cur]){
//						tr("UP", cur);
						ct++;
					}
					break;
				}
			}
		}
//		tr("udia", udia);
		
//		tr("up", ct);
//		tr("ups", ups);
		
//		tr(udia);
		for(int i = 0;i < n;i++){
			long sup = Math.max(-1, -down[i].min[2]-1);
			int[] temp = new int[g[i].length]; // {down}
			int tp = 0;
			for(int e : g[i]){
				if(par[i] != e){
					temp[tp++] = (int)downs[e]+1;
					int lsup = (int)Math.min(sup, downs[e]);
					int linf = Math.max(0, (int)(-dia[e].min[0]-downs[e]-1));
//					if(linf <= lsup)tr(i, e, linf, lsup, sup, -dia[e].min[0]);
					ct += Math.max(lsup-linf+1, 0);
				}
			}
			if(i > 0){
				temp[tp++] = (int)ups[i];
				int lsup = (int)Math.min(sup, ups[i]-1);
				int linf = Math.max(0, (int)(udia[i]-ups[i]));
//				if(linf <= lsup)tr(i, par[i], linf, lsup);
				ct += Math.max(lsup-linf+1, 0);
			}
			// d+k+1 >= r
			// k >= r-d-1
			// k <= d
			
			Arrays.sort(temp);
			if(tp >= 2){
//				tr(i, "temp", temp);
				ct += temp[tp-2];
			}
//			tr("ENDct", i, ct);
		}
		out.println(ct);
	}
	
	public static class Ranking {
		public long[] min;
		public long[] argmin;
		public int K;
		
		public Ranking(int K)
		{
			this.K = K;
			min = new long[K];
			Arrays.fill(min, Long.MAX_VALUE/3);
			argmin = new long[K];
			Arrays.fill(argmin, 999999);
		}
		
		public void query(long v, long ind)
		{
//			if(v >= min[K-1])return;
			for(int i = 0;i < K;i++){
				if(v < min[i]){
					for(int j = K-2;j >= i;j--){
						min[j+1] = min[j];
						argmin[j+1] = argmin[j];
					}
					min[i] = v;
					argmin[i] = ind;
					break;
				}
			}
		}

		@Override
		public String toString() {
			return "Ranking [" + (min != null ? "min=" + Arrays.toString(min) + ", " : "")
					+ (argmin != null ? "argmin=" + Arrays.toString(argmin) + ", " : "") + "K=" + K + "]";
		}
	}	
	public static int[][] parents3(int[][] g, int root) {
		int n = g.length;
		int[] par = new int[n];
		Arrays.fill(par, -1);

		int[] depth = new int[n];
		depth[0] = 0;

		int[] q = new int[n];
		q[0] = root;
		for (int p = 0, r = 1; p < r; p++) {
			int cur = q[p];
			for (int nex : g[cur]) {
				if (par[cur] != nex) {
					q[r++] = nex;
					par[nex] = cur;
					depth[nex] = depth[cur] + 1;
				}
			}
		}
		return new int[][] { par, q, depth };
	}

	
	static int[][] packU(int n, int[] from, int[] to) {
		int[][] g = new int[n][];
		int[] p = new int[n];
		for (int f : from)
			p[f]++;
		for (int t : to)
			p[t]++;
		for (int i = 0; i < n; i++)
			g[i] = new int[p[i]];
		for (int i = 0; i < from.length; i++) {
			g[from[i]][--p[from[i]]] = to[i];
			g[to[i]][--p[to[i]]] = from[i];
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
