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
    int h = sc.nextInt();
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    Map<Integer, Integer> dp1 = new HashMap<>();
    Map<Integer, Integer> dp2 = new HashMap<>();
    dp1.put(0, 0);
    for (int i = 0; i < n; i++) {
      dp2.clear();
      for (int hp : dp1.keySet()) {
        int j = 0;
        while (true) {
          int attack = Math.min(h, a[i] * j);
          int magic = b[i] * j;
          int key = Math.min(h, hp + attack);
          if (dp2.containsKey(key)) {
            dp2.put(key, Math.min(dp2.get(key), dp1.get(hp) + magic));
          } else {
            dp2.put(key, dp1.get(hp) + magic);
          }
          if (hp + attack >= h) break;
          j++;
        }
      }
      dp1.clear();
      dp1.putAll(dp2);
    }
    System.out.println(dp1.get(h));
  }
}