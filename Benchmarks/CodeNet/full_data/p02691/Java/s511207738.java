
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int cnt = 0;
		Integer N = Integer.parseInt(scanner.next());
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			Integer a = Integer.parseInt(scanner.next());
			if (i > a && map.containsKey(i-a)) {
				cnt+=map.get(i-a);
			}
			if (map.containsKey(a + i)) {
				map.put(a + i, map.get(a + i) + 1);
			} else {
				map.put(a + i, 1);
			}
		}
		System.out.println(cnt);
	}

}