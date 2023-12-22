import java.util.*;

/**
 * Deadlock
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N;
		N = sc.nextInt();

		Set<String> vs = new HashSet<>();
		Map<String, Set<String>> indeg = new HashMap<>();
		Map<String, Set<String>> outdeg = new HashMap<>();

		for (int i = 0; i < N; i++) {

			String u, d, rel;

			u = 'u' + sc.next();
			rel = sc.next();
			d = 'd' + sc.next();

			vs.add(u);
			vs.add(d);
			indeg.putIfAbsent(u, new HashSet<>());
			indeg.putIfAbsent(d, new HashSet<>());
			outdeg.putIfAbsent(u, new HashSet<>());
			outdeg.putIfAbsent(d, new HashSet<>());

			if (rel.equals("lock")) {
				indeg.get(u).add(d);
				outdeg.get(d).add(u);
			} else {
				indeg.get(d).add(u);
				outdeg.get(u).add(d);
			}
		}

		Queue<String> que = new ArrayDeque<>();

		for (String v : indeg.keySet()) {
			if (indeg.get(v).size() == 0) {
				que.offer(v);
			}
		}

		while (!que.isEmpty()) {
			String u = que.poll();
			for (String v : outdeg.get(u)) {
				indeg.get(v).remove(u);
				if (indeg.get(v).size() == 0) {
					que.offer(v);
				}
			}
			vs.remove(u);
		}

		System.out.println(vs.size() == 0 ? 0 : 1);
	}
}
