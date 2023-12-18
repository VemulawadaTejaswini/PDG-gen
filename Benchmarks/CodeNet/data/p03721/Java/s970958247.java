import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		long k = sc.nextInt();
		TreeMap<Long, Long> tm = new TreeMap<>();
		long a, b;
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (tm.containsKey(a)) {
				tm.put(a, tm.get(a) + b);
			} else {
				tm.put(a, b);
			}
		}
		for (long i : tm.keySet()) {
			k = k - tm.get(i);
			if (k <= 0) {
				System.out.println(i);
				break;
			}
		}
	}
}
