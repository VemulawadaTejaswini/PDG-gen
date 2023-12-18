import java.util.Scanner;

public class Main {

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    final int F = 500; // 500円
    int k = sc.nextInt(); // 枚数
    int x = sc.nextInt(); // 円

    if (F * k >= x) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
