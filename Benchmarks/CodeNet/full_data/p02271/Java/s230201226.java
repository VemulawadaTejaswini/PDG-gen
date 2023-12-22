
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n];		//nこの要素を入れる
		int s = 0;			//要素の合計
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
			s += num[i];
		}
		boolean[] map = new boolean[s + 1];		//要素の合計+1のboolean

		slove(0, 0, num, map);		//nこの配列と　booleanを投げる  0 0 は開始地点か？
		int m = scanner.nextInt();
		while (m-- > 0) {
			int a = scanner.nextInt();
			System.out.println(a <= s && map[a] ? "yes" : "no");
		}

	}

	private void slove(int i, int sum, int[] num, boolean[] map) {
		map[sum] = true;		//DP法
		if (i == num.length)
			return;

		slove(i + 1, sum + num[i], num, map);
		slove(i + 1, sum, num, map);
	}
}

