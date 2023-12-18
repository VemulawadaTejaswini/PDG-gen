import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int[] ruig1 = new int[n + 1];
    int[] ruig2 = new int[n + 1];
    for(int i = 1; i <= n; i++) {
      ruig1[i] = gcd(ruig1[i - 1], a[i]);
    }
    for(int i = 1; i <= n; i++) {
      ruig2[i] = gcd(ruig2[i - 1], a[n - i]);
    }
    int ans = 1;
    for(int i = 0; i < n; i++) {
      ans = Math.max(ans, gcd(ruig1[i], ruig2[n - 1 - i]));
    }
    System.out.println(ans);
  }

  public static int gcd(int x, int y) {
    if(x == 0) return y;
    if(y == 0) return x;
    return gcd(y, (x % y));
  }
}