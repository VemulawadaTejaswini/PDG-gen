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
            if(arr[1] == 0 && N >= 2)
               System.out.println(-1);
            else
            {
               int[] res = new int[N+1];
               res[1] = arr[1];
               if(res[1] == -1)
                  res[1] = 1;
               for(int i=2; i <= N; i++)
                  res[i] = Math.max(0,arr[i]);
               String lol = "";
               for(int i=1; i <= N; i++)
                  lol+=res[i];
               if(arr[1] == 0 && N == 1)
                  lol = "0";
               System.out.println(lol);
            }
         }
      }
   }