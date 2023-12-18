import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main m = new Main(sc);
    m.show(m.solve());
  }

  Scanner sc;
  long N = 0;
  long K = 0;
  long answer = 0;

  // 標準入力用のコンストラクタ
  public Main(Scanner sc) {
    this.sc = sc;
    N = sc.nextLong();
    K = sc.nextLong();
  }

  // 判定処理
  long solve() {
      //int[] ball = new int[N];  //色の種類数を格納するボールの配列
      answer = K;
      for (int i = 1; i < N; ++i){
        if (N == 1){
            break;
        } else {
            //ball[i] = K;
            answer *= K - 1;
        }
      }
      
      return answer;
  }

  // 回答の表示
  void show(long answer) {
        System.out.println(answer);
  }
    
}