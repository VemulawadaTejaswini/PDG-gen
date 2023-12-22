import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = null;
    while (!(line = sc.next()).equals("0 0")) {
      String str[] = line.split(" ", 2);
      int n = Integer.parseInt(str[0]);
      int s = Integer.parseInt(str[1]);
    }
    System.out.println(dfs(n, s, 0));
  }

  private static int dfs(int n, int s, int min) {
    if (n == 0) {
      return s == 0 ? 1 : 0;
    }
    int ret = 0;
    for (int i = min; i <= Math.min(9, s); i++) {
      ret += dfs(n - 1, s - i, i + 1);
    }
    return ret;
  }
}