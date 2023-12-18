import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Main {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  void run() {
    String str = sc.next();
    char[] ans = str.toCharArray();
    int k = ni();
    for (int i = 0; i < str.length(); ++i) {
      int a = str.charAt(i);
      int v = 'z' - a + 1;
      if (v <= k) {
        k -= v;
        ans[i] = 'a';
      }
    }
    int r = ans[str.length() - 1];
    r += k;
    r -= 'a';
    r %= 'z' - 'a' + 1;
    r += 'a';
    ans[str.length() - 1] = (char)r;
    String aaa = new String(ans);
    System.out.println(aaa);
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }

}
