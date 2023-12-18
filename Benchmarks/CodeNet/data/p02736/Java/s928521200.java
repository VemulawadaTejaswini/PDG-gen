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

  private static int merge(String s, int i, int j, Map<Integer, Map<Integer, Integer>> cache) {
    if (cache.containsKey(i) && cache.get(i).containsKey(j)) return (int) cache.get(i).get(j);
    if (j - i == 1) return Integer.parseInt(s.substring(i, j));
    int left = merge(s, i + 1, j, cache);
    int right = merge(s, i, j - 1, cache);
    int ans = Math.abs(left - right);
    if (!cache.containsKey(i)) {
      Map<Integer, Integer> c = new HashMap<>();
      cache.put(i, c);
    }
    cache.get(i).put(j, ans);
    return ans;
  }
  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    String as = sc.next();
    Map<Integer, Map<Integer, Integer>> cache = new HashMap<>();
    System.out.println(merge(as, 0, as.length(), cache));
  }
}