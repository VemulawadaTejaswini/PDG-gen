import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] point = { 0, 0 };

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		boolean isSuccess = true;
		int currentTime = 0;
		for (int i = 0; i < n; i++) {
			int t = Integer.parseInt(sc.next()) - currentTime;
			int x = Integer.parseInt(sc.next());
			int y = Integer.parseInt(sc.next());

			int move = Math.abs(point[0] - x) + Math.abs(point[1] - y);
			// 最短ではない場合は往復して時間をつぶす
			if (move > t || move % 2 != t % 2) {
				isSuccess = false;
				break;
			}
			currentTime = t;
			point[0] = x;
			point[1] = y;

		}

		if (isSuccess) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
