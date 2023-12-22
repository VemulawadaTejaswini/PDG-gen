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
		int[] vs = new int[n+1];
		int[] ws = new int[n+1];
		for(int i = 0;i < n;i++){
			vs[i+1] = ni();
			ws[i+1] = ni();
		}
		int Q = ni();
		long[] qs = new long[Q];
		for(int z = 0;z < Q;z++){
			qs[z] = (long)ni()<<40|(long)ni()<<20|z;
		}
		Arrays.sort(qs);

		long[][] bases = new long[1<<9][];
		long[] anss = new long[Q];
		for(int i = 0;i < Q;){
			int j = i;
			while(j < Q && qs[i]>>>40 == qs[j]>>>40){
				j++;
			}
			int v = (int)(qs[i]>>>40);
			int D = 32-Integer.numberOfLeadingZeros(v);
			int h = D/2;
			
			long[] vws = new long[1<<h];
			for(int k = 1;k < 1<<h;k++){
				int l = Integer.numberOfTrailingZeros(k);
				vws[k] = vws[k&k-1] + ((long)ws[v>>>l]<<32|vs[v>>>l]);
			}
			Arrays.sort(vws);
			for(int k = 1;k < vws.length;k++){
				if((int)vws[k] < (int)vws[k-1]){
					vws[k] = vws[k]>>>32<<32|(int)vws[k-1];
				}
			}
			
			long[] vws2 = bases[v>>>h];
			if(vws2 == null){
				vws2 = new long[1<<D-h];
				for(int k = 1;k < 1<<D-h;k++){
					int l = Integer.numberOfTrailingZeros(k);
					vws2[k] = vws2[k&k-1] + ((long)ws[v>>>l+h]<<32|vs[v>>>l+h]);
				}
				Arrays.sort(vws2);
				bases[v>>>h] = vws2;
			}
			
			for(int u = i;u < j;u++){
				int L = (int)(qs[u]>>>20&(1L<<20)-1);
				int p = (1<<h)-1;
				long ans = 0;
				for(int k = 0;k < 1<<D-h && p >= 0;k++){
					while(p >= 0 && (vws2[k]>>>32) + (vws[p]>>>32) > L){
						p--;
					}
					if(p >= 0){
						ans = Math.max(ans, (int)vws2[k] + (int)vws[p]);
					}
				}
				anss[(int)(qs[u]&(1L<<20)-1)] = ans;
			}
			
			i = j;
		}
		
		StringBuilder sb = new StringBuilder();
		for(long v : anss){
			sb.append(v).append("\n");
		}
		out.print(sb);
	}
	
	public static int lowerBound(int[] a, int v){ return lowerBound(a, 0, a.length, v); }
	public static int lowerBound(int[] a, int l, int r, int v)
	{
		if(l > r || l < 0 || r > a.length)throw new IllegalArgumentException();
		int low = l-1, high = r;
		while(high-low > 1){
			int h = high+low>>>1;
			if(a[h] >= v){
				high = h;
			}else{
				low = h;
			}
		}
		return high;
	}

	
	public static void main(String[] args) throws Exception
	{
//		int n = (1<<18)-1, m = 99999;
//		Random gen = new Random();
//		StringBuilder sb = new StringBuilder();
//		sb.append(n + " ");
//		for (int i = 0; i < n; i++) {
//			sb.append(gen.nextInt(100000) + " ");
//			sb.append(gen.nextInt(100000) + " ");
//		}
//		sb.append(m + " ");
//		for (int i = 0; i < m; i++) {
//			sb.append(gen.nextInt(n)+1 + " ");
//			sb.append(gen.nextInt(100000) + " ");
//		}
//		INPUT = sb.toString();

		
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
