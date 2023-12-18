//CF template

import java.io.*;
import java.util.*;
 
public class Main{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      
      //begin
      int n = sc.nextInt();
      long pairs = (long) 0;
      char[][] arr = new char[n][];
      for(int i = 0; i < n; i++)
      {
        arr[i] = sc.nextLine().toCharArray();
        Arrays.sort(arr[i]);
        for(int j = 0; j < i; j++)
        {
            if(Arrays.equals(arr[i], arr[j]))
                pairs++;
        }
      }
      out.println(pairs);
      //end
      out.close();
   }
 
   public static PrintWriter out;
      
   public static class MyScanner {
      BufferedReader br;
      StringTokenizer st;
 
      public MyScanner() {
         br = new BufferedReader(new InputStreamReader(System.in));
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
      String nextLine(){
          String str = "";
	  try {
	     str = br.readLine();
	  } catch (IOException e) {
	     e.printStackTrace();
	  }
	  return str;
      }
   }
   
   static boolean areAnagram(char[] str1, char[] str2) 
{ 
   for (int i = 0; i < 10; i++) 
            if (str1[i] != str2[i]) 
                return false; 
  
        return true; 
} 
}