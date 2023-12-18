import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 複数行の標準入力
		ArrayList<String> strList = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String buf = in.nextLine();
			strList.add(buf);
		}
		in.close();

		// 入力データの分割
		String[] HW = strList.get(0).split(" ");
		int h = Integer.parseInt(HW[0]);
		int w = Integer.parseInt(HW[1]);

		// 入力データの整理
		strList.remove(0);
		Boolean[][] inputData = new Boolean[h][w];
		for (int i = 0; i < strList.size(); i++) {
			inputData[i] = new Boolean[w];
			String tmp = strList.get(i);
			// 文字列の分割
			for (int j = 0; j < tmp.length(); j++) {
				// 通り道ならtrue
				inputData[i][j] = tmp.charAt(j) == '#';
			}
		}

		// 入力データのチェック
		// 右か下にしか移動できない

		int down = 0;
		int right = 0;
		while (true) {
			if (inputData[down][right]) {
				// 通過点をチェック
				inputData[down][right] = false;
			} else {
				break;
			}
			// 最終地点まで到達
			if (right == (w - 1) && down == (h - 1)) {
				break;
			}

			if (down < (h - 1) && inputData[down + 1][right]) {
				down++;
			} else if (right < (w - 1) && inputData[down][right + 1]) {
				right++;
			} else {
				break;
			}
		}

		boolean ngCheck = false;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (inputData[i][j]) {
					ngCheck = true;
				}
			}
		}
		if (ngCheck) {
			System.out.println("Impossible");
		} else {
			System.out.println("Possible");
		}
	}
}
