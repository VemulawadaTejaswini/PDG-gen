import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, x, ans;
    while (true) {
      ans = 0;
      n = Integer.parseInt(sc.next());
      x = Integer.parseInt(sc.next());
      if (n == 0 && x == 0) break;
      for (int i = 1; i <= n; i++) {
        for (int j = i + 1; j <= n; j++) {
          for (int k = j + 1; k <= n; k++) {
            if (i + j + k == x) ans++;
          }
        }
      }
      System.out.println(ans);
    }
  }
}