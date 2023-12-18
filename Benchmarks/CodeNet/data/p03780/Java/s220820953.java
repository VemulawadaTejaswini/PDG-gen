import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int a[] = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		
		int ans = 0;
		L: for (int i = 0; i < N; i++) {
			boolean dp[] = new boolean[K + 1];
			dp[0] = true;
			for (int j = 0; j < N; j++) {
				if (i == j) continue;
				boolean ndp[] = Arrays.copyOf(dp, K + 1);
				for (int k = 0; k <= K; k++) {
					if (dp[k] && k + a[j] <= K) {
						ndp[k + a[j]] = true;
					}
				}
				dp = ndp;
			}
			for (int j = Math.max(1, K - a[i]); j <K; j++) {
				if (dp[j]) {
					ans++;
					continue L;
				}
			}
		}
		
		System.out.println(N - ans);
	}
}
