import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		long sum = 0;
		long count = 0;
		Map<String, Long> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			if (map.containsKey(String.valueOf(a[i]))) {
				map.put(String.valueOf(a[i]), map.get(String.valueOf(a[i])) + b[i]);
			} else {
				map.put(String.valueOf(a[i]), (long) b[i]);
				list.add(a[i]);
			}
		}
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			if (map.get(String.valueOf(list.get(i))) < m - count) {
				sum += list.get(i) * map.get(String.valueOf(list.get(i)));
				count += map.get(String.valueOf(list.get(i)));
			} else {
				sum += list.get(i) * (m - count);
				System.out.println(sum);
				return;
			}
		}
	}
}
