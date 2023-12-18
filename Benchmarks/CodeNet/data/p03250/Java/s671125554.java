import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
  private static PrintWriter out;

  public static void main(String[] args) {
    Main main = new Main();
    try {
      main.run(args);
    } catch (Exception e) {
      e.printStackTrace();
    }finally{
      out.close();
    }
  }

  private void run(String[] arguments) throws Exception {
    MyScanner sc = new MyScanner();
    out = new PrintWriter(new BufferedOutputStream(System.out));
    Integer[] numbers = new Integer[3];
    IntStream.range(0,3).boxed().forEach(i->numbers[i]=sc.nextInt());
    Arrays.sort(numbers, Comparator.reverseOrder());
    int ans = numbers[0]*10 + numbers[1] + numbers[2];
    out.println(ans);
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
