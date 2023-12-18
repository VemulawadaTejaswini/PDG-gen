import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		// 入力をTreeMapに格納
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int w1 = sc.nextInt();
			int v1 = sc.nextInt();
			ArrayList<Integer> list;
			if (map.containsKey(w1)) {
				list = map.get(w1);
			} else {
				list = new ArrayList<Integer>();
				map.put(w1, list);
			}
			list.add(v1);
		}
		// TreeMap内のリストをソートし、降順の累積和を計算しておく
		for (ArrayList<Integer> list : map.values()) {
			Collections.sort(list);
			int val = 0;
			for (int i = 0; i < list.size(); i++) {
				if (i == 0) {
					val = list.get(list.size() - 1);
				} else {
					val += list.get(list.size() - 1 - i);
					list.set(list.size() - 1 - i, val);
				}
			}
		}
		// TreeMapのキーを4つに分解
		Integer[] arr = map.keySet().toArray(new Integer[0]);
		int w1 = arr[0];
		int w2 = 0;
		if (arr.length > 1) {
			w2 = arr[1];
		}
		int w3 = 0;
		if (arr.length > 2) {
			w3 = arr[2];
		}
		int w4 = 0;
		if (arr.length > 3) {
			w4 = arr[3];
		}
		// 最大の算出
		int max = 0;
		for (int i = 0; i <= map.get(w1).size() && i * w1 <= w; i++) {
			int val1 = 0;
			if (i != 0) {
				ArrayList<Integer> list1 = map.get(w1);
				val1 += list1.get(list1.size() - i);
				if (max < val1) {
					max = val1;
				}
			}
			if (w2 != 0) {
				for (int j = 0; j <= map.get(w2).size() && j * w2 + w1 * i <= w; j++) {
					int val2 = 0;
					if (j != 0) {
						ArrayList<Integer> list2 = map.get(w2);
						val2 += list2.get(list2.size() - j);
						if (max < val1 + val2) {
							max = val1 + val2;
						}
					}
					if (w3 != 0) {
						int val3 = 0;
						for (int k = 0; k <= map.get(w3).size() && k * w3 + j * w2 + w1 * i <= w; k++) {
							if (k != 0) {
								ArrayList<Integer> list3 = map.get(w3);
								val3 += list3.get(list3.size() - k);
								if (max < val1 + val2 + val3) {
									max = val1 + val2 + val3;
								}
							}
							if (w4 != 0) {
								for (int l = 0; l <= map.get(w4).size() && l * w4 + k * w3 + j * w2 + w1 * i <= w; l++) {
									int val4 = 0;
									if (l != 0) {
										ArrayList<Integer> list4 = map.get(w4);
										val4 += list4.get(list4.size() - 1 - l);
										if (max < val1 + val2 + val3 + val4) {
											max = val1 + val2 + val3 + val4;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(max);
	}
}
