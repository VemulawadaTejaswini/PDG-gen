import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		char[] arr = s.toCharArray();
		sc.close();

		int ans = 0;
		int cnt1 = 0;
		int cnt0 = 0;
		int siji = 0;
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(-1);
		for (int i = 0; i < n; i++) {
			if (arr[i] == '1') {
				cnt0 = 0;
				if (cnt1 == 0) {
					if (siji > k) {
						set.pollFirst();
					}
					Integer idx = set.first();
					ans = Math.max(ans, i - idx);
					set.add(i);
				}
				cnt1++;
			} else {
				cnt1 = 0;
				if (cnt0 == 0) {
					siji++;
				}
				cnt0++;
			}
		}
		if (siji > k) {
			set.pollFirst();
		}
		Integer idx = Math.max(set.first(), 0);
		ans = Math.max(ans, n - idx);
		System.out.println(ans);
	}
}
