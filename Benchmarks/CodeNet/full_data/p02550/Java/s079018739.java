import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.concurrent.ThreadLocalRandom;

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

  private static void solve(long n, long x, long m) {
    Map<Long, Integer> a2 = new HashMap<>();
    long[] a = new long[(int) m + 1];
    a2.put(x, 0);
    a[0] = x;
    int from = -1, to = -1;
    for (int i = 1; i < n; i++) {
      a[i] = (a[i - 1] * a[i - 1]) % m;
      if (a2.containsKey(a[i])) {
        from = a2.get(a[i]);
        to = a2.get(a[i - 1]);
        break;
      }
      a2.put(a[i], i);
    }
    long sum = 0L;
    if (from >= 0) {
      for (int i = 0; i < from; i++) sum += a[i];
      n -= from;
      long intervalSum = 0L;
      for (int i = from; i <= to; i++) intervalSum += a[i];
      long interval = (long) (to - from + 1);
      sum += (n / interval) * intervalSum;
      n %= interval;
    } else {
      from = 0;
    }
    for (int i = 0; i < (int) n; i++) {
      sum += a[from + i];
    }
    System.out.println(sum);
  }

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    long n = sc.nextLong();
    long x = sc.nextLong();
    long m = sc.nextLong();
    solve(n, x, m);
  }
}