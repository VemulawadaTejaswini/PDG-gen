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
		int K = ni();
		MinHeap q = new MinHeap(K);
		int[] td = new int[K];
		Arrays.fill(td, 999999999);
		for(int i = 9;i >= 1;i--){
			q.add(i%K, i);
			td[i%K] = i;
		}

		while (q.size() > 0) {
			int cur = q.argmin();
			q.remove(cur);

			for(int k = 0;k < 10;k++){
				int next = (cur*10+k)%K;
				int nd = td[cur] + k;
				if (nd < td[next]) {
					td[next] = nd;
					q.update(next, nd);
				}
			}
		}
		out.println(td[0]);
	}

	public static class MinHeap {
		public int[] a;
		public int[] map;
		public int[] imap;
		public int n;
		public int pos;
		public static int INF = Integer.MAX_VALUE;

		public MinHeap(int m) {
			n = m + 2;
			a = new int[n];
			map = new int[n];
			imap = new int[n];
			Arrays.fill(a, INF);
			Arrays.fill(map, -1);
			Arrays.fill(imap, -1);
			pos = 1;
		}

		public int add(int ind, int x) {
			int ret = imap[ind];
			if (imap[ind] < 0) {
				a[pos] = x;
				map[pos] = ind;
				imap[ind] = pos;
				pos++;
				up(pos - 1);
			}
			return ret != -1 ? a[ret] : x;
		}

		public int update(int ind, int x) {
			int ret = imap[ind];
			if (imap[ind] < 0) {
				a[pos] = x;
				map[pos] = ind;
				imap[ind] = pos;
				pos++;
				up(pos - 1);
			} else {
				int o = a[ret];
				a[ret] = x;
				up(ret);
				down(ret);
				//			if(a[ret] > o){
				//				up(ret);
				//			}else{
				//				down(ret);
				//			}
			}
			return x;
		}

		public int remove(int ind) {
			if (pos == 1)
				return INF;
			if (imap[ind] == -1)
				return INF;

			pos--;
			int rem = imap[ind];
			int ret = a[rem];
			map[rem] = map[pos];
			imap[map[pos]] = rem;
			imap[ind] = -1;
			a[rem] = a[pos];
			a[pos] = INF;
			map[pos] = -1;

			up(rem);
			down(rem);
			return ret;
		}

		public int min() {
			return a[1];
		}

		public int argmin() {
			return map[1];
		}

		public int size() {
			return pos - 1;
		}

		private void up(int cur) {
			for (int c = cur, p = c >>> 1; p >= 1 && a[p] > a[c]; c >>>= 1, p >>>= 1) {
				int d = a[p];
				a[p] = a[c];
				a[c] = d;
				int e = imap[map[p]];
				imap[map[p]] = imap[map[c]];
				imap[map[c]] = e;
				e = map[p];
				map[p] = map[c];
				map[c] = e;
			}
		}

		private void down(int cur) {
			for (int c = cur; 2 * c < pos;) {
				int b = a[2 * c] < a[2 * c + 1] ? 2 * c : 2 * c + 1;
				if (a[b] < a[c]) {
					int d = a[c];
					a[c] = a[b];
					a[b] = d;
					int e = imap[map[c]];
					imap[map[c]] = imap[map[b]];
					imap[map[b]] = e;
					e = map[c];
					map[c] = map[b];
					map[b] = e;
					c = b;
				} else {
					break;
				}
			}
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
