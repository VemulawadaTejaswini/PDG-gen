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
         StringTokenizer st = null;
         int[][] grid = new int[3][3];
         for(int i=0; i < 3; i++)
            grid[i] = readArr(3, infile, st);
         int N = Integer.parseInt(infile.readLine());
         HashSet<Integer> set = new HashSet<Integer>();
         while(N-->0)
            set.add(Integer.parseInt(infile.readLine()));
         boolean[][] marked = new boolean[3][3];
         for(int r=0; r < 3; r++)
            for(int c=0; c < 3; c++)
               if(set.contains(grid[r][c]))
                  marked[r][c] = true;
         String res = "No";
         for(int r=0; r < 3; r++)
         {
            int cnt = 0;
            for(boolean b: marked[r])
               if(b)
                  cnt++;
            if(cnt==3)
               res = "Yes";
         }
         for(int c=0; c < 3; c++)
         {
            int cnt = 0;
            for(int r=0; r < 3; r++)   
               if(marked[r][c])
                  cnt++;
            if(cnt==3)
               res = "Yes";
         }
         if(marked[0][0]&&marked[1][1]&&marked[2][2])
            res = "Yes";
         if(marked[2][0]&&marked[1][1]&&marked[0][2])
            res = "Yes";
         System.out.println(res);
      }
      public static int[] readArr(int N, BufferedReader infile, StringTokenizer st) throws Exception
      {
         int[] arr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         return arr;
      }
   }