import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main m = new Main(sc);
    m.show(m.solve());
  }

  Scanner sc;
  int H1 = 0;
  int M1 = 0;
  int H2 = 0;
  int M2 = 0;
  int K = 0;
  int answer = 0;

  // 標準入力用のコンストラクタ
  public Main(Scanner sc) {
    this.sc = sc;
    H1 = sc.nextInt();  //24時間表記
    M1 = sc.nextInt();
    H2 = sc.nextInt();
    M2 = sc.nextInt();
    K = sc.nextInt();
  }

  // 判定処理
  int solve() {
      int answer = (H2 - H1) * 60 + (M2 - M1) - K;
      return answer;
  }

  // 回答の表示
  void show(int answer) {
    System.out.println(answer); //分
  }
}