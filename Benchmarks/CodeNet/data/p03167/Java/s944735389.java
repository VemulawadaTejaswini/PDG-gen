import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

// import java.text.DecimalFormat; 
// import java.text.DecimalFormatSymbols; 
 
public class Main {
    
    public static final int m = (int)1e9+7;
    
    public static void main(String args[] ) throws Exception {
        StringBuffer str = new StringBuffer();
        PrintWriter pw=new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] c = new char[h][w];
        for(int i=0;i<h;i++)
            c[i] = sc.next().toCharArray();
        
        long[][] dp = new long[h][w];
        for(int i=1;i<h;i++){
            if(c[i][0]=='.'){
                dp[i][0] = 1;
            } else 
                break;
        }
        for(int i=1;i<w;i++){
            if(c[0][i]=='.'){
                dp[0][i] = 1;
            } else 
                break;
        }
        for(int i=1;i<h;i++){
            for(int j=1;j<w;j++){
                if(c[i][j]=='.'){
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                    if(dp[i][j]>=m)
                        dp[i][j]-=m;
                }
            }
        }
        
        
        str.append(dp[h-1][w-1]);
        
        
        pw.println(str.toString());
        
        pw.close();
    }
    
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   public static <T> void deb(T x){
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