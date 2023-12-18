import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		boolean error = false;
		for (int i = 0; i < m; i++) {
			int s = scan.nextInt();
			int c = scan.nextInt();
			if (map.containsKey(s) && map.get(s) != c) {
				error = true;
				continue;
			}
			map.put(s, c);
		}

		int number = 0;
		if (!error) {
			if (m == 0) {
				int[] defaults = new int[] { 0, 10, 100 };
				number = defaults[n - 1];
			} else {
				for (int i = 0; i < n; i++) {
					int key = n - i;
					int dn = map.containsKey(key) ? map.get(key) : 0;
					number += Math.pow(10, i) * dn;
				}
			}
		}

		if (String.valueOf(number).length() != n) {
			error = true;
		}

		System.out.println(!error ? number : -1);
		scan.close();
	}
}