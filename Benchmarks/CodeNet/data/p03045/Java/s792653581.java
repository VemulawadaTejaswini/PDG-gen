import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String[] input1 = bf.readLine().split(" ");
			int n = Integer.parseInt(input1[0]);
			int m = Integer.parseInt(input1[1]);

			// 計算式の組み合わせをまとめる
			Map<Integer, Set<Integer>> convination = new HashMap<Integer, Set<Integer>>();
			for (int i = 1; i <= m; i++) {
				String[] input2 = bf.readLine().split(" ");
				int ax = Integer.parseInt(input2[0]);
				int ay = Integer.parseInt(input2[1]);
				int z = Integer.parseInt(input2[1]);
				if (!convination.containsKey(ax)) {
					convination.put(ax, new HashSet<Integer>());
				}
				if (!convination.containsKey(ay)) {
					convination.put(ay, new HashSet<Integer>());
				}
				convination.get(ax).add(ay);
			}

			// 計算式で結ばれているものは、Ax、Ayいずれか一つが分かればもう片方も分かる
			// →　分かる対象が多いものから順に魔法で開ける
			int magic = 0;
			boolean[] cards = new boolean[n + 1];
			List<Map.Entry<Integer, Set<Integer>>> descSort = new ArrayList<Map.Entry<Integer, Set<Integer>>>(convination.entrySet());
			Collections.sort(descSort, new Comparator<Map.Entry<Integer, Set<Integer>>>() {

				@Override
				public int compare(Entry<Integer, Set<Integer>> o1, Entry<Integer, Set<Integer>> o2) {
					return Integer.valueOf(o2.getValue().size()).compareTo(Integer.valueOf(o1.getValue().size()));
				}
			});
			for (Map.Entry<Integer, Set<Integer>> conv : descSort) {
				int ones = conv.getKey();
				if (!cards[ones]) {
					magic++;
					cards[ones] = true;
				}
				for (Integer other : conv.getValue()) {
					cards[other] = true;
				}
			}

			// それでも分からないカードはひとつずつ魔法を使う
			for (int i = 1; i < n + 1; i++) {
				if (!cards[i]) {
					magic++;
				}
			}
			System.out.println(magic);
		} catch (IOException e1) {
		}
	}

}
