import java.util.*;

public class Main {
  public static void main(final String[] args) throws Exception {
    final Scanner scanner = new Scanner(System.in);
    try {
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      int[] cnt = new int[m]; // 食べ物別に好きな人数を集計する

      for (int i = 0; i < n; i++) {
        int k = scanner.nextInt();
        for (int j = 0; j < k; j++) {
          int a = scanner.nextInt();
          a--;
          cnt[a]++;
        }
      }

      int ans = 0;
      for (int i = 0; i < m; i++) {
        if (cnt[i] == n) ans++;
      }
      System.out.println(ans);
    } finally {
      scanner.close();
    }
  }
}
