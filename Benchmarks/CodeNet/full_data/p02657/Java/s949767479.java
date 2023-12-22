import java.util.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.solve();
  }

  int a;
  int b;
  int ans;

  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      a = sc.nextInt();
      b = sc.nextInt();
    } finally {
      sc.close();
    }
  }

  void solve() {
    ans = a * b;
    show();
  }

  void show() {
    System.out.println(ans);
  }
}
