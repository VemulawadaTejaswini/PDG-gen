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
         //solve
         for(int a=0; a < 4000; a++)
         {
            long A = power(a);
            for(int b=0; b < 4000; b++)
            {
               long B = power(b);
               for(int c=-1; c <= 1; c += 2)
                  for(int d=-1; d <= 1; d += 2)
                  {
                     long aa = A*c;
                     long bb = B*d;
                     if(aa-bb == X)
                     {
                        System.out.println((a*c)+" "+(b*d));
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