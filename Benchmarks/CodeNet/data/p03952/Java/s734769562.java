import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// 標準入力
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try {
			str = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] inputStr = str.split(" ");

		int n = Integer.parseInt(inputStr[0]);
		int x = Integer.parseInt(inputStr[1]);
		int max = 2 * n - 1;

		// 2N-1のリスト
		List<Integer> array = new ArrayList<Integer>();
		for (int i = 1; i <= max; i++) {
			array.add(i);
		}

		boolean completeFlg = false;

		for (int loop = 0; loop < 100; loop++) {

			Collections.shuffle(array);

			List<Integer> baseArray = new ArrayList<Integer>(array);
			List<List<Integer>> subArray = null;

			subArray = new ArrayList<List<Integer>>(n);
			subArray.add(baseArray);
			// 段
			for (int i = 0; i < n; i++) {
				subArray.add(new ArrayList<Integer>()); // i+1
				// 1つ上の段の数値推測
				for (int j = 0; j < (2 * (i + 1)) - 1; j++) {
					if ((j + 3) <= subArray.get(i).size()) {
						List<Integer> subTmp = subArray.get(i).subList(j, j + 3);
						if (subTmp.size() >= 3) {
							Collections.sort(subTmp);
							// 1つ上の段に登録
							subArray.get(i + 1).add(subTmp.get(1));
						}
					} else if (subArray.get(i).size() == 1) {
						subArray.get(i + 1).add(subArray.get(i).get(0));
					}
				}
			}
			if (subArray.get(subArray.size() - 1).get(0) == x) {
				System.out.println("Yes");
				for (Integer i : subArray.get(0)) {
					System.out.println(i);
				}
				completeFlg = true;
				break;
			}

		}

		if (!completeFlg) {
			System.out.println("No");
		}

	}
}
