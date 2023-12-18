import java.util.*;

public class Main {

  static Scanner scan = new Scanner(System.in);

  static long d = (long) Math.pow(10, 9) + 7;
  public static void main(String[] args) {
    long n = scan.nextInt();
    long k = scan.nextInt();

    long sum = 1;
    for (long i = k; i <= n; i++) {
      sum += calc(n) - calc(n - i) - calc(i - 1) + 1;
      // System.out.println(calc(n) - calc(n - i) - calc(i - 1) + 1);
      sum %= d;
    }

    System.out.print(sum);
  }

  static long calc(long n) {
    return n * (n + 1) / 2;
  }
}