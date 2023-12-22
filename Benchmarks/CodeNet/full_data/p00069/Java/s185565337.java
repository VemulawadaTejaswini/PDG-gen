import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int h = -1;
	static int v = -1;
	static int goal = -1;
	static int[] route = null;
	static char[][] holizon = null;
	static boolean[][] checkLine = null;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			while (true) {
				int[] param = new int[4];
				for (int i = 0; i < 4; i++) {
					line = br.readLine();
					if ((line = br.readLine()) == null || line.equals("0") || line.equals("")) {
						System.exit(0);
					}
					param[i] = Integer.parseInt(line);
				}
				v = param[0];
				h = param[3];
				goal = param[2];

				// 途中を保存
				route = new int[h + 1];
				route[0] = param[1];

				holizon = new char[h][v];
				// 追加可能位置の記録
				checkLine = new boolean[h][v - 1];

				for (int i = 0; i < h; i++) {
					holizon[i] = br.readLine().trim().toCharArray();
					route[i + 1] = route[i];
					for (int j = 0; j < v - 1; j++) {
						if (holizon[i][j] == '1') {
							if (j + 1 == route[i] || j + 2 == route[i]) {
								route[i + 1] += j + 1 == route[i] ? 1 : -1;
							}
							checkLine[i][j] = true;
							if (j == 0)
								checkLine[i][j + 1] = true;
							else if (j == v - 2)
								checkLine[i][j - 1] = true;
							else {
								checkLine[i][j + 1] = true;
								checkLine[i][j - 1] = true;
							}
						}
					}
				}
				String ans = "0";
				if (route[h] != goal) {
					ans = searchAddLine();
				}
				System.out.println(ans);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ライン追加可能場所全てをチェックする
	private static String searchAddLine() {
		String returnData = "1";
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < v - 1; j++) {
				// 結果に影響を与える箇所かどうか
				if ((j + 1 == route[i] || j + 2 == route[i])
						&& checkLine[i][j] == false) {
					if (checkResult(i, j) == true) {
						returnData = Integer.toString(i + 1) + " "
								+ Integer.toString(j + 1);
						return returnData;
					}

				}
			}
		}
		return returnData;
	}

	private static boolean checkResult(int ai, int aj) {
		int tmp = route[ai];
		tmp += aj + 1 == tmp ? 1 : -1;

		for (int i = ai + 1; i < h; i++) {
			for (int j = 0; j < v - 1; j++) {
				if ((j + 1 == tmp || j + 2 == tmp) && holizon[i][j] == '1') {
					tmp += j + 1 == tmp ? 1 : -1;
					break;
				}
			}
		}
		if (tmp == goal)
			return true;
		else
			return false;
	}
}