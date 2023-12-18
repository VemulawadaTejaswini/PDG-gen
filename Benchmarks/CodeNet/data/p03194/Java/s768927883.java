import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long p = sc.nextLong();
		if (n == 1) {
			System.out.println(p);
			return;
		}
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i = 2; i * i < p; i++) {
			while (p % i == 0) {
				p /= i;
				Integer x = map.get(i);
				if (x == null) {
					x = 0;
				}
				map.put(i, x + 1);
			}
        }
        int total = 1;
        for (int x : map.keySet()) {
			int v = map.get(x);
			if (v >= n) {
				total *= x * (v / n);
			}
		}
		System.out.println(total);
	}
}
