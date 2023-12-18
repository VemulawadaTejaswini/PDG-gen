import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    long ans = (n / (a + b)) * a;
    long r = n % (a + b);
    ans += r;
    System.out.println(ans);
  }
}