/*
If you want to aim high, aim high
Don't let that studying and grades consume you
Just live life young
******************************
What do you think? What do you think?
1st on Billboard, what do you think of it
Next is a Grammy, what do you think of it
However you think, I’m sorry, but shit, I have no fcking interest
*******************************
I'm standing on top of my Monopoly board
That means I'm on top of my game and it don't stop
til my hip don't hop anymore
https://www.a2oj.com/Ladder16.html
*******************************
300IQ as writer = Sad!
*/
import java.util.*;
import java.io.*;
import java.math.*;

   public class Main
   {
      static long MOD = 1000000007L;
      public static void main(String hi[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int M = Integer.parseInt(st.nextToken());
         long res = 1L;
         int tempo = M;
         for(int i=0; i < N; i++)
         {
            res *= tempo;
            res %= MOD;
            tempo--;
         } 
         //pie
         long[] fac = new long[500001];
         long[] invfac = new long[500001];
         fac[0] = invfac[0] = 1L;
         for(int i=1; i <= 500000; i++)
         {
            fac[i] = (fac[i-1]*i)%MOD;
            invfac[i] = power(fac[i], MOD-2, MOD);
         }
         long other = 0L;
         for(int c=0; c <= N; c++) 
         {
            long temp = (fac[N]*invfac[c])%MOD;
            temp = (temp*invfac[N-c])%MOD;
            //temp = (temp*fac[M-c])%MOD;
            int leftover = N-c;
            int choices = M-c;
            
            long boof = (fac[choices]*invfac[choices-leftover])%MOD;
            //boof = (boof*invfac[choices-leftover])%MOD;
            temp = (temp*boof)%MOD;
            
            if(c%2 == 1)
               temp *= -1;
            other += temp+MOD;
            other %= MOD;
         }
         res = (res*other)%MOD;
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