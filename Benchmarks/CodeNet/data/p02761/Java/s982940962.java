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

		int number = -1;
		for (int i = 0; i <= 999; i++) {
			if (String.valueOf(i).length() == n && check(n, i, map)) {
				number = i;
				break;
			}
		}

		System.out.println(!error ? number : -1);
		scan.close();
	}

	private static boolean check(int n, int number, HashMap<Integer, Integer> map) {
		for (int key : map.keySet()) {
			int dn1 = (int)Math.pow(10, n - key + 1);
			int dn2 = (int)Math.pow(10, n - key);
			int dn3 = (number % dn1) / dn2;
			if (dn3 != map.get(key)) {
				return false;
			}
		}

		return true;
	}
}