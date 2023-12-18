import java.util.*;

public class Main {
  private static final int[] mnum = { 0, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] A = new int[M];
    for (int i = 0; i < M; i++) {
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);
    
    int[] dp = new int[N+1];
    for (int i = 1; i <= N; i++) {
      for (int j = 0; j < M; j++) {
        if (i - mnum[A[j]] >= 0) {
          dp[i] = Math.max(dp[i], dp[i-mnum[A[j]]]+1);
        }
      }
    }
    
    String ans = "";
    int remain = dp[N];
    int match = N;
    while (match > 0) {
      for (int j = M-1; j >= 0; j--) {
        if (match-mnum[A[j]] < 0) {
          continue;
        }
        if (remain == 1) {
          if (match-mnum[A[j]] == 0) {
            ans = ans + Integer.toString(A[j]);
            match -= mnum[A[j]];
            break;
          }
        } else {
          if (dp[match-mnum[A[j]]] == remain-1) {
            ans = ans + Integer.toString(A[j]);
            match -= mnum[A[j]];
            remain--;
            break;
          }
        }
      }
    }
    
    System.out.println(ans);
  }
}