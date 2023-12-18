
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();

		Map<Integer, Integer> children = new HashMap<Integer, Integer>();
		Set<Integer> keys = new TreeSet<Integer>();

		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			if (children.containsKey(a)) {
				children.put(a, children.get(a) + 1);
			} else {
				children.put(a, 1);
				keys.add(a);
			}
		}

		int result = 0;
		for (int a : keys) {
			int aNum = children.get(a);
			for (int i = 0; i < aNum && 0 <= x; i++) {
				if (a <= x) {
					x = x - a;
					result++;
				}
			}
		}
		if (x == 0 || result == 0) {
			System.out.println(result);
		} else {
			System.out.println(result - 1);
		}

	}

}
