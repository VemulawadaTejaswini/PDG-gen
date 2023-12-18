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
         int M = Integer.parseInt(st.nextToken());
         int[] arr = new int[N+1];
         Arrays.fill(arr,-1);
         boolean bad = false;
         for(int i=0; i < M; i++)
         {
            st = new StringTokenizer(infile.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(arr[a] != -1 && arr[a] != b)
               bad = true;
            arr[a] = b;
         }
         if(bad)
            System.out.println(-1);
         else
         {
            String res = "";
            for(int d=1; d <= N; d++)
               res+=(Math.max(arr[d],0));
            if(ok(res))
               System.out.println(res);
            else
               System.out.println(-1);
         }
      }
      public static boolean ok(String res)
      {
         if(res.length() == 1)
            return true;
         return res.charAt(0) != '0';
      }
   }