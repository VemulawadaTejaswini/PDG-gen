

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		int mod = 998244353;

		if(m == 1){
			if(k == n - 1){
				System.out.println(1);
				return;
			}
			else {
				System.out.println(0);
				return;
			}
		}

//		long dp[] = new long[k + 1];
//		dp[0] = m;
//
//		for(int i = 1; i < n; i++){
//			dp[0] *= m - 1;
//			dp[0] %= mod;
//		}
//
//		System.out.println(dp[0]);
//
//		for(int i = 1; i <= k; i++){
//			dp[i] = dp[i - 1];
//
//			dp[i] %= mod;
//
//			System.out.println(dp[i]);
//		}

		long result = 0;
		long baseColorNum[] = new long[n + 1];

		for(int i = 1; i <= n; i++){
			if(i == 1){
				baseColorNum[i] = m;
			}
			else {
				baseColorNum[i] = baseColorNum[i - 1]*(m - 1);
				baseColorNum[i] %= mod;
			}
//			System.out.println("i = "+i+" base = "+baseColorNum[i]);

			int remain = n - i;

			if(remain > k){
				continue;
			}

			long tmp = repeatablePow(i, remain, mod) * baseColorNum[i];
			tmp %= mod;

//			System.out.println("i = "+i+" tmp = "+tmp);

			result += tmp;
			result %= mod;

		}

		System.out.println(result);
//		long dp[] = new long[n];
//		dp[n - 1] = m;
//		for(int i = n - 2; i >= 0; i--){
//			dp[i] = dp[i + 1]*(m - 1);
//			dp[i] %= mod;
//			dp[i] = dp[i]*(n - 1);
//
//			dp[i] %= mod;
//		}
//
//		for(int i = 0; i <= k; i++){
//			System.out.print(dp[i] + " ");
//		}
//
//		System.out.println();

	}

	static long repeatablePow(int x, int n, int mod){
		if(n == 0){
			return 1;
		}
		long result = repeatablePow((int)((long)x*x%mod), n/2, mod);
		if(n % 2 == 1){
			result = result*x%mod;
		}
		return result;
	}

}
