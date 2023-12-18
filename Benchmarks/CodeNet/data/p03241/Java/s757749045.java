import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

  private void solve(InputReader in, PrintWriter out) {
    int n = in.nextInt();
    int m = in.nextInt();
    int a = m / n;
    int[] arr = new int[n];
    Arrays.fill(arr, a);
    int b = a + m % n;
    arr[0] = b;
    if (a == b){
      out.println(a);
      return;
    }
    int max = gcd(a, b);
    while (arr[n - 1] > 1) {
      arr[n - 1]--;
      arr[0]++;
      max = Math.max(max, findGCD(arr,n));
    }
    out.println(max);
  }

  private int findGCD(int arr[], int n) {
    int result = arr[0];
    for (int i = 1; i < n; i++)
      result = gcd(arr[i], result);

    return result;
  }

  private int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
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
