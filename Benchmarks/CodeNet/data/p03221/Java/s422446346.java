import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	private void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int M = sc.nextInt();

		int[] prefs = new int[M];
		int[] ys = new int[M];
		Map<Integer, Integer> order = new HashMap<>();

		Map<Integer, List<Integer>> prefCity = new HashMap<>();
		for (int i = 0; i < M; i++) {
			prefs[i] = sc.nextInt();
			ys[i] = sc.nextInt();
			if (!prefCity.containsKey(prefs[i])) {
				prefCity.put(prefs[i], new ArrayList<Integer>());
			}
			prefCity.get(prefs[i]).add(ys[i]);
		}

		for (List<Integer> l : prefCity.values()) {
			Collections.sort(l);
			int ord = 1;
			for (Integer i : l) {
				order.put(i, ord++);
			}
		}

		for (int i = 0; i < M; i++) {
			int o = order.get(ys[i]);
			String cityNumber = String.format("%06d", prefs[i]) + String.format("%06d", o);
			System.out.println(cityNumber);
		}
		sc.close();
	}

}
