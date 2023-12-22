
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int R = scanner.nextInt();
		int L = scanner.nextInt();
		int now = 0;
		int[][] num = new int[N][2];
		int index = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < R; i++) {
			int d = scanner.nextInt() - 1;
			int t = scanner.nextInt();
			int x = scanner.nextInt();
			num[index][1] += t - now;
			num[d][0] += x;
			if (index == d && x > 0) {
				max = num[index][0];
			} else if (x > 0) {
				if (max < num[d][0]) {
					max = num[d][0];
					index = d;
				} else if (max == num[d][0] && d < index) {
					index = d;
				}
			} else if (index == d && x < 0) {
				max = Integer.MIN_VALUE;
				for (int j = 0; j < N; j++) {
					if (max < num[j][0]) {
						max = num[j][0];
						index = j;
					}
				}
			}
			now = t;
		}
		num[index][1] += L - now;
		int time = 0;
		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (time < num[i][1]) {
				time = num[i][1];
				ans = i;
			}
		}
		System.out.println(ans+1);

	}
}