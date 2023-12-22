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
300IQ as writer = Sad!
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
         int M = Integer.parseInt(st.nextToken());
         int T = Integer.parseInt(st.nextToken());
         int[] arr = readArr(N, infile, st);
         int[] brr = readArr(M, infile, st);
         int res = 0;
         int a = 0;  int b = 0;
         while(T > 0 && res < N+M)
         {
            int min = Integer.MAX_VALUE;
            if(a < N)
               min = Math.min(min, arr[a]);
            if(b < M)
               min = Math.min(min, brr[b]);
            if(min > T)
               break;
            T -= min;
            if(a < N && arr[a] == min)
               a++;
            else
               b++;
            res++;
         }
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