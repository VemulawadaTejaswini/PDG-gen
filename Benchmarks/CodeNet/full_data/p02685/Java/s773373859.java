import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static class FastReader {
		BufferedReader br;
		StringTokenizer root;
		
 
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (root == null || !root.hasMoreTokens()) {
				try {
					root = new StringTokenizer(br.readLine());
				} catch (Exception addd) {
					addd.printStackTrace();
				}
			}
			return root.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		double nextDouble() {
			return Double.parseDouble(next());
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
 
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception addd) {
				addd.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	
	public static FastReader sc = new FastReader();
 
	//static int MOD = (int) (1e9+7),MAX=(int) (2e5);
    static List<Integer>[] edges;
  
	public static void main(String[] args) {
		precompute((int)3e5);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		long ans = 0;
	//	out.println(solve(n,m,n-1));
		for(int K=n-1;K>=n-k-1;--K) {
			ans = (ans + solve(n,m,K)%MOD)%MOD;
			//out.println(solve(n,m,K));
		}
	  out.print(ans);
		out.close();
   }
	static long solve(int n,int m,int k) {
		return mul(mul(mul(fac[n - 1], inv(mul(fac[k], fac[n - k - 1]))), m), pow(m - 1, k));
	}
	static final int MOD = 998244353;
	 
	static int add(int a, int b) {
		int res = a + b;
		return res >= MOD ? res - MOD : res;
	}
 
	static int sub(int a, int b) {
		int res = a - b;
		return res < 0 ? res + MOD : res;
	}
 
	static int mul(long r, long fac2) {
		int res = (int) ((long) r * fac2 % MOD);
		return res < 0 ? res + MOD : res;
	}
 
	static long pow(long fac2, int e) {
		if (e == 0) {
			return 1;
		}
		long r = fac2;
		for (int i = 30 - Integer.numberOfLeadingZeros(e); i >= 0; i--) {
			r = mul(r, r);
			if ((e & (1 << i)) != 0) {
				r = mul(r, fac2);
			}
		}
		return r;
	}
 
	static long inv(int a) {
		return pow(a, MOD - 2);
	}
 
	static long[] fac,inv;
	static void precompute(int n)
	{

		 fac = new long[n+1];
	     inv = new long[n+1];
		fac[0]=fac[1]=1;
		for(int i=2;i<fac.length;i++)
		{
			fac[i]=fac[i-1]*i;
			fac[i]%=MOD;
		}
		
		inv[n]=pow(fac[n],(int) (MOD-2));
		for(int i=n-1;i>=0;i--)
		{
			inv[i]=inv[i+1]*(i+1);
			inv[i]%=MOD;
		}
	}
 
	
	
}

