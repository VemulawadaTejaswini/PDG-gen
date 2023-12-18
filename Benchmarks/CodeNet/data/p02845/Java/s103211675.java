import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	final int LEN = 0;

	int a[];
	
	void doIt() {
		int n = sc.nextInt();
		long ans = 1;
		int num[] = new int[n + 1];
		num[0] = 3;
		a = new int[n + 1];
		for(int i = 1; i <= n; i++)
			a[i] = sc.nextInt() + 1;
		for(int i = 1; i <= n; i++) {
			ans = (ans * (num[a[i] - 1] - num[a[i]])) % MOD;
			num[a[i]] ++;
		}
		System.out.println(ans % MOD);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
