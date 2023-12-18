import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	// 通過不可なら0
	Integer steps[];
	Map<Integer, Integer> map;

	public Main(int n, Integer a[]) {
		steps = new Integer[n];
		map = new TreeMap<>();
		for (int i = 0; i < steps.length; i++) {
			steps[i] = 1;
		}
		for (int e : a) {
			steps[e] = 0;
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		Integer a[] = new Integer[m];
		for (int i = 0; i < m; i++) {
			a[i] = s.nextInt();
		}
		System.out.println(new Main(n, a).calc(0));
	}

	public int calc(int prefix) {
		Integer shortcut = map.get(prefix);
		Integer result;
		if (shortcut != null) {
			return shortcut;
		}
		if (prefix >= steps.length) {
			result = 0;
		} else if (prefix == steps.length - 1) {
			result = 1;
		} else if (prefix == steps.length - 2) {
			result = 1 + ((steps[prefix + 1] == 1) ? 1 : 0);
		} else {
			result = ((steps[prefix + 1] == 1) ? calc(prefix + 1) : 0)
					+ ((steps[prefix + 2] == 1) ? calc(prefix + 2) : 0);
		}
		map.put(prefix, result);
		return result;
	}
}