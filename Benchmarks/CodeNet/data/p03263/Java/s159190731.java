import java.util.*;

public class Main {

	public static void main(
			String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		boolean[][] map = new boolean[h][w];
		int cnt = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				map[i][j] = sc.nextInt() % 2 == 1;
				if (map[i][j]) {
					cnt++;
				}
			}
		}
		ArrayList list = new ArrayList();
		// 全マスを対象とするループ
		all: for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				// 奇数の場合
				if (map[i][j]) {
					for (int a = 0; a < h; a++) {
						for (int b = 0; b < w; b++) {
//							System.out.print(map[a][b] ? " 1" : " 0");
						}
//						System.out.println("");
					}
					// 一番近くの奇数を探す
//					System.out.println("h:" + i + " w:" + j);
					int find = h - i > w - j ? h - i : w - j;
					int h2 = 0;
					int w2 = 0;
					find: for (int k = 1; k < find; k++) {
						for (int l = 0; l <= k; l++) {
							if (i + l >= h) {
								continue;
							}
							if (j + (k - l) >= w) {
								continue;
							}
//							System.out.println(" " + k + "回" + l + "loop:" + l + "-" + (k - l) + ":" + (i + l) + "-" + (j + (k - l)));
							if (map[i + l][j + (k - l)]) {
//								System.out.print(" h:" + (i + l) + " w:" + (j + (k - l)));
								h2 = i + l;
								w2 = j + (k - l);
								break find;
							}
						}
					}
//					System.out.println("");
					// 移動ルートを検索しリストに追加する
					int h3 = h2 - i;
					int w3 = w2 - j;
					int h4 = h3 > 0 ? 1 : -1;
					int w4 = w3 > 0 ? 1 : -1;
					for (int m = 0; m < h3; m++) {
						list.add((i + m) + " " + j + " " + (i + m + h4) + " " + j);
//						System.out.println((i + m) + " " + j + " " + (i + m + h4) + " " + j);
					}
					for (int m = 0; m < w3; m++) {
						list.add(h2 + " " + (j + m) + " " + h2 + " " + (j + m + w4));
//						System.out.println(h2 + " " + (j + m) + " " + h2 + " " + (j + m + w4));
					}
					map[i][j] = false;
					cnt--;
					map[h2][w2] = false;
					cnt--;
				}
				// 奇数が1個以下となった場合
				if (cnt <= 1) {
					break all;
				}
			}
		}
		 System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			 System.out.println(list.get(i));
		}
	}
}
