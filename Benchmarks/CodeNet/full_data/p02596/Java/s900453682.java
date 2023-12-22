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
         int K = Integer.parseInt(st.nextToken());
         if(!isPrime(K))
            System.out.println(-1);
         else
         {
            long curr = 7L;
            int res = 1;
            while(true)
            {
               curr %= K;
               if(curr == 0)
               {
                  System.out.println(res);
                  return;
               }
               curr = (curr*10)%K+7L;
               res++;
            }
         }
      }
      public static boolean isPrime(long n) 
      {
          if(n < 2) return false;
          if(n == 2 || n == 3) return true;
          if(n%2 == 0 || n%3 == 0) return false;
          long sqrtN = (long)Math.sqrt(n)+1;
          for(long i = 6L; i <= sqrtN; i += 6) {
              if(n%(i-1) == 0 || n%(i+1) == 0) return false;
          }
          return true;
      }
   }