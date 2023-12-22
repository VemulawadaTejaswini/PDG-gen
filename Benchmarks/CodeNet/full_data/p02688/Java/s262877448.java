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
         HashSet<Integer> set = new HashSet<Integer>();
         for(int i=1; i <= N; i++)
            set.add(i);
         for(int qw=0; qw < K; qw++)
         {
            int d = Integer.parseInt(infile.readLine());
            int[] arr = new int[d];
            st = new StringTokenizer(infile.readLine());
            for(int i=0; i < d; i++)
               arr[i] = Integer.parseInt(st.nextToken());
            for(int x: arr)
               if(set.contains(x))
                  set.remove(x);
         }
         System.out.println(set.size());
      }
   }