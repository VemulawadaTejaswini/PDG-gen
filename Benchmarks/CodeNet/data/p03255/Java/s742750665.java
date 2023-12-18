import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    long X = scanner.nextLong();
    int[] x = new int[N];
    for (int i = 0; i < N; i++) {
      x[i] = scanner.nextInt();
    }
    int left = 0;
    int right = N - 1;
    while (left < right) {
      int tmp = x[left];
      x[left] = x[right];
      x[right] = tmp;
      left++;
      right--;
    }
    long sum = 0;
    long[] cumx = new long[N + 1];
    for (int i = 0; i < N; i++) {
      sum += x[i];
      cumx[i + 1] = sum;
    }

    long min = Long.MAX_VALUE;
    for (int k = 1; k <= N; k++) {
      long e = compute(cumx, k, N);
      e += k * X;
      e += N * X;
      if (min > e) min = e;
    }
    System.out.println(min);
  }

  private static long compute(long[] cumx, int k, int N) {
    long e = 0;
    long co = 5;
    for (int i = 0; i < (N - 1) / k + 1; i++) {
      e += co * (cumx[Math.min(k * (i + 1), cumx.length - 1)] - cumx[k * i]);
      if (i > 0) co += 2;
    }
    return e;
  }
}
