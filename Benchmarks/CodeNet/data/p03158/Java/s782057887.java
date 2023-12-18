import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String... args) throws IOException {

		// 標準入力を取得
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int n = Integer.parseInt(line.split(" ")[0]);
		int q = Integer.parseInt(line.split(" ")[1]);

		// キー:インデックス. 値:カードの値
		Map<Integer, Integer> as = new LinkedHashMap<Integer, Integer>();
		line = br.readLine();
		int index = -1;
		for (String s : line.split(" ")) {
			index++;
			as.put(index, Integer.parseInt(s));
		}

		List<Integer> xs = new ArrayList<Integer>();
		while ((line = br.readLine()) != null) {
			for (String s : line.split(" ")) {
				xs.add(Integer.parseInt(s));
			}
		}
		br.close();

		for (int gameCount = 0; gameCount < xs.size(); gameCount++) {

			Map<Integer, Integer> as2 = new HashMap<Integer, Integer>(as);
			int takahashiCsore = 0;
			int aokiTarget = xs.get(gameCount);

			// キー: インデックス, 値:差分
			Map<Integer, Integer> aoki = new HashMap<Integer, Integer>();
			for (Entry<Integer, Integer> e : as.entrySet()) {
				aoki.put(e.getKey(), Math.abs(aokiTarget - e.getValue()));
			}
			List<Entry<Integer, Integer>> aoki2 = new ArrayList<Entry<Integer, Integer>>(aoki.entrySet());

			// 3.比較関数Comparatorを使用してMap.Entryの値を比較する(昇順)
			Collections.sort(aoki2, new Comparator<Entry<Integer, Integer>>() {
				public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
					return obj1.getValue().compareTo(obj2.getValue());
				}
			});

			// インデックス
			List<Integer> aoki3 = new ArrayList<Integer>();
			for (Entry<Integer, Integer> e : aoki2) {
				aoki3.add(e.getKey());
			}
			for (int i = 0; i < n; i++) {

				// 高橋ターン
				if (i % 2 == 0) {

					final Set<Entry<Integer, Integer>> mapValues = as2.entrySet();
				    final int maplength = mapValues.size();
				    final Entry<Integer,Integer>[] test = new Entry[maplength];
				    mapValues.toArray(test);

					int key = test[maplength-1].getKey();
					int value = test[maplength-1].getValue();
					takahashiCsore += value;
					as2.remove(key);
					aoki3.remove((Object) key);

					// 青木ターン
				} else {

					as2.remove(aoki3.get(0));
					aoki3.remove(aoki3.remove(0));
				}

			}
			System.out.println(takahashiCsore);
		}
	}
}