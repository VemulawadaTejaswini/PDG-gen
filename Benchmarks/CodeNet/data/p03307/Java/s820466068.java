import java.io.*;
import java.util.*;

public class Main {


  private void solve(InputReader in, PrintWriter out) {
    long n = in.nextLong();
    out.println(lcm(2,n));
  }

  long lcm(long a,long b){
    return a / gcd(a,b) * b;
  }

  private long gcd(long a,long b){
    return b == 0 ? a : gcd(b,a % b);
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
