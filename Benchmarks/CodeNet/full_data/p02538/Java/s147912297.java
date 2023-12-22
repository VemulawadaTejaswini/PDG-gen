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
		int n = ni(), Q = ni();
		LazySegmentTreeL st = new LazySegmentTreeL(n);
		st.update(0, n, 1);
		for(int i = 0;i < Q;i++){
			int l = ni()-1, r = ni()-1, d = ni();
			st.update(l, r+1, d);
			out.println(st.vals[st.sum(0, n)]);
		}
	}

	public static class LazySegmentTreeL {
		public int M, H, N, LH;
		public long[] vals;
		public long[] lazy;
		public int[] lens;
		private final long I = Long.MAX_VALUE;
		private final int mod = 998244353;

		long[] ps, sps;

		public LazySegmentTreeL(int n)
		{
			N = n;
			M = Integer.highestOneBit(Math.max(N-1, 1))<<2;
			H = M>>>1;
			LH = Integer.numberOfTrailingZeros(H);

			ps = new long[H+1];
			sps = new long[H+1];
			ps[0] = sps[0] = 1;
			for(int i = 1;i <= H;i++){
				ps[i] = ps[i-1] * 10 % mod;
				sps[i] = (sps[i-1] + ps[i]) % mod;
			}

			lazy = new long[H];
			Arrays.fill(lazy, I);
			vals = new long[M + 40];
			Arrays.fill(vals, 0);
			lens = new int[M + 40];
			Arrays.fill(lens, H, M, 1);
			for(int i = H-1;i >= 1;i--){
				propagate(i);
			}
		}

		public LazySegmentTreeL(long[] a)
		{
			this(a.length);
			for(int i = 0;i < N;i++){
				vals[H+i] = a[i];
			}
			for(int i = H-1;i >= 1;i--){
				propagate(i);
			}
		}

		private void initialize(int cur)
		{
			vals[cur] = 0;
			lens[cur] = 0;
		}

		private void update1(int cur, long v)
		{
			vals[cur] = v*sps[lens[cur]-1];
			if(cur < H){
				lazy[cur] = v;
			}
		}

		private void merge(int P, int L, int R)
		{
			vals[P] = (vals[L] * ps[lens[R]] + vals[R]) % mod;
			lens[P] = lens[L] + lens[R];
		}

		private void push1(int cur)
		{
			if(lazy[cur] == I)return;
			int L = cur*2, R = L + 1;
			update1(L, lazy[cur]);
			update1(R, lazy[cur]);
			lazy[cur] = I;
		}

		private void propagate(int P) {
			merge(P, 2*P, 2*P+1);
		}

		private void push(int l, int r)
		{
			for(int i = LH;i >= 1;i--) {
				if (l >>> i << i != l) push1(l >>> i);
				if (r >>> i << i != r) push1(r >>> i);
			}
		}

		public void update(int l, int r, long v)
		{
			if(l >= r)return;
			l += H; r += H;
			push(l, r);
			for(int ll = l, rr = r;ll < rr;ll>>>=1,rr>>>=1){
				if((ll&1) == 1) update1(ll++, v);
				if((rr&1) == 1) update1(--rr, v);
			}
			for(int i = 1;i <= LH;i++){
				if(l>>>i<<i != l)propagate(l>>>i);
				if(r>>>i<<i != r)propagate(r>>>i);
			}
		}

		public int sum(int l, int r)
		{
			if(l >= r){
				initialize(M);
				return M;
			}
			l += H; r += H;
			push(l, r);
			int gen = M;
			int L = gen++, R = gen++;
			initialize(L);
			initialize(R);
			for(int ll = l, rr = r;ll < rr;ll>>>=1,rr>>>=1){
				if((ll&1) == 1){
					int NL = gen++;
					merge(NL, L, ll++);
					L = NL;
				}
				if((rr&1) == 1){
					int NR = gen++;
					merge(NR, --rr, R);
					R = NR;
				}
			}
			merge(gen++, L, R);
			return gen-1;
		}

		private String tos(long[] a, int ind){ return ind < a.length ? "" + a[ind] : "_";}
		private static String j(Object... o){ return Arrays.deepToString(o);}

		public String nodeToString(int cur)
		{
			return j(cur, vals[cur], tos(lazy, cur));
		}

		public String toString() {  return toString(1, ""); }

		private String toString(int cur, String indent)
		{
			return cur >= M ? "" :
					toString(2*cur, indent + "  ")
							+ indent + nodeToString(cur) + "\n"
							+ toString(2*cur+1, indent + "  ");
		}
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
