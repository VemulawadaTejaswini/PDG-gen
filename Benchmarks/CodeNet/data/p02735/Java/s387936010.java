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
         int[][] grid = new int[N][M];
         for(int i=0; i < N; i++)
         {
            char[] boof = infile.readLine().toCharArray();
            for(int a=0; a < M; a++)
               if(boof[a] == '#')
                  grid[i][a] = 1;
         }
         int[][][] dp = new int[N][M][2];
         for(int i=0; i < N; i++)
            for(int a=0; a < M; a++)
               Arrays.fill(dp[i][a], -1);
         int res = dfs(0,0,grid[0][0],dp,grid)/2;
         res += grid[0][0];
         System.out.println(res);
      }
      public static int dfs(int x, int y, int color, int[][][] dp, int[][] grid)
      {
         if(dp[x][y][color] != -1)
            return dp[x][y][color];
         int N = grid.length;
         int M = grid[0].length;
         if(x == N-1 && y == M-1)
            return dp[x][y][color] = color;
         int res = Integer.MAX_VALUE;
         if(x+1 < N)
         {
            if(grid[x+1][y] == color)
               res = Math.min(res, dfs(x+1,y,color,dp,grid));
            else
               res = Math.min(res, 1+dfs(x+1,y,(color+1)%2,dp,grid));
         }
         if(y+1 < M)
         {
            if(grid[x][y+1] == color)
               res = Math.min(res, dfs(x,y+1,color,dp,grid));
            else
               res = Math.min(res, 1+dfs(x,y+1,(color+1)%2,dp,grid));
         }
         return dp[x][y][color] = res;
      }
   }