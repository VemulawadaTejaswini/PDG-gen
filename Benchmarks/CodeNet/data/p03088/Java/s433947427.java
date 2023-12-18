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
  private static boolean isAllowed(String key) {
    String[][] ps = {{"A", "GC"}, {"AG", "C"}, {"ACG", ""}, {"GAC", ""}};
    for (String[] p : ps) {
      int i = key.indexOf(p[0]);
      if (i < 0) continue;
      if (key.indexOf(p[1], i + p[0].length()) >= 0) return false;
    }
    return true;
  }
  private static final int mod = 1_000_000_007;
  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    Map<String, Integer> counter = new HashMap<>();
    Map<String, Integer> counter2 = new HashMap<>();
    String[] chars = new String[] {"A", "C", "G", "T"};
    for (String c1 : chars) for (String c2 : chars) counter.put(c1 + c2, 1);
    for (int i = 3; i <= n; i++) {
      counter2.clear();
      for (String c : chars) {
        for (String prefix : counter.keySet()) {
          String s = prefix + c;
          if (!isAllowed(s)) continue;
          String key = s.substring(Math.max(0, s.length() - 3), s.length());
          int val = (counter2.getOrDefault(key, 0) + counter.get(prefix)) % mod;
          counter2.put(key, val);
        }
      }
      counter.clear();
      counter.putAll(counter2);
    }
    int sum = 0;
    for (int val : counter.values()) sum = (sum + val) % mod;
    System.out.println(sum);
  }
}