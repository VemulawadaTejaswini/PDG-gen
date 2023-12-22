/*
 *created by Kraken on 03-05-2020 at 11:04
 */

import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) {
    FastReader sc = new FastReader();
    int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
    if (n == 1) {
      System.out.println("OK");
      return;
    }
    if (a / n != b / n) {
      System.out.println("OK");
    } else {
      System.out.println("NG");
    }
  }

  static class FastReader {

    BufferedReader br;

    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        }
        catch (IOException e) {
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
      }
      catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }
  }
}
