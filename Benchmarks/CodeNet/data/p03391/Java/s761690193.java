import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static int N;
  static final long INF = 1L << 60;

  public static void main(String[] args) {
    N = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    long a = INF;
    long sum = 0;
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      B[i] = sc.nextInt();
      if (A[i] > B[i]) {
        a = Math.min(a, B[i]);
      }
      sum += A[i];
    }
    System.out.println(a == INF ? 0 : sum - a);
  }
}
