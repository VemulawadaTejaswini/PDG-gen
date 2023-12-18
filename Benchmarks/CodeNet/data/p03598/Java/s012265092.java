import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long k = sc.nextLong();
    long ans = 0;
    for(int i = 0; i < n; i++) {
      long x = sc.nextLong();
      ans += Math.min(2 * x, 2 * Math.abs(k - x));
    }
    System.out.println(ans);
  }
}