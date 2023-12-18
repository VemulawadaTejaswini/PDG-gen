import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static void solve()
	{
		int W = ni(), H = ni(), n = ni();
		int[][] co = new int[n][];
		for(int i = 0;i < n;i++){
			co[i] = na(2);
		}
		Arrays.sort(co, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});
		int max = 0;
		for(int i = 0;i < n-1;i++){
			max = Math.max(max, (co[i+1][0]-co[i][0]+H)*2);
		}
		max = Math.max(max, (co[0][0]-0+H)*2);
		max = Math.max(max, (W-co[n-1][0]+H)*2);
		
		Arrays.sort(co, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[1] - b[1];
			}
		});
		for(int i = 0;i < n-1;i++){
			max = Math.max(max, (co[i+1][1]-co[i][1]+W)*2);
		}
		max = Math.max(max, (co[0][1]-0+W)*2);
		max = Math.max(max, (H-co[n-1][1]+W)*2);
		
		max = Math.max(max, dfs(0, n, co, W, H)*2);
		out.println(max);
	}
	
	static int dfs(int l, int r, int[][] co, int W, int H)
	{
		if(r-l <= 2)return 0;
		int h = l+r>>1;
		int mid = co[h][1];
		int[][] uco = new int[r-h][];
		for(int i = 0;i < r-h;i++){
			uco[i] = co[i+h];
		}
		int[][] lco = new int[h-l][];
		for(int i = 0;i < h-l;i++){
			lco[i] = new int[]{co[i+l][0], 2*mid-co[i+l][1]};
		}
		Arrays.sort(uco, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});
		Arrays.sort(lco, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});
		int[] upv = enumPrevValley(uco);
		int[] unv = enumNextValley(uco);
		int[] lpv = enumPrevValley(lco);
		int[] lnv = enumNextValley(lco);
		int[][] us = new int[r-h][];
		for(int i = 0;i < r-h;i++){
			us[i] = new int[]{ // left right height
					upv[i] == -1 ? 0 : uco[upv[i]][0], 
					unv[i] == unv.length ? W : uco[unv[i]][0],
					uco[i][1]-mid, -1};
		}
		int[][] ls = new int[h-l][];
		for(int i = 0;i < h-l;i++){
			ls[i] = new int[]{ // left right height
					lpv[i] == -1 ? 0 : lco[lpv[i]][0], 
					lnv[i] == lnv.length ? W : lco[lnv[i]][0],
					lco[i][1]-mid, -1};
		}
		int max = 0;
		max = Math.max(max, go(us, ls));
		max = Math.max(max, go(ls, us));
		max = Math.max(max, dfs(l, h, co, W, H));
		max = Math.max(max, dfs(h, r, co, W, H));
		return max;
	}
	
	static int go(int[][] us, int[][] ls)
	{
		int nu = us.length, nl = ls.length;
		Arrays.sort(us, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});
		Arrays.sort(ls, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[1] - b[1];
			}
		});
		for(int i = 0;i < us.length;i++)us[i][3] = i;
		int[][] urs = Arrays.copyOf(us, us.length);
		Arrays.sort(us, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[1] - b[1];
			}
		});
		
		int[] hs = new int[nu];
		for(int i = 0;i < nu;i++)hs[i] = -us[i][2];
		SegmentTreeRMQ strh = new SegmentTreeRMQ(nu);
		SegmentTreeRMQ sth = new SegmentTreeRMQ(hs);
		int p = 0;
		int max = 0;
		for(int i = 0;i < nl;i++){
			int[] e = ls[i];
			while(p < nu && urs[p][1] <= e[1]){
				strh.update(urs[p][3], -(urs[p][1]+urs[p][2]));
				sth.update(urs[p][3], Integer.MAX_VALUE / 2);
				p++;
			}
			int indx = lowerBound(us, 0, e[0]); // uの左端がlの左端より左に来ているもの
			// uの右端がlの範囲にあるもの
			max = Math.max(max, -strh.minx(0, indx) - e[0] + e[2]);
			// uの右端がlの右端より右に来ているもの
			max = Math.max(max, -sth.minx(0, indx) + (e[1] - e[0]) + e[2]);
		}
		return max;
	}
	
	public static int lowerBound(int[][] a, int ind, int v)
	{
		int low = -1, high = a.length;
		while(high-low > 1){
			int h = high+low>>>1;
			if(a[h][ind] >= v){
				high = h;
			}else{
				low = h;
			}
		}
		return high;
	}
	
	public static class SegmentTreeRMQ {
		public int M, H, N;
		public int[] st;
		
		public SegmentTreeRMQ(int n)
		{
			N = n;
			M = Integer.highestOneBit(Math.max(N-1, 1))<<2;
			H = M>>>1;
			st = new int[M];
			Arrays.fill(st, 0, M, Integer.MAX_VALUE/2);
		}
		
		public SegmentTreeRMQ(int[] a)
		{
			N = a.length;
			M = Integer.highestOneBit(Math.max(N-1, 1))<<2;
			H = M>>>1;
			st = new int[M];
			for(int i = 0;i < N;i++){
				st[H+i] = a[i];
			}
			Arrays.fill(st, H+N, M, Integer.MAX_VALUE);
			for(int i = H-1;i >= 1;i--)propagate(i);
		}
		
		public void update(int pos, int x)
		{
			st[H+pos] = x;
			for(int i = (H+pos)>>>1;i >= 1;i >>>= 1)propagate(i);
		}
		
		private void propagate(int i)
		{
			st[i] = Math.min(st[2*i], st[2*i+1]);
		}
		
		public int minx(int l, int r){
			if(l >= r)return Integer.MAX_VALUE/2;
			int min = Integer.MAX_VALUE/2;
			while(l != 0){
				int f = l&-l;
				if(l+f > r)break;
				int v = st[(H+l)/f];
				if(v < min)min = v;
				l += f;
			}
			
			while(l < r){
				int f = r&-r;
				int v = st[(H+r)/f-1];
				if(v < min)min = v;
				r -= f;
			}
			return min;
		}
		
		public int min(int l, int r){ return l >= r ? 0 : min(l, r, 0, H, 1);}
		
		private int min(int l, int r, int cl, int cr, int cur)
		{
			if(l <= cl && cr <= r){
				return st[cur];
			}else{
				int mid = cl+cr>>>1;
				int ret = Integer.MAX_VALUE;
				if(cl < r && l < mid){
					ret = Math.min(ret, min(l, r, cl, mid, 2*cur));
				}
				if(mid < r && l < cr){
					ret = Math.min(ret, min(l, r, mid, cr, 2*cur+1));
				}
				return ret;
			}
		}
		
		public int firstle(int l, int v) {
			int cur = H+l;
			while(true){
				if(st[cur] <= v){
					if(cur < H){
						cur = 2*cur;
					}else{
						return cur-H;
					}
				}else{
					cur++;
					if((cur&cur-1) == 0)return -1;
					if((cur&1)==0)cur>>>=1;
				}
			}
		}
		
		public int lastle(int l, int v) {
			int cur = H+l;
			while(true){
				if(st[cur] <= v){
					if(cur < H){
						cur = 2*cur+1;
					}else{
						return cur-H;
					}
				}else{
					if((cur&cur-1) == 0)return -1;
					cur--;
					if((cur&1)==1)cur>>>=1;
				}
			}
		}
	}
	
	public static int[] enumPrevValley(int[][] a)
	{
		int n = a.length;
		int[] L = new int[n];
		for(int i = 0;i < n;i++){
			L[i] = i-1;
			while(L[i] >= 0 && a[L[i]][1] > a[i][1])L[i] = L[L[i]];
		}
		return L;
	}
	
	public static int[] enumNextValley(int[] a)
	{
		int n = a.length;
		int[] L = new int[n];
		for(int i = n-1;i >= 0;i--){
			L[i] = i+1;
			while(L[i] < n && a[i] < a[L[i]])L[i] = L[L[i]];
		}
		return L;
	}
	public static int[] enumPrevValley(int[] a)
	{
		int n = a.length;
		int[] L = new int[n];
		for(int i = 0;i < n;i++){
			L[i] = i-1;
			while(L[i] >= 0 && a[L[i]] > a[i])L[i] = L[L[i]];
		}
		return L;
	}
	
	public static int[] enumNextValley(int[][] a)
	{
		int n = a.length;
		int[] L = new int[n];
		for(int i = n-1;i >= 0;i--){
			L[i] = i+1;
			while(L[i] < n && a[i][1] < a[L[i]][1])L[i] = L[L[i]];
		}
		return L;
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
