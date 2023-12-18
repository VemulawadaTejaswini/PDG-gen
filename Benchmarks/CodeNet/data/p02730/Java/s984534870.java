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
         String input = infile.readLine();
         int N = input.length();
         String res = "Yes";
         for(int i=0; i < N/2; i++)
            if(input.charAt(i) != input.charAt(N-1-i))
               res = "No";
         int a = 0;
         int b = N/2-1;
         while(a < b)
         {
            if(input.charAt(a) != input.charAt(b))
               res = "No";
            a++;
            b--;
         }
         a = N/2+1;
         b = N-1;
         while(a < b)
         {
            if(input.charAt(a) != input.charAt(b))
               res = "No";
            a++;
            b--;
         }
         System.out.println(res);
      }
   }