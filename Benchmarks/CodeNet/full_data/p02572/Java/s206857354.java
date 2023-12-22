import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		long buf = 1000000000 + 7;
		long ans = 0;
		double[] dp = new double[N-2];
		A[0] = sc.nextLong();
		for(int i = 1;i < N;i++){
			A[i] = sc.nextLong();
			ans += (A[0] * A[i]) % buf;
			if(i != 1){
				dp[0] += (A[0] * A[i]) % buf;
			}
		}
		dp[0] %= buf;
		ans %= buf;
		for(int i = 1;i < N - 2;i++){
			dp[i] = dp[i-1] * (A[i] / A[i-1]);
			ans += (long)dp[i] % buf;
		}
		ans += (A[N-2] * A[N-1]) % buf;
		ans %= buf;
		System.out.println(ans);
	}
}