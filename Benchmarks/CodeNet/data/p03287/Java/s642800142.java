import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong();

		long[] a = new long[n + 1];
		for (int i = 0; i < n; i++) {
			a[i + 1] = sc.nextLong() % m;
		}

		Map<Long, List<Integer>> h = new HashMap<>();
		h.putIfAbsent(0L, new ArrayList<>());
		h.get(0L).add(0);

		long answer = 0;
		for (int i = 1; i <= n; i++) {
			a[i] = (a[i] + a[i - 1]) % m;
			answer += h.getOrDefault(a[i], new ArrayList<>()).size();
			h.putIfAbsent(a[i], new ArrayList<>());
			h.get(a[i]).add(i);
		}

		System.out.println(answer);
	}
}
