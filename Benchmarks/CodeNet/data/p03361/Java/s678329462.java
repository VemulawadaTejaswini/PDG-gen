import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 標準入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nums = br.readLine().split(" ");
		int h = Integer.parseInt(nums[0]);
		int w = Integer.parseInt(nums[1]);

		boolean[][] canvas = new boolean[h][w];

		// 入力値でキャンバス初期化
		for (int i = 0; i < h; i++) {
			String xline = br.readLine();
			for (int j = 0; j < w; j++) {
				if (xline.charAt(j) == '#') {
					canvas[i][j] = true;
				} else {
					canvas[i][j] = false;
				}
			}
		}

		// 判定
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (canvas[i][j]) {
					// 上方向チェック
					int hu = i - 1;
					if (hu < 0)
						hu = i;
					boolean checku = canvas[hu][j];

					// 左方向チェック
					int wl = j - 1;
					if (wl < 0)
						wl = h - 1;
					boolean checkl = canvas[i][wl];

					// 下方向チェック
					int hb = i + 1;
					if (h <= hb)
						hb = h - 1;
					boolean checkb = canvas[hb][j];

					// 右方向チェック
					int wr = j + 1;
					if (w <= wr)
						wr = h - 1;
					boolean checkr = canvas[i][wr];

					// 4方向のどれも黒色ではない場合
					if (!(checku || checkl || checkb || checkr)) {
						System.out.println("No");
						return;
					}
				}

			}
		}

		System.out.println("Yes");

	}

}