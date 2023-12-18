import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine()) - k;
		}
		br.close();

		TreeMap<Long, Integer> map = new TreeMap<>();
		map.put(a[0], 0);
		for (int i = 1; i < n; i++) {
			a[i] += a[i - 1];
			map.put(a[i], 0);
		}

		Long[] arr = map.keySet().toArray(new Long[0]);
		int cnt = 0;
		for (Long i : arr) {
			cnt++;
			map.put(i, cnt);
		}
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = map.get(a[i]);
		}

		long ans = 0;
		BIT bit = new BIT(map.size());
		for (int i = 0; i < n; i++) {
			ans += bit.sum(b[i]);
			if (a[i] >= 0) {
				ans++;
			}
			bit.add(b[i], 1);
		}
		System.out.println(ans);
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
