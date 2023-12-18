import java.util.Scanner;

public class Main {
  static int n;
  static int[] a;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    a = new int[n];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }

    int[] dp = new int[n + 1];
    dp[1] = a[0] / 2;
    for(int i = 2; i <= n; i++){
      int c = Math.min(a[i - 2], a[i - 1]);
      int max = (a[i - 2] - c) / 2 + (a[i - 1] - c) / 2;
      max += c;
      max = Math.max(max, dp[i - 1] + a[i - 1] / 2);
      dp[i] = max;
    }

    System.out.println(dp[n]);
  }
}