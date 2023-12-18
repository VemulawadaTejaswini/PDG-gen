import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Rough {

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
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    long total = pow(2,n)-1;
	    long waste = (ncr(n,a) + ncr(n,b))%mod;
	    long ans = (total - waste + mod)%mod; 
	    out.print(ans);
		out.close();

	}
	private static long ncr(int n, int r) {
		long a = 1, b = 1;
		for(long i=0; i<r; ++i){
			a = (a*(n-i))% mod;
			b = (b*(r-i))% mod;
		}
		return (a * pow(b,mod-2))%mod;
	}
	
			 
	private static long pow(long a, long b) {
		return BigInteger.valueOf(a).modPow(BigInteger.valueOf(b), BigInteger.valueOf(mod)).longValue();
	}
	

}
