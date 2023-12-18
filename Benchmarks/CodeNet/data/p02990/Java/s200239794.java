import java.io.*;
import java.util.*;

public class Main {

	static class FastReader { 
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
	public static List<Integer>[] edges;
	public static long[] fac,inv;
	public static int mod = (int) (1e9+7),MAX = (int) (1e5+1);
	public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();
	
		int n = sc.nextInt();
		int k = sc.nextInt();
		fac = new long[MAX];
		inv = new long[MAX];
		fac[0] = 1;
		for(int i=1;i<fac.length;++i) fac[i] = (i*fac[i-1])%mod;
		inv[MAX-1]=pow(fac[MAX-1],mod-2);
		for(int i=MAX-2;i>=0;i--){
			inv[i]=(inv[i+1]*(i+1))%mod;
		}
		
		for(int i=1;i<=k;++i) {
			long ans = (ncr(n-k+1,i)*ncr(k-1,i-1))%mod;
			out.println(ans);
		}
        out.close();
		
	}
	private static long ncr(int n, int r) {
		// TODO Auto-generated method stub
		return ((fac[n]*inv[r])%mod*inv[n-r])%mod;
	}
	private static long pow(long a, int b) {
		if(b == 0) return 1;
		long p =pow(a,b/2);
		p = (p*p)%mod;
		if((b&1) == 1) p = (a*p)%mod;
		return p;
	}
	
}
