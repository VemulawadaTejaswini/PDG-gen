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
        int k=f.nextInt();
        int h[]=new int[n+1];
        for (int i=0;i<n;i++ ) {
          h[i+1]=f.nextInt();
        }
        int way=Integer.MAX_VALUE;
        int dp[]=new int[n+1];
        dp[2]=Math.abs(h[2]-h[1]);
        for (int i=3;i<dp.length;i++) {
          way=Integer.MAX_VALUE;
          for (int j=Math.max(1,i-k);j<i;j++) {
             way=Math.min(way,dp[j]+Math.abs(h[j]-h[i]));
          }
          dp[i]=way;
        }
        
        out.println(dp[n]);
    out.close();

}
}


