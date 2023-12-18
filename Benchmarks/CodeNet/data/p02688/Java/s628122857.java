import java.io.*;
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
    int k = sc.nextInt();

    boolean[][] checkNote = new boolean[n][k];

    for (int i = 0; i < k; i++) {
      int d = sc.nextInt();
      for (int j = 0; j < d; j++) {
        int a = sc.nextInt()-1;
        checkNote[a][i] = true;
      }
    }

    int counter = 0;
    for (int i = 0; i < checkNote.length; i++) {
      boolean isTrueContain = false;
      for (int j = 0; j < checkNote[i].length; j++) {
        if (checkNote[i][j]){
          isTrueContain = true;
          break;
        }
      }
      if (!isTrueContain) counter++;
    }

    out.println(counter);
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
