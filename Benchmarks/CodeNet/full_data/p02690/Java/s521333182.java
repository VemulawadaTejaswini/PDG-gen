import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

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

  private static long pow5(long v) {
    return v * v * v * v * v;
  }

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    long x = sc.nextInt();
    Map<Long, Integer> p5 = new HashMap<>();
    p5.put(0L, 0);
    int lastInt = 0;
    long lastPow = 0L;
    while (true) {
      long pow = pow5((long) lastInt + 1L);
      p5.put(pow, lastInt + 1);
      if (pow - lastPow >= 1000000000L) break;
      lastPow = pow;
      lastInt++;
    }
    for (int i = 0; i <= lastInt; i++) {
      long pow = pow5((long) i);
      if (p5.containsKey(x - pow)) {
        System.out.println(i + " " + (-1 * p5.get(x - pow)));
        return;
      }
    }
    for (int i = 0; i <= lastInt; i++) {
      long pow = pow5((long) i);
      if (p5.containsKey(x + pow)) {
        System.out.println(p5.get(x + pow) + " " + i);
        return;
      }
    }
  }
}