
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int[][] map = new int[n][2];
			for (int i = 0; i < n; i++) {
				int sum = 0;
				int num = scanner.nextInt();
				for (int j = 0; j < 4; j++) {
					sum += scanner.nextInt() * 60;
					sum += scanner.nextInt();
				}
				map[i][0] = num;
				map[i][1] = sum;

			}
			Arrays.sort(map, new Comparator<int[]>() {
				@Override
				public int compare(int[] a, int[] b) {
					return a[1] - b[1];
				}
			});
			System.out.println(map[0][0]);
			System.out.println(map[1][0]);
			System.out.println(map[map.length - 2][0]);
		}
	}
}