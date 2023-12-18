import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> blue = new HashMap<String, Integer>();
		Map<String, Integer> red = new HashMap<String, Integer>();
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String string = sc.next();
			if (blue.containsKey(string)) {
				int count = blue.get(string) + 1;
				blue.put(string, count);
			} else {
				blue.put(string, 1);
			}
		}
		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			String string = sc.next();
			if (red.containsKey(string)) {
				int count = red.get(string) - 1;
				red.put(string, count);
			} else {
				red.put(string, -1);
			}
		}
		int ans = 0;
		for (Map.Entry<String, Integer> bm : blue.entrySet()) {
			int count = bm.getValue();
			if (red.containsKey(bm.getKey())) {
				count += red.get(bm.getKey());
			}
			ans = Math.max(ans, count);
		}
		System.out.println(ans);
		sc.close();
	}
}