import java.util.*;

public class Main {
  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    final long a = sc.nextLong();
    final long b = sc.nextLong();
    System.out.println(calc(a - 1) ^ calc(b));
    sc.close();
  }

  static long calc(final long n) {
    if (n % 2 != 0) {
        return  ((n + 1) / 2) % 2;
    }
    final long remain = (n / 2) % 2;
    return n + remain;
  }
}