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
      static long MOD = 998244353L;
      public static void main(String omkar[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int M = Integer.parseInt(st.nextToken());
         int K = Integer.parseInt(st.nextToken());
         //solve
         long[] fac = new long[200001];
         fac[0] = 1L;
         for(int i=1; i <= 200000; i++)
            fac[i] = (fac[i-1]*i)%MOD;
         long res = power(M, N, MOD);
         for(int i=N-K-1; i > 0; i--)
         {
            long temp = power(M-1, i-1, MOD);
            temp = (temp*M)%MOD;
            //dont double count
            temp = (temp*fac[N-1])%MOD;
            temp = (temp*power(fac[N-i], MOD-2, MOD))%MOD;
            temp = (temp*power(fac[i-1], MOD-2, MOD))%MOD;
            res = (res-temp+MOD)%MOD;
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