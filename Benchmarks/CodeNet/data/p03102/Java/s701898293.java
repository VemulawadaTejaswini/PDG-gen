import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int C = sc.nextInt();
    int B[] = new int[M];
    for (int i = 0; i < M; i++) {
      B[i] = sc.nextInt();
    }
    int A[][] = new int[N][M];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        A[i][j] = sc.nextInt();
      }
    }

    int ans = 0;
    int sum = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        sum += B[j] * A[i][j];
      }
      sum += C;
      if (sum > 0) {
        ans++;
      }
    }
    System.out.println(ans);
  }
}