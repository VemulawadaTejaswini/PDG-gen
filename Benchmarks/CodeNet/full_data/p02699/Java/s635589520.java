import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.StringTokenizer;

public class Main {
  private static class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(final InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (final IOException e) {
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

  private static class OutputWriter extends PrintWriter {
    public OutputWriter(final OutputStream outputStream) {
      super(outputStream);
    }

    @Override
    public void println() {
      super.println();
      super.flush();
    }
  }

  private static boolean isLocal() {
    return new File("../in.txt").exists();
  }

  public static void main(final String[] args) throws IOException {
    final InputStream inputStream = isLocal() ? new FileInputStream("../in.txt") : System.in;
    final OutputStream outputStream = System.out;
    final InputReader in = new InputReader(inputStream);
    final OutputWriter out = new OutputWriter(outputStream);
    final Task solver = new Task();
    int testcase = 1;
    while (testcase-- > 0) {
      solver.solve(in, out);
    }
    out.close();
  }

  private static class Task {
    public void solve(final InputReader in, final PrintWriter out) {
      int S = in.nextInt();
      int W = in.nextInt();
      if (W >= S) {
        out.println("unsafe");
      } else {
        out.println("safe");
      }
    }
  }
}
