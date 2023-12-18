import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int h = Integer.parseInt(sc.next());
			int w = Integer.parseInt(sc.next());
			// テーブル
			int[][] square = new int[10][10];
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					square[i][j] = Integer.parseInt(sc.next());
				}
			}
			// 壁
			int[] wall = new int[h * w];
			for (int i = 0; i < h * w; i++) {
				wall[i] = Integer.parseInt(sc.next());
			}
			for (int n = 0; n < 3; n++) {
				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < 10; j++) {
						for (int k = 0; k < 10; k++) {
							square[i][j] = Math.min(square[i][j], square[i][k] + square[k][j]);
						}
					}
				}
			}
			//			boolean flag = true;
			//			while (flag) {
			//				flag = false;
			//				for (int i = 0; i < 10; i++) {
			//					if (i == 1) {
			//						continue;
			//					}
			//					for (int j = 0; j < 10; j++) {
			//						if (j == 1 || i == j) {
			//							continue;
			//						}
			//						if (square[i][j] + square[j][1] < square[i][1]) {
			//							square[i][1] = square[i][j] + square[j][1];
			//							flag = true;
			//						}
			//					}
			//				}
			//			}
			long ans = 0;
			for (int i = 0; i < h * w; i++) {
				if (wall[i] == -1 || wall[i] == 1) {
					continue;
				}
				ans += square[wall[i]][1];
			}
			System.out.println(ans);
		}
	}
}