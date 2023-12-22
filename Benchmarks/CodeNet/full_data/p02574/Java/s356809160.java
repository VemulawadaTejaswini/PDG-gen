import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

// import java.text.DecimalFormat; 
// import java.text.DecimalFormatSymbols; 
/*
caba
abc
  
 */

public class Main {	
    
	public static void main(String args[] ) throws Exception {
        PrintWriter pw=new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt();
        
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        	a[i] = sc.nextInt();
        
        int res =  pairgcd(a,n);
        if(res==1)
        	pw.print("pairwise coprime");
        else {
        	res = setgcd(a,n);
        	if(res==1) {
        		pw.print("setwise coprime");
        	} else {
        		pw.print("not coprime");
        	}
        }
        
        pw.close();
    }
    
    
    
    
    
   
    static int pairgcd(int[] a,int n) {
	   
		int hi = 0;
		for(int i=0;i<n;i++)
			hi = Math.max(hi, a[i]);
		
		int[] div = new int[hi+1];
		
		for(int i=0;i<n;i++) {
			for(int j=1;j<=Math.sqrt(a[i]);j++) {
				if(a[i]%j==0) {
					div[j]++;
					if(j!=a[i]/j) {
						div[a[i]/j]++;
					}
				}
			}
		}
		for(int i=hi;i>1;i--) {
			if(div[i]>1)
				return i;
		}
	   
		return 1;
	}
    static int gcd(int a,int b) {
    	if(a==0)
    		 return b;
    	return gcd(b%a,a);
    }
   
    static int setgcd(int[] a,int n) {
	   int res=a[0];
	   for(int i=1;i<n;i++) {
		   res = gcd(res,a[i]);
		   if(res==1)
			   return 1;
	   }
	   return res;
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