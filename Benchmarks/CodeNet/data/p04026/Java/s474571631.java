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
         char[] arr = st.nextToken().toCharArray();
         int N = arr.length;
         for(int i=0; i < N-1; i++)
            if(arr[i] == arr[i+1])
            {
               System.out.println((i+1)+" "+(i+2));
               return;
            }
         for(int i=0; i < N-2; i++)
            if(arr[i] == arr[i+2])
            {
               System.out.println((i+1)+" "+(i+3));
               return;
            }
         System.out.println("-1 -1");
      }
   }