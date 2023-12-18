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
         String s = infile.readLine();
         String t = infile.readLine();/*
         int N = s.length();
         int M = s.length();
         Node[][] dp = new Node[N+1][M+1];
         for(int i=0; i <= N; i++)
            for(int j=0; j <= M; j++)
               dp[i][j] = new Node(-1, -1, 0);
         for(int i=1; i <= N; i++)
            for(int j=1; j <= M; j++)
            {
               if(s.charAt(i-1) == t.charAt(j-1))
               {
                  int len = dp[i-1][j-1].length+1;
                  if(len > dp[i][j].length)
                     dp[i][j] = new Node(i-1, j-1, len);
               }
               else
               {
                  int len = dp[i][j-1].length;
                  if(len > dp[i][j].length)
                     dp[i][j] = new Node(i, j-1, len);
                  len = dp[i-1][j].length;
                  if(len > dp[i][j].length)
                     dp[i][j] = new Node(i-1, j, len);
               }
            }*/
         System.out.println(solve(s,t));
      }
      public static String solve(String s, String t)
      {
   		if(s.length() == 0 || t.length() == 0) 
            return "";
   		int m = s.length();
   		int n = t.length();
   		int[][] dp = new int[m+1][n+1];
   		for (int i = 1; i <= m; i++) 
   			for (int j = 1; j <= n; j++) 
            {
   				if(s.charAt(i-1) == t.charAt(j-1)) 
                  dp[i][j] = dp[i-1][j-1] + 1;
   				else 
                  dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
   			}
   		int i = m, j = n;
   		StringBuilder sb = new StringBuilder();
   		while(i >= 1 && j >= 1)
         {
   			if(dp[i][j] == dp[i][j-1]) 
               j--;
   			else if(dp[i][j] == dp[i-1][j]) 
               i--;
   			else 
            {
   				sb.append(s.charAt(i-1));
   				i--;
   				j--;
   			}
   		}
   		return sb.reverse().toString();
   	}
   }
   class Node
   {
      public int length;
      public int x;
      public int y;
      
      public Node(int a, int b, int c)
      {
         x = a;
         y = b;
         length = c;
      }
   }