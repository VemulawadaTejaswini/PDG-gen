import java.util.*;

public class Main {
	static int r = 998244353;

	public static long mypow(long a, long b) {
		if (a == 1 || b == 0)
			return 1;
		long ans = 1;
		for (int i = 0; i < b; ++i) {
			ans *= a;
			ans %= r;
		}
		return ans;
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long len[] = new long[n];
		for (int i = 0; i < n; ++i) {
			int tmp = sc.nextInt();
			len[tmp]++;
		}
		sc.close();
		long num = len[1];
		long pre = num;
		long ans = 0;
		if (len[0] != 0) {
			ans = 1;
			for (int i = 2; i < n; ++i) {
				pre = len[i];
				long tmp = mypow(num, pre);
				ans *= tmp;
				ans %= r;
				num = len[i];
			}
		}
		System.out.println(ans);
	}
}
