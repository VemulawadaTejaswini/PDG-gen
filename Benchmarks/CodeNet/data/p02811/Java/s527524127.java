import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 500円玉の数
    int a = sc.nextInt();
    // 数
    int b = sc.nextInt();

    if (500 * a >= b) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
