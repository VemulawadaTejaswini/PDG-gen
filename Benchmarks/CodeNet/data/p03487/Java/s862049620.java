import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		Scanner scanner = new Scanner(System.in);
		int len = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < len; i++) {
			int n = scanner.nextInt();
			if (map.get(n) == null) {
				map.put(n, 1);
			} else {
				map.put(n, map.get(n) + 1);
			}
		}

		int ans = 0;
		java.util.List<Integer> list =map.keySet().stream()
				.filter(key -> map.get(key) % key != 0)
				.collect(Collectors.toList());
		
		list.add(1);
		for (Integer i : list) {
			int n = map.get(i);
			if (n>i) {
				ans+=n-i;
			}else{
				ans+=n;
			}
		}

		
		System.out.println(ans);
		scanner.close();
	}

}
