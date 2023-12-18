
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int cityCnt = scanner.nextInt();
			int routeCnt = scanner.nextInt();

			int[][] map = new int[cityCnt][cityCnt];
			int a, b;
			for (int i = 0; i < routeCnt; i++) {
				a = scanner.nextInt() - 1;
				b = scanner.nextInt() - 1;

				map[a][b]++;
				map[b][a]++;
			}

			int cnt;
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < cityCnt; i++) {
				cnt = 0;
				for (int j = 0; j < cityCnt; j++) {
					if (map[i][j] > 0) {
						cnt += map[i][j];
					}
				}
				builder.append(cnt + "\n");
			}
			System.out.println(builder.toString());
		}
	}
}