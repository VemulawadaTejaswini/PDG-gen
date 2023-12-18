import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	static List<Integer> path;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		long h = Long.parseLong(sa[0]);
		long w = Long.parseLong(sa[1]);
		int n = Integer.parseInt(sa[2]);

		int[] a = new int[n];
		int[] b = new int[n];
		Map<Integer, Set<Integer>> map = new HashMap<Integer, Set<Integer>>();
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			a[i] = Integer.parseInt(sa[0]) - 1;
			b[i] = Integer.parseInt(sa[1]) - 1;
			Set<Integer> set = map.get(a[i]);
			if (set == null) {
				set = new HashSet<Integer>();
				map.put(a[i], set);
			}
			set.add(b[i]);
		}
		br.close();

		long[] ans = new long[10];
		for (int i = 0; i < n; i++) {
			for (int jx = -2; jx <= 0; jx++) {
				for (int jy = -2; jy <= 0; jy++) {
					int x = a[i] + jx;
					if (x < 0 || h - 3 < x) {
						continue;
					}
					int y = b[i] + jy;
					if (y < 0 || w - 3 < y) {
						continue;
					}

					int cnt = 0;
					for (int kx = 0; kx <= 2; kx++) {
						Set<Integer> set = map.get(x + kx);
						if (set != null) {
							for (int ky = 0; ky <= 2; ky++) {
								if (set.contains(y + ky)) {
									cnt++;
								}
							}
						}
					}
					ans[cnt]++;
				}
			}
		}

		for (int i = 2; i < 10; i++) {
			ans[i] /= i;
		}

		ans[0] = (h - 2) * (w - 2);
		for (int i = 1; i < 10; i++) {
			ans[0] -= ans[i];
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(ans[i]);
		}
	}
}
