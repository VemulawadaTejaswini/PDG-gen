import java.util.*;

class Main {
  final static int INF = 1001001001;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 入力データを変数に格納する
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = sc.nextInt();
    int[][] a = new int[12][12];
    int[] c = new int[n];
    for (int i = 0; i < n; i++) {
      c[i] = sc.nextInt();
      for (int j = 0; j < m; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    sc.close();

    // 回答=コストの最小値なので最小値比較のために大きな数値で初期化しておく。
    int ans = INF;

    // 全ての組み合わせパターンをチェックする
    // 全ての組み合わせは「1<<n」通りある。
    // 二進数で考える。例としてn=3のときは
    // 1: 000
    // 2: 001
    // 3: 010
    // 4: 011
    // 5: 100
    // 6: 101
    // 7: 110
    // 8: 111
    // の８パターン(1<<3 = 8)
    for (int s = 0; s < 1<<n; s++) {
      int cost = 0;         // このs番目の組み合わせのコスト
      int[] d = new int[m]; // このs番目の組み合わせでの各アルゴリズムの理解度

      // ２進数で各ビットが1になっているかどうか調べる
      for (int i = 0; i < n; i++) {

        // 右にi個シフトすると調べたいビットが一番右にくる。
        if ((s>>i & 1) > 0) {
          cost += c[i];
          for (int j = 0; j < m; j++) {
            d[j] += a[i][j];
          }
        }
      }

      // 全てのアルゴリズムの理解度がxを超えているかチェックする
      boolean ok = true;
      for (int j = 0; j < m; j++) {
        if (d[j] < x) ok = false;
      }
      // チェックOKであれば、そのコストが最小値を更新するかどうか。
      if (ok) ans = Math.min(ans, cost);

    }

    // 全てのアルゴリズムの理解度がxを超えるパターンが１つもない場合はansがINFのままになってる
    if (ans == INF) System.out.println(-1);
    else System.out.println(ans);

  }
}