import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static final long MOD = 1000000007;

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[] S = sc.next().toCharArray();
		for (int i = 0; i < N; ++i) {
			S[i] -= 'a';
		}
		final long A = 37;
		final long revA = pow(A, (int) MOD - 2);
		long hash = S[0];
		int r = 0;
		int l = 0;
		ArrayList<HashSet<Long>> sets = new ArrayList<HashSet<Long>>();
		for (int i = 0; i < N; ++i) {
			sets.add(null);
		}
		for (int i = 0; i < M; ++i) {
			String q = sc.next();
			if (q.charAt(0) == 'R') {
				if (q.charAt(1) == '+') {
					++r;
					hash *= A;
					hash += S[r];
					hash %= MOD;
				} else {
					hash += MOD - S[r];
					--r;
					hash *= revA;
					hash %= MOD;
				}
			} else {
				if (q.charAt(1) == '+') {
					hash += MOD - S[l] * pow(A, r - l);
					++l;
					hash %= MOD;
				} else {
					--l;
					hash += S[l] * pow(A, r - l);
					hash %= MOD;
				}
			}
			if (sets.get(r - l) == null) {
				sets.set(r - l, new HashSet<Long>());
			}
			sets.get(r - l).add(hash);
		}
		int ret = 0;
		for (HashSet<Long> set : sets) {
			if (set != null) {
				ret += set.size();
			}
		}
		System.out.println(ret);
	}

	static long pow(long base, int p) {
		if (p == 0) return 1;
		if (p == 1) return base;
		long ret = pow(base, p / 2);
		ret *= ret;
		ret %= MOD;
		if (p % 2 != 0) {
			ret *= base;
			ret %= MOD;
		}
		return ret;
	}

}