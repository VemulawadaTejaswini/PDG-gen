import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long key;

		Map<Long, Integer> a = new HashMap<>();

		for(int i = 0; i < n; i++) {
			key = sc.nextLong();
			if(a.containsKey(key)) {
				a.put(key, a.get(key) + 1);
			}else {
				a.put(key, 1);
			}

		}

		int sum = 0;

		for(int value : a.values()) {
			sum = (value % 2 != 0)? sum + 1 : sum;
		}

		System.out.println(sum);
		sc.close();
	}
}