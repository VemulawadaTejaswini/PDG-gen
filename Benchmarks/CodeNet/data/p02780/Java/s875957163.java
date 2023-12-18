import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] p = new int[N];
    int sumK = 0;
    int max = -1, midx = -1;
    for (int i = 0; i < N; i++) {
      p[i] = sc.nextInt();
      sumK += p[i];
      if (i >= K) {
        sumK -= p[i - K];
      }
      if (i >= K - 1 && sumK > max) {
        max = sumK;
        midx = i;
      }
    }
    double ans = 0;
    double[] cache = build();
    for (int i = midx; i > midx - K; i--) {
      ans += cache[p[i]];
    }
    System.out.println(ans);
  }

  private static double[] build() {
    double[] c = new double[1001];
    double sum = 0;
    for (int i = 1; i <= 1000; i++) {
      sum += i;
      c[i] = sum / i;
    }
    return c;
  }
}
