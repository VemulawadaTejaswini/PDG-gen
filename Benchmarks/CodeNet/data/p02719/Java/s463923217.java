import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();
    long res = cal(n, k);
    System.out.println(res);
    sc.close();
  }

  static long cal(long n, long k) {
    if (Math.abs(n - k) < Math.abs(Math.abs(n - k) - k)) return n;
    else return cal(Math.abs(n-k), k);
  }
}