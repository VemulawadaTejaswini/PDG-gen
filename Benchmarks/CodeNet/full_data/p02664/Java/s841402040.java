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
         char[] arr = infile.readLine().toCharArray();
         char[] copy = new char[arr.length];
         int N = arr.length;
         for(int i=0; i < N; i++)
            copy[i] = arr[i];
         for(int i=0; i < N; i++)
            if(arr[i] == '?')
               arr[i] = 'D';
         System.out.println(arr);
      }
   }