/*
If you want to aim high, aim high
Don't let that studying and grades consume you
Just live life young
******************************
*/
import java.util.*;
import java.io.*;

   public class Main
   {
      public static void main(String args[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         String input = infile.readLine();
         long K = Long.parseLong(infile.readLine());
         int N = input.length();
         char[] arr = input.toCharArray();
         int left = 0;
         int right = 0;
         long res = 0L;
         while(right < N)
         {
            while(right < N && arr[left] == arr[right])
               right++;
            int boof = right-left;
            res += boof/2;
            left = right;
         }
         if(arr[0] != arr[N-1])
            System.out.println(K*res);
         else
         {
            long res2 = 0L;
            int count = 0;
            for(int i=0; i < N; i++)
            {
               if(arr[i] == arr[0])
                  count++;
               else
               {
                  int upper = N;
                  while(arr[upper-1] == arr[0])
                     upper--;
                  int l = i;
                  int r = i;
                  while(r < upper)
                  {
                     while(r < upper && arr[l] == arr[r])
                        r++;
                     int boof = r-l;
                     res2 += boof/2;
                     l = r;
                  }
                  break;
               }
            }
            if(count == N)
            {
               System.out.println(K*N/2);
               return;
            }
            res = count/2;
            int count2 = 0;
            for(int i=N-1; i >= 0; i--)
            {
               if(arr[i] == arr[0])
                  count2++;
               else
                  break;
            }
            res += count2/2;
            res += K*(res2);
            res += ((long)count+count2)/2*(K-1);
            System.out.println(res);
         }
      }
   }