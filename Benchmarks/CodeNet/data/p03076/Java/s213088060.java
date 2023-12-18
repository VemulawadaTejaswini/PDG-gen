import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans = 0;
    int maxi = 0; // 10分に満たない分の最大値
    for (int i = 0; i < 5; i++) {
      int a = sc.nextInt();
      int b = (a + 9) / 10 * 10; // 10分単位で切り上げ
      ans += b;
      if (maxi < b - a) {
        maxi = b - a;
      }
    }
    System.out.println(ans - maxi); // 最後の注文は10分待たない。
  }
}
