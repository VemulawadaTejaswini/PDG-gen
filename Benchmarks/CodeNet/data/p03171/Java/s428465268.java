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
      public static void main(String omkar[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         arr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         //what is dp?
         dp = new long[N][N];
         for(int i=0; i < N; i++)
            Arrays.fill(dp[i], 69);
         System.out.println(dfs(0,N-1));
      }
      static int[] arr;
      static long[][] dp;
      public static long dfs(int a, int b)
      {
         if(a > b)
            return 0;
         int N = arr.length;
         if(a == b)
         {
            int temp = arr[a];
            if(arr.length%2 == 0)
               temp *= -1;
            return dp[a][b] = temp;
         }
         if(dp[a][b] != 69)
            return dp[a][b];
         int turn = N-b+a-1;
         long res = Long.MIN_VALUE;
         if(turn%2 == 0)
            res = Math.max(res, Math.max(arr[a]+dfs(a+1,b),arr[b]+dfs(a,b-1)));
         else
         {
            res = Long.MAX_VALUE;
            res = Math.min(res, Math.min(-1*arr[a]+dfs(a+1,b),-1*arr[b]+dfs(a,b-1)));
         }
         return dp[a][b] = res;
      }
   }