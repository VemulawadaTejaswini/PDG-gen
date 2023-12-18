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

    int N = sc.nextInt();
    int Y = sc.nextInt();
    Pair result = new Pair(-1, -1, -1);

    for (int x = 0; x <= N; x++) {
      for (int y = 0; y <= N-x ; y++) {
        int rest = Y - 10000*x - 5000*y;
        int z = rest / 1000;
        if (x+y+z == N){
          result = new Pair(x,y,z);
          break;
        }
      }
    }

    out.println(result.resultStr());
    out.close();
  }

  class Pair{
    int x;
    int y;
    int z;
    
    Pair(int x, int y, int z){
      this.x = x;
      this.y = y;
      this.z = z;
    }

    String resultStr(){
      return String.format("%s, %s, %s",this.x, this.y, this.x);
    }
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
