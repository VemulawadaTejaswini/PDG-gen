import java.util.Scanner;

public class Main {
  private static void solve(int n, int[] a, int[] b) {
    int[] sumA = new int[n + 1];
    int[] sumB = new int[n + 1];
    for (int i = 0; i < n; i++) {
      sumA[i + 1] = sumA[i] + a[i];
      sumB[i + 1] = sumB[i] + b[i];
    }
    int max = 0;
    for (int i = 1; i <= n; i++) {
      int sum = sumA[i] + sumB[n] - sumB[i - 1];
      max = Math.max(max, sum);
    }
    System.out.println(max);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String[] as = sc.nextLine().split(" ");
    String[] bs = sc.nextLine().split(" ");
    sc.close();
    int[] a = new int[n];
    int[] b = new int[n];
    for (int i = 0; i < n; i ++) a[i] = Integer.parseInt(as[i]);
    for (int i = 0; i < n; i ++) b[i] = Integer.parseInt(bs[i]);
    solve(n, a, b);
  }
}