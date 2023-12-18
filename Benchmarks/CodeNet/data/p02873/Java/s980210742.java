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
         char[] input = infile.readLine().toCharArray();
         int N = input.length;
         int[] arr = new int[N+1];
         Arrays.fill(arr, -1);
         if(input[0] == '<')
            arr[0] = 0;
         if(input[N-1] == '>')
            arr[N] = 0;
         for(int i=1; i <= N-1; i++)
            if(input[i-1] == '>' && input[i] == '<')
               arr[i] = 0;
         for(int i=1; i <= N-1; i++)
            if(input[i-1] == '<' && input[i] == '>')
            {
               int left = i;
               while(arr[left] != 0)
                  left--;
               int right = i;
               while(arr[right] != 0)
                  right++;
               int temp = 1;
               for(int a=left+1; a < i; a++)
                  arr[a] = temp++;
               temp = 1;
               for(int a=right-1; a > i; a--)
                  arr[a] = temp++;
               arr[i] = Math.max(arr[i-1],arr[i+1])+1;
            }
         for(int i=0; i <= N; i++)
            if(arr[i] == 0)
            {
               int dex = i-1;
               while(dex >= 0 && arr[dex] < 0)
               {
                  arr[dex] = arr[dex+1]+1;
                  dex--;
               }
               dex = i+1;
               while(dex <= N && arr[dex] < 0)
               {
                  arr[dex] = arr[dex-1]+1;
                  dex++;
               }
            }
         long res = 0L;
         for(int x: arr)
            res += x;
         System.out.println(res);
      }
   }