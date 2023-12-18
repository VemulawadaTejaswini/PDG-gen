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
300iq as writer = Sad!
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
         int X = Integer.parseInt(st.nextToken());
         int Y = Integer.parseInt(st.nextToken());
         int Z = Integer.parseInt(st.nextToken());
         int all = (1<<(X+Y+Z))-1;
         int bad = 1<<(Z-1);
         bad += 1<<(Y+Z-1);
         bad += 1<<(X+Y+Z-1);
         long[][] dp = new long[N+1][all+1];
         dp[0][0] = 1L;
         for(int i=1; i <= N; i++)
            for(int mask=0; mask <= all; mask++)
               for(int d=1; d <= 10; d++)
               {
                  long lmao = (long)mask;
                  int nextmask = (int)(lmao << d)+(1<<(d-1));
                  nextmask &= all;
                  if((nextmask&bad) != bad)
                  {
                     dp[i][nextmask] += dp[i-1][mask];
                     if(dp[i][nextmask] >= MOD)
                        dp[i][nextmask] -= MOD;
                     
                  }
               }
         long res = 1L;
         for(int i=0; i < N; i++)
            res = (res*10)%MOD;
         for(int mask=0; mask <= all; mask++)
         {
            res -= dp[N][mask];
            if(res < 0)
               res += MOD;
         }
         System.out.println(res);
      }
   }