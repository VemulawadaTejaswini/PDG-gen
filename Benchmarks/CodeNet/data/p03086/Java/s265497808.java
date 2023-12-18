import java.util.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.solve();
    main.show();
  }

  String s;
  int n;
  int ans;
  
  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      s = sc.next();
      n = s.length();
    } finally {
      sc.close();
    }
  }
  
  void solve() {
    for (int i = 0; i < n; i++) {
      for (int j = i; j <= n; j++) {
        if (checkString(i, j)) {
          int k = j - i;
          if (ans < k) ans = k;
        } 
      }
    }
  }
  
  boolean checkString(int lo, int hi) {
    for (int i = lo; i < hi; i++) if (!checkChar(i)) return false;
    return true;
  }
  
  boolean checkChar(int i) {
    char[] cs = new char[] { 'A', 'C', 'G', 'T' };
    for (char c: cs) if (s.charAt(i) == c) return true;
    return false;
  }

  void show() {
    System.out.println(ans);
  }
}
