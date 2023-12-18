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
         int[] arr = new int[N+1];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i+1] = Integer.parseInt(st.nextToken());
         int[] pos = new int[N+1];
         for(int i=0; i < N; i++)
            pos[arr[i+1]] = i+1;
         TreeSet<Integer> active = new TreeSet<Integer>();
         active.add(0); active.add(N+1);
         long res = 0L;
         for(int v=N; v >= 1; v--)
         {
            int loc = pos[v];
            int left = active.floor(loc-1);
            int right = active.ceiling(loc+1);
            int farleft = 0;
            int farright = N+1;
            if(left > 0)
               farleft = active.floor(left-1);
            if(right < N+1)
               farright = active.ceiling(right+1);
            long cnt = (long)(left-farleft)*(right-loc);
            cnt += (long)(farright-right)*(loc-left);
            //cnt -= (long)(right-loc)*(loc-left);
            res += cnt*v;
            active.add(loc);
         }
         System.out.println(res);
      }
   }