
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			Map<String, Integer> map = new HashMap<String, Integer>();
			for (int i = 0; i < n; i++) {
				String tmp = change(sc.next());
				if (map.containsKey(tmp)) {
					map.put(tmp, map.get(tmp)+1);
				} else {
					map.put(tmp, 1);
				}
			}
			long result = 0;

			for (String str : map.keySet()) {
				result += calc(map.get(str));
			}
			System.out.println(result);
		}
	}

	private static long calc(long num) {
		return (num * (num - 1)) / 2;
	}

	private static String change(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
}
