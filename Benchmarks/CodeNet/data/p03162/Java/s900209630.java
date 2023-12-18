import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

// import java.text.DecimalFormat; 
// import java.text.DecimalFormatSymbols; 
 
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
public class Main {
    
    
    public static void main(String args[] ) throws Exception {
        StringBuffer str = new StringBuffer();
        PrintWriter pw=new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        
        
        int n = sc.nextInt();
        int[] dp = new int[3];
        int[] a = new int[3];
        for(int z=0;z<n;z++){
            int[] new_dp = new int[3];
            for(int j=0;j<3;j++)
                a[j] = sc.nextInt();
            for(int i=0;i<3;i++)
                for(int j=0;j<3;j++){
                    if(i!=j){
                        new_dp[j] = Math.max(new_dp[j],dp[i]+a[j]);
                    }
                }
            
            dp= new_dp;
        }
        int ans = dp[0];
        for(int i=0;i<2;i++){
            ans = Math.max(ans,dp[i+1]);
        }
        
        str.append(ans);
        
        pw.println(str.toString());
        
        pw.close();
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