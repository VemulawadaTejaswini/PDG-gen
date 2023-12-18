/*
Stay innocent, be naive. 
But still dream big. 
Dream big to the point that it is beyond your ability and endeavour to achieve it. 
So dream big and don�t lose your innocence.
*/
import java.util.*;
import java.io.*;

   public class Main
   {
      public static void main(String args[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int max = 0;
         int max2 = 0;
         int maxcnt = 0;
         int[] arr = new int[N];
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(infile.readLine());
         for(int i=0; i < N; i++)
            max = Math.max(max, arr[i]);
         for(int a: arr)
            if(max == a)
               maxcnt++;
         for(int i=0; i < N; i++)
            if(arr[i] < max)
               max2 = Math.max(max2, arr[i]);
         for(int i=0; i < N; i++)
         {
            if(maxcnt > 1)
               System.out.println(max);
            else
            {
               if(arr[i] == max)
                  System.out.println(max2);
               else
                  System.out.println(max);   
            }
         }
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