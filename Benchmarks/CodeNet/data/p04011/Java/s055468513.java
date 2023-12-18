import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();

    int sum = 0;
    for (int i = 0; i < n; i++) {
      if (i < k) {
        sum = sum + x;
      } else {
        sum = sum + y;
      }
    }

    System.out.println(sum);
  }
}
