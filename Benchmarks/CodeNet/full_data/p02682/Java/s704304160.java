
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();

    Integer sum = 0;
    for (int i = 1; i <= k; i++) {
      if (i <= a) {
        sum++;
      } else if (i <= a + b) {

      } else if (i < +a + b + c) {
        sum--;
      }
    }

    // 出力
    System.out.println(sum);
  }
}
