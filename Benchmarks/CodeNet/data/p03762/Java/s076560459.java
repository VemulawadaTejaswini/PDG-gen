import java.util.*;

public class Main {
	static final long MOD = 1000000007;
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int prev = sc.nextInt();
		long nValue = 0;
		for (int i = 0; i < n - 1; i++) {
			int x = sc.nextInt();
			nValue += (x - prev) * calc(n - 1, i) % MOD;
			nValue %= MOD;
			prev = x;
		}
		prev = sc.nextInt();
		long mValue = 0;
		for (int i = 0; i < m - 1; i++) {
			int x = sc.nextInt();
			mValue += (x - prev) * calc(m - 1, i) % MOD;
			mValue %= MOD;
			prev = x;
		}
      System.out.println(nValue * mValue % MOD);
	}
	
	static long calc(int max, int idx) {
		idx = Math.min(idx, max - idx - 1);
		long ans = max;
		ans = (ans - idx) * (idx + 1);
		return ans;
	}
}
