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
         int N = Integer.parseInt(st.nextToken());
         String input = infile.readLine();
         char[] arr = input.toCharArray();
         int cnt = 0;
         for(int x: arr)
            cnt += x-'0';
         int[] dp = new int[N+1];
         for(int v=1; v <= N; v++)
         {
            int bc = Integer.bitCount(v);
            dp[v] = dp[v%bc]+1;
         }
         int plus = cnt+1;
         int minus = cnt-1;
         int val1 = 0;
         int val2 = 0;
         for(int i=N-1; i >= 0; i--)
         {
            int b = N-1-i;
            if(arr[i] == '1')
            {
               val1 += (int)power(2, b, plus);
               if(minus > 0)
                  val2 += (int)power(2, b, minus);
               if(val1 >= plus)  val1-=plus;
               if(val2 >= minus) val2-=minus;
            }
         }
         StringBuilder sb = new StringBuilder();
         for(int i=0; i < N; i++)
         {
            int b = N-1-i;
            int res = 0;
            if(arr[i] == '0')
            {
               int newval = val1+(int)power(2, b, plus);
               newval %= plus;
               res = 1+dp[newval];
            }
            else if(minus > 0)
            {
               int newval = val2-(int)power(2, b, minus);
               if(newval < 0) newval += minus;
               res = 1+dp[newval];
            }
            sb.append(res+"\n");
         }
         System.out.print(sb);
      }
      public static long power(long x, long y, long p) 
      { 
          long res = 1L;      
          x = x % p;  
          while(y > 0) 
          { 
              if((y & 1)==1) 
                  res = (res * x) % p; 
              y = y >> 1;  
              x = (x * x) % p;  
          } 
          return res; 
      } 
   }