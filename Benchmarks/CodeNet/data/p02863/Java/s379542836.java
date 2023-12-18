import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		int best = 0;
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			best = Math.max(best, B[i]);
		}
		int ans = 0;
		int dp[] = new int[T + 1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		for(int i = 0 ; i < N ; ++i){
			int next[] = dp.clone();
			int a = A[i];
			int b = B[i];
			for(int j = 0 ; j < T ; ++j){
				if(dp[j] < 0){
					continue;
				}
				if(j + a >= T){
					ans = Math.max(ans, dp[j] + b);
				}else{
					next[j + a] = Math.max(next[j + a], dp[j] + b);
				}
			}
			dp = next;
		}
		for(int d : dp){
			ans = Math.max(ans, d);
		}
//		System.out.println(Arrays.toString(dp));
		System.out.println(ans);
	}
}
