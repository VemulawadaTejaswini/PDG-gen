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

  private static int merge(String s, Map<String, Integer> cache) {
    if (cache.containsKey(s)) return (int) cache.get(s);
    if (s.length() == 1) return Integer.parseInt(s);
    int left, right;
    if (s.length() % 2 == 0) {
      left = merge(s.substring(0, s.length() / 2), cache);
    } else {
      left = merge(s.substring(0, s.length() / 2 + 1), cache);
    }
    right = merge(s.substring(s.length() / 2), cache);
    int ans = Math.abs(left - right);
    cache.put(s, ans);
    return ans;
  }
  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    String as = sc.next();
    Map<String, Integer> cache = new HashMap<>();
    System.out.println(merge(as, cache));
  }
}