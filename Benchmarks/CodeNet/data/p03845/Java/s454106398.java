import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Main {

  public static void main(String [] args) {
    InputReader scanner = new InputReader(System.in);
    int N = scanner.nextInt();
    int [] T = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      T[i] = scanner.nextInt();
    }
    int M = scanner.nextInt();
    int [] P = new int[M + 1];
    int [] A = new int[M + 1];
    for (int i = 1; i <= M; i++) {
      P[i] = scanner.nextInt();
      A[i] = scanner.nextInt();
    }
    for (int i = 1; i <= M; i++) {
      int temp = T[P[i]];
      T[P[i]] = A[i];
      int res = 0;
      for (int j = 1; j <= N; j++) {
        res += T[j];
      }
      System.out.println(res);
      T[P[i]] = temp;
    }
  }

  static class Interval implements Comparable<Interval> {
    int a, b;
    public Interval(int a, int b) {
      this.a = a;
      this.b = b;
    }

    public int compareTo(Interval rhs) {
      if (b < rhs.b) return -1;
      if (b == rhs.b) {
        return a - rhs.a;
      }
      return 1;
    }
  }

  static class InputReader {
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    public String nextLine() {
      try {
        return reader.readLine();
      } catch (IOException e) {
        return null;
      }
    }

    public boolean hasNext() {
      if (tokenizer == null) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
        }
      }
      return tokenizer.hasMoreTokens();
    }

    public String next() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
          if (!tokenizer.hasMoreTokens()) {
            return null;
          }
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
  }
}
