import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int K[] = new int[N];
    int A[][] = new int[N][M];
    for (int i = 0; i < N; i++) {
      K[i] = sc.nextInt();
      for (int j = 0; j < K[i]; j++) {
        A[i][j] = sc.nextInt();
      }
    }
    int ans = 0;
    if (N == 1) {
      System.out.println(K[0]);
      return;
    }
    for (int j = 0; j < A[0].length; j++) {
      int tmp = A[0][j];
      int count = 0;
      for (int i = 1; i < N; i++) {
        for (int k = 0; k < K[i]; k++) {
          if (A[i][k] == 0) {
            break;
          }
          if (tmp == A[i][k]) {
            count++;
            break;
          }
        }
      }
      if (count == N - 1) {
        ans++;
      }
    }
    System.out.println(ans);
  }
}