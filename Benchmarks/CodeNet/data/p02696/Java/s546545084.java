import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    long b = sc.nextLong();
    long n = sc.nextLong();
    long rem = n % b;
    long res = 0;
    for (long i = n - rem; i <= n; i++) {
      res = Math.max((a*i/b) - a*(i/b), res);
    }
    System.out.println(res);
    sc.close();
  }
}