import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
 public class Testing {
  
  
   public static void main(String[] args) {
    UltraFast uf=new UltraFast();
    String st="ACL";
    int K=uf.nextInt();
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<K;i++){
      sb.append(st);

    }
    System.out.println(sb);
   }







    
    
  static  class UltraFast {
      BufferedReader br;
      StringTokenizer st;

      public UltraFast() {
        BufferedInputStream bis = new BufferedInputStream(System.in);
        br = new BufferedReader(new InputStreamReader(bis, StandardCharsets.UTF_8));
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

      String nextLine() {
        String str = "";
        try {
          str = br.readLine();
        } catch (IOException e) {
          e.printStackTrace();
        }
        return str;
      }

      int[] readintarray(int n) {
        int res[] = new int[n];
        for (int i = 0; i < n; i++)
          res[i] = nextInt();
        return res;
      }

      Integer[] readIntegerArray(int n) {
        Integer res[] = new Integer[n];
        for (int i = 0; i < n; i++)
          res[i] = nextInt();
        return res;
      }

      long[] readlongarray(int n) {
        long res[] = new long[n];
        for (int i = 0; i < n; i++)
          res[i] = nextLong();
        return res;
      }

      Long[] readLongArray(int n) {
        Long res[] = new Long[n];
        for (int i = 0; i < n; i++)
          res[i] = nextLong();
        return res;
      }
    }

  }

  