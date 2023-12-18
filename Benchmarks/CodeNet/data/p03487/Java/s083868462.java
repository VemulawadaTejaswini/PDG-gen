import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			int a = in.nextInt();
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}
		}
		Integer ans = 0;
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			Integer key = e.getKey();
			Integer num = e.getValue();
			if (num > key) {
				ans += (num - key);
			} else if (num < key) {
				ans += num;
			}
		}
		System.out.println(ans);
		in.close();
	}
}