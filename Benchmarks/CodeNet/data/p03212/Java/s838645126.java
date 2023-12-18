

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
  private static PrintWriter out;
  private static int len;
  private static int max;
  private static ArrayList<String> matchList;

  public static void main(String[] args) {
    Main main = new Main();
    try {
      main.run(args);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void run(String[] arguments) throws Exception {
    MyScanner sc = new MyScanner();
    out = new PrintWriter(new BufferedOutputStream(System.out));
    String line = sc.next();

    len = line.length();
    max = Integer.parseInt(line);
    matchList = new ArrayList<>();
    dfs("");
    List<String> strings = matchList.stream().distinct().collect(Collectors.toList());
    out.println(strings.size());
    out.flush();
    out.close();
  }

  private void dfs(String accumulator) {
    if (accumulator.length() >= 3) {
      if (!isContinue(accumulator)) {
        return;
      }
    }
    dfs(accumulator + "3");
    dfs(accumulator + "5");
    dfs(accumulator + "7");
  }

  private boolean isContinue(String s) {
    boolean[] check = new boolean[3]; // 3, 5, 7
    char[] letters = s.toCharArray();
    for (char letter : letters) {
      switch (letter) {
        case '3':
          check[0] = true;
          break;
        case '5':
          check[1] = true;
          break;
        case '7':
          check[2] = true;
          break;
      }
      if (check[0] && check[1] && check[2]){
          if (Integer.parseInt(s)<max){
              matchList.add(s);
          }

      }
    }
    if (s.length()>=len){
        return false;
    }
    if (Integer.parseInt(s)>=max){
        return false;
    }
    return true;
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
