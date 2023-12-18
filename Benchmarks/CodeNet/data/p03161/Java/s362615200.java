import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] h = new int[N];
		for(int i = 0; i < N; i++)
			h[i] = sc.nextInt();
		int[] dp = new int[N];
		Arrays.fill(dp, 1000000);
		dp[0] = 0;
		dp[1] = Math.abs(h[1]-h[0]);
		for(int i = 2; i <= K && i < N; i++)
			for(int j = 1; j <= i; j++)
				if(dp[i] > dp[i-j]+Math.abs(h[i]-h[i-j]))
					dp[i] = dp[i-j]+Math.abs(h[i]-h[i-j]);
		for(int i = K+1; i < N; i++)
			for(int j = 1; j <= K; j++)
				if(dp[i] > dp[i-j]+Math.abs(h[i]-h[i-j]))
					dp[i] = dp[i-j]+Math.abs(h[i]-h[i-j]);
		System.out.println(dp[N-1]);

	}

}
