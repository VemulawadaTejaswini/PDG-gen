import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
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
    long[] a = sc.nextLongArray(n);
    Arrays.sort(a);
    PriorityQueue<long[]> pq = new PriorityQueue<>((long[] x, long[] y) -> {
      long minX = Math.min(x[0], x[1]);
      long maxX = Math.max(x[0], x[1]);
      long minY = Math.min(y[0], y[1]);
      long maxY = Math.min(y[0], y[1]);
      if (minY != minX) return minY > minX ? 1 : -1;
      return maxY > maxX ? 1 : -1;
    });
    pq.add(new long[] {a[n - 1], a[n - 2]});
    pq.add(new long[] {a[n - 1], a[n - 2]});
    long sum = a[n - 1];
    for (int i = n - 3; i >= 0; i--) {
      long[] span = pq.poll();
      sum += Math.min(span[0], span[1]);
      pq.add(new long[] {span[0], a[i]});
      pq.add(new long[] {span[1], a[i]});
    }
    System.out.println(sum);
  }
}