/*
If you want to aim high, aim high
Don't let that studying and grades consume you
Just live life young
******************************
If I'm the sun, you're the moon
Because when I go up, you go down
*******************************
I'm working for the day I will surpass you
https://www.a2oj.com/Ladder16.html
*/
import java.util.*;
import java.io.*;
import java.math.*;

   public class Main
   {
      static long MOD = 1000000007L;
      public static void main(String omkar[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int K = Integer.parseInt(st.nextToken());
         long[] dp = new long[K+1];
         dp[K] = 1;
         for(int x=K-1; x >= 1; x--)
         {
            int choices = K/x;
            dp[x] = power(choices, N, MOD);
            //inclusion exclusion
            int dex = 2*x;
            while(dex <= K)
            {
               dp[x] -= dp[dex];
               dp[x] += MOD;
               dp[x] %= MOD;
               dex += x;
            }
         }
         long res = 0L;
         for(int x=1; x <= K; x++)
         {
            res += dp[x]*x;
            res %= MOD;
         }
         System.out.println(res);
      }
      public static long power(long x, long y, long p) 
      { 
          long res = 1L;      
          x = x % p;  
          while (y > 0) 
          { 
              if((y & 1)==1) 
                  res = (res * x) % p; 
              y = y >> 1;  
              x = (x * x) % p;  
          } 
          return res; 
      } 
   }