import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();

    if (k <= a) {
      System.out.println(k);
      return;
    }

    int total = a;
    k -= a;

    if (k <= b) {
      System.out.println(total);
      return;
    }

    k -= b;

    System.out.println(total - k);

  }
}
