import java.io.IOException;
import java.util.Scanner;

public class Main {
	private static int diceNum;
	private static int sideNum;
	private static int cutback;

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			diceNum = scanner.nextInt();
			sideNum = scanner.nextInt();
			cutback = scanner.nextInt();
			if (diceNum == 0) {
				scanner.close();
				break;
			}
			int dfs = dfs(0, 0);
			double ans = dfs / Math.pow(sideNum, diceNum);
			System.out.println(ans);

		}

	}

	static int dfs(int sum, int depth) {
		if (depth < diceNum) {
			int dfs = 0;
			for (int i = 1; i <= sideNum; i++) {
				dfs += dfs(sum + i, depth + 1);
			}
			return dfs;
		} else {
			if (sum - cutback < 1) {
				return 1;
			} else {
				return sum - cutback;
			}
		}
	}
}