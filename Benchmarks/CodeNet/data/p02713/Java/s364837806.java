import java.util.*;
public class Main {

  private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int k = sc.nextInt();
    int ans = 0;

    for (int a = 1; a <= k; a++) {
      for (int b = 1; b <= k; b++) {
        for (int c = 1; c <= k; c++) {
          ans += gcd(a, gcd(b,c));
        }
      }
    }
    System.out.println(ans);

    sc.close();

  }
}