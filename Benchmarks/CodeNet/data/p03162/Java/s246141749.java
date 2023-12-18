import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.OptionalLong;
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
    CVacation solver = new CVacation();
    solver.solve(1, in, out);
    out.close();
  }

  static class CVacation {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt();
      int m = 3;
      long[][] arr = new long[n][m];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          arr[i][j] = in.nextInt();
        }
      }
      long[][] dp = new long[n][m];
      dp[0] = arr[0];
      int f1 = 0;
      int s1 = 1;
      int t1 = 2;
      int f2 = 0;
      int s2 = 1;
      int t2 = 2;
      int f3 = 0;
      int s3 = 1;
      int t3 = 2;
      for (int i = 1; i < n; i++) {
        if (arr[i][s1] >= arr[i][t1]) {
          dp[i][0] = dp[i - 1][0] + arr[i][s1];
          s1 ^= f1;
          f1 ^= s1;
          s1 ^= f1;
        } else {
          dp[i][0] = dp[i - 1][0] + arr[i][t1];
          t1 ^= f1;
          f1 ^= t1;
          t1 ^= f1;
        }
        if (arr[i][f2] >= arr[i][t2]) {
          dp[i][1] = dp[i - 1][1] + arr[i][f2];
          s2 ^= f2;
          f2 ^= s2;
          s2 ^= f2;
        } else {
          dp[i][1] = dp[i - 1][1] + arr[i][t2];
          t2 ^= s2;
          s2 ^= t2;
          t2 ^= s2;
        }
        if (arr[i][f3] >= arr[i][s3]) {
          dp[i][2] = dp[i - 1][2] + arr[i][f3];
          f3 ^= t3;
          t3 ^= f3;
          f3 ^= t3;
        } else {
          dp[i][2] = dp[i - 1][2] + arr[i][s3];
          s3 ^= t3;
          t3 ^= s3;
          s3 ^= t3;
        }
      }
      out.println(Arrays.stream(dp[n - 1]).max().getAsLong());
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

