import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    int K = sc.nextInt();
    long[] A = new long[N];
    long[] sum = new long[N + 1];
    long[] sumPosi = new long[N + 1];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      sum[i + 1] = sum[i] + A[i];
      sumPosi[i + 1] = sumPosi[i] + Math.max(A[i], 0);
    }
    long ans = 0;
    for (int i = 0; i <= N - K; i++) {
      long s = sumPosi[N] - sumPosi[i + K] + sumPosi[i] + Math.max(sum[i + K] - sum[i], 0);
      ans = Math.max(ans, s);
    }
    System.out.println(ans);
  }

}
