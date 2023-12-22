import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) {
    FastScanner fs = new FastScanner();
    long[] arr = fs.readLongArray(3);
    long x = Math.abs(arr[0]);
    long k = arr[1];
    long d = arr[2];
    if (x > 0 && x / d >= k) {
      x -= k * d;
      System.out.println(x);
    }
    else {
      long y = x / d;
      x -= y * d;
      k -= y;
      if (k % 2 == 0) {
        System.out.println(Math.abs(x));
      }
      else {
        System.out.println(Math.min(Math.abs(x + d), Math.abs(x - d)));
      }
    }
  }

  static class FastScanner {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer("");

    String next() {
      while (!st.hasMoreTokens()) {
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

    int[] readIntArray(int n) {
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = nextInt();
      }
      return a;
    }

    long[] readLongArray(int n) {
      long[] a = new long[n];
      for (int i = 0; i < n; i++) {
        a[i] = nextLong();
      }
      return a;
    }

    long nextLong() {
      return Long.parseLong(next());
    }
  }
}
