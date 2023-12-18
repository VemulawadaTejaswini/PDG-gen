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

		int l = sc.nextInt();
		int[] a = new int[l];

		for(int i=0; i<l; i++) {
			a[i] = sc.nextInt();
		}

		long count = 0;
		Map<Long,List<Integer>> blocks = new HashMap<Long,List<Integer>>();

		List<Integer> b = new ArrayList<Integer>();
		long cost = 0;

		for(int i=0; i<l; i++) {
			count += a[i];
			if(a[i] == 0) {
				// mapに詰めて初期化
				while(blocks.containsKey(cost)) {
					cost++;
				}
				blocks.put(cost, b);
				b = new ArrayList<Integer>();
				cost = 0;
			} else {
				b.add(a[i]);
				cost += a[i];
			}
		}

		// 最後の一個をマップに]
		if(cost != 0) {
			while(blocks.containsKey(cost)) {
				cost++;
			}
			blocks.put(cost, b);
		}

		// コスト高い順
		List<Entry<Long,List<Integer>>> blocksDesc = new ArrayList<Entry<Long,List<Integer>>>(blocks.entrySet());
		Collections.sort(blocksDesc, new Comparator<Entry<Long,List<Integer>>>() {
			public int compare(Entry<Long,List<Integer>> obj1, Entry<Long,List<Integer>> obj2) {
					return obj2.getKey().compareTo(obj1.getKey());
			}
		});

		long preCost = 0;
		long result = count;
		for(Entry<Long,List<Integer>> block : blocksDesc) {
			long blockCost = block.getKey();
			List<Integer> blockItems = block.getValue();
			if(preCost > blockCost + blockItems.size()) {
				break;
			}

			preCost = blockCost;
			result = count;
			List<Long> costList = new ArrayList<Long>();
			long mCost = 0;
			int oddCount = 0;
			for(int i : blockItems) {
				if(i == 1) {
					costList.add(mCost);
					mCost = 0;
				} else {
					if(i%2 == 0) {
						mCost += i;
					} else {
						mCost += i-1;
						oddCount++;
					}
				}
			}
			// 最後の一個をリストに
			if(mCost != 0) {
				costList.add(mCost);
			}

			// 並び替え
			Collections.sort(costList);
			Collections.reverse(costList);

			if(costList.size() == 1) {
				result -= costList.get(0);
				if(oddCount == 1) {
					result --;
				} else if(oddCount >=2) {
					result -= 2;
				}
			} else if (costList.size() == 2){
				result -= costList.get(0);
				result--;
				result -= costList.get(1);
				if(oddCount >= 1) {
					result --;
				}
			} else {
				result -= costList.get(0);
				result--;
				result -= costList.get(1);
				result--;
				result -= costList.get(2);
			}
		}

		System.out.println(result);

	}

}
