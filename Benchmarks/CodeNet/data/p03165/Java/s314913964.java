import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

// import java.text.DecimalFormat; 
// import java.text.DecimalFormatSymbols; 
 
public class Main {
    
    public static char[] ans;
    public static char[] s;
    public static char[] t;
    
    public static void main(String args[] ) throws Exception {
        StringBuffer str = new StringBuffer();
        PrintWriter pw=new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        
        s = sc.next().toCharArray();
        t = sc.next().toCharArray();
        int n = s.length;
        int m = t.length;
        int[][] dp = new int[n+1][m+1];
        //deb(Arrays.toString(dp[0]));
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                dp[i][j] = dp[i-1][j-1];
                if(s[i-1]==t[j-1]){
                    dp[i][j]++;
                } else {
                    dp[i][j] = Math.max(dp[i][j],dp[i][j-1]);
                    dp[i][j] = Math.max(dp[i][j],dp[i-1][j]);
                }
                
            }
            //deb(Arrays.toString(dp[i]));
        }
        ans = new char[dp[n][m]];
        find(dp,n,m,dp[n][m]-1);
        str.append(new String(ans));
        
        
        pw.println(str.toString());
        
        pw.close();
    }
    public static void find(int[][] dp,int x,int y,int i){
        if(x==0||y==0||i<0){
            return;
        }
        if(s[x-1]==t[y-1]){
            ans[i]=s[x-1];
            find(dp,x-1,y-1,i-1);
        } else if(dp[x][y]==dp[x-1][y]){
            find(dp,x-1,y,i);
        } else if(dp[x][y]==dp[x][y-1]){
            find(dp,x,y-1,i);
        } else if(dp[x][y]==dp[x-1][y-1])
            find(dp,x-1,y-1,i);
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