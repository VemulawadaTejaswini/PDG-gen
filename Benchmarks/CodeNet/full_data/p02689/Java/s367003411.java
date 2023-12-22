import java.io.*;
import java.util.ArrayList;
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
    int M = sc.nextInt();
    ArrayList<Integer> hight = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      hight.add(sc.nextInt());
    }

    boolean[][] graph = new boolean[N][N];
    for (int i = 0; i < M; i++) {
      int a = sc.nextInt()-1;
      int b = sc.nextInt()-1;
      graph[a][b] = true;
      graph[b][a] = true;
    }

    int counter = 0;
    for (int i = 0; i < graph.length; i++) {
      int H1 = hight.get(i);
      boolean isGoodObservatory = true;
      for (int j = 0; j < graph[i].length; j++) {
        if (graph[i][j]){
          int H2 = hight.get(j);
          if (H1<H2){
            isGoodObservatory = false;
            break;
          }
        }
      }
      if (isGoodObservatory) counter++;
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
