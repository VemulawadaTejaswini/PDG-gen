import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] a = br.readLine().toCharArray();
		char[] b = br.readLine().toCharArray();
		char[] c = br.readLine().toCharArray();
		br.close();

		List<Integer> ab = matchIdx(a, b);
		List<Integer> ac = matchIdx(a, c);
		List<Integer> ba = matchIdx(b, a);
		List<Integer> bc = matchIdx(b, c);
		List<Integer> ca = matchIdx(c, a);
		List<Integer> cb = matchIdx(c, b);
		int ans = 10000;
		ans = Math.min(ans, calc(a, b, c, ab, ac, bc));
		ans = Math.min(ans, calc(a, c, b, ac, ab, cb));
		ans = Math.min(ans, calc(b, a, c, ba, bc, ac));
		ans = Math.min(ans, calc(b, c, a, bc, ba, ca));
		ans = Math.min(ans, calc(c, a, b, ca, cb, ab));
		ans = Math.min(ans, calc(c, b, a, cb, ca, ba));
		System.out.println(ans);
	}

	static int calc(char[] a, char[] b, char[] c,
			List<Integer> ab, List<Integer> ac, List<Integer> bc) {
		int ans = 10000;
		if (!bc.isEmpty()) {
			int val = a.length + Math.max(b.length, bc.get(0) + c.length);
			ans = Math.min(ans, val);
		}
		for (int i : ab) {
			int maxab = Math.max(a.length, i + b.length);
			int val = maxab + c.length;
			ans = Math.min(ans, val);
			for (int j : bc) {
				if (i + j >= a.length || ac.contains(i + j)) {
					val = Math.max(maxab, i + j + c.length);
					ans = Math.min(ans, val);
				}
			}
			int idx = Collections.binarySearch(ac, i + b.length);
			if (idx < 0) idx = ~idx;
			if (idx < ac.size()) {
				val = Math.max(a.length, ac.get(idx) + c.length);
				ans = Math.min(ans, val);
			}
		}
		return ans;
	}

	static List<Integer> matchIdx(char[] a, char[] b) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			boolean flg = true;
			for (int j = 0; j < b.length && i + j < a.length; j++) {
				if (a[i + j] != b[j] && b[j] != '?' && a[i + j] != '?') {
					flg = false;
					break;
				}
			}
			if (flg) list.add(i);
		}
		return list;
	}
}
