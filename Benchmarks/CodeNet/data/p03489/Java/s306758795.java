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
         int[] arr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
         for(int x: arr)
         {
            if(!map.containsKey(x))
               map.put(x,0);
            map.put(x,map.get(x)+1);
         }
         int res = 0;
         for(int k: map.keySet())
         {
            if(map.get(k) < k)
               res += map.get(k);
            else
               res += map.get(k)-k;
         }
         System.out.println(res);
      }
   }