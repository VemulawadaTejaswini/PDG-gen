import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean canArrive = true;
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int t = 0, tNext;
			int x = 0, xNext;
			int y = 0, yNext;

			for (int i = 0; i < n; i++) {
				tNext = scanner.nextInt();
				xNext = scanner.nextInt();
				yNext = scanner.nextInt();

				int time = tNext - 1;
				int distance = Math.abs(xNext - x + yNext - y);

				if (distance > t || (distance ^ time & 1) == 1) {
					canArrive = false;
					break;
				}

				t = tNext;
				x = xNext;
				y = yNext;
			}
		}

		if (canArrive) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}