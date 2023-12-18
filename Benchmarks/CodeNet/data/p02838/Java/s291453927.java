import java.util.*;

public class Main {

	final static long r = 1000000000 + 7;
	final static int MAX = 60;

	public static long solve(long a[]) {
		long ans = 0, tmp = 0, tmp2 = 0, current = 1;
		int n = a.length;
		int bit[] = new int[MAX];
		for (int i = 0; i < MAX; ++i) {
			int cnt = 0;
			for (int j = 0; j < n; ++j) {
				long target = a[j];
				tmp = current & target;
				if (tmp == 0)
					++cnt;
			}
			bit[i] = cnt;
			current <<= 1;
		}
		current = 1;
		for (int i = 0; i < MAX; ++i) {
			tmp = bit[i];
			tmp = (n - tmp) * tmp;
			tmp %= r;
			tmp2 = current % r;
			current <<= 1;
			tmp = tmp * tmp2;
			tmp %= r;
			ans += tmp;
			ans %= r;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];
		for (int i = 0; i < n; ++i)
			a[i] = sc.nextLong();
		sc.close();
		long ans = solve(a);
		System.out.println(ans);
	}
}
