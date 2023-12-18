// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	long solve0(long l1, long r1, long l2, long r2) {
		long l = Math.max(l1, l2);
		long r = Math.min(r1, r2);
		if (l <= r) {
			long m = (l + r) / 2;
			return m * (l + r - m);
		}
		return l * r;
	}
	long solve1(long l1, long m1, long r1, long l2, long r2) {
		long p = m1 - l1;
		long q = r1 - m1;
		long sp = p == 0 ? 0 : solve0(l1, l1 + p - 1, r2 - p + 1, r2);
		long sq = q == 0 ? 0 : solve0(r1 - q + 1, r1, l2, l2 + q - 1);
		return Math.max(sp, sq);
	}
	long solve2(long l1, long m1, long r1, long l2, long m2, long r2) {
		if (l1 == m1)
			return solve1(l2, m2, r2, l1 + 1, r1);
		if (m1 == r1)
			return solve1(l2, m2, r2, l1, r1 - 1);
		if (l2 == m2)
			return solve1(l1, m1, r1, l2 + 1, r2);
		if (m2 == r2)
			return solve1(l1, m1, r1, l2, r2 - 1);
		long p = Math.min(m1 - l1, r2 - m2);
		long q = Math.min(r1 - m1, m2 - l2);
		long sp = p == 0 ? 0 : solve0(l1, l1 + p - 1, r2 - p + 1, r2);
		long sq = q == 0 ? 0 : solve0(r1 - q + 1, r1, l2, l2 + q - 1);
		long so = solve2(l1 + p, m1, r1 - q, l2 + q, m2, r2 - p);
		return Math.max(so, Math.max(sp, sq));
	}
	long solve(long n, int a, int b) {
		if (n < a && n < b)
			return solve0(1, n, 1, n);
		if (n >= a && n >= b)
			return solve2(1, a, n + 1, 1, b, n + 1);
		return solve1(1, Math.min(a, b), n + 1, 1, n);
	}
	void main() {
		int q = sc.nextInt();
		while (q-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			long s = (long) a * b;
			long upper = 1;
			while (solve(upper, a, b) < s)
				upper *= 2;
			long lower = upper / 2;
			while (upper - lower > 1) {
				long n = (lower + upper) / 2;
				if (solve(n, a, b) < s)
					lower = n;
				else
					upper = n;
			}
			println(lower);
		}
	}
}
