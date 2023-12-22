import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		long count = 5404;
		Map<Long, Long> map = new HashMap<>();
		List<Long> list = new ArrayList<>();
		for (int i = 0; i < count * 2 + 1; i++) {
			long hoge = (long) Math.pow(count - i, 5);
			list.add(hoge);
			map.put(hoge, count - i);
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 0; i < list.size(); i++) {
			long a = list.get(i);
			for (int j = 0; j < list.size(); j++) {
				long b = list.get(j);
				if (a - b == n) {
					System.out.println(map.get(a) + " " + map.get(b));
					return;
				}
			}
		}
	}
}
