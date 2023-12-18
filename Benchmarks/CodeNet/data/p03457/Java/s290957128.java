import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int t1 = 0;
		int x1 = 0;
		int y1 = 0;

		boolean canArrive = true;
		for (int i = 0; i < n; i++) {
			int t2 = scanner.nextInt();
			int x2 = scanner.nextInt();
			int y2 = scanner.nextInt();

			int time = t2 - t1;
			int distance = Math.abs(x2 + y2 - x1 - y1);
			if (distance > time || (distance + time) % 2 == 1) {
				canArrive = false;
				break;
			}

			t1 = t2;
			x1 = x2;
			y1 = y2;
		}

		if (canArrive) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		scanner.close();
	}
}