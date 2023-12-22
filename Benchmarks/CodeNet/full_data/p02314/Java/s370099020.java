import java.util.*;

public class Main {
	static int goal;

	static ArrayList<Integer> list = new ArrayList<>();
	static int[] cache;

	// static int[] result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		goal = sc.nextInt();
		// result = new int[goal + 1];
		// Arrays.fill(result, -1);
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			list.add(sc.nextInt());
		}
		cache = new int[goal + 1];
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(compute(goal));

	}

	public static int compute(int value) {
		if (cache[value] != 0) {
			return cache[value];
		}
		HashSet<Integer> set = new HashSet<Integer>();
		for (int e : list) {
			if (e == value) {
				cache[value] = 1;
				return 1;
			}
			if (e < value) {
				int coins = 1;
				coins += compute(value - e);
				set.add(coins);

			}
		}
		int result = Integer.MAX_VALUE;
		for (int e : set) {
			if (e < result) {
				result = e;
			}
		}
		cache[value] = result;
		return result;

	}

}