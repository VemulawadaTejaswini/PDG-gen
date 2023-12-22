import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

// import java.text.DecimalFormat; 
// import java.text.DecimalFormatSymbols; 
/*
 
 
 
 */

public class Main {

    public static void main(String args[] ) throws Exception {
        PrintWriter pw=new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        
        int t=1;
        //t = sc.ni();
        while(t-->0) {
        	solve(pw,sc);
        }
       
        pw.close();
    }
    static final int M = (int) 1e9+7;
    static long[] fac;
    private static void solve(PrintWriter pw, FastScanner sc) {
    	int n = sc.ni();
    	fac = new long[n+1];
    	fill(n);
    	
    	long ans = exp(10L,n);
    	//pw.println(ans);
    	ans = (ans-exp(8L,n)+M)%M;
    	long te =0;
    	//pw.println(ans);
    	for(int i=1;i<=n;i++) {
    		te = (te+(exp(8,n-i)*(fac[n]*exp((fac[n-i]*fac[i])%M,M-2))%M)%M)%M;
    	}
    	//pw.println(te);
    	ans = (ans-(te*2)%M+M)%M;
    	
    	pw.println(ans);
    	
	}
    static void fill(int n) {
    	fac[0]=1L;
    	for(int i=1;i<n+1;i++) {
    		fac[i]=(fac[i-1]*i)%M;
    	}
    			
    }
    static long exp(long x,int n) {
    	long res=1;
    	while(n>0) {
    		if((n&1)==1) {
    			res= (res*x)%M;
    		}
    		x = (x*x)%M;
    		n=n>>1;
    	}
    	return res;
    }

	static <T> void deb(T x,int o){
       System.out.print(x);
       if(o==0) {
    	   System.out.println();
    	   
       }
    }
   
   
   static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		public String ne() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		public String ne(int k) {
			try {
				return br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "Not able to read";
		}
		
		int ni() {
			return Integer.parseInt(ne());
		}
		
		long nl() {
			return Long.parseLong(ne());
		}
		
		double nd() {
			return Double.parseDouble(ne());
		}
		
	    
	}
   
}