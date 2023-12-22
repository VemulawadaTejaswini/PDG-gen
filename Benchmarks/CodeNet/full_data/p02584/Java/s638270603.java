import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

// import java.text.DecimalFormat; 
// import java.text.DecimalFormatSymbols; 
 
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
public class Main {
    
    
    public static void main(String args[] ) throws Exception {
        // StringBuffer str = new StringBuffer();
        // PrintWriter pw=new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        
        long x,k,d;
        x = sc.nextLong();
        k = sc.nextLong();
        d = sc.nextLong();
        boolean f=true;
        if(x<0){
            f=true;
            x=0L-x;
        }
        long rem = x%d;
        long mov=x/d;
        if(k<=mov+1){
            long ans = x-k*d;
            if(ans<0)
                ans=0-ans;
            System.out.println(ans);
        } else  {
            long ans = x-d*mov;
            long op = k-mov;
            if((op&1)==0){
                System.out.println(ans);
            } else{
                ans = ans-d;
                if(ans<0)
                    ans = 0-ans;  
                System.out.println(ans);
            }
        }
        
        
        
        
        
        
        // str.append(ans);
        
        
        
        
        // pw.println(str.toString());
        
        // pw.close();
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