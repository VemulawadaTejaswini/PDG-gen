import java.io.*;
import java.util.*;

public class Main{ 
   static class Fast{
     public BufferedReader br;
     public StringTokenizer st;
     
     public Fast(){
          br =new BufferedReader(new InputStreamReader(System.in));
     }
     
     String next(){
          while(st==null || !st.hasMoreTokens()){
               try{
                    st=new StringTokenizer(br.readLine());
               }
               catch(IOException e){
                    throw new RuntimeException(e);
               }
               
          }
               return st.nextToken();
          }
     int nextInt(){
          return Integer.parseInt(next());
     }

     long nextLong(){
          return Long.parseLong(next());
     }

 }
  

	public static void main(String[] args)throws Exception{
         //StringTokenizer st;//! @ % & * () _ {} # ~ : < > ? "" | ^
          Fast f=new Fast();
         PrintWriter out = new PrintWriter(System.out);
        // StringBuilder str=new StringBuilder();
         //  int x=Integer.parseInt(st.nextToken());
         
        //st=new StringTokenizer(br.readLine()); 

        
        int n=f.nextInt();
        int W=f.nextInt();
        
        int w[]=new int[n+1];
        int v[]=new int[n+1];
        for (int i=1;i<=n;i++) {
          w[i]=f.nextInt();
          v[i]=f.nextInt();
        }

        long dp[][]=new long[n+1][W+1];
        
        for (int i=1;i<=n;i++) {
          for (int j=1;j<=W;j++) {
            dp[i][j]=dp[i-1][j];
            if (w[i]<=j) {
              dp[i][j]=Math.max(dp[i][j],v[i]+dp[i-1][j-w[i]]);
            }
          }
        }
        
        out.println(dp[n][W]);
        
        //out.println(mh);
    out.close();

}
}


