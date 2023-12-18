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
    
    boolean allSame = true;
    for (int i = 1; i < N; i++) {
      if (A[i] != A[i-1]) {
        allSame = false;
        break;
      }
    }
    if (allSame || N == 1) {
      System.out.println(A[0] == K ? "POSSIBLE" : "IMPOSSIBLE");
      return;
    }

    if (K > A[N-1]) {
      System.out.println("IMPOSSIBLE");
      return;
    }

    int gcd = calcGcd(A[1], A[0]);
    if (gcd == 1) {
      System.out.println("POSSIBLE");
      return;
    }
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
    return calcGcd(b, a%b);
  }
}