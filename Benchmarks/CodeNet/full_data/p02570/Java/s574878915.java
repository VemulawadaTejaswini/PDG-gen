import java.util.Scanner;

public class Te {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 目的地までの距離
    int d = sc.nextInt();

    // 待ち合わせ時間
    int t = sc.nextInt();

    // 分速
    int s = sc.nextInt();

    if (d / s <= t) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
