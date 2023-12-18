import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		Set<Integer> s = new HashSet<>();

		List<Long>[] a = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			a[i] = new ArrayList<>();
		}

		for (int i = 0; i < n; i++) {
			int t = sc.nextInt() - 1;
			long d = sc.nextLong();
			s.add(t);
			a[t].add(d);
		}

		for (int i = 0; i < s.size(); i++) {
			Collections.sort(a[i], Comparator.reverseOrder());
		}

		Long[] x = new Long[n - s.size()];
		Long[] y = new Long[s.size()];

		int xi = 0;
		for (int i = 0; i < s.size(); i++) {
			y[i] = a[i].get(0);
			for (int j = 1; j < a[i].size(); j++) {
				x[xi++] = a[i].get(j);
			}
		}

		Arrays.sort(x, Comparator.reverseOrder());
		Arrays.sort(y, Comparator.reverseOrder());
		long answer = 0;

		for (int i = 1; i <= k; i++) {
			long t = 0;
			for (int j = 0; j < i; j++) {
				t += y[j];
			}
			t += i * i;
			for (int j = 0; j < k - i; j++) {
				t += x[j];
			}
			answer = Math.max(answer, t);
		}
		System.out.println(answer);
	}
}
