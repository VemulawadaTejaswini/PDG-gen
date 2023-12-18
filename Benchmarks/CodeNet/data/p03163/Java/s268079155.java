/*
Roses are red
Memes are neat
All my test cases time out
Lmao yeet
**************************
Time to solve: 
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
         int W = Integer.parseInt(st.nextToken());
         int[] arr = new int[N];
         int[] arr2 = new int[N];
         for(int i=0; i < N; i++)
         {
            st = new StringTokenizer(infile.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            arr2[i] = Integer.parseInt(st.nextToken());
         }
         long res = knapSack(W, arr, arr2, N);
         System.out.println(res);
      }
      public static long knapSack(int W, int wt[], int val[], int n) 
       { 
            int i, w; 
           long K[][] = new long[n+1][W+1]; 
           // Build table K[][] in bottom up manner 
           for (i = 0; i <= n; i++) 
           { 
               for (w = 0; w <= W; w++) 
               { 
                   if (i==0 || w==0) 
                        K[i][w] = 0; 
                   else if (wt[i-1] <= w) 
                         K[i][w] = Math.max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]); 
                   else
                         K[i][w] = K[i-1][w]; 
               } 
            } 
            return K[n][W]; 
       } 
   }
   