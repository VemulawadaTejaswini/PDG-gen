import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	static int MOD = 1000000007;

	public static void main(String[] args) {
		exec_1_2();

	}

	public static void exec_1_2() {

		try(var sc = new Scanner(System.in)) {

			int mod = 998244353;

			int N = sc.nextInt();

			int K = sc.nextInt();

			List<Integer> s = new ArrayList<>();

			for(int i=0; i<K; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();

				for(int x=a;x<=b;x++) {
					s.add(x);
				}
			}

			long[] dp = new long[N+1];

			dp[0] = 0;
			dp[1] = 0;

			Collections.sort(s);

			for(int i=2; i<N+1;i++) {
				for(int x=0; x<s.size();x++) {
					if(s.get(x)>i) break;
					dp[i] += dp[i-s.get(x)]%mod;
					dp[i]%=mod;
					if(s.get(x)+1==i) dp[i]++;
					dp[i]%=mod;
				}
			}

			System.out.println(dp[N]);
		}
	}
}