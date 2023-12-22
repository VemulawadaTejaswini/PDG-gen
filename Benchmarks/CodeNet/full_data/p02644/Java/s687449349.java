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
300IQ as writer = Sad!
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
         int K = Integer.parseInt(st.nextToken());
         st = new StringTokenizer(infile.readLine());
         int x1 = Integer.parseInt(st.nextToken())-1;
         int y1 = Integer.parseInt(st.nextToken())-1;
         int x2 = Integer.parseInt(st.nextToken())-1;
         int y2 = Integer.parseInt(st.nextToken())-1;
         char[][] grid = new char[N][M];
         for(int i=0; i < N; i++)
            grid[i] = infile.readLine().toCharArray();
         TreeSet<Integer>[] row = new TreeSet[N];
         TreeSet<Integer>[] col = new TreeSet[M];
         for(int i=0; i < N; i++)
            row[i] = new TreeSet<Integer>();
         for(int i=0; i < M; i++)
            col[i] = new TreeSet<Integer>();
         for(int r=0; r < N; r++)
            for(int c=0; c < M; c++)
               if(grid[r][c] == '.')
               {
                  row[r].add(c);
                  col[c].add(r);
               }
         int[][] prefrow = new int[N][M];
         for(int r=0; r < N; r++)
         {
            if(grid[r][0] == '@')
               prefrow[r][0] = 1;
            for(int c=1; c < M; c++)
            {
               prefrow[r][c] += prefrow[r][c-1];
               if(grid[r][c] == '@')
                  prefrow[r][c]++;
            }
         }
         int[][] prefcol = new int[M][N];
         for(int c=0; c < M; c++)
         {
            if(grid[0][c] == '@')
               prefcol[c][0] = 1;
            for(int r=1; r < N; r++)
            {
               prefcol[c][r] += prefcol[c][r-1];
               if(grid[r][c] == '@')
                  prefcol[c][r]++;
            }
         }
         K = Math.min(K, Math.max(N, M));
         ArrayDeque<Integer> q = new ArrayDeque<Integer>();
         q.add(x1);  q.add(y1);
         int[][] dist = new int[N][M];
         for(int i=0; i < N; i++)   Arrays.fill(dist[i], 999999999);
         dist[x1][y1] = 0; row[x1].remove(y1);  col[y1].remove(x1);
         while(q.size() > 0)
         {
            int x = q.poll();
            int y = q.poll();
            if(x == x2 && y == y2)
               break;
            //north
            int boundary = Math.max(0, x-K);
            TreeSet<Integer> set = col[y];
            while(set.size() > 0 && set.first() <= x)
            {
               int val = set.floor(x);
               if(val < boundary)
                  break;
               if(colq(y, val, x, prefcol) > 0)
                  break;
               if(dist[val][y] == 999999999)
               {
                  dist[val][y] = dist[x][y]+1;
                  q.add(val); q.add(y);
               }
               set.remove(val);
            }
            //south
            boundary = Math.min(N-1, x+K);
            while(set.size() > 0 && set.last() >= x)
            {
               int val = set.ceiling(x);
               if(val > boundary)
                  break;
               if(grid[val][y] == '@')
                  break;
               if(colq(y, x, val, prefcol) > 0)
                  break;
               if(dist[val][y] == 999999999)
               {
                  dist[val][y] = dist[x][y]+1;
                  q.add(val); q.add(y);
               }
               set.remove(val);
            }
            //west
            boundary = Math.max(0, y-K);
            set = row[x];
            while(set.size() > 0 && set.first() <= y)
            {
               int val = set.floor(y);
               if(val < boundary)
                  break;
               if(rowq(x, val, y, prefrow) > 0)
                  break;
               if(dist[x][val] == 999999999)
               {
                  dist[x][val] = dist[x][y]+1;
                  q.add(x); q.add(val);
               }
               set.remove(val);
            }
            //east
            boundary = Math.min(M-1, y+K);
            while(set.size() > 0 && set.last() >= y)
            {
               int val = set.ceiling(y);
               if(val > boundary)
                  break;
               if(rowq(x, y, val, prefrow) > 0)
                  break;
               if(dist[x][val] == 999999999)
               {
                  dist[x][val] = dist[x][y]+1;
                  q.add(x); q.add(val);
               }
               set.remove(val);
            }
         }
         if(dist[x2][y2] == 999999999)
            dist[x2][y2] = -1;
         System.out.println(dist[x2][y2]);
      }
      //EW
      public static int rowq(int r, int c1, int c2, int[][] pref)
      {
         int res = pref[r][c2];
         if(c1-1 >= 0)
            res -= pref[r][c1-1];
         return res;
      }
      //NS
      public static int colq(int c, int r1, int r2, int[][] pref)
      {
         int res = pref[c][r2];
         if(r1-1 >= 0)
            res -= pref[c][r1-1];
         return res;
      }
   }
   /*
   class Node
   {
      public int x;
      public int y;
      
      public Node(int a, int b)
      {
         x = a;
         y = b;
      }
   }*/