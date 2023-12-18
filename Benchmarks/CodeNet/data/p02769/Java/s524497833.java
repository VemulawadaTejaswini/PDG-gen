import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
	static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
	public static long mod = (long) (1e9+7);
	public static long[] fac,inv;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();
	    int n = sc.nextInt();
	    int k = sc.nextInt();
	    k = Math.min(n-1, k);
	    long ans = 0;
	    precompute(n);
	    for(int r=0;r<=k;++r) {
	    	ans= (ans + (ncr(n,r) * ncr(n-1,r))%mod)%mod;
	    }
	    out.print(ans);
	    out.close();

	}
	static void precompute(int n){

		fac = new long[n+1];
		inv = new long[n+1];
		fac[0]=fac[1]=1;
		for(int i=2;i<fac.length;i++)
		{
			fac[i]=(fac[i-1]*i)%mod;
		}
		
		inv[n]=pow(fac[n],mod-2)%mod;
		for(int i=n-1;i>=0;i--)
		{
			inv[i]=(inv[i+1]*(i+1))%mod;
		}
	}
	private static long pow(long a, long b) {
		// TODO Auto-generated method stub
		return BigInteger.valueOf(a).modPow(BigInteger.valueOf(b), BigInteger.valueOf(mod)).longValue();
	}
	private static long ncr(int n, int r) {
		
		return (fac[n]*(inv[r]*inv[n-r]%mod)%mod)%mod;
	}

}
