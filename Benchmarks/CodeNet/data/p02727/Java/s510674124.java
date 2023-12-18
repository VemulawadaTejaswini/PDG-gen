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
         int A = Integer.parseInt(st.nextToken());
         int B = Integer.parseInt(st.nextToken());
         int C = Integer.parseInt(st.nextToken());
         int[] red = readArr(A, infile, st);
         int[] green = readArr(B, infile, st);
         int[] white = readArr(C, infile, st);
         sort(red);  sort(green);   sort(white);
         TreeMap<Integer, Integer> mset1 = new TreeMap<Integer, Integer>();
         TreeMap<Integer, Integer> mset2 = new TreeMap<Integer, Integer>();
         for(int i=0; i < N; i++)
            push(mset1, red[A-i-1]);
         for(int i=0; i < M; i++)
            push(mset2, green[B-i-1]);
         //white apples
         for(int i=C-1; i >= 0; i--)
         {
            if(Math.min(mset1.firstKey(), mset2.firstKey()) >= white[i])
               break;
            if(mset1.firstKey() < mset2.firstKey())
            {
               pull(mset1, mset1.firstKey());
               push(mset1, white[i]);
            }
            else
            {
               pull(mset2, mset2.firstKey());
               push(mset2, white[i]);
            }
         }
         long res = 0L;
         for(int k: mset1.keySet())
            res += (long)k*(long)mset1.get(k);
         for(int k: mset2.keySet())
            res += (long)k*(long)mset2.get(k);
         System.out.println(res);
      }
      public static void push(TreeMap<Integer, Integer> map, int k)
      {
         if(!map.containsKey(k))
            map.put(k, 1);
         else
            map.put(k, map.get(k)+1);
      }
      public static void pull(TreeMap<Integer, Integer> map, int k)
      {
         map.put(k, map.get(k)-1);
         if(map.get(k) == 0)
            map.remove(k);
      }
      //input shenanigans
      public static int[] readArr(int N, BufferedReader infile, StringTokenizer st) throws Exception
      {
         int[] arr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         return arr;
      }
      public static void sort(int[] arr)
      {
         //stable heap sort
         PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
         for(int a: arr)
            pq.add(a);
         for(int i=0; i < arr.length; i++)
            arr[i] = pq.poll();
      }
   }