import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long k = sc.nextLong();
    sc.close();

    long sum = 0;

    if (a <= k) {
      sum += a * 1;
      k -= a;
    } else {
      System.out.println(k);
      return;
    }
    if (k <= 0) {
      System.out.println(sum);
      return;
    }

    if (b <= k) {
      sum += b * 0;
      k -= b;
    } else {
      System.out.println(sum);
      return;
    }
    if (k <= 0) {
      System.out.println(sum);
      return;
    }

    if (c <= k) {
      sum += c * -1;
      k -= c;
    } else {
      sum += k * -1;
    }
    System.out.println(sum);
  }
}