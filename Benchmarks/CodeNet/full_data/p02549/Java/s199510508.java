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
Shining through the city with a little funk and soul
*******************************
300iq as writer = Sad!
*/
import java.util.*;
import java.io.*;
import java.math.*;

   public class Main
   {
      static final long MOD = 998244353L;
      public static void main(String hi[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int K = Integer.parseInt(st.nextToken());
         int[][] arr = new int[K][2];
         for(int i=0; i < K; i++)
         {
            st = new StringTokenizer(infile.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
         }
         long[] dp = new long[N+1];
         long[] pref = new long[N+1];
         dp[1] = pref[1] = 1L;
         for(int i=2; i <= N; i++)
         {
            for(int k=0; k < K; k++)
            {
               if(i-arr[k][0] <= 0)
                  continue;
               int right = i-arr[k][0];
               int left = Math.max(1, i-arr[k][1]);
               dp[i] += pref[right]-pref[left-1]+MOD;
               while(dp[i] >= MOD)
                  dp[i] -= MOD;
            }
            pref[i] = pref[i-1]+dp[i];
            if(pref[i] >= MOD)
               pref[i] -= MOD;
         }
         System.out.println(dp[N]);
      }
   }