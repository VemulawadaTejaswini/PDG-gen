import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    
    int max = sc.nextInt();
    int gcd = max;
    for (int i = 0; i < N-1; i++) {
      int A = sc.nextInt();
      gcd = calcGcd(gcd, A);
      max = Math.max(max, A);
    }
    System.out.println(K <= max && K%gcd == 0 ? "POSSIBLE" : "IMPOSSIBLE");
  }
  
  private static int calcGcd(int a, int b) {
    if (b == 0) return a;
    return calcGcd(b, a%b);
  }
}