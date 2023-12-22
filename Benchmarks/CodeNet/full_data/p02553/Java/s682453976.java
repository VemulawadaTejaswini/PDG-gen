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
         int A = Integer.parseInt(st.nextToken());
         int B = Integer.parseInt(st.nextToken());
         int C = Integer.parseInt(st.nextToken());
         int D = Integer.parseInt(st.nextToken());
         ArrayList<Integer> ls = new ArrayList<Integer>();
         ls.add(A);
         ls.add(B);
         if(A <= 1 && B >= 1)
            ls.add(1);
         if(A <= -1 && B >= -1)
            ls.add(-1);
         ArrayList<Integer> ls2 = new ArrayList<Integer>();
         ls2.add(C);
         ls2.add(D);
         if(C <= 1 && D >= 1)
            ls2.add(1);
         if(C <= -1 && D >= -1)
            ls2.add(-1);
         long res = Long.MIN_VALUE;
         if(A <= 0 && B >= 0 || C <= 0 && D >= 0)
            res = 0L;
         for(int a=0; a < ls.size(); a++)
         {
            long temp = ls.get(a);
            for(int b=0; b < ls2.size(); b++)
               res = Math.max(res, temp*ls2.get(b));
         }
         System.out.println(res);
      }
   }