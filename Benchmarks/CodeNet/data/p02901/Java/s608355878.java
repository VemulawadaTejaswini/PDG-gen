import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		Key[] arr = new Key[m];
		for (int i = 0; i < arr.length; i++) {
			Key k = new Key();
			sa = br.readLine().split(" ");
			k.a = Integer.parseInt(sa[0]);
			k.b = Integer.parseInt(sa[1]);
			sa = br.readLine().split(" ");
			for (int j = 0; j < sa.length; j++) {
				k.c.add(Integer.parseInt(sa[j]));
			}
			k.d = (double) k.a / k.b;
			arr[i] = k;
		}
		br.close();

		Arrays.parallelSort(arr, (k1, k2) -> {
			if (k1.d == k2.d) {
				return 0;
			} else if (k1.d > k2.d) {
				return 1;
			}
			return -1;
		});

		Set<Integer> set = new HashSet<>();
		long ans = 0;
		for (int i = 0; i < arr.length; i++) {
			if (set.addAll(arr[i].c)) {
				ans += arr[i].a;
			}
			if (set.size() >= n) {
				break;
			}
		}
		if (set.size() >= n) {
			System.out.println(ans);
		} else {
			System.out.println(-1);
		}
	}

	static class Key {
		int a, b;
		Set<Integer> c = new HashSet<>();
		double d;
	}
}
