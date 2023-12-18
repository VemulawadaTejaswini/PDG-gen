import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {
	static int n;
	static long half;
	static int[] a;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		half = (long) n * (n + 1) / 4;
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			set.add(a[i]);
		}
		Integer[] arr = set.toArray(new Integer[0]);

		int ok = -1;
		int ng = arr.length;
		while (Math.abs(ok - ng) > 1) {
			int mid = (ok + ng) / 2;
			if (judge(arr[mid])) {
				ok = mid;
			} else {
				ng = mid;
			}
		}
		System.out.println(arr[ok]);
	}

	static boolean judge(int med) {
		int[] b = new int[n + 1];
		for (int i = 0; i < n; i++) {
			if (a[i] >= med) {
				b[i + 1] = 1;
			} else {
				b[i + 1] = -1;
			}
		}
		for (int i = 1; i < b.length; i++) {
			b[i] += b[i - 1];
		}

		long t = tentousuu(b);
		return t <= half;
	}

	static long tentousuu(int[] a) {
		int n = a.length;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			min = Math.min(min, a[i]);
			max = Math.max(max, a[i]);
		}
		min--;
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = a[i] - min;
		}

		BIT bit = new BIT(max - min);
		long ret = 0;
		for (int i = 0; i < n; i++) {
			ret += i - bit.sum(b[i]);
			bit.add(b[i], 1);
		}
		return ret;
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
