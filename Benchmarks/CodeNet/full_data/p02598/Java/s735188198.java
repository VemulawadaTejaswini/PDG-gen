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
300iq as writer = Sad!
*/
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.Math;

   public class Main
   {
      static final double EPS = 0.000001;
      public static void main(String hi[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int K = Integer.parseInt(st.nextToken());
         StringBuilder sb = new StringBuilder();
         int[] arr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         if(K == 0)
         {
            sort(arr);
            System.out.println(arr[N-1]);
            return;
         }
         int min = arr[0];
         for(int x: arr)
            min = Math.min(min, x);
         double low = 1.0*min/K;
         double high = 1.0*arr[0];
         for(int x: arr)
            high = Math.max(high, 1.0*x);
         while(low+EPS < high)
         {
            double mid = (low+high)/2;
            long moves = 0L;
            for(int x: arr)
            {
               int lol = (int)(x/mid);
               moves += lol;
               if(lol*mid != x)
                  moves++;
            }
            moves -= N;
            if(moves > K)
               low = mid;
            else
               high = mid;
         }
         int res = (int)Math.ceil(low);
         System.out.println(res);
      }
      public static void sort(int[] arr)
      {
         //stable heap sort
         PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
         for(int a: arr)
            pq.add(a);
         for(int i=0; i < arr.length; i++)
            arr[i] = pq.poll();
      }
   }