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
        int w = sc.nextInt();
        int[][] a = new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        long[][] dp = new long[n+1][w+1];
        for(int i=1;i<=n;i++){
            for(int j=0;j<=w;j++){
                int t = j-a[i-1][0];
                dp[i][j]=dp[i-1][j];
                if(t>=0){
                    dp[i][j]=Math.max(dp[i][j],dp[i-1][t]+a[i-1][1]);
                }
                //System.out.print(dp[i][j]+" ");
            }
            //System.out.println();
        }
        str.append(dp[n][w]);
        
        
        
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