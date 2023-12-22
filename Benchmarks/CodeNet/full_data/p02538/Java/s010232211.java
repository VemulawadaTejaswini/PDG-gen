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
		SegmentTreeRUpdateRSQ st = new SegmentTreeRUpdateRSQ(n);
		st.update(0, n, 1);
		for(int i = 0;i < Q;i++){
			int l = ni()-1, r = ni()-1, d = ni();
			st.update(l, r+1, d);
			out.println(st.st[1]);
		}
	}

	public static class SegmentTreeRUpdateRSQ {
		public int M, H, N;
		public long[] st;
		public long[] cover;
		private long I = Long.MAX_VALUE;
		public final int mod = 998244353;

		long[] ps;
		long[] sps;

		public SegmentTreeRUpdateRSQ(long[] a)
		{
			N = a.length;
			M = Integer.highestOneBit(Math.max(N-1, 1))<<2;
			H = M>>>1;
			cover = new long[H];
			Arrays.fill(cover, I);
			st = new long[M];
			Arrays.fill(st, I);
			for(int i = 0;i < N;i++){
				st[H+i] = a[i];
			}
			for(int i = H-1;i >= 1;i--){
				propagate(i);
			}
		}

		public SegmentTreeRUpdateRSQ(int n)
		{
			N = n;
			M = Integer.highestOneBit(Math.max(N-1, 1))<<2;
			H = M>>>1;
			cover = new long[H];
			Arrays.fill(cover, I);
			st = new long[M];
			Arrays.fill(st, 0);
			ps = new long[H+1];
			sps = new long[H+1];
			ps[0] = 1;
			sps[0] = 1;
			for(int i = 1;i <= H;i++){
				ps[i] = ps[i-1] * 10 % mod;
				sps[i] = sps[i-1] + ps[i];
				sps[i] %= mod;
			}
			for(int i = H-1;i >= 1;i--){
				propagate(i);
			}
		}

		private void propagate(int i)
		{
			int len = H/Integer.highestOneBit(i);
			if(cover[i] == I){
				st[i] = (st[2*i] * ps[len/2] + st[2*i+1]) % mod;
			}else{
				st[i] = cover[i] * sps[len-1] % mod;
			}
		}

		public void update(int l, int r, long v){ update(l, r, v, 0, H, 1); }

		private void update(int l, int r, long v, int cl, int cr, int cur)
		{
			if(l <= cl && cr <= r){
				if(cr == cl+1){
					st[cur] = v;
				}else{
					cover[cur] = v;
					propagate(cur);
				}
			}else{
				int mid = cl+cr>>>1;
				boolean bp = false;
				if(cover[cur] != I){ // back-propagate
					if(2*cur >= H){
						st[2*cur] = st[2*cur+1] = cover[cur];
					}else{
						cover[2*cur] = cover[2*cur+1] = cover[cur];
						bp = true;
					}
					cover[cur] = I;
				}
				if(cl < r && l < mid){
					update(l, r, v, cl, mid, 2*cur);
				}else if(bp){
					propagate(2*cur);
				}
				if(mid < r && l < cr){
					update(l, r, v, mid, cr, 2*cur+1);
				}else if(bp){
					propagate(2*cur+1);
				}
				propagate(cur);
			}
		}

		public long sum(int l, int r){ return sum(l, r, 0, H, 1); }

		private long sum(int l, int r, int cl, int cr, int cur)
		{
			if(l <= cl && cr <= r){
				return st[cur];
			}else{
				if(cover[cur] != I){
					int len = Math.min(r, cr) - Math.max(l, cl);
					return cover[cur] * len;
				}
				int mid = cl+cr>>>1;
				long ret = 0L;
				if(cl < r && l < mid){
					ret += sum(l, r, cl, mid, 2*cur);
				}
				if(mid < r && l < cr){
					ret += sum(l, r, mid, cr, 2*cur+1);
				}
				return ret;
			}
		}

		public long[] toArray() { return toArray(1, 0, H, new long[H]); }

		private long[] toArray(int cur, int l, int r, long[] ret)
		{
			if(r-l == 1){
				ret[cur-H] = st[cur];
			}else if(cover[cur] != I){
				Arrays.fill(ret, l, r, cover[cur]);
			}else{
				toArray(2*cur, l, l+r>>>1, ret);
				toArray(2*cur+1, l+r>>>1, r, ret);
			}
			return ret;
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
