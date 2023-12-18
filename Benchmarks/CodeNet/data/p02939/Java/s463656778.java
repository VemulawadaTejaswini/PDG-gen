/*
Stay innocent, be naive. 
But still dream big. 
Dream big to the point that it is beyond your ability and endeavour to achieve it. 
So dream big and don’t lose your innocence.
*/
import java.util.*;
import java.io.*;

   public class Main
   {
      public static void main(String args[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         String input = st.nextToken();
         char[] arr = input.toCharArray();
         int N = arr.length;
         String prev = ""+arr[0];
         String t = "";
         int res = 1;
         for(int i=1; i < N; i++)
         {
            t += arr[i];
            if(!t.equals(prev))
            {
               res++;
               prev = t;
               t = "";
            }
         }
         System.out.println(res);
      }
   }