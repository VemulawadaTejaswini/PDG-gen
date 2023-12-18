import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int w=sc.nextInt();
         int wi[]=new int[n];
         int v[]=new int [n];
         
          for(int i=0;i<n;i++)
          {
              wi[i]=sc.nextInt();
              v[i]=sc.nextInt();
          }
          
         long dp[][]=new long[n][w+1];
         
         for(int i=wi[0];i<=w;i++)
          {
              dp[0][i]=v[0];
          }
          for(int i=1;i<n;i++)
           {
             for(int j=0;j<=w;j++)
              {
                 
                 if(j<wi[i])
                  dp[i][j]=dp[i-1][j];
                  else
                  dp[i][j]=Math.max(dp[i-1][j] , v[i]+dp[i-1][j-wi[i]]);
               }
               
          }
         
         System.out.println(dp[n-1][w]);
            
             
           
          
       }
     
     
}