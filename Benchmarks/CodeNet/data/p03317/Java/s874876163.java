
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


  private void solve(InputReader in, PrintWriter out) {
    int n = in.nextInt();
    int k = in.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    int res = 0;
    int min = arr[0];
    int[] tmp = new int[k];
    for (int i = 1; i < n; ) {
      if (min != arr[i]) {
        while (i + k > n) i--;
        System.arraycopy(arr, i, tmp, 0, tmp.length);
        min = Math.min(min, Arrays.stream(tmp).min().getAsInt());
        Arrays.fill(tmp, min);
        System.arraycopy(tmp, 0, arr, i, tmp.length);
        res++;
        i += tmp.length;
      } else {
        i++;
      }
    }
    for (int i = n - 1; i > -1; ) {
      if (min != arr[i]) {
        while (i + k > n) i--;
        System.arraycopy(arr, i, tmp, 0, tmp.length);
        Arrays.fill(tmp, min);
        System.arraycopy(tmp, 0, arr, i, tmp.length);
        res++;
        i -= tmp.length;
      } else {
        i--;
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