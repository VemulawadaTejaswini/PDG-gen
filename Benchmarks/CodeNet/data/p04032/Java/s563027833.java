import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {


  private void solve(InputReader in, PrintWriter out) {
    String s = in.next();
    int l = s.length();
    for (int i = 0; i < l - 2; i++) {
      if (s.charAt(i) == s.charAt(i + 1) || s.charAt(i) == s.charAt(i + 2) || s.charAt(i + 1) == s.charAt(i + 2)) {
        out.print((i + 1) + " " + (i + 3));
        return;
      }
    }
    if (s.charAt(0) == s.charAt(1)) {
      out.print(1 + " " + 2);
    } else {
      out.print(-1 + " " + -1);
    }
  }


  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {

    try (InputReader in = new InputReader(System.in);
         PrintWriter out = new PrintWriter(System.out)) {
      solve(in, out);
    }
  }


  static class InputReader implements AutoCloseable {
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    InputReader(InputStream stream) {
      //reader = new BufferedReader(new FileReader(stream), 32768);
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    String next() {
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
