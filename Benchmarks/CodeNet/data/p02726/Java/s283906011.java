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
         int X = Integer.parseInt(st.nextToken());
         int Y = Integer.parseInt(st.nextToken());
         int[] res = new int[N];
         for(int a=1; a <= N; a++)
            for(int b=a+1; b <= N; b++)
            {
               int dist = b-a;
               dist = Math.min(dist, Math.abs(a-X)+Math.abs(b-Y)+1);
               res[dist]++;
            }
         StringBuilder sb = new StringBuilder();
         for(int k=1; k < N; k++)
            sb.append(res[k]+"\n");
         System.out.println(sb);
      }
   }