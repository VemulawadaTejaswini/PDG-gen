import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		HashSet<Long> first = new HashSet<>();
		HashMap<Long, Long> map = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] array = new long[n];
		for (int i = 0; i < n; i++) {
			long a = sc.nextInt();
			array[i] = a;
			if (first.contains(a)) {
				if (map.containsKey(a)) {
					long num = map.get(a);
					map.put(a, num + 1);
				} else {
					map.put(a, 2L);
				}
			} else {
				first.add(a);
			}
		}
		sc.close();

		long answer = 0;
		for (long value : map.values()) {
			long product = (value * (value - 1)) / 2;
			answer = answer + product;
		}

		for (int i = 0; i < n; i++) {
			long a = array[i];
			if (!map.containsKey(a)) {
				print(answer);
			} else {
				long dup = map.get(a);
				long subtractAns = answer - dup + 1;
				print(subtractAns);
			}
		}

	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}