/*
Roses are red
Memes are neat
All my test cases time out
Lmao yeet
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
         int K = Integer.parseInt(st.nextToken());
         if((N+K)%2 == 1)
            System.out.println("NO");
         else
            System.out.println((N+K)/2);
      }
   }