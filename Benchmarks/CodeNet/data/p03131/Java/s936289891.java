import java.util.*;
import java.io.*;

public class Main {

  private static void solve() {
    long k = nextInt();
    long A = nextInt();
    long B = nextInt();

    long ans = k + 1;
    if (A < B && k >= A - 1) {
      k -= A - 1;
      long diff = B - A;
      ans = Math.max(ans, A + (k % 2 == 0 ? (k / 2) * diff : ((k - 1) / 2) * diff + 1));
    }

    System.out.println(ans);
  }

  private static void run() {
    br = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(System.out);

    solve();

    out.close();
  }

  private static StringTokenizer st;
  private static BufferedReader br;
  private static PrintWriter out;

  private static String next() {
    while (st == null || !st.hasMoreElements()) {
      String s;
      try {
        s = br.readLine();
      } catch (IOException e) {
        return null;
      }
      st = new StringTokenizer(s);
    }
    return st.nextToken();
  }

  private static int nextInt() {
    return Integer.parseInt(next());
  }

  private static long nextLong() {
    return Long.parseLong(next());
  }

  public static void main(String[] args) {
    run();
  }
}