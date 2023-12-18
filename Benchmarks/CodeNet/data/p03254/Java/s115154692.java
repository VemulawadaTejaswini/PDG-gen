import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main m = new Main(sc);
    m.show(m.solve());
  }

  Scanner sc;
  int N;
  int x;
  int[] a;
  int max;

  // 標準入力用のコンストラクタ
  public Main(Scanner sc) {
    this.sc = sc;
    N = sc.nextInt();
    x = sc.nextInt();
    a = new int[N];
    for (int i = 0; i < N; ++i){
        a[i] = sc.nextInt();
    }
  }

  // 判定処理
  int solve() {
      Arrays.sort(a);
      int count = 0;
      boolean over = false; //xより多くキャンディを渡さないと喜ばせられない子供がいるか
      
      for (int i = 0; i < N; ++i){
        if (a[i] <= x){   //a[i]がxより大きいと、そのi番目の子供を喜ばせることはできない
            ++count;
            x -= a[i];
        } else {
           over = true;
           break;   //昇順にソートされているため、オーバーした子供がいる時点で終了
        }
      }
      
      if (x > 0 && over){
        count--;
      }
      
      max = count;
      return max;
  }

  // 回答の表示
  void show(int max) {
        System.out.println(max);
  }
    
}