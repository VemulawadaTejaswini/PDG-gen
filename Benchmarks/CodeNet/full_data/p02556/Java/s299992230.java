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
      public static void main(String hi[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         Point[] arr = new Point[N];
         for(int i=0; i < N; i++)
         {
            st = new StringTokenizer(infile.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i] = new Point(a,b);
         }
         Arrays.sort(arr);
         int min = arr[0].x+arr[0].y;
         int max = min;
         for(int i=1; i < N; i++)
         {
            min = Math.min(min, arr[i].x+arr[i].y);
            max = Math.max(max, arr[i].x+arr[i].y);
         }
         int res = Math.abs(max-min);
         min = arr[0].x-arr[0].y;
         max = min;
         for(int i=1; i < N; i++)
         {
            min = Math.min(min, arr[i].x-arr[i].y);
            max = Math.max(max, arr[i].x-arr[i].y);
         }
         res = Math.max(res, Math.abs(max-min));
         System.out.println(res);
      }
   }
   class Point implements Comparable<Point>
   {
      public int x;
      public int y;
      
      public Point(int a, int b)
      {
         x = a;
         y = b;
      }
      public int compareTo(Point oth)
      {
         if(x == oth.x)
            return y-oth.y;
         return x-oth.x;
      }
   }