import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.StringTokenizer;


public class Main {

  class A {
    int c;
    int t;

    public A(int c, int t) {
      this.c = c;
      this.t = t;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      A a = (A) o;
      return c == a.c &&
              t == a.t;
    }

    @Override
    public int hashCode() {
      return Objects.hash(c, t);
    }
  }

  private void solve(InputReader in, PrintWriter out) {
    int n = in.nextInt();
    int T = in.nextInt();
    A[] arr = new A[n];
    for (int i = 0; i < n; i++) {
      arr[i] = new A(in.nextInt(), in.nextInt());
    }
    Arrays.sort(arr, Comparator.comparingInt(a -> a.c));
    for (int i = 0; i < n; i++) {
      if (arr[i].t <= T) {
        out.println(arr[i].c);
        return;
      }
    }
    out.println("TLE");

  }

  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    try (
            InputReader in = new InputReader(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
      solve(in, out);
    }
  }


  static class InputReader implements AutoCloseable {
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }


    public int nextInt() {
      return Integer.parseInt(next());
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }

    @Override
    public void close() {

    }
  }

}
