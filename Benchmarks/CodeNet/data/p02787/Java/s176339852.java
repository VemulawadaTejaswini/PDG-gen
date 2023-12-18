import java.io.*;
import java.util.*;


public class Main {

  void solve() throws IOException {
    int h = nextInt();
    int n = nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = nextInt();
      b[i] = nextInt();
    }
    long[] dp = new long[h + 1];
    for (int i = 0; i <= h; i++) {
        dp[i] = -1;
    }
    dp[h] = 0;
    for (int i = h; i > 0; i--) {
      if (dp[i] != -1) {
        for (int j = 0; j < n; j++) {
          int next = Math.max(i - a[j], 0);
          if (dp[next] == -1 || dp[next] > dp[i] + b[j]) {
            dp[next] = dp[i] + b[j];
          }
        }
      }
    }
    out.println(dp[0]);
  }

  public static void main(String[] args) throws IOException {
    new Main().run();
  }

  void run() throws IOException {
    reader = new BufferedReader(new InputStreamReader(System.in));
//		reader = new BufferedReader(new FileReader("input.txt"));
    tokenizer = null;
    out = new PrintWriter(new OutputStreamWriter(System.out));
//		out = new PrintWriter(new FileWriter("output.txt"));
    solve();
    reader.close();
    out.flush();

  }

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter out;

  int nextInt() throws IOException {
    return Integer.parseInt(nextToken());
  }

  long nextLong() throws IOException {
    return Long.parseLong(nextToken());
  }

  double nextDouble() throws IOException {
    return Double.parseDouble(nextToken());
  }

  String nextToken() throws IOException {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
      tokenizer = new StringTokenizer(reader.readLine());
    }
    return tokenizer.nextToken();
  }
}
