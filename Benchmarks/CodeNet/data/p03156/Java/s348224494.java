import java.util.*;
import java.io.*;

public class Main {

  private static void solve() {
    int n = nextInt();
    int a = nextInt();
    int b = nextInt();

    int[] p = new int[n];

    for (int i = 0; i < n; i++) {
      p[i] = nextInt();
    }

    int ac = 0, bc = 0, cc = 0;
    for (int i = 0; i < n; i++) {
      if (p[i] <= a) {
        ac++;
      } else if (p[i] >= a + 1 && p[i] <= b) {
        bc++;
      } else {
        cc++;
      }
    }

    out.println(Math.min(ac, Math.min(bc, cc)));
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