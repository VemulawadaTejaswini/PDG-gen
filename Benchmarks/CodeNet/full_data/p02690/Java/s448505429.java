/*
If you want to aim high, aim high
Don't let that studying and grades consume you
Just live life young
******************************
If I'm the sun, you're the moon
Because when I go up, you go down
*******************************
I'm working for the day I will surpass you
https://www.a2oj.com/Ladder16.html
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
         int X = Integer.parseInt(st.nextToken());
         int lol = 100;
         for(int a=0; a < lol; a++)
         {
            long val = power(a);
            for(int b=0; b < lol; b++)
            {
               long rrr = power(b);
               for(int s=-1; s <= 1; s += 2)
               {
                  long check = rrr*s;
                  if(val-check == X)
                  {
                     System.out.println(a+" "+(b*s));
                     return;
                  }
               }
            }
         }
      }
      public static long power(int x)
      {
         long res = 1L;
         for(int i=0; i < 5; i++)
            res *= x;
         return res;
      }
   }