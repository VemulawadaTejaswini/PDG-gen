import java.io.*;
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

    String s = sc.next();
    char[] letters = s.toCharArray();

    int[] superCache = new int[s.length()];
    int[] cache = new int[s.length()];
    Arrays.fill(cache, 1);

    boolean isEvenLoop = true;
    while (true){
      isEvenLoop = !isEvenLoop;

      int[] thisLoopResult = new int[s.length()];
      for (int i = 0; i < letters.length; i++) {
        char rightOrLeft = letters[i];
        if (rightOrLeft == 'R'){
          thisLoopResult[i+1] += cache[i];
        }else {
          thisLoopResult[i-1] += cache[i];
        }
      }
      boolean isConvergence = true;
      for (int i = 0; i < superCache.length; i++) {
        if (superCache[i]!=thisLoopResult[i]){
          isConvergence = false;
          break;
        }
      }
       if (isConvergence && isEvenLoop){
         break;
       }

       superCache = Arrays.copyOf(cache, cache.length);
       cache = Arrays.copyOf(thisLoopResult,thisLoopResult.length);
    }

    StringBuilder sb = new StringBuilder();
    for (int c : superCache) {
      sb.append(c).append(" ");
    }
    sb.setLength(sb.length()-1);

    out.println(sb.toString());
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
