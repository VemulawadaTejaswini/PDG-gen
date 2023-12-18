import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {

			int in = sc.nextInt();
			map.put(in, map.getOrDefault(in, 0) + 1);

		}

		int size = map.keySet().size();

		int remKeyNum = size - k;

		LinkedList<Integer> values = new LinkedList<>(map.values());

		Collections.sort(values);

		int ans = 0;

		for (int i = 0; i < remKeyNum; i++) {
			ans += values.poll();
		}

		if (size >= k) {
			System.out.println(ans);
		} else {
			System.out.println(0);
		}

		sc.close();

	}
}