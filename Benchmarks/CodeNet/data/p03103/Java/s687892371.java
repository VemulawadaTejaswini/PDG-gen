import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] a = new long[n];
		long[] b = new long[n];
		int count = 0;
		int sum = 0;

		Map<Long, Long> map = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			if (map.containsKey((a[i]))) {
				map.put((a[i]), map.get((a[i])) + b[i]);
			} else {
				map.put((a[i]), b[i]);
			}
		}

		for (Map.Entry<Long, Long> me : map.entrySet()) {
			if (me.getValue() < m - count) {
				sum += me.getKey() * me.getValue();
				count += me.getValue();
			} else {
				sum += me.getKey() * (m - count);
				System.out.println(sum);
				break;
		}






	}

}
