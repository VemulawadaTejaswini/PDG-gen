import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    sc.close();

    long ans = 0;
    for (int i = 1; i <= K; i++)
      for (int j = 1; j <= K; j++)
        for (int k = 1; k <= K; k++)
          ans += gcd(gcd(i, j), k);
    System.out.println(ans);
  }

  private static long gcd(long a, long b) {
    long l = a < b ? a : b;
    long s = a < b ? b : a;
    for (long c = l % s; c != 0; c = l % s) {
        l = s;
        s = c;
    };
    return s;
  }
}
