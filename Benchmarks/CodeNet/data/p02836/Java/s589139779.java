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
    for (int i = 0; i < n / 2; i++) {
      if (s.charAt(i) != s.charAt(n-1-i)) ans++;
    }
  }

  void show() {
    System.out.println(ans);
  }
}
