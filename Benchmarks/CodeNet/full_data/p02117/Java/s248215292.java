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
		int n = ni(), X = ni(), Y = ni();
		int[][][] dgs = new int[n][][];
		for(int i = 0;i < n;i++){
			int K = ni();
			int[][] row = new int[K][];
			for(int j = 0;j < K;j++){
				row[j] = na(3);
			}
			dgs[i] = row;
		}
		int[][] d = new int[n][];
		for(int i = 0;i < n;i++){
			d[i] = na(n);
		}
		for(int k = 0;k < n;k++){
			for(int i = 0;i < n;i++){
				for(int j = 0;j < n;j++){
					d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
				}
			}
		}
		
		int[][] dp = new int[1<<n][n];
		for(int i = 1;i < 1<<n;i++){
			if(Integer.bitCount(i) == 1){
				dp[i][Integer.numberOfTrailingZeros(i)] = d[0][Integer.numberOfTrailingZeros(i)];
			}else{
				for(int j = 0;j < n;j++){
					if(i<<~j<0){
						dp[i][j] = 999999999;
						for(int k = 0;k < n;k++){
							if(i<<~k<0 && k != j){
								// k->j
								dp[i][j] = Math.min(dp[i][j], dp[i^1<<j][k] + d[k][j]);
							}
						}
					}
				}
			}
		}
		
		long ans = 0;
		int[] dq = new int[1005];
		int[][] eps = new int[1<<n][];
		for(int i = 1;i < 1<<n;i+=2){
			int ld = dp[i][0];
			int rem = Math.min(Y, X-ld);
			if(rem < 0)continue;
			int j = Integer.numberOfTrailingZeros(Integer.highestOneBit(i));
			int[] ep = Integer.bitCount(i) == 1 ? new int[rem+1] : Arrays.copyOf(eps[i^1<<j], rem+1);
			for(int[] dg : dgs[j]){
				int price = dg[0], sa = dg[1], z = dg[2];
				int[] nep = new int[rem+1];
				for(int k = 0;k < price;k++){
					int tail = 0, head = 0;
					for(int l = k;l <= rem;l+=price){
						while(head-tail > 0 && ep[dq[head-1]] + (l-dq[head-1])/price * sa < ep[l]){
							head--;
						}
						dq[head++] = l;
						while(dq[tail] < l-z*price){
							tail++;
						}
						nep[l] = ep[dq[tail]] + (l-dq[tail])/price * sa;
					}
				}
				ep = nep;
			}
//			tr(i, ep);
			ans = Math.max(ans, ep[rem]);
			eps[i] = ep;
		}
		out.println(ans);
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
	public static int lenbuf = 0, ptrbuf = 0;
	
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
	private static int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
	
	private static double nd() { return Double.parseDouble(ns()); }
	private static char nc() { return (char)skip(); }
	
	private static String ns()
	{
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while(!(isSpaceChar(b))){ // when nextLine, (isSpaceChar(b) && b != ' ')
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