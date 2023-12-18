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
				ans = ans * (num[a[i] - 1] - num[a[i]]);
			}
			num[a[i]] ++;
		}
		System.out.println(ans  * 6 %MOD);
	}
	
	long dfs(int _num[], int dps, int n) {
		if(dps == n) return 1L;
		int num[] = _num.clone();
		long ans = 0;
		for(int i = 0; i < 3; i++) {
			if(num[i] == a[dps]) {
				num[i]++;
				ans = (ans + dfs(num, dps + 1, n)) % MOD;
				num = _num.clone();
			}
		}
		System.out.println(dps +" "+ ans);
		return ans;
	}

	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
