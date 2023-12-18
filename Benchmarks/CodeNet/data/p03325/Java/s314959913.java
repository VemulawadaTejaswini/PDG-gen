
import java.io.*;
import java.util.StringTokenizer;

public class Main {

  private void solve(InputReader in, PrintWriter out) {
    int n = in.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    int count = 0;
    int countDivide = 0;
    while (true) {
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0 && countDivide == 0) {
          arr[i] = arr[i] / 2;
          countDivide++;
        } else {
          arr[i] = arr[i] * 3;
        }
      }
      if (countDivide == 0) {
        break;
      }
      countDivide = 0;
      count++;
    }
    out.println(count);
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
