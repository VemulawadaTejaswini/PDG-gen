import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int prev = 0;
		for (int i = 0; i < n; i++) {
		    prev += sc.nextInt();
		    prev %= m;
		    if (map.containsKey(prev)) {
		        map.put(prev, map.get(prev) + 1);
		    } else {
		        map.put(prev, 1);
		    }
		}
		long total = 0;
		for (int x : map.values()) {
		    total += (long)x * (long)(x - 1) / 2L;
		    total %= MOD;
		}
        System.out.println(total);
	}
}
