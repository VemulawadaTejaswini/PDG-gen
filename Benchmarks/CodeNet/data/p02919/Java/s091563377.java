import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] idx = new int[n];
		for (int i = 0; i < n; i++) {
			idx[sc.nextInt() - 1] = i;
		}

		long answer = 0;
		NavigableSet<Integer> s = new TreeSet<>();
		for (int i = n - 1; i >= 0; i--) {
			s.add(idx[i]);
			Integer l1 = s.lower(idx[i]);
			Integer r1 = s.higher(idx[i]);
			Integer r2 = r1 == null ? null : s.higher(r1);
			Integer l2 = l1 == null ? null : s.lower(l1);
			if (l1 == null && r1 == null) continue;

			int ll1 = idx[i] + 1, ll2 = 0, lr1 = n - idx[i], lr2 = 0;
			if (r1 != null) {
				lr1 = r1 - idx[i];
				lr2 = n - r1;
			}
			if (r2 != null) {
				lr2 = r2 - r1;
			}

			if (l1 != null) {
				ll1 = idx[i] - l1;
				ll2 = l1 + 1;
			}

			if (l2 != null) {
				ll2 = l1 - l2;
			}

			answer += ((long) ll1 * lr2 + ll2 * lr1) * (i + 1);

		}
		System.out.println(answer);
	}
}
