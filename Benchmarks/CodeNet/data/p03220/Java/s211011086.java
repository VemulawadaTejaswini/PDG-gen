import java.io.*;
import java.util.StringTokenizer;


public class Main {


  private void solve(InputReader in, PrintWriter out) {
    int n = in.nextInt();
    int t = in.nextInt();
    int a = in.nextInt();
    int index = 1;
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    int res =  (int) (t - arr[0] * 0.006) - Math.abs(a);
    for (int i = 1; i < n; i++) {
      if (res < (t - arr[i] * 0.006 - Math.abs(a))){
        res = (int) (t - arr[i] * 0.006) - Math.abs(a);
        index = i + 1;
      }
    }
    out.println(index);

  }


  public static void main(String[] args) throws FileNotFoundException {
    new Main().run();
  }

  private void run() throws FileNotFoundException {

    //new FileInputStream(new File("input.txt"))
    //
    try (InputReader in = new InputReader(System.in);
         PrintWriter out = new PrintWriter(System.out)) {
      solve(in, out);
    }
  }


  static class InputReader implements AutoCloseable {
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    InputReader(InputStream stream) {
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
