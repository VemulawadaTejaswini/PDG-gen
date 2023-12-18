import java.util.Scanner;

public class Main {
  private static void solve(int n, long k, long[] a) {
    long[] sum = new long[n + 1];
    for (int i = 1; i <= n; i++) {
      sum[i] = sum[i - 1] + a[i - 1];
    }
    long count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n + 1; j++) {
        long subsum = sum[j] - sum[i];
        if (subsum % k == j - i) count++;
      }
    }
    System.out.println(count);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] nk = sc.nextLine().split(" ");
    int n = Integer.parseInt(nk[0]);
    long k = Long.parseLong(nk[1]);
    String[] as = sc.nextLine().split(" ");
    long[] a = new long[n];
    for (int i = 0; i < n; i++) {
      a[i] = Long.parseLong(as[i]);
    }
    sc.close();
    solve(n, k, a);
  }
}