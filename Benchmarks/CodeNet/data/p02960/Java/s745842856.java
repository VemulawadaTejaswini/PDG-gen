/*
Roses are red
Memes are neat
All my test cases time out
Lmao yeet
**************************
Codeforces Java Template 
made by Ray Bai
*/
import java.util.*;
import java.io.*;

   public class Main
   {
      public static void main(String args[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         String input = st.nextToken();
         int N = input.length();
         //process
         int[] arr = new int[N];
         for(int i=0; i < N; i++)
         {
            char c = input.charAt(i);
            if(c == '?')
               arr[i] = -1;
            else
               arr[i] = Integer.parseInt(c+"");
         }
         long[][] dp = new long[N+1][13];
         long MOD = 1000000007L;
         //base
         if(arr[0] >= 0)
         {
            int rem = power(10, N-1, 13);
            rem *= arr[0];
            rem %= 13;
            dp[0][rem] = 1L;
         }
         else
            for(int i=0; i <= 9; i++)
            {
               int rem = power(10, N-1, 13);
               rem *= i;
               rem %= 13;
               dp[0][rem] = 1L;
            }
         for(int i=1; i < N; i++)
         {
            int var = arr[i];
            if(var >= 0)
               for(int r=0; r < 13; r++)
               {
                  int val = power(10, N-1-i, 13);
                  val *= var;
                  dp[i][(val+r)%13] += dp[i-1][r];
                  dp[i][(val+r)%13] %= MOD;
               }
            else
               for(int v=0; v <= 9; v++)
                  for(int r=0; r < 13; r++)
                  {
                     int val = power(10, N-1-i, 13);
                     val *= v;
                     dp[i][(val+r)%13] += dp[i-1][r];
                     dp[i][(val+r)%13] %= MOD;
                  }
         }
         System.out.println(dp[N-1][5]);
      }
      public static int power(long x, long y, long p) 
       { 
           // Initialize result 
           long res = 1L;
           // Update x if it is more   
           // than or equal to p 
           x = x % p;  
         
           while (y > 0) 
           { 
               // If y is odd, multiply x 
               // with result 
               if((y & 1)==1) 
                   res = (res * x) % p; 
         
               // y must be even now 
               // y = y / 2 
               y = y >> 1;  
               x = (x * x) % p;  
           } 
           return (int)res; 
       } 
   }