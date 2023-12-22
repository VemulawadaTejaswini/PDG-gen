import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

  private static PrintWriter out;

  public static void main(String[] args) {
    Main main = new Main();
    Runtime.getRuntime().addShutdownHook(new Thread(() -> out.close()));
    try {
      main.run(args);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void run(String[] arguments) throws Exception {
    MyScanner sc = new MyScanner();
    out = new PrintWriter(new BufferedOutputStream(System.out));

    long x = sc.nextInt();
    long n = sc.nextInt();
    TreeSet<Long> longs = new TreeSet<>();

    for (long i = 0; i < n; i++) {
      long p = sc.nextLong();
      longs.add(p);
    }

    ArrayList<Long> ans = new ArrayList<>();
    long target = x;
    for (long i = 0; i < 100; i++) {
      long upper = target + i;
      long lower = target - i;
      if (!longs.contains(upper)) {
        ans.add(upper);
      }
      if (!longs.contains(lower)) {
        ans.add(lower);
      }
      if (ans.size() > 0) {
        break;
      }
    }

    long pans;
    if (ans.size() > 1) {
      pans = Math.min(ans.get(0), ans.get(1));
    } else {
      pans = ans.get(0);
    }
    out.println(pans);
    out.close();
  }

  /*
   * Form: http://codeforces.com/blog/entry/7018
   */
  private class MyScanner {

    BufferedReader br;
    StringTokenizer st;

    MyScanner() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }
  }
}
