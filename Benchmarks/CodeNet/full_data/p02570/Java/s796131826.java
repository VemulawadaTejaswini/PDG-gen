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
        
//        char[] s = sc.next().toCharArray();
//        char[] t = sc.next().toCharArray();
//        int n = s.length;
//        int m = t.length;
//        int max = 0;
//        for(int i=0;i<n-m+1;i++) {
//        	int c=0;
//        	int in=0;
//        	for(int j=i;j<m;j++) {
//        		if(s[j]==t[in]) {
//        			c++;
//        		}
//        		in++;
//        	}
//        	max = Math.max(max, c);
//        }
        double d = sc.nextDouble();
        double t = sc.nextDouble();
        double s = sc.nextDouble();
        
        if(d/s<=t) {
        	pw.print("Yes");
        } else {
        	pw.print("No");
        }
        
        
        //pw.print(t.length-max);
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