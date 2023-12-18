import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String s = sc.next();
			if (!map.containsKey(s)) {
				map.put(s, 1);
			} else {
				map.put(s, map.get(s) + 1);
			}
		}
		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			String s = sc.next();
			if (!map.containsKey(s)) {
				map.put(s, -1);
			} else {
				map.put(s, map.get(s) - 1);
			}
		}
		int max = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			max = Integer.max(max, entry.getValue());
		}
		System.out.println(max);
	}
}