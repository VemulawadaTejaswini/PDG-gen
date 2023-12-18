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
		int mod = 1000000007;
		long[][] res =  guessLeaned(1000000007, 
				1, 4, 16, 84, 516, 3696, 30096, 275040, 2786400, 31000320, 375736320, 928152292
				);
		
		long[] u = {1, 4, 16};
		for(int i = 3;i <= n;i++){
			long v = f(res, u, i, mod);
			for(int j = 0;j < 2;j++){
				u[j] = u[j+1];
			}
			u[2] = v;
		}
		out.println(u[0]);
	}
	
	public static long f(long[][] ged, long[] prevs, long x, int mod)
	{
		int n = ged.length;
		assert prevs.length == n-1;
		x -= n-1;
		
		long s = 0;
		long tar = 0;
		for(int i = 0;i < n;i++){
			long co = 0;
			for(int j = ged[i].length-1;j >= 0;j--){
				co = (co * x + ged[i][j]) % mod;
			}
			if(i < n-1){
				s += co * prevs[i];
				s %= mod;
			}else{
				tar = co;
			}
		}
		
		long ret = -invl(tar, mod) * s % mod;
		if(ret < 0)ret += mod;
		return ret;
	}
	
	public static long[][] guessLeaned(int mod, long... a)
	{
		int n = a.length;
		
		// #formula >= #variable
		// n-r+2 >= r(r+1)/2
		for(int r = n;r >= 1;r--){
			if(n-r+2 < r*(r+1)/2)continue;
			int[][] M = new int[n-r+2][r*(r+1)/2];
			for(int i = 0;i < n-r+1;i++){
				int p = 0;
				for(int j = 0;j < r;j++){
					long prod = 1;
					for(int k = 0;k <= r-j-1;k++){
						M[i][p++] = (int)(prod*a[i+j]%mod);
						prod = prod * i % mod;
					}
				}
			}
			M[n-r+1][0] = 1;
			
			int[] v = new int[n-r+2];
			v[n-r+1] = 1;
			
			Result res = gaussElimination(M, v, mod);
			if(res.exists){
				long[][] ret = new long[r][];
				int p = 0;
				for(int i = 0;i < r;i++){
					ret[i] = new long[r-i];
					for(int j = 0;j < r-i;j++){
						ret[i][j] = res.sol[p++];
					}
				}
				return ret;
			}
		}
		return null;
	}
	
	public static Result gaussElimination(int[][] M, int[] v, int mod)
	{
		int n = M.length, m = M[0].length;
		int[] head = new int[n];
		
		// if not needed, comment out.
		for(int[] row : M){
			for(int i = 0;i < row.length;i++){
				row[i] %= mod;
				if(row[i] < 0)row[i] += mod;
			}
		}
		
		// Forward Elimination
		int row = 0;
		for(int col = 0;col < m;col++){
			// select pivot
			boolean pivotFound = false;
			out:
			for(int prow = row;prow < n;prow++){
				if(M[prow][col] != 0){
					// pivot found
					if(prow != row){
						// swap rows
						for(int k = 0;k < m;k++){
							int u = M[prow][k]; M[prow][k] = M[row][k]; M[row][k] = u;
						}
						int dum = v[prow]; v[prow] = v[row]; v[row] = dum;
					}
					pivotFound = true;
					break out;
				}
			}
			if(!pivotFound)continue;
			head[row] = col;
			
			// diag to 1
			long imul = invl(M[row][col], mod);
			for(int k = 0;k < m;k++){
				M[row][k] = (int)(M[row][k] * imul % mod);
			}
			v[row] = (int)(v[row] * imul % mod);
			
			for(int j = row+1;j < n;j++){
				if(M[j][col] != 0){
					long mul = mod-M[j][col];
					for(int k = col;k < m;k++){
						M[j][k] = (int)((M[j][k] + M[row][k] * mul) % mod);
					}
					v[j] = (int)((v[j] + v[row] * mul) % mod);
				}
			}
			row++;
		}
		
		Result ret = new Result();
		ret.mat = M;
		for(int i = row;i < n;i++){
			if(v[i] != 0){
				ret.rank = row;
				ret.exists = false;
				return ret;
			}
		}
		
		for(int i = row-1;i >= 0;i--){
			for(int j = i-1;j >= 0;j--){
				if(M[j][head[i]] != 0){
					long mul = mod-M[j][head[i]];
					for(int k = head[i];k < m;k++){
						M[j][k] = (int)((M[j][k] + M[i][k] * mul) % mod);
					}
					v[j] = (int)((v[j] + v[i] * mul) % mod);
				}
			}
		}
		
		int[] retv = new int[m];
		for(int i = 0;i < row;i++){
			retv[head[i]] = v[i];
		}
		
		ret.sol = retv;
		ret.rank = row;
		ret.exists = true;
		return ret;
	}
	
	public static class Result
	{
		public int[][] mat;
		public int[] sol;
		public int rank;
		public boolean exists;
	}
	
	public static long invl(long a, long mod) {
		long b = mod;
		long p = 1, q = 0;
		while (b > 0) {
			long c = a / b;
			long d;
			d = a;
			a = b;
			b = d % b;
			d = p;
			p = q;
			q = d - c * q;
		}
		return p < 0 ? p + mod : p;
	}


	
	public static long C(int n, int r, int mod, int[][] fif) {
		if (n < 0 || r < 0 || r > n)
			return 0;
		return (long) fif[0][n] * fif[1][r] % mod * fif[1][n - r] % mod;
	}

	
	public static int[][] enumFIF(int n, int mod) {
		int[] f = new int[n + 1];
		int[] invf = new int[n + 1];
		f[0] = 1;
		for (int i = 1; i <= n; i++) {
			f[i] = (int) ((long) f[i - 1] * i % mod);
		}
		long a = f[n];
		long b = mod;
		long p = 1, q = 0;
		while (b > 0) {
			long c = a / b;
			long d;
			d = a;
			a = b;
			b = d % b;
			d = p;
			p = q;
			q = d - c * q;
		}
		invf[n] = (int) (p < 0 ? p + mod : p);
		for (int i = n - 1; i >= 0; i--) {
			invf[i] = (int) ((long) invf[i + 1] * (i + 1) % mod);
		}
		return new int[][] { f, invf };
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
