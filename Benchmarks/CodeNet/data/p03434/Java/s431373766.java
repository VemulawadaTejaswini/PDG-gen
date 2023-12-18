import java.util.*;
import java.io.*;
import java.math.*;
import java.awt.geom.*;
 class Main{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int n=sc.ni();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.ni();
        Arrays.sort(arr);
        int a=0,b=0;
        for(int i=n-1;i>=0;i--){
            if(i%2==0) a+=arr[i];
            else b+=arr[i];
        }
        System.out.println(Math.abs(a-b));
    }


    private static class MyScanner {
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

      int ni() {
          return Integer.parseInt(next());
      }
      float nf() {
        return Float.parseFloat(next());
    }
      long nl() {
          return Long.parseLong(next());
      }

      double nd() {
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
}