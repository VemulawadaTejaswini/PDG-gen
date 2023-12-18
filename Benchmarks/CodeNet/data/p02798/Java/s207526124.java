import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Main {
	static int ans = Integer.MAX_VALUE;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			Obj o = new Obj();
			o.i = i;
			o.a = Integer.parseInt(sa[i]);
			arr[i] = o;
		}
		sa = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i].b = Integer.parseInt(sa[i]);
		}
		br.close();

		combination(arr, n / 2, new LinkedHashSet<>(), null);
		if (ans == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
	}

	static void combination(Obj[] arr, int k, LinkedHashSet<Integer> set, Integer last) {
		if (set.size() == k) {
			List<Obj> list1 = new ArrayList<>();
			List<Obj> list2 = new ArrayList<>();
			for (Obj o : arr) {
				if (!set.contains(o.i)) {
					if (o.i % 2 == 0) {
						o.v = o.a;
					} else {
						o.v = o.b;
					}
					list1.add(o);
				} else {
					if (o.i % 2 == 0) {
						o.v = o.b;
					} else {
						o.v = o.a;
					}
					list2.add(o);
				}
			}
			Collections.sort(list1, (o1, o2) -> o1.v - o2.v);
			Collections.sort(list2, (o1, o2) -> o1.v - o2.v);
			int n = arr.length;
			int[] idx = new int[n];
			int x = 0;
			for (int i = 0; i < k; i++) {
				idx[x] = list1.get(i).i;
				x++;
				idx[x] = list2.get(i).i;
				x++;
			}
			if (n > k * 2) {
				idx[x] = list1.get(k).i;
			}
			for (int i = 1; i < n; i++) {
				if (arr[idx[i - 1]].v > arr[idx[i]].v) {
					return;
				}
			}

			for (int i = 0; i < n; i++) {
				idx[i]++;
			}
			BIT bit = new BIT(n);
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				cnt += i - bit.sum(idx[i]);
				bit.add(idx[i], 1);
			}
			ans = Math.min(ans, cnt);
			return;
		}

		int i = 0;
		if (last != null) {
			i = last + 1;
			if (set.size() + arr.length - i < k) {
				return;
			}
		}
		for ( ; i < arr.length; i++) {
			set.add(i);
			combination(arr, k, set, i);
			set.remove(i);
		}
	}

	static class Obj {
		int i, a, b, v;
	}

	static class BIT {
		int n;
		long[] arr;

		public BIT(int n) {
			this.n = n;
			arr = new long[n + 1];
		}

		void add(int idx, long val) {
			for (int i = idx; i <= n; i += i & -i) {
				arr[i] += val;
			}
		}

		long sum(int idx) {
			long sum = 0;
			for (int i = idx; i > 0; i -= i & -i) {
				sum += arr[i];
			}
			return sum;
		}
	}
}
