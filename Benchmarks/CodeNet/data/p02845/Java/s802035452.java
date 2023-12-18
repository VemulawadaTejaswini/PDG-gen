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
		int num[] = new int[n];
		a = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for(int i = 0; i < n; i++) {
			if(a[i] != 0) {
				int m = num[a[i] - 1] - num[a[i]];
				for(int k = 1; k < m; i++) {
					ans = (ans + ans) % MOD;
				}
			}
			num[a[i]] ++;
		}
		for(int i = 1; i < 6; i++) {
			ans = (ans + ans) % MOD;
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
