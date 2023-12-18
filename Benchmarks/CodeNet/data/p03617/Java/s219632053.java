import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long q = sc.nextLong();
    long h = sc.nextLong();
    long s = sc.nextLong();
    long d = sc.nextLong();
    long N = sc.nextLong();
    long two = N / 2;
    long one = N - 2 * two;
    long d2 = Math.min(d, 8 * q);
    d2 = Math.min(d2, 4 * h);
    d2 = Math.min(d2, 2 * s);
    long d1 = Math.min(4 * q, 2 * h);
    d1 = Math.min(d1, s);
    long ans = two * d2 + one * d1;
    System.out.println(ans);
  }
}