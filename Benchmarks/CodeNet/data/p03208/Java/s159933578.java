import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

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
    int N = sc.nextInt(), K = sc.nextInt();
    int[] trees = new int[N];
    IntStream.range(0, N).boxed().forEach(i->trees[i]=sc.nextInt());
    Arrays.sort(trees);

    int shift = K-1;
    int ans = Integer.MAX_VALUE;
    for (int i = 0; i < N-shift; i++) {
        int min = trees[i];
        int max = trees[i+shift];
        int sub = max - min;
        if (sub<ans){
            ans = sub;
        }
    }
    System.out.println(ans);
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
