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

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    long k = sc.nextLong();
    int[] a = new int[n + 1];
    for (int i = 1; i <= n; i++) a[i] = sc.nextInt();
    int[] position = new int[n + 1];
    Arrays.fill(position, -1);
    int i = 1;
    int t = 0;
    int interval = 0;
    List<int[]> cities = new ArrayList<>();
    while (true) {
      if (position[i] != -1) {
        interval = t - position[i];
        for (int j = 1; j <= n; j++) {
          if (position[j] == -1) continue;
          cities.add(new int[] {j, position[j]});
        }
        break;
      }
      position[i] = t++;
      i = a[i];
    }
    Collections.sort(cities, (int[] c1, int[] c2) -> c1[1] - c1[1]);
    int size = cities.size();
    int prefix = size - interval;
    k -= (long) prefix;
    if (k < 0) k += (long) interval;
    if (interval > 0) k %= interval;
    System.out.println(cities.get(Math.max(0, prefix -1) + (int) k)[0]);
  }
}