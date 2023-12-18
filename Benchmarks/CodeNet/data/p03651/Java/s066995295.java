import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int a0 = sc.nextInt();
    int M = a0;
    int g = a0;
    for(int i = 1; i < n; i++) {
      int a = sc.nextInt();
      M = Math.max(M, a);
      g = gcd(g, a);
    }
    String ans = "IMPOSSIBLE";
    if((M >= k) && ((k % g) == 0)) ans = "POSSIBLE";
    System.out.println();
  }

  public static int gcd(int a, int b) {
    if(b == 0) return a;
    return gcd(b, (a % b));
  }
}