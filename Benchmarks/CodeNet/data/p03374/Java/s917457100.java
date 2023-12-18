import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    long c = scanner.nextLong();
    long[] x = new long[n + 1];
    long[] v = new long[n + 1];
    for (int i = 0; i < n; i++) {
      x[i + 1] = scanner.nextLong();
      v[i + 1] = scanner.nextLong();
    }
    System.out.println(solve(n + 1, c, x, v));
  }

  private static long solve(int n, long c, long[] x, long[] v) {
    long res = 0;
    long sumLeft = 0, sumRight = 0;
    for (int a = n; a > 0; a--) {
      if (a < n) {
        sumLeft += v[a];
      }
      sumRight = 0;
      for (int b = 0; b < a; b++) {
        sumRight += v[b];
        long r = sumLeft + sumRight - (a == n ? x[b] : (x[b] * 2 + c - x[a]));
        if (r > res) res = r;
      }
    }
    sumRight = 0;
    for (int b = 0; b < n; b++) {
      sumRight += v[b];
      sumLeft = 0;
      for (int i = n; b < i; i--) {
        int a = i;
        if (a >= n) a -= n;
        sumLeft += v[a];
        long r = sumLeft + sumRight - (b == 0 ? (c - x[a]) : ((c - x[a]) * 2 + x[b]));
        if (r > res) res = r;
      }
    }

    return res;
  }
}
