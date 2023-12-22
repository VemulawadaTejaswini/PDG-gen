import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Comparator;
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

    int n = sc.nextInt();
    TreeSet<Integer> treeNumbers = new TreeSet<>(Comparator.reverseOrder());

    for (int i = 0; i < n; i++) {
      treeNumbers.add(sc.nextInt());
    }

    int ans = 0;
    while (!treeNumbers.isEmpty()) {

      if (treeNumbers.size() == 1) {
        break;
      }

      boolean isOK = true;
      int first = treeNumbers.first();

      for (Integer num : treeNumbers) {
        int rest = first % num;
        if (rest == 0) {
          isOK = false;
          treeNumbers.remove(first);
          break;
        }
      }
      if (!isOK) {
        ans++;
      }
    }
    out.println(ans);
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
