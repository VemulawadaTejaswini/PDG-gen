import java.util.*;

public class Main {
  private static int gcd(int p, int q) {
    if(p % q == 0)return q;
    return gcd(q, p % q);
  }
  
  private static long solve(int n) {
    long result = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        for (int k = 1; k <= n; k++) {
          if (i == j && j == k) {
            result += i;
          } else {
            result += gcd(gcd(i, j), k);
          }
        }
      }
    }
    return result;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(solve(sc.nextInt()));
    sc.close();
  }
}

