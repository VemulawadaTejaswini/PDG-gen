
import java.util.*;

public class Main {
  static int n, k;
  static int[] W;

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      n = sc.nextInt();
      k = sc.nextInt();
      W = new int[n];
      for (int i = 0; i < W.length; i++) {
        W[i] = sc.nextInt();
      }
      solve();
    }
  }

  static void solve() {
    // 最小の積載量を探す。
    // pの候補を線形探索しては間に合わないので二分探索
    int begin = 0;
    int end = 100000 * 10000;// とりあえず n * Wi

    while (end - begin > 1) {
      int center = (begin + end) / 2;
      int target = chackCnt(center);
      if (target >= n) {
        end = center;// 前を探す
      } else {
        begin = center;// 後を探す
      }

    }
    System.out.println(end);
  }

  /**
   * 積載量pのトラックk台で何個積めるか
   */
  static int chackCnt(int p) {
    int cnt = 0;
    for (int j = 0; j < k; j++) {
      int s = 0;
      while (s + W[cnt] <= p) {
        s += W[cnt];
        cnt++;
        if (cnt == n)
          return n;
      }
    }
    return cnt;
  }
}

