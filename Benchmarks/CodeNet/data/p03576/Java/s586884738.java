import java.lang.Math;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//問題入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] array = new int[n][2];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		long space = 1L<<62;;	//暫定的な面積(あとで表示するのでこれはforのブロックの外で宣言)
		//長方形の各辺の座標をarrayから探す
		int ceil, floor, left, right; //各辺の位置
		for (int i = 0; i < n; i++) {
			ceil = array[i][1];
			for (int j = 0; j < n; j++) {
				floor = array[j][1];
				for (int k1 = 0; k1 < n; k1++) {
					right = array[k1][0];
					for (int l = 0; l < n; l++) {
						left = array[l][0];
						int counter = 0; //長方形に含まれる点の数をカウント
						for (int c = 0; c < n; c++) {
							if (array[c][0] >= Math.min(right, left) && array[c][0] <= Math.max(right, left)
									&& array[c][1] >= Math.min(floor, ceil) && array[c][1] <= Math.max(floor, ceil)) {
								counter++;
							}
							if (counter >= k) {
								space = Math.min(space, Math.abs(floor-ceil)*Math.abs(right-left));
							}
						}
					}
				}
			}
		}
		System.out.println(space);
		sc.close();
	}
}
