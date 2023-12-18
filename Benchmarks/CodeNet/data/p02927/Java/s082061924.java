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
         int M = Integer.parseInt(st.nextToken());
         int D = Integer.parseInt(st.nextToken());
         int res = 0;
         for(int m=1; m <= M; m++)
            for(int d=21; d <= D; d++)
            {
               int x = d/10;
               int y = d%10;
               if(x*y == m && x >= 2 && y >= 2)
               {
                  res++;
                  //System.out.println(m+" "+d);
               }
            }
         System.out.println(res);
      }
   }