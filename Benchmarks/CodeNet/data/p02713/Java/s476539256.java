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
         int N = Integer.parseInt(st.nextToken());
         long sum = 0L;
         for(int a=1; a <= N; a++)
            for(int b=1; b <= N; b++)
               for(int c=1; c <= N; c++)
                  sum += gcd(gcd(a,b),c);
          System.out.println(sum);
      }
      public static long gcd(long a, long b)
      {
         if(a > b)
         {
            long t = a;
            a = b;
            b = t;
         }
         if(a == 0L)
            return b;
         return gcd(b%a, a);
      }
   }