/*
 *created by Kraken on 19-04-2020 at 17:29
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) {
    FastReader sc = new FastReader();
    long n = sc.nextLong();
    int m = sc.nextInt();
    long sum = 0;
    for (int i = 0; i < m; i++) sum += sc.nextLong();
    System.out.println((sum <= n) ? n - sum : "-1");
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
