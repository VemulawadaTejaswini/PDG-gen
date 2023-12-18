import java.util.*;
public class Main {

	static long mod = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i <= 2000; i++) Arrays.fill(dp[i], -1);
		for(int i = 0; i <= 2000; i++){
			for(int j = 0; j <= 2000; j++){
				calc(i,j);
			}
		}
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a = k, b = n-k;
		for(int i = 1; i <= k; i++){
			long x = (calc(b, i+1) * calc(a, i)) % mod;
			long y = i > 1?(calc(b, i-1) * calc(a, i)) % mod : 0;
			long z = (2 * calc(b, i) * calc(a, i)) % mod;
			System.out.println(((x + y) % mod + z) % mod);
		}
	}
	static long[][] dp = new long[2001][2001];
	static long calc(int m, int k){//m balls in k spaces
		if(dp[m][k] >= 0) return dp[m][k];
		if(k <= 1 || m == 0) return dp[m][k] = 1;
		else if(m < k) return dp[m][k] = 0;
		else{
			return dp[m][k] = (calc(m-1, k-1) + calc(m-1, k)) % mod;
		}
	}
}
