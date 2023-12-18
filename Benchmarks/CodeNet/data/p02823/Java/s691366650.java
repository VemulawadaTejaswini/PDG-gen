import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();

    int diff = Math.abs(a - b);
    if (diff % 2 == 0) {
      System.out.println(diff / 2);
    } else {
      int center = (int) Math.ceil(n / 2.0);
      int max = Math.max(a, b);
      int min = Math.min(a, b);
      if (max <= center) {
        System.out.println(max - 1);
      } else {
        System.out.println(n - min);
      }
    }
  }
}