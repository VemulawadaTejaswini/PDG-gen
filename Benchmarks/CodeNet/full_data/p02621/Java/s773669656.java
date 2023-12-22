import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int N, M, K, cnt, sum, i, j;
    sum = 0;
    cnt = 0;
    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();
    M = sc.nextInt();
    K = sc.nextInt();

    int[] A = new int[N];
    for (i = 0; i < N; i++)
      A[i] = sc.nextInt();
    int[] B = new int[M];
    for (i = 0; i < M; i++)
      B[i] = sc.nextInt();

    for (j = 0; sum <= K; j++) {
      for (i = 0; sum <= K; i++) {
        if (A[i] < B[j]) {
          sum += A[i];
          cnt++;
        } else {
          sum += B[j];
          cnt++;
        }
      }
    }
    System.out.print(cnt);
  }
}
