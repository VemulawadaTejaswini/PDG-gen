/*
If you want to aim high, aim high
Don't let that studying and grades consume you
Just live life young
******************************
What do you think? What do you think?
1st on Billboard, what do you think of it
Next is a Grammy, what do you think of it
However you think, I’m sorry, but shit, I have no fucking interest
*******************************
Higher, higher, even higher, to the point you won’t even be able to see me
https://www.a2oj.com/Ladder16.html
*******************************
NEVER DO 300IQ CONTESTS EVER
300IQ AS WRITER = EXTRA NONO
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
         char[][] grid = new char[N][M];
         for(int i=0; i < N; i++)
            grid[i] = infile.readLine().toCharArray();
         TreeSet<Integer>[] vert = new TreeSet[M];
         TreeSet<Integer>[] hort = new TreeSet[N];
         for(int r=0; r < N; r++)
         {
            hort[r] = new TreeSet<Integer>();
            for(int c=0; c < M; c++)
               if(grid[r][c] == '#')
                  hort[r].add(c);
         }
         for(int c=0; c < M; c++)
         {
            vert[c] = new TreeSet<Integer>();
            for(int r=0; r < N; r++)
               if(grid[r][c] == '#')
                  vert[c].add(r);
         }
         int res = 1;
         int[] hortval = new int[N];
         int[] vertval = new int[M];
         Arrays.fill(hortval, -1);
         Arrays.fill(vertval, -1);
         for(int r=0; r < N; r++)
            for(int c=0; c < M; c++)
               if(grid[r][c] == '.')
               {
                  int col = N;
                  if(vert[c].size() >= 1)
                  {
                     if(vertval[c] == -1)
                     {
                        int high = N;
                        if(vert[c].last() > r)
                           high = vert[c].ceiling(r);
                        int low = -1;
                        if(vert[c].first() < r)
                           low = vert[c].floor(r);
                        col = high-low-1;
                        vertval[c] = col;
                     }
                     col = vertval[c];
                  }
                  int row = M;
                  if(hort[r].size() >= 1)
                  {
                     if(hortval[r] == -1)
                     {
                        int high = M;
                        if(hort[r].last() > c)
                           high = hort[r].ceiling(c);
                        int low = -1;
                        if(hort[r].first() < c)
                           low = hort[r].floor(c);
                        row = high-low-1;
                        hortval[r] = row;
                     }
                     row = hortval[r];
                  }
                  res = Math.max(res, col+row-1);
               }
         System.out.println(res);
      }
   }