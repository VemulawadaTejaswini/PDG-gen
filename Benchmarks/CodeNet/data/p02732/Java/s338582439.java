import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
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
    int[] a = sc.nextIntArray(n);
    Map<Integer, Integer> count = new HashMap<>();
    for (int i = 0; i < n; i++) {
      count.merge(a[i], 1, Integer::sum);
    }
    Map<Integer, Integer> combinations = new HashMap<>();
    int sum = 0;
    for (int key : count.keySet()) {
      int c = count.get(key);
      sum += c * (c - 1) / 2;
      combinations.put(key, c * (c - 1) / 2);
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      if (sb.length() > 0) sb.append("\n");
      int rest = count.get(a[i]) - 1;
      int s = sum - combinations.get(a[i]);
      if (rest > 1) s += rest * (rest - 1) / 2;
      sb.append(s);
    }
    System.out.println(sb.toString());
  }
}