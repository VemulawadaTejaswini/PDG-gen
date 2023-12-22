import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
  private static class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
      reader = new BufferedReader(new InputStreamReader(in));
      tokenizer = null;
    }

    public String next() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public String nextLine() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          return reader.readLine();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }

      return tokenizer.nextToken("\n");
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = nextInt();
      return a;
    }

    public long[] nextLongArray(int n) {
      long[] a = new long[n];
      for (int i = 0; i < n; i++)
        a[i] = nextLong();
      return a;
    }
  }

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long k = sc.nextLong();
    long[] a = sc.nextLongArray(n);
    long[] b = sc.nextLongArray(m);
    long[] suma = new long[n + 1];
    for (int i = 1; i <= n; i++) {
      suma[i] = suma[i - 1] + a[i - 1];
    }
    long[] sumb = new long[m + 1];
    for (int i = 1; i <= m; i++) {
      sumb[i] = sumb[i - 1] + b[i - 1];
    }
    int max = 0;
    for (int i = 0; i <= n && k >= suma[i]; i++) {
      int count = i;
      long time = k - suma[i];
      int left = 0;
      int right = m + 1;
      while (right - left > 1) {
        int middle = left + (right - left) / 2;
        if (time >= sumb[middle]) left = middle;
        else right = middle;
      }
      count += left;
      max = Math.max(max, count);
    }
    System.out.println(max);
  }
}