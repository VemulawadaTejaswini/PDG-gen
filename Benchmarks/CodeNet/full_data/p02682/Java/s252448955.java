import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    final int a = scanner.nextInt();
    final int b = scanner.nextInt();
    final int c = scanner.nextInt();
    int k = scanner.nextInt();

    int sum = 0;
    if (k >= a) {
      k -= a;
      sum += a;
    } else {
      sum += k;
      k = 0;
    }

    if (k >= b) {
      k -= b;
    } else {
      k = 0;
    }

    sum -= k;

    System.out.println(sum);
  }
}