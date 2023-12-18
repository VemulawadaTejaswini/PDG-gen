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
         int K = Integer.parseInt(st.nextToken());
         int[] arr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         //dp[i] = longest increasing seq
         int res = 1;
         int[] dp = new int[N];
         dp[0] = 1;
         for(int i=1; i < N; i++)
         {
            if(arr[i] > arr[i-1])
               dp[i] = dp[i-1]+1;
            else
               dp[i] = 1;
         }
         TreeSet<Integer> curr = new TreeSet<Integer>();
         for(int i=0; i < K; i++)
            curr.add(arr[i]);
         boolean yeet = dp[K-1] >= K;
         if(yeet)
            res--;
         for(int i=1; i < N-K+1; i++)
         {
            int right = arr[K-1+i];
            int left = arr[i-1];
            if((curr.first() != left || curr.last() > right) && dp[K-1+i] < K)
               res++;
            else if(dp[K-1+i] >= K)
               yeet = true;
            curr.remove(left);
            curr.add(right);
         }
         if(yeet)
            res++;
         System.out.println(res);
      }
   }