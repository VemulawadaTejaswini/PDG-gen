import java.util.Scanner;
import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = sc.nextInt();
    int[] dp = new int[N + 1];
    dp[1] = Math.abs(A[0] - A[1]);
    for (int i = 2; i <= N; i++) {
    	dp[i] = Math.min(dp[i - 1] + Math.abs(A[i - 1] - A[i - 2]), dp[i - 2] + Math.abs(A[i - 1] - A[i - 3]));
    }
    System.out.println(dp[N]);
  }
}