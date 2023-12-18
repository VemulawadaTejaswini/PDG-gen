// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	int[] aa, pq, ip; int cnt;
	boolean lt(int i, int j) {
		return aa[i] < aa[j];
	}
	int p2(int p) {
		return (p *= 2) > cnt ? 0 : p < cnt && lt(ip[p + 1], ip[p]) ? p + 1 : p;
	}
	void pq_dn(int i) {
		int j, p, q;
		for (p = pq[i]; (q = p2(p)) > 0 && lt(j = ip[q], i); p = q)
			ip[pq[j] = p] = j;
		ip[pq[i] = p] = i;
	}
	void pq_add_last(int i) {
		ip[pq[i] = ++cnt] = i;
	}
	void solve(long[] pp, int n) {
		cnt = 0;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			pq_add_last(i);
			sum += aa[i];
		}
		for (int p = cnt / 2; p > 0; p--)
			pq_dn(ip[p]);
		for (int i = n; i < n * 2; i++) {
			pp[i - n] = sum;
			int d = aa[i] - aa[ip[1]];
			if (d > 0) {
				sum += d;
				pq[i] = 1; pq_dn(i);
			}
		}
		pp[n] = sum;
	}
	void main() {
		int n = sc.nextInt(), n2 = n * 2, n3 = n * 3;
		aa = new int[n3];
		for (int i = 0; i < n3; i++)
			aa[i] = sc.nextInt();
		pq = new int[n2]; ip = new int[n + 1];
		long[] pp = new long[n + 1];
		long[] qq = new long[n + 1];
		solve(pp, n);
		for (int i = 0; i < n3; i++)
			aa[i] = -aa[i];
		for (int i = 0, j = n3 - 1; i < j; i++, j--) {
			int tmp = aa[i]; aa[i] = aa[j]; aa[j] = tmp;
		}
		solve(qq, n);
		long ans = -0x3f3f3f3f3f3f3f3fL;
		for (int i = 0; i <= n; i++)
			ans = Math.max(ans, pp[i] + qq[n - i]);
		println(ans);
	}
}
