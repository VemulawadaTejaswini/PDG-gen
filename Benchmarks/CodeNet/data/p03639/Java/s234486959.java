import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	class SegTree {
		int n;
		int[] v;

		public SegTree(int n) {
			this.n = 1;
			while (this.n < n)
				this.n = 2 * this.n;
			v = new int[2 * this.n - 1];
			Arrays.fill(v, Integer.MAX_VALUE / 3);
		}

		void put(int val, int k) {
			k += n - 1;
			v[k] = val;
			while (k > 0) {
				k = (k - 1) / 2;
				v[k] = Math.min(v[2 * k + 1], v[2 * k + 2]);
			}
		}

		int query(int a, int b) {
			return query(0, n, a, b, 0);
		}

		int query(int l, int r, int a, int b, int k) {
			if (a <= l && r <= b)
				return v[k];
			else if (r <= a || b <= l)
				return Integer.MAX_VALUE / 3;
			else {
				int lv = query(l, (l + r) / 2, a, b, 2 * k + 1);
				int rv = query((l + r) / 2, r, a, b, 2 * k + 2);
				return Math.min(lv, rv);
			}
		}

	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N];
		int[] pos = new int[N];
		SegTree even = new SegTree(N);
		SegTree odd = new SegTree(N);
		for (int i = 0; i < N; ++i) {
			P[i] = sc.nextInt();
			--P[i];
			pos[P[i]] = i;
			if (i % 2 == 0) {
				even.put(P[i], i);
			} else {
				odd.put(P[i], i);
			}
		}
		ArrayDeque<Long> ret = calc(N, P, pos, even, odd, 0, N);
		long[] ans = new long[2 * ret.size()];
		int p = 0;
		for (long v : ret) {
			ans[p++] = 1 + (v >> 32);
			ans[p++] = 1 + (int) v;
		}
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < N; ++i) {
			pw.print(ans[i] + (i == N - 1 ? "\n" : " "));
		}
		pw.close();
	}

	ArrayDeque<Long> calc(int N, int[] P, int[] pos, SegTree even, SegTree odd, int l, int r) {
//		while (r > 0 && even.v[r - 1] == Integer.MAX_VALUE / 3 && odd.v[r - 1] == Integer.MAX_VALUE / 3)
//			--r;
//		while (l + 1 < N && even.v[l] == Integer.MAX_VALUE / 3 && odd.v[l] == Integer.MAX_VALUE / 3)
//			++l;

		ArrayDeque<Long> ret = new ArrayDeque<>();
		if (r - l < 2) {
			ret.add(Long.MAX_VALUE / 3);
			return ret;
		}
		int first = (l % 2 == 0 ? even.query(l, r - 1) : odd.query(l, r - 1));
		if (first == Integer.MAX_VALUE / 3) {
			ret.add(Long.MAX_VALUE / 3);
			return ret;
		}
		even.put(Integer.MAX_VALUE / 3, pos[first]);
		odd.put(Integer.MAX_VALUE / 3, pos[first]);
		int second = Integer.MAX_VALUE / 3;
		if (pos[first] % 2 == 0) {
			second = odd.query(pos[first] + 1, r);
		} else {
			second = even.query(pos[first] + 1, r);
		}
		ret.addFirst(((long) first) << 32 | second);
		even.put(Integer.MAX_VALUE / 3, pos[second]);
		odd.put(Integer.MAX_VALUE / 3, pos[second]);
		ArrayDeque<Long> middle = calc(N, P, pos, even, odd, pos[first] + 1, pos[second]);
		ArrayDeque<Long> left = calc(N, P, pos, even, odd, l, pos[first]);
		ArrayDeque<Long> right = calc(N, P, pos, even, odd, pos[second], r);
		while (middle.peek() != Long.MAX_VALUE / 3 || left.peek() != Long.MAX_VALUE / 3
				|| right.peek() != Long.MAX_VALUE / 3) {
			if (middle.getFirst() < left.getFirst() && middle.getFirst() < right.getFirst()) {
				ret.addLast(middle.pollFirst());
			} else if (left.getFirst() < middle.getFirst() && left.getFirst() < right.getFirst()) {
				ret.addLast(left.pollFirst());
			} else if (right.getFirst() < left.getFirst() && right.getFirst() < middle.getFirst()) {
				ret.addLast(right.pollFirst());
			}
		}
		if (ret.peekLast() != Long.MAX_VALUE / 3)
			ret.addLast(Long.MAX_VALUE / 3);
		return ret;
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}