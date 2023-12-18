import java.io.*;
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

    int N = sc.nextInt();
    String line = sc.nextLine();
    Integer[] numbers = Arrays.stream(line.split(" ")).map(s->Integer.valueOf(s)).toArray(Integer[]::new);

    boolean[][] relations = new boolean[N][N];
    for (int i = 0; i < numbers.length; i++) {
      int a = numbers[i]-1;
      relations[a][i] = true;
    }

    for (int i = 0; i < relations.length; i++) {
      int counter = 0;
      for (int j = 0; j < relations[i].length; j++) {
        if (relations[i][j]){
          counter++;
        }
      }
      out.println(counter);
    }
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
