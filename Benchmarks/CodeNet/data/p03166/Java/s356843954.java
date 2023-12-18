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
         int M = Integer.parseInt(st.nextToken());
         LinkedList<Integer>[] edges = new LinkedList[N+1];
         for(int i=1; i <= N; i++)
            edges[i] = new LinkedList<Integer>();
         for(int i=0; i < M; i++)
         {
            st = new StringTokenizer(infile.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            edges[a].add(b);
         }
         int[] dp = new int[N+1];
         Arrays.fill(dp, -1);
         for(int i=1; i <= N; i++)
            if(dp[i] == -1)
               dfs(i, dp, edges);
         int res = 0;
         for(int x: dp)
            res = Math.max(res, x);
         System.out.println(res);
      }
      public static int dfs(int curr, int[] dp, LinkedList<Integer>[] edges)
      {
         if(dp[curr] >= 0)
            return dp[curr];
         int res = 0;
         for(int next: edges[curr])
            res = Math.max(res, 1+dfs(next, dp, edges));
         return dp[curr] = res;
      }
   }