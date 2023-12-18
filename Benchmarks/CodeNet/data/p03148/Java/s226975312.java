import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> maxMap = new HashMap<Integer,Integer>();
		Map<Integer, Integer> eatTypeMap = new HashMap<Integer,Integer>();

		int n = sc.nextInt();
		int k = sc.nextInt();
		List<int[]> sushiListDsc = new ArrayList<int[]>();
		for(int i = 0; i < n; i++) {
			int type = sc.nextInt();
			int del = sc.nextInt();

			if(maxMap.containsKey(type)) {
				if(del > maxMap.get(type)) {
					maxMap.put(type, del);
				}
			} else {
				maxMap.put(type, del);
			}

			sushiListDsc.add(new int[]{type, del});
		}

		Collections.sort(sushiListDsc, new Comparator<int[]>() {
			public int compare(int[] obj1, int[] obj2) {
					return Integer.valueOf(obj2[1]).compareTo(Integer.valueOf(obj1[1]));
			}
		});

		List<Entry<Integer, Integer>> maxListDsc = new ArrayList<Entry<Integer, Integer>>(maxMap.entrySet());
		Collections.sort(maxListDsc, new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
					return obj2.getValue().compareTo(obj1.getValue());
			}
		});

		// 単純に大きいほうからK個
		List<int[]> eatList = new ArrayList<int[]>();
		long amt = 0;
		for(int i = 0; i < k; i++) {
			int[] sushi = sushiListDsc.get(i);
			int type = sushi[0];
			int del = sushi[1];

			if(eatTypeMap.containsKey(type)) {
				eatTypeMap.put(type, eatTypeMap.get(type) + 1);
			} else {
				eatTypeMap.put(type, 1);
			}

			amt += del;
			eatList.add(sushi);
		}


		int simpleTypeCnt = eatTypeMap.size();
		long simpleTypePt = simpleTypeCnt * simpleTypeCnt;
		long simpleAmt = amt + simpleTypePt;
		long maxAmt = simpleAmt;

		int maxTypeCnt = maxMap.size();
		if(maxTypeCnt > k) {
			maxTypeCnt = k;
		}
		long maxTypePt = maxTypeCnt * maxTypeCnt;

		change:
		while(simpleTypeCnt < maxTypeCnt) {
			long typeDeffMax = maxTypePt - simpleTypePt;

			int type = 0;
			int del = 0;
			// 使ってないタイプ
			for(Integer key : maxMap.keySet()) {
				if(!eatTypeMap.containsKey(key)) {
					type = key;
					del = maxMap.get(key);
					break;
				}
			}

			// どれと入れ替えるか
			for(int i = k - 1; i >= 0; i--) {
				// 小さいほうから
				int[] eatSushi = eatList.get(i);
				int eatType = eatSushi[0];
				int eatDel = eatSushi[1];

				// 一個しかなかったら入れ替えられない
				if(eatTypeMap.get(eatType) != 1) {

					// 入れ替える価値があるか。
					int deff = eatDel - del;
					if(deff > typeDeffMax) {
						// 価値なし！ここで価値なかったら他も
						break change;
					}

					eatList.remove(i);
					eatList.add(new int[] {type, del});
					eatTypeMap.put(type, 1);

					// 入れ替え結果を計算
					simpleTypeCnt = eatTypeMap.size();
					simpleAmt = simpleAmt - deff - simpleTypePt + simpleTypeCnt * simpleTypeCnt;
					simpleTypePt = simpleTypeCnt * simpleTypeCnt;

					// 入れ替え結果が大きいか
					if(simpleAmt > maxAmt) {
						maxAmt = simpleAmt;
					}

					break;
				}
			}
		}


		System.out.println(maxAmt);

	}

}
