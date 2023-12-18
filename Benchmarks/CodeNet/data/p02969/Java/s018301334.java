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
         System.out.println(3*N*N);
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