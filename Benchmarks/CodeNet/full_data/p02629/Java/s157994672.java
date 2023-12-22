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

   public class Main
   {
      public static void main(String hi[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(infile.readLine());
         long N = Long.parseLong(st.nextToken());
         long[] pow26 = new long[12];
         pow26[0] = 1L;
         for(int i=1; i <= 11; i++)
            pow26[i] = pow26[i-1]*26;
         int len = 0;
         long total = 0L;
         for(int l=1; l <= 11; l++)
         {
            long temp = 1L;
            for(int i=0; i < l; i++)
               temp *= 26;
            total += temp;
            if(total >= N)
            {
               len = l;
               break;
            }
         }
         char[] res = new char[len];
         Arrays.fill(res, '?');
         for(int i=1; i < len; i++)
            N -= pow26[i];
         for(int curr=0; curr < len-1; curr++)
         {
            long suffix = pow26[len-1-curr];
            char c = 'a';
            long cons = 0L;
            while(true)
            {
               if(N <= cons)
               {
                  res[curr] = (char)(c-1);
                  cons -= suffix;
                  N -= cons;
                  break;
               }
               cons += suffix;
               c = (char)(c+1);
            }
         }
         res[len-1] = (char)('a'+(int)N-1);
         System.out.println(res);
      }
   }