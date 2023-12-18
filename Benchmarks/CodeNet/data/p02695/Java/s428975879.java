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
    int M = sc.nextInt();
    int Q = sc.nextInt();

    int[][] data = new int[Q][4];
    for (int i = 0; i < Q; i++) {
      for (int j = 0; j < 4; j++) {
        data[i][j] = sc.nextInt();
      }
    }

    ArrayList<String> pairs = new ArrayList<>();
    for (int i = 0; i < Math.pow(2,M); i++) {
      String word = "";
      for (int j = 0; j < M; j++) {
        if ((1 & i>>j)==1){
          word+=(j+1)+",";
        }
      }
      String[] ss = word.split(",");
      if (ss.length==N){
        pairs.add(word);
      }
    }


    int ansForMax = 0;
    for (String s: pairs) {
      String[] ss = s.split(",");
      Integer[] nums = Arrays.stream(ss).map(sss->Integer.valueOf(sss)).toArray(Integer[]::new);

      int total = 0;
      for (int i = 0; i < data.length; i++) {
        int Ab = nums[data[i][1]-1];
        int Aa = nums[data[i][0]-1];
        int c = data[i][2];
        int d = data[i][3];
        if (Ab-Aa==c){
          total+=d;
        }
      }
      if (total>ansForMax){
        ansForMax = total;
      }
    }

    out.println(ansForMax);
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
