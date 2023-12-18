import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();

		Map<Integer, Integer> map = new HashMap<>();
		Set<Integer> set = new HashSet<>();
		set.add(1);

		for (int i = 1; i <= m; i++) {
			map.put(i, 0);
		}
		
		for (int i = 0; i < q; i++) {
			int a = sc.nextInt();
			int curr = map.get(a);
			if (curr == n - 1) {
				map.put(a, 0);
				set.add(a);
			} else {
				map.put(a, curr + 1);
			}
		}
		
		for (int i = 1; i <= m; i++) {
			if (map.get(i) > 0 && !set.contains(i)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}