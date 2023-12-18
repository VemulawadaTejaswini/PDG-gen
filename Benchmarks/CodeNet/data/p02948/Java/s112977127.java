import java.util.Scanner;

public class Main {
  static int ans;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    int[] dp = new int[M + 1];
    boolean[] isUsed = new boolean[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      B[i] = sc.nextInt();
    }

    dfs(0, isUsed, 0, A, B, M);

    System.out.println(ans);
  }

  static void dfs(int today, boolean[] isUsed, int cur, int[] A, int[] B, int M) {
    if (today == M) {
      return;
    }
    for (int i = 0; i < isUsed.length; ++i) {
      if (!isUsed[i]
              && today + A[i] <= M
              && cur + B[i] > ans) {
        isUsed[i] = true;
        ans = cur + B[i];
        dfs(today + 1, isUsed, ans, A, B, M);
        isUsed[i] = false;
      }
    }
  }
}