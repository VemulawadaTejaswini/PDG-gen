import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

// import java.text.DecimalFormat; 
// import java.text.DecimalFormatSymbols; 

public class Main {

	public static final int m = (int)1e9+7;
	
    public static void main(String args[] ) throws Exception {
        PrintWriter pw=new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] s = new long[n];
        for(int i=0;i<n;i++)
        	a[i] = sc.nextLong();
        
        s[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--) {
        	s[i] = a[i]+s[i+1];
        	if(s[i]>=m) {
        		s[i]-=m;
        	}
        }
        
        long ans=0;
        for(int i=0;i<n-1;i++) {
        	ans +=(a[i]*s[i+1]);
        	if(ans>=m) {
        		ans=ans%m;
        	}
        }
        
        pw.print(ans);
        pw.close();
    }
    
    
    
    
    
    
   
   static <T> void deb(T x){
       System.out.println(x);
   }
   
   
   static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		public String next(int k) {
			try {
				return br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "Not able to read";
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		double nextDouble() {
			return Double.parseDouble(next());
		}
		
	    
	}
   
}