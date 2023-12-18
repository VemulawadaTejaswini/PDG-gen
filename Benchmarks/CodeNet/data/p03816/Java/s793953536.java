import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> m = new HashMap<>();
		Set<Integer> d = new HashSet<>();

		long answer = n;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (!m.containsKey(x)) {
				m.putIfAbsent(x, 1);
				continue;
			}

			int c = m.get(x);
			if (c == 1) {
				m.put(x, c + 1);
				d.add(x);
			} else {
				answer -= 2;
				m.put(x, c - 1);
				d.remove(x);
			}
		}

		answer -= d.size();
		if (d.size() % 2 == 1) answer -= 1;
		System.out.println(answer);
	}
}
