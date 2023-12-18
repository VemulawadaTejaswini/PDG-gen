import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Map<String, Integer> map = new HashMap<>();
		int[] l = new int[m];
		int[] r = new int[n];
		boolean bool = false;
		for (int i = 0; i < m; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
			if (i == 0) {
				for (int j = l[i]; j <= r[i]; j++) {
					map.put(String.valueOf(j), 1);
				}
			} else {
				for (int j = l[i]; j <= r[i]; j++) {
					if (map.containsKey(String.valueOf(j))) {
						map.put(String.valueOf(j), map.get(String.valueOf(j)) + 1);
						bool = true;
					} else {
						if (bool) {
							break;
						}
					}
				}
			}
		}
		int count = 0;
		for (String s : map.keySet()) {
			if (map.get(s) == m) {
				count++;
			}
		}
		System.out.println(count);
	}
}
