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
		int mod = 1000000007;
		int n = ni(), K = ni();
		char[] s = ns(K);
		boolean[] ued = new boolean[K];
		int use = 0;
		outer:
		for(int i = 0;i < K;i++){
			for(int j = 0;j < K;j++){
				if(s[j] == 'r' && !ued[j]){
					ued[j] = true;
					for(int k = j+1;k < K;k++){
						if(s[k] == 'b' && !ued[k]){
							ued[k] = true;
							use++;
							continue outer;
						}
					}
				}
			}
		}
		
		long[][] C = new long[n + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			C[i][0] = 1;
			for (int j = 1; j <= i; j++) {
				C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
				if (C[i][j] >= mod)
					C[i][j] -= mod;
			}
		}

		
		// ababa
		long[][] nums = new long[41][n+1]; // asterisk len
		
		for(int len = 3;len <= n;len+=2){
			for(int i = len;i <= n;i++){
				nums[len/2-1][i] += C[i-1][len-1];
			}
		}
		// baba
		// abab
		for(int len = 2;len <= n;len+=2){
			for(int i = len;i <= n;i++){
				nums[len/2-1][i] += C[i-1][len-1];
				nums[len/2-1][i] += C[i-1][len-1];
			}
		}
		
		// bab
		for(int len = 1;len <= n;len+=2){
			for(int i = len;i <= n;i++){
				nums[len/2][i] += C[i-1][len-1];
			}
		}
		
//		for(int i = 0;i <= 80;i++){
//			for(int j = 0;j < nums[i].length;j++){
//				if(nums[i][j] != 0){
//					tr(i, j, nums[i][j]);
//				}
//			}
//		}
		
		long[][][][] dp = new long[41][41][use+1][n+1]; // asterisk red ab
		dp[0][0][0][0] = 1;
		for(int i = 1;i <= n;i++){
			for(int j = 0;j <= 40;j++){
				if(use > 0)dp[j][0][1][i] += nums[j][i];
			}
			dp[0][1][0][i] += 1; // r
		}
		
		for(int i = 0;i < n;i++){
			for(int ast = 0;ast <= 40;ast++){
				for(int red = 0;red <= 40;red++){
					for(int rb = 0;rb <= use;rb++){
						if(dp[ast][red][rb][i] == 0)continue;
//						tr(ast, red, rb, i, dp[ast][red][rb][i]);
						
						// w
						dp[ast][red][rb][i+1] += dp[ast][red][rb][i];
						dp[ast][red][rb][i+1] %= mod;
						
						// wrbr
						if(rb+1 <= use){
							for(int last = 0;ast+last <= 40;last++){
								for(int llen = 0;i+llen+1 <= n;llen++){
									dp[ast+last][red][rb+1][i+llen+1] += 
											dp[ast][red][rb][i] * nums[last][llen];
									dp[ast+last][red][rb+1][i+llen+1] %= mod;
								}
							}
						}
						
						// wr
						if(red+1 <= 40){
							for(int llen = 1;i+llen+1 <= n;llen++){
								dp[ast][red+1][rb][i+llen+1] += 
										dp[ast][red][rb][i];
								dp[ast][red+1][rb][i+llen+1] %= mod;
							}
						}
					}
				}
			}
		}
		
		int nr = 0;
		for(char c : s)if(c == 'r')nr++;
		int nb = K-nr;
		long ans = 0;
		for(int ast = 0;ast <= 40;ast++){
			for(int red = 0;red <= 40;red++){
				for(int rb = 0;rb <= use;rb++){
					int remr = nr - red - rb;
					int remb = nb - rb;
					if(remr < 0 || remr + remb < ast)break;
					ans += dp[ast][red][rb][n];
				}
			}
		}
		out.println(ans%mod);
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
