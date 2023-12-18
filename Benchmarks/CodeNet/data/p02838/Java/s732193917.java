import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = 0;

	void doIt() {
		int n = sc.nextInt();
		long a[] = new long[n];
		int max = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		long ans = 0;
		for(int i = 0; i <= 60; i++) {
			int zero = 0, one = 0;
			for(int j = 0; j < n; j++) {
				if((a[j] >> i & 1) == 1)one++;
				else zero++;
				//System.out.println(one + " " + zero);
			}
			//System.out.println(one + " " + zero);
			long num = zero * one % MOD;
			//System.out.println(num);
			for(int j = 0; j < i; j++) {
				num = (num << 1) % MOD;
			}
			ans = (ans + num) % MOD;
		}
		System.out.println(ans % MOD);
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
