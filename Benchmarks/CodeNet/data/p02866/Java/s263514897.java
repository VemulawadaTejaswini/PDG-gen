import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());

		Map<Integer, Integer> map = new TreeMap<>();

		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			int c = map.getOrDefault(input, 0);
			c++;
			map.put(input, c);
		}
		sc.close();
		if (!map.containsKey(0)) {
			System.out.println(0);
			return;
		}
		Integer before = -1;
		for (Integer key : map.keySet()) {
			if (key != before + 1) {
				System.out.println(0);
				return;
			}
			before = key;
		}
		int size = map.values().size();
		int ans = 1;
		for (int i = 0; i < size - 1; i++) {
			int a = map.get(i);
			int b = map.get(i + 1);
			ans = ans * (int) Math.pow(a, b);
		}
		System.out.println(ans);
	}
}
