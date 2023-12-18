import java.util.*;

public class Main {
  private static final int MOD = 1_000_000_007;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    // inside A
    int a = 0;
    for (int i = 0; i < N-1; i++) {
      for (int j = i+1; j < N; j++) {
        if (A[i] > A[j]) {
          a++;
        }
      }
    }
    
    Arrays.sort(A);
    int sumP = 0;
    for (int i = N-1; i >= 1; i--) {
      for (int j = i-1; j >= 0; j--) {
        if (A[i] > A[j]) {
          sumP++;
        }
      }
    }
    
    long ans = (((long)a*K)%MOD + (((long)K*(K-1)/2%MOD)*sumP)%MOD)%MOD;
    
    System.out.println(ans);
  }
}