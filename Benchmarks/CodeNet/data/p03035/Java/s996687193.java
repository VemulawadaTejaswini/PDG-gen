
import java.util.*;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      // 6歳以上 12 歳以下の人はその半額で乗ることができ、
      // さらに5 歳以下の人は無料
      int ans = B;
      if (A <= 13) {
        if (A <= 5) {
          ans = 0;
        } else {
          ans = B / 2;
        }
      }

      System.out.println(ans);
    }
  }
}
