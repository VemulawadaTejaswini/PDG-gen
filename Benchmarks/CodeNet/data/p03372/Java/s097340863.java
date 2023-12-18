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
    long[] lsum = new long[N];
    for (int i = 0; i < N; i++) {
      sum += v[i];
      lsum[i] = sum;
    }

    sum = 0;
    long[] rsum = new long[N];
    for (int i = N - 1; i >= 0; i--) {
      sum +=v[i];
      rsum[i] = sum;
    }

    long max = 0;
    for (int a = N - 1; a >= 0; a--) {
      long r = rsum[a] - (C - x[a]);
      if (r > max) max = r;
    }
    for (int b = 0; b < N; b++) {
      long r = lsum[b] - x[b];
      if (r > max) max = r;
    }
    for (int a = N - 1; a >= 0; a--) {
      long r1 = rsum[a] - (C - x[a]) * 2;
      for (int b = 0; b < a; b++) {
        long r2 = lsum[b] - x[b];
        if (r1 + r2 > max) max = r1 + r2;
      }
    }
    for (int b = 0; b < N; b++) {
      long r2 = lsum[b] - x[b] * 2;
      for (int a = N - 1; a > b; a--) {
        long r1 = rsum[a] - (C - x[a]);
        if (r1 + r2 > max) max = r1 + r2;
      }
    }
    System.out.println(max);
  }
}
