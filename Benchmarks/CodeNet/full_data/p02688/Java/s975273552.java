import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[][] A = new int[K][K];
    int[] d = new int[K];
    for (int i = 0; i < K; i++) {
      d[i] = sc.nextInt();
      for (int j = 0; j < d[i]; j++)
        A[i][j] = sc.nextInt();
    }
    sc.close();

    int[] n = new int[N + 1];
    for (int i = 0; i < K; i++)
      for (int j = 0; j < d[i]; j++)
        n[A[i][j]]++;

    int ans = 0;
    for (int i = 1; i < N + 1; i++)
      if (n[i] == 0) ans++;
    System.out.println(ans);
  }
}
