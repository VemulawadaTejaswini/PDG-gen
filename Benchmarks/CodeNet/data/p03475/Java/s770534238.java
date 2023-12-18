import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t[][] = new int[n - 1][3];

		for (int i = 0; i < n - 1; i++) {
			t[i][0] = scanner.nextInt();
			t[i][1] = scanner.nextInt();
			t[i][2] = scanner.nextInt();
		}

		int time = 0;
		for (int i = 0; i < n - 1; i++) {
			time = t[i][0] + t[i][1];
			for (int j = i + 1; j < n - 1; j++) {
				if (time < t[j][1]) {
					time = t[j][1] + t[j][0];
				} else if (time < t[j][2]) {
					time = t[j][2] + t[j][0];
				} else {
					time = calcWaiting(time, t[j][2]) + t[j][0];
				}
			}
			System.out.println(time);
		}

		System.out.println(0);
	}

	private static int calcWaiting(int time, int f) {
		int cnt = 0;
		while (time > f * cnt) {
			cnt++;
		}
		return f * cnt;
	}
}
