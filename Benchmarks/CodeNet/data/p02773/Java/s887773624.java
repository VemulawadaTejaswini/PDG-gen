import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String input = sc.next();
			Integer num = map.get(input);
			if (num != null) {
				map.put(input, num + 1);
			} else {
				map.put(input, 1);
			}
		}
		int max = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
			}
		}
		List<String> list = new ArrayList<>();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == max) {
				list.add(entry.getKey());
			}
		}
		list.stream().sorted((str1, str2) -> str1.compareTo(str2)).forEach(System.out::println);
	}
}
