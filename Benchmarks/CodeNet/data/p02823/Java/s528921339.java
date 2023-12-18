import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    long a = sc.nextInt();
    long b = sc.nextInt();
    sc.close();

    long diff = Math.abs(a - b);
    if (diff % 2 == 0) {
      System.out.println(diff / 2);
    } else {
      long center = (int) Math.ceil(n / 2.0);
      long max = Math.max(a, b);
      long min = Math.min(a, b);
      if (max <= center) {
        System.out.println(max - 1);
      } else {
        System.out.println(n - min);
      }
    }
  }
}