import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main m = new Main(sc);
    m.show(m.solve());
    // m.debug();
  }

  Scanner sc;
  boolean a;
  boolean b;

  // 標準入力用のコンストラクタ
  public Main(Scanner sc) {
    this.sc = sc;
    a = sc.next().equals("H");
    b = sc.next().equals("H");
  }

  // 判定処理
  boolean solve() {
    return a ^ b;
  }

  // 回答の表示
  void show(boolean ans) {
    System.out.println(ans ? "D" : "H");
  }
}
