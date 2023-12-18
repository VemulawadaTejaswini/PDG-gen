import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 入力の数
    int inputs = sc.nextInt();

    int time;
    int x;
    int y;
    for (int i = 0; i < inputs; i++) {

      time = sc.nextInt();
      x= sc.nextInt();
      y= sc.nextInt();

      if (x + y <= time) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
