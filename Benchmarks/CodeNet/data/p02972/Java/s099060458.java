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
         st = new StringTokenizer(infile.readLine());
         int[] arr = new int[N];
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         int[] res = new int[N];
         for(int i=1+N/2; i < N; i++)
            res[i] = arr[i];
         for(int i=1; i <= N/2; i++)
         {
            int sum = 0;
            for(int j=i; j <= N; j+=i)
               sum += arr[j-1];
            res[i-1] = sum%2;
         }
         int resM = 0;
         StringBuilder sb = new StringBuilder("");
         int i=1;
         for(int a: res)
         {
            if(a == 1)
            {
               resM++;
               sb.append(i);
            }
            i++;
         }
         System.out.println(resM);
         System.out.println(sb.toString());
      }
      public static ArrayList<Integer> findDiv(int N)
      {
         //gens all divisors of N
         ArrayList<Integer> ls1 = new ArrayList<Integer>();
         ArrayList<Integer> ls2 = new ArrayList<Integer>();
         for(int i=1; i <= (int)(Math.sqrt(N)); i++)
            if(N%i == 0)
            {
               ls1.add(i);
               ls2.add(N/i);
            }
         Collections.reverse(ls2);
         for(int b: ls2)
            if(b != ls1.get(ls1.size()-1))
               ls1.add(b);
         return ls1;
      }
   }