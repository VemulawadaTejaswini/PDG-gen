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
         Thing[] arr = new Thing[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = new Thing(i, Integer.parseInt(st.nextToken()));
         //Arrays.sort(arr);
         HashMap<Integer, Long> map = new HashMap<Integer, Long>();
         for(Thing t: arr)
         {
            int k = t.num-t.height;
            if(!map.containsKey(k))
               map.put(k, 0L);
            map.put(k, map.get(k)+1);
         }
         long res = 0L;
         for(int i=0; i < N; i++)
         {
            int find = arr[i].num+arr[i].height;
            if(map.containsKey(find))
               res += hs(map.get(find));
            find = arr[i].num-arr[i].height;
            map.put(find, map.get(find)-1);
            if(map.get(find) == 0)
               map.remove(find);
         }
         System.out.println(res);
      }
      public static long hs(long x)
      {
         return x;//x*(x-1)/2;
      }
   }
   class Thing implements Comparable<Thing>
   {
      public int num;
      public int height;
      
      public Thing(int a, int b)
      {
         num = a; height = b;
      }
      public int compareTo(Thing oth)
      {
         return num-oth.num;
         //return height-oth.height;
      }
   }