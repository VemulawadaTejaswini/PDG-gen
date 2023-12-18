import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    try {
      main.run(args);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void run(String[] arguments) throws Exception{
    MyScanner sc = new MyScanner();
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    String line = sc.next();
    int threshold = Integer.parseInt(line);
    char[] chars = line.toCharArray();

    char[] letters = new char[chars.length];
    for (int i = 0; i < letters.length; i++) {
      letters[i] = chars[0];
    }
    int result = Integer.parseInt(new String(letters));
    if (result>=threshold){

    }else {
      for (int i = 0; i < letters.length; i++) {
        int v = letters[i] + 1;
        letters[i] =(char)v;
      }
    }
    out.println(new String(letters));
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