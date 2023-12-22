import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;



 class Main {

   public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

   static class FastReader {

     BufferedReader br;
     StringTokenizer st;

     public FastReader() {
       br = new BufferedReader(new
           InputStreamReader(System.in));
     }

     String next() {
       while (st == null || !st.hasMoreElements()) {
         try {
           st = new StringTokenizer(br.readLine());
         } catch (IOException e) {
           e.printStackTrace();
         }
       }
       return st.nextToken();
     }

     int nextInt() {
       return Integer.parseInt(next());
     }

     long nextLong() {
       return Long.parseLong(next());
     }

     double nextDouble() {
       return Double.parseDouble(next());
     }

     String[] nextSArray() {
       String sr[] = null;
       try {
         sr = br.readLine().trim().split(" ");
       } catch (IOException e) {
         e.printStackTrace();
       }
       return sr;
     }

     String nextLine() {
       String str = "";
       try {
         str = br.readLine();
       } catch (IOException e) {
         e.printStackTrace();
       }

       return str;
     }
   }

   //  static int MOD=1000000000+7;
//  public static void sortbyCol(int arr[][],int col)
//  {
//    Arrays.sort(arr,new Comparator<int[]>(){
//      @Override
//      public int compare(int[] o1, int[] o2) {
//        // To sort in descending order revert
//        // the '>' Operator
//        if(o1[col]>o2[col])
//          return 1;
//        else
//          return -1;
//      }
//    });
//  }
   static int countbits(int a) {
     if (a == 0)
       return 0;
     return (int) (Math.log(a) / Math.log(2) + 1);
   }

   static int reversebits(int n, int pos) {
     while (pos > 0) {
       if ((n & pos) > 0) {
         n -= pos;
       } else
         n += pos;
       pos = pos >> 1;
     }
     return n;
   }

   public static void main(String[] args) throws java.lang.Exception {
     FastReader sc = new FastReader();
//   int t1=sc.nextInt();
//
//   for(int t=0;t<t1;++t)
//   {
//
//   }
      int n=sc.nextInt();
      long total=0;
      long arr[]=new long[n];
      for(int i=0;i<n;++i)
      {
        arr[i]=sc.nextLong();
        total=total^arr[i];
      }
     for(int i=0;i<n;++i)
     {
       out.print((total^arr[i])+" ");
     }
     out.flush();
     out.close();


   }
 }



// out.println(al.toString().replaceAll("[\\[|\\]|,]",""));
