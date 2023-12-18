import java.util.*;
import java.util.Map.Entry;



import java.io.*;

public class Main{
	static int mod;
	static long[] sta;
	static long[] oa;
	static long[] lazy;

	static void preprocess(long[] dp) {
		oa = dp;
		int ht = getlog(oa.length);
		int sl = (int) Math.pow(2, ht + 1) - 1;
		sta = new long[sl];
		lazy = new long[sl];
		build(0, 0, oa.length - 1);
	}

	static void build(int si, int ss, int se) {
		if (ss == se) {
			sta[si] = oa[ss];
			return;
		}
		int mid = (ss + se) / 2;
		build(2 * si + 1, ss, mid);
		build(2 * si + 2, mid + 1, se);
		sta[si] = operation(sta[2 * si + 1], sta[2 * si + 2]);
	}

	static void update(int idx, int val, int si, int ss, int se) {
		if (ss == idx && se == idx) {
			sta[si] = val;
			oa[idx] = val;
			return;
		}
		if (ss > se) {
			return;
		}
		int mid = (ss + se) / 2;
		if (idx <= mid) {
			update(idx, val, 2 * si + 1, ss, mid);
		} else {
			update(idx, val, 2 * si + 2, mid + 1, se);
		}
		sta[si] = operation(sta[2 * si + 1], sta[2 * si + 2]);

	}

	static long query(int qs, int qe, int si, int ss, int se) {
		handlingpedig(si, ss, se);
		if (ss >= qs && se <= qe) {
			return sta[si];
		} else if (se < qs || ss > qe) {
			return identity();
		} else {
			int mid = (ss + se) / 2;
			long lc = query(qs, qe, 2 * si + 1, ss, mid);
			long rc = query(qs, qe, 2 * si + 2, mid + 1, se);
			return operation(lc, rc);
		}
	}

	static void Update(int qs, int qe, long max, int si, int ss, int se) {
		handlingpedig(si, ss, se);

		if (ss >= qs && se <= qe) {
			lazy[si] = max;
			handlingpedig(si, ss, se);
			return;
		} else if (se < qs || ss > qe) {
			return;
		} else {
			int mid = (ss + se) / 2;
			Update(qs, qe, max, 2 * si + 1, ss, mid);
			Update(qs, qe, max, 2 * si + 2, mid + 1, se);
			sta[si] = operation(sta[2 * si + 1], sta[2 * si + 2]);
		}
	}

	static void handlingpedig(int si, int ss, int se) {
		sta[si] += lazy[si];
		if (ss != se) {
			lazy[2 * si + 1] += lazy[si];
			lazy[2 * si + 2] += lazy[si];
		}

		lazy[si] = 0;
	}

	static int getlog(int n) {
		int log = 0;
		while ((1 << log) < n) {
			log++;
		}
		return log;
	}

	static int identity() {
		// return 0;// sum
		// return Integer.MAX_VALUE;//min
		return Integer.MIN_VALUE;// max
	}

	static long operation(long ls, long rs) {
		// return ls + rs;
		return Math.max(ls, rs);// max
		// return Math.min(ls, rs);
	}

	public static class pair {
	long  sc;
		int l;
		int r;

		pair(int l, int r, long sc) {
			this.l = l;
			this.r = r;
			this.sc = sc;
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		pair p[] = new pair[m];
		ArrayList<Integer> g[] = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < m; i++) {
			int l = scn.nextInt() - 1;
			int r = scn.nextInt() - 1;
			long sc = scn.nextLong();
			p[i] = new pair(l, r, sc);
			g[r].add(i);
		}
		long dp[] = new long[n];
		preprocess(dp);
		long max = 0;
		for (int i = 0; i < n; i++) {
			max = query(0, (i > 0) ? (i - 1) : 0, 0, 0, dp.length - 1);
			Update(i, i, max, 0, 0,n-1);
			for (int j = 0; j < g[i].size(); j++) {
				Update(p[g[i].get(j)].l, p[g[i].get(j)].r, p[g[i].get(j)].sc, 0, 0, dp.length - 1);
			}
		}
		System.out.println(query(0, n-1, 0, 0, n-1)>0?query(0, n-1, 0, 0, n-1):0);

	}

}