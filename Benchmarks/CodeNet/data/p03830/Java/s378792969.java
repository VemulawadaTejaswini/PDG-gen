import java.util.*;

public class Main {
	static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 2; i <= n; i++) {
			int x = i;
			for (int j = 2; j <= i; j++) {
				while (x % j == 0) {
					int count = 0;
					if (map.containsKey(j)) {
						count = map.get(j);
					}
					map.put(j, count + 1);
					x /= j;
				}
			}
		}
		long total = 1;
		for (int x : map.values()) {
			total *= x + 1;
			total %= MOD;
		}
		System.out.println(total);
	}
}
