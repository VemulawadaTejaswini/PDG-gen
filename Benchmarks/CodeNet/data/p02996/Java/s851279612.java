import java.util.*;
import java.util.TreeMap;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int time = 0;
		int by = 0;
		int count = 0;
		String ans = "Yes";
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for (int i = 0; i < N; i++) {
			time = sc.nextInt();
			by = sc.nextInt();
			if (map.containsKey(by)) {
				map.replace(by, time + map.get(by));
			} else {
				map.put(by, time);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			count += entry.getValue();
			if (count > entry.getKey()) {
				ans = "No";
			}
		}

		sc.close();
		System.out.println(ans);
	}

};
