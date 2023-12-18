import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		int max = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (map.containsKey(x)) {
				map.put(x, map.get(x) + 1);
			} else {
				map.put(x, 1);
			}
			max = Math.max(max, x);
		}
		boolean flag = true;
		if (max % 2 == 0) {
			for (int i = max; i > max / 2; i--) {
				if (!map.containsKey(i) || map.get(i) < 2) {
					flag = false;
					break;
				}
			}
			if (!map.containsKey(max / 2) || map.get(max / 2) != 1) {
				flag = false;
			}
		} else {
			for (int i = max; i > max / 2 + 1; i--) {
				if (!map.containsKey(i) || map.get(i) < 2) {
					flag = false;
					break;
				}
			}
			if (!map.containsKey(max / 2 + 1) || map.get(max / 2 + 1) != 2) {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("Possible");
		} else {
			System.out.println("Impossible");
		}
	}
}
