import java.util.*;
import java.lang.*;

public class Main {
	static long mod = 1000000007;
	static long out = 0;
	static int n;
	static long x;
	static long[] kai;
	static long[] s;
	static boolean[] used;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		x = sc.nextLong();
		s = new long[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextLong();
		}
		Arrays.sort(s);
		kai = new long[n + 1];
		kai[0] = 1;
		for (int i = 1; i <= n; i++) {
			kai[i] = kai[i - 1] * i;
		}
		for (int i = 0; i < n; i++) {
			used = new boolean[n];
			used[i] = true;
			dfs(x % s[i], 1);
		}
		System.out.println(out);
	}
	static void dfs(long nowx, int count) {
		if (nowx <= s[0]) {
			out += (nowx % s[0]) * kai[n - count];
			out %= mod;
			return;
		}
		for (int i = 0; i < n; i++) {
			if (!used[i]) {
				used[i] = true;
				dfs(nowx % s[i],count + 1);
				used[i] = false;
			}
		}
	}
}