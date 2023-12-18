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
         int[] arr = new int[N];
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(input.charAt(i)+"");
         long[] resid = new long[2019];
         resid[0]++;
         long temp = 0L;
         for(int i=N-1; i >= 0; i--)
         {
            temp += arr[i]*power(10, N-1-i, 2019);
            temp %= 2019;
            resid[(int)temp]++;
         }
         long res = 0L;
         for(int i=0; i < 2019; i++)
            res += (resid[i]*(resid[i]-1))/2;
         System.out.println(res);
      }
      public static long power(long x, long y, long p) 
      { 
          long res = 1L;      
          x = x % p;  
          while (y > 0) 
          { 
              if((y & 1)==1) 
                  res = (res * x) % p; 
              y = y >> 1;  
              x = (x * x) % p;  
          } 
          return res; 
      }
   }