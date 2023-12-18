import java.util.Scanner;

public class Main {
  private static void solve(int n, int[] b) {
    long sum = 0;
    int min = Integer.MAX_VALUE;
    for (int i = n - 2; i >= 0; i--) {
      min = Math.min(b[i], min);
      sum += min;
    }
    sum += min;
    System.out.println(sum);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String[] bs = sc.nextLine().split(" ");
    int[] b = new int[n - 1];
    for (int i = 0; i < n - 1; i++) b[i] = Integer.parseInt(bs[i]);
    sc.close();
    solve(n, b);
  }
}
