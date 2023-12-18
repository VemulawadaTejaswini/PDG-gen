import java.util.*;
public class Main {
	public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int[] A = new int[N];
      	for (int i = 0; i < N; i++) A[i] = sc.nextInt();
      	int[] dp = new int[N];
      	Arrays.fill(dp,Integer.MAX_VALUE);
      	dp[0] = 0;
      	for (int i = 1; i < N; i++) {
			for (int j = 1; j <= i; j++) {
              	dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(A[i] - A[i - j]));
            }
        }
      	System.out.println(dp[N - 1]);
    }
}