import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int INF = Integer.MAX_VALUE/2;
		int H = sc.nextInt();
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		int[] dp = new int[20000];
		int ans = INF;
		Arrays.fill(dp, INF);
		dp[0] = 0;
		for(int i = 0; i < N; i++)
			for(int j = A[i]; j < 20000; j++)
				dp[j] = Math.min(dp[j], dp[j-A[i]] + B[i]);
		for(int i = H; i < 20000; i++)
			ans = Math.min(ans, dp[i]);
		System.out.println(ans);
	}

}