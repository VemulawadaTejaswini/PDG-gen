// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	static class V {
		int i, t;
		V(int i, int t) {
			this.i = i; this.t = t;
		}
	}
	int[] xx, pq, ip; int cnt;
	boolean lt(int i, int j) {
		return xx[i] < xx[j];
	}
	int p2(int p) {
		return (p *= 2) > cnt ? 0 : p < cnt && lt(ip[p + 1], ip[p]) ? p + 1 : p;
	}
	void pq_up(int i) {
		int j, p, q;
		for (p = pq[i]; (q = p / 2) > 0 && lt(i, j = ip[q]); p = q)
			ip[pq[j] = p] = j;
		ip[pq[i] = p] = i;
	}
	void pq_dn(int i) {
		int j, p, q;
		for (p = pq[i]; (q = p2(p)) > 0 && lt(j = ip[q], i); p = q)
			ip[pq[j] = p] = j;
		ip[pq[i] = p] = i;
	}
	void pq_add(int i) {
		pq[i] = ++cnt; pq_up(i);
	}
	void pq_remove(int i) {
		int j = ip[cnt--];
		if (j != i) {
			pq[j] = pq[i]; pq_up(j); pq_dn(j);
		}
		pq[i] = 0;
	}
	void main() {
		int n = sc.nextInt();
		int q = sc.nextInt();
		int m = n * 2 + q;
		V[] vv = new V[m];
		m = 0;
		int[] ll = new int[n];
		int[] rr = new int[n];
		xx = new int[n];
		for (int i = 0; i < n; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			int x = sc.nextInt();
			ll[i] = s - x;
			rr[i] = t - x;
			xx[i] = x;
			vv[m++] = new V(i, 0);
			vv[m++] = new V(i, 1);
		}
		int[] dd = new int[q];
		int[] yy = new int[q];
		for (int h = 0; h < q; h++) {
			dd[h] = sc.nextInt();
			vv[m++] = new V(h, 2);
		}
		Arrays.sort(vv, (u, v) -> {
			int ux = u.t == 2 ? dd[u.i] : u.t == 0 ? rr[u.i] : ll[u.i];
			int vx = v.t == 2 ? dd[v.i] : v.t == 0 ? rr[v.i] : ll[v.i];
			return ux != vx ? ux - vx : u.t - v.t;
		});
		pq = new int[n]; ip = new int[1 + n];
		for (int h = 0; h < m; h++) {
			V v = vv[h];
			if (v.t == 0)
				pq_remove(v.i);
			else if (v.t == 1)
				pq_add(v.i);
			else
				yy[v.i] = cnt > 0 ? xx[ip[1]] : -1;
		}
		for (int h = 0; h < q; h++)
			println(yy[h]);
	}
}
