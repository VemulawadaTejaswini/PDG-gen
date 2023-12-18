
import java.io.*;
import java.util.StringTokenizer;

public class Main {


  private void solve(InputReader in, PrintWriter out) {
    String s = in.next();
    int res = 0;
    char[] arr = s.toCharArray();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == '+') {
        res++;
      } else {
        res--;
      }
    }
    out.println(res);
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