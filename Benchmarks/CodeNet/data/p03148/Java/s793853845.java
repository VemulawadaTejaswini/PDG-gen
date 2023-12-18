import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * メインクラス
 *
 */
public class Main {

	/**
	 * メインメソッド
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		// ============================================================
		// 標準入力を変数に設定
		// ============================================================

		// 標準入力を取得
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		int N = Integer.parseInt(line.split(" ")[0]);
		int K = Integer.parseInt(line.split(" ")[1]);

		Map<Integer, List<Integer>> sushisMaster = new HashMap<Integer, List<Integer>>();

		while ((line = br.readLine()) != null) {

			int va = Integer.parseInt(line.split(" ")[0]);
			int de = Integer.parseInt(line.split(" ")[1]);

			if (!sushisMaster.containsKey(va)) {
				sushisMaster.put(va, new ArrayList<Integer>());
			}
			sushisMaster.get(va).add(de);
		}

		for (List<Integer> l : sushisMaster.values()) {
			Collections.sort(l, Collections.reverseOrder());
		}

		// パターン1
		Map<Integer, List<Integer>> sushis = new HashMap<Integer, List<Integer>>();
		for (int key : sushisMaster.keySet()) {
			if (sushis.containsKey(key)) {
				List<Integer> i = new ArrayList<Integer>(sushisMaster.get(key));
				sushis.get(key).addAll(i);
			} else {
				sushis.put(key, new ArrayList<Integer>(sushisMaster.get(key)));
			}
		}

		List<Integer> vas = new ArrayList<>();
		long deSum = 0;

		for (int i = 0; i < K; i++) {

			long tmp = 0;
			int tmpSize = vas.size();
			long max = -1;
			int maxVa = -1;

			for (int j : sushis.keySet()) {

				if (sushis.get(j).size() == 0) {
					continue;
				}

				if (vas.contains(j)) {
					tmp = tmpSize * tmpSize + deSum + sushis.get(j).get(0);
				} else {
					tmp = (tmpSize + 1) * (tmpSize + 1) + deSum + sushis.get(j).get(0);
				}

				if (max < tmp) {
					max = tmp;
					maxVa = j;
				}
			}

			if (!vas.contains(maxVa)) {
				vas.add(maxVa);
			}

			deSum += sushis.get(maxVa).get(0);
			sushis.get(maxVa).remove(0);

		}

		long pttern1 = vas.size() * vas.size() + deSum;

		// パターン2
		vas = new ArrayList<>();
		deSum = 0;

		sushis = new HashMap<Integer, List<Integer>>();
		for (int key : sushisMaster.keySet()) {
			if (sushis.containsKey(key)) {
				List<Integer> i = new ArrayList<Integer>(sushisMaster.get(key));
				sushis.get(key).addAll(i);
			} else {
				sushis.put(key, new ArrayList<Integer>(sushisMaster.get(key)));
			}
		}

		for (int j : sushis.keySet()) {

			vas.add(j);
			deSum += sushis.get(j).get(0);

		}

		for (int i = sushis.size(); i < K; i++) {

			long tmp = 0;
			int tmpSize = vas.size();
			long max = -1;
			int maxVa = -1;

			for (int j : sushis.keySet()) {

				tmp = tmpSize * tmpSize + deSum + sushis.get(j).get(0);

				if (max < tmp) {
					max = tmp;
					maxVa = j;
				}
			}

			if (!vas.contains(maxVa)) {
				vas.add(maxVa);
			}

			deSum += sushis.get(maxVa).get(0);
			sushis.get(maxVa).remove(0);

		}

		long pttern2 = vas.size() * vas.size() + deSum;

		if (pttern1 > pttern2) {
			System.out.println(pttern1);
		} else {
			System.out.println(pttern2);
		}

	}
}