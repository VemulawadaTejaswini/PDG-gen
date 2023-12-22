import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] l = new int[k];
		int[] r = new int[k];
		for (int i = 0; i < k; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		
		long[] dp = new long[n + 1];
		long[] dpSum = new long[n + 1];
		dp[1] = 1;
		dpSum[1] = 1;
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < k; j++) {
				int li = i - r[j];
				int ri = i - l[j];
				if (ri < 0) continue;
				li = Math.max(li, 1);
				
				dp[i] = modAdd(dp[i], modSub(dpSum[ri], dpSum[li - 1]));
			}
			
			dpSum[i] = modAdd(dpSum[i - 1], dp[i]);
		}
		
		System.out.println(dp[n]);
//		System.out.println(Arrays.toString(dp));
//		System.out.println(Arrays.toString(dpSum));
		sc.close();
	}
	
	static long mod = 998244353;
	static long modAdd(long a, long b) {
		return (a % mod + b % mod) % mod;
	}
	
	static long modSub(long a, long b) {
		return (a - b) % mod;
	}
}

