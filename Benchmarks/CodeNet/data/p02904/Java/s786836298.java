import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < k; i++) {
			set.add(p[i]);
		}

		int ans = 1;
		for (int i = k; i < n; i++) {
			set.add(p[i]);
			if (set.first() != p[i - k] || set.last() != p[i]) {
				ans++;
			}
			set.remove(p[i - k]);
		}

		int overK = 0;
		int cnt = 1;
		for (int i = 1; i < n; i++) {
			if (p[i - 1] < p[i]) {
				cnt++;
				if (cnt == k) {
					overK++;
				}
			} else {
				cnt = 1;
			}
		}
		System.out.println(ans - Math.max(overK - 1, 0));
	}
}
