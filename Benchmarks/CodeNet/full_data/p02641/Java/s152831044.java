import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
    int x = sc.nextInt();
    int n = sc.nextInt();
    if (n == 0) {
      System.out.println(x);
      return;
    }
    int[] p = sc.nextIntArray(n);
    Set<Integer> set = new HashSet<>();
    for (int pi: p) set.add(pi);
    for (int d = 0; d <= 101; d++) {
      if (!set.contains(x - d)) {
        System.out.println(x - d);
        return;
      } else if (!set.contains(x + d)) {
        System.out.println(x + d);
        return;
      }
    }
  }
}