import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    
    Arrays.sort(A);

    if (K > A[N-1]) {
      System.out.println("IMPOSSIBLE");
      return;
    }
    if (N == 1) {
      System.out.println(A[0] == K ? "POSSIBLE" : "IMPOSSIBLE");
      return;
    }
    int gcd = calcGcd(A[1], A[0]);
    boolean ans = false;
    for (int i = 0; i < N; i++) {
      if (A[i]%gcd != 0 || A[i] == K) {
        ans = true;
        break;
      }
    }
    System.out.println(ans ? "POSSIBLE" : "IMPOSSIBLE");
  }
  
  private static int calcGcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a%b);
  }
}