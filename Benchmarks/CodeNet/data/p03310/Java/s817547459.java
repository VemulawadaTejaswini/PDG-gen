import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long[] A = new long[N];
    long sum = 0;
    for (int i = 0; i < N; i++) {
      A[i] = scanner.nextInt();
      sum += A[i];
    }

    int j = 0, k = 2;
    long p = A[0], q = 0, r = A[1] + A[2], s = sum - A[0] - A[1] - A[2];
    long minMaxDiff = Long.MAX_VALUE;
    for (int i = 1; i < N - 2; i++) {
      q += A[i];
      long diffPQ = Math.abs(p - q);
      while (j < i && Math.abs(p + A[j + 1] - q + A[j + 1]) < diffPQ) {
        j++;
        p += A[j];
        q -= A[j];
        diffPQ = Math.abs(p - q);
      }

      r -= A[i];
      long diffRS = Math.abs(r - s);
      while (k < N - 1 && Math.abs(r + A[k + 1] - s + A[k + 1]) < diffRS) {
        k++;
        r += A[k];
        s -= A[k];
        diffRS = Math.abs(r - s);
      }

      long maxDiff = maxDiff(p, q, r, s);
      if (maxDiff < minMaxDiff) minMaxDiff = maxDiff;
    }

    System.out.println(minMaxDiff);
  }

  static long maxDiff(long p, long q, long r, long s) {
    if (p > q) return maxDiff(q, p, r, s);
    if (q > r) return maxDiff(p, r, q, s);
    if (r > s) return maxDiff(p, q, s, r);
    return s - p;
  }
}
