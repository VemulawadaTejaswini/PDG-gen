import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			while (((line = br.readLine()) != null) && !line.equals("0")) {
				int v = Integer.parseInt(line);
				int start = Integer.parseInt(br.readLine());
				int goal = Integer.parseInt(br.readLine());
				int h = Integer.parseInt(br.readLine());
				
				// 途中を保存
				int[] route = new int[h + 1];
				route[0] = start;

				char[][] holizon = new char[h][v];
				// 追加可能位置の記録
				boolean[][] checkLine = new boolean[h][v - 1];

				for (int i = 0; i < h; i++) {
					holizon[i] = br.readLine().toCharArray();
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
					ans = "1";
					for (int i = 0; i < h; i++) {
						for (int j = 0; j < v - 1; j++) {
							// 結果に影響を与える箇所かどうか
							if ((j + 1 == route[i] || j + 2 == route[i])
									&& checkLine[i][j] == false) {
								if (checkResult(i, j, route, holizon, goal,h ,v) == true) {
									ans = Integer.toString(i + 1) + " "
											+ Integer.toString(j + 1);
								}
							}
						}
					}
				}
				System.out.println(ans);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//ライン追加後のチェック
	private static boolean checkResult(int ai, int aj, int[] route, char[][] holizon, int goal, int h, int v) {
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