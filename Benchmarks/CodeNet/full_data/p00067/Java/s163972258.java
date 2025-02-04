

import java.io.IOException;
import java.util.Scanner;

/**
 * <pre>
 * NumberOfIsland
 *
 * ??¶?????°???????????????
 * </pre>
 *
 * @author ?????????????????§???
 *
 */
public class Main{

	static boolean map[][] = new boolean[12][12];
	static int ans = 0;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			for (int cnt1 = 0; cnt1 < 12; cnt1++) {
				char[] c = sc.next().toCharArray();
				for (int cnt2 = 0; cnt2 < 12; cnt2++) {
					map[cnt1][cnt2] = (c[cnt2] == '1');
				}
			}
			int ans = 0;
			for (int cnt1 = 0; cnt1 < 12; cnt1++) {
				for (int cnt2 = 0; cnt2 < 12; cnt2++) {
					if (map[cnt1][cnt2]) {
						test(cnt1, cnt2);
						ans++;
					}
				}
			}
			System.out.println(ans);
		} // ?????????????????????
	}// ?????????????????????????????????

	public static void test(int mh, int mw) {
		map[mh][mw] = false;
		int move_h[] = { 1, 0, -1, 0 };
		int move_w[] = { 0, 1, 0, -1 };
		for (int cnt = 0; cnt < 4; cnt++) {
			int tmp_h = mh + move_h[cnt];
			int tmp_w = mw + move_w[cnt];
			if (0 <= tmp_h && 0 <= tmp_w && tmp_h < map.length && tmp_w < map[0].length && map[tmp_h][tmp_w])//
				test(tmp_h, tmp_w);
		}
	}
}// ??????????????????????????????