import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.io.IOException;
import java.util.OptionalInt;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author dyominov
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    AFrog1 solver = new AFrog1();
    solver.solve(1, in, out);
    out.close();
  }

  static class AFrog1 {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = in.nextInt();
      }
      int[] res = new int[n + 1];
      int[] res2 = new int[n + 1];
      for (int i = 0; i < n - 2; i++) {
        res[i] = Integer.MAX_VALUE;
        for (int j = i + 1; j <= i + 2; j++) {
          res[j] = Math.min(Math.abs(arr[i] - arr[j]), res[j]);
          res2[i] = Math.min(Math.abs(arr[i] - arr[j]), res[i]);
        }
      }
      out.println(Arrays.stream(res2).max().getAsInt());
    }

  }

  static class InputReader implements AutoCloseable {
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      //reader = new BufferedReader(new FileReader(stream), 32768);
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

    public void close() {
    }

  }
}

