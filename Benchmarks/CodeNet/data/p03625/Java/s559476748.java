import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
		int x = 0, y = 0;

		for (int i = 0; i < N; i++) {
			int b = sc.nextInt();
			int c = a.get(b) == null ? 0 : a.get(b);
			a.put(b, (c + 1));
			if (a.get(b) == 2) {
				if (y <= x && x <= b) {
					y = x;
					x = b;
					a.put(b, 0);
				} else if (y <= x && y <= b && b <= x) {
					y = b;
					a.put(b, 0);

				}
			}
		}

		System.out.println((x * y));

		sc.close();
	}
}