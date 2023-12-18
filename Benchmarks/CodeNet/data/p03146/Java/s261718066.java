import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int s = Integer.parseInt(scanner.nextLine());

		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

		int preVal = 0;

		for (int i = 0; i < 1000000; i++) {
			if (i == 0) {
				map.put(s, true);
				preVal = s;

				continue;
			}

			int val = f(preVal);
			if (map.get(val) != null) {
				System.out.println(i + 1);
				return;
			} else {
				map.put(val, true);
				preVal = val;
			}
		}

	}

	private static int f(int n) {
		if (n % 2 == 0) {
			return n / 2;
		} else {
			return 3 * n + 1;
		}
	}

}
