import java.io.*;
import java.util.*;


public class Main {

  void solve() throws IOException {
    int h = nextInt();
    int n = nextInt();
    for (int i = 0; i < n; i++) {
      h -= nextInt();
    }
    if (h > 0) {
      out.println("No");
    } else {
      out.println("Yes");
    }
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
