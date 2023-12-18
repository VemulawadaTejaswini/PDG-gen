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
	static long[] an;
	static long lastans;
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
		an = new long[100000];
		for (int i = 0; i < an.length; i++) {
			an[i] = -1;
		}
		for (int i = 0; i < n; i++) {
			used = new boolean[n];
			used[i] = true;
			dfs(x % s[i], 1);
		}
		System.out.println(out);
	}
	static void dfs(long nowx, int count) {
		if (an[(int)nowx] != -1) {
			out += an[(int)nowx];
			out %= mod;
			return;
		}
		if (nowx <= s[0]) {
			lastans = nowx % s[0];
			out += (nowx % s[0]) * kai[n - count];
			out %= mod;
			return;
		}
		int changed = 0;
		long prelas = 0;
		for (int i = 0; i < n; i++) {
			if (!used[i]) {
				used[i] = true;
				dfs(nowx % s[i],count + 1);
				used[i] = false;
				if (changed == 0) {
					prelas = lastans;
				}
				if (prelas != lastans) {
					changed = -1;
				}
			}
		}
		if (changed != -1) {
			an[(int)nowx] = lastans;
		}
	}
}