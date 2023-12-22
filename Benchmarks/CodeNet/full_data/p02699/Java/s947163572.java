import java.util.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.solve();
    main.show();
  }

  int s;
  int w;
  String ans;

  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      s = sc.nextInt();
      w = sc.nextInt();
    } finally {
      sc.close();
    }
  }
  
  void solve() {
    ans = s <= w ? "unsafe" : "safe";
  }

  void show() {
    System.out.println(ans);
  }
}
