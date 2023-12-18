import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    long C = scanner.nextLong();
    long[] x = new long[N];
    long[] v = new long[N];
    for (int i = 0; i < N; i++) {
      x[i] = scanner.nextLong();
      v[i] = scanner.nextLong();
    }

    long sum = 0;
    long[] lmax1 = new long[N + 1];
    long[] lmax2 = new long[N + 1];
    for (int i = 1; i <= N; i++) {
      sum += v[i - 1];
      lmax1[i] = Math.max(lmax1[i - 1], sum - x[i - 1]);
      lmax2[i] = Math.max(lmax2[i - 1], sum - x[i - 1] * 2);
    }

    sum = 0;
    long[] rmax1 = new long[N + 1];
    long[] rmax2 = new long[N + 1];
    for (int i = 1; i <= N; i++) {
      sum += v[N - i];
      rmax1[i] = Math.max(rmax1[i - 1], sum - (C - x[N - i]));
      rmax2[i] = Math.max(rmax2[i - 1], sum - (C - x[N - i]) * 2);
    }

    long max = lmax1[N];
    max = Math.max(max, rmax1[N]);

    for (int i = 1; i <= N; i++) for (int j = 1; j < N - i; j++) max = Math.max(max, rmax2[i] + lmax1[j]);
    for (int i = 1; i <= N; i++) for (int j = 1; j < N - i; j++) max = Math.max(max, lmax2[i] + rmax1[j]);

    System.out.println(max);
  }
}
