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
    int x = sc.nextInt();
    int y = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int[] p = sc.nextIntArray(a);
    int[] q = sc.nextIntArray(b);
    int[] r = sc.nextIntArray(c);
    Arrays.sort(p);
    Arrays.sort(q);
    Arrays.sort(r);
    int xy = x + y;
    PriorityQueue<Integer> pq = new PriorityQueue<>((Integer ap1, Integer ap2) -> ap2 - ap1);
    for (int i = a - 1; x > 0; i--) {
      pq.add(p[i]);
      x--;
    }
    for (int i = b - 1; y > 0; i--) {
      pq.add(q[i]);
      y--;
    }
    for (int ri : r) pq.add(ri);
    long sum = 0L;
    for (int i = 0; i < xy; i++) {
      sum += (long) pq.poll();
    }
    System.out.println(sum);
  }
}