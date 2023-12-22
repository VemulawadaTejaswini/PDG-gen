import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
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
    int m = sc.nextInt();
    long k = sc.nextLong();
    long[] a = sc.nextLongArray(n);
    long[] b = sc.nextLongArray(m);
    Deque<Long> aqueue = new ArrayDeque<>();
    Deque<Long> bqueue = new ArrayDeque<>();
    for (long ai: a) aqueue.add(ai);
    for (long bi: b) bqueue.add(bi);
    int count = 0;
    while (k > 0 && aqueue.size() + bqueue.size() > 0) {
      long book;
      if (aqueue.isEmpty()) {
        book = bqueue.poll();
      } else if (bqueue.isEmpty()) {
        book = aqueue.poll();
      } else {
        book = aqueue.peek() > bqueue.peek() ? bqueue.poll() : aqueue.poll();
      }
      if (book > k) break;
      k -= book;
      count++;
    }
    System.out.println(count);
  }
}