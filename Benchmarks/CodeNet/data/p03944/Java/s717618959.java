import java.util.*;

public class Main {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int W = sc.nextInt();
    int H = sc.nextInt();
    int N = sc.nextInt();
    // 塗りつぶされていない範囲のx,yを求める
    int maxX = W, minX = 0;
    int maxY = H, minY = 0;

    for (int n = 0; n < N; n++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int a = sc.nextInt();

      if (a == 1) {
        minX = Math.max(minX, x);
      } else if (a == 2) {
        maxX = Math.min(maxX, x);
      } else if (a == 3) {
        minY = Math.max(minY, y);
      } else if (a == 4) {
        maxY = Math.min(maxY, y);
      }
    }

    int ans = (maxX - minX) * (maxY - minY);
    System.out.println(ans > 0 ? ans : 0);
  }
}
