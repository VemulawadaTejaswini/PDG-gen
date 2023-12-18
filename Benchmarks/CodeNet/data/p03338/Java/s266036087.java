import java.util.*;
// import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.solve();
  }

  int n;
  String s;

  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      n = sc.nextInt();
      s = sc.next();
    } finally {
      sc.close();
    }
  }

  void solve() {
    int ans = 0;
    for (int i = 0; i < n; i++) {
      int cnt = count(i);
      if (ans < cnt) ans = cnt;
    }
    System.out.println(ans);
  }

  int count(int i) {
    int ans = 0;
    for (char c = 'a'; c < 'z' + 1; c++) {
      if (left(i, c) && right(i, c)) ans++;
    }
    return ans;
  }

  boolean left(int i, char c) {
    for (int j = 0; j < i; j++) if (s.charAt(j) == c) return true;
    return false;   
  }

  boolean right(int i, char c) {
    for (int j = i; j < n; j++) if (s.charAt(j) == c) return true;
    return false;   
  }
}
