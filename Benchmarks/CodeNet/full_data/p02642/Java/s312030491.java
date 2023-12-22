import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

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
    ArrayList<Integer> list = new ArrayList<>();
    //HashSet<Integer> hashSet = new HashSet<>();
    //TreeSet<Integer> treeNumbers = new TreeSet<>();

    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }

    int MAX_A = (int) Math.pow(10, 6);
    int[] checks = new int[MAX_A + 1];
    int ans = 0;

    for (Integer num : list) {
      for (int i = num; i < MAX_A; i += num) {
        checks[i]++;
      }
    }

    for (Integer number : list) {
      if (checks[number] == 1) {
        ans++;
      }
    }

    System.err.println(Arrays.asList(checks).toString());
    out.println(ans);
    out.close();

    /*
    int ans = 0;
    if (treeNumbers.size() > 1) {
      while (!treeNumbers.isEmpty()) {
        ans++;
        int first = treeNumbers.first();
        treeNumbers.remove(first);
        TreeSet<Integer> newTreeSet = new TreeSet<>();

        for (Integer number : treeNumbers) {
          int rest = number % first;
          if (rest != 0) {
            newTreeSet.add(number);
          }
        }

        treeNumbers = newTreeSet;
      }
    }
    }
     */

    /*
    if (treeNumbers.size() != 1) {

      while (!treeNumbers.isEmpty()) {

        boolean isOK = true;
        int first = treeNumbers.first();
        treeNumbers.remove(first);

        for (Integer num : treeNumbers) {
          int rest = first % num;
          if (rest == 0) {
            isOK = false;
            break;
          }
        }
        if (isOK) {
          ans++;
        }
      }
    }
     */
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
