import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long X = sc.nextLong();
    long ans = 0;
    for (int i = 0; i < N; i++) {
      long x = sc.nextLong();
      // 3値以上で最大公約数を求める
      ans = GCD(ans, Math.abs(x - X));
    }
    sc.close();
    System.out.println(ans);
  }

  public static long GCD(long a, long b) {
    if (b == 0) {
      return a;
    }
    return GCD(b, a % b);
  }

}
