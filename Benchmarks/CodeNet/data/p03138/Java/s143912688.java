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

		long n = sc.nextInt();
		long k = sc.nextLong();

		Map<Long, Long> oneCountMap = new HashMap<Long, Long>();

		long maxLength = 0;
		for(long i= 0; i < n; i++) {
			// 01 に変換する
			String s = Long.toBinaryString(sc.nextLong());

			char[] c = s.toCharArray();
			if(maxLength < c.length) {
				maxLength = c.length;
			}

			for(int j = c.length - 1; j >= 0; j--) {
				long key = c.length - j;
				if(c[j] == '1') {
					if(oneCountMap.containsKey(key)) {
						oneCountMap.put(key, oneCountMap.get(key) + 1);
					} else {
						oneCountMap.put(key, 1L);
					}
				}
			}
		}

		String s = Long.toBinaryString(k);
		long maxMapSize = Math.max(maxLength, s.length());

		long sumA = 0;
		Map<Long,Long> reversAmtMap = new HashMap<Long,Long>();
		for(long i = maxMapSize; i > 0; i--) {
			long amt = (long) Math.pow(2, i-1);
			long zeroCount = 0;
			long oneCount = 0;
			if(oneCountMap.containsKey(i)) {
				oneCount = oneCountMap.get(i);
			}
			zeroCount = n-oneCount;

			if(zeroCount > oneCount) {
				// ZEROを1にしてたしたい
				// 変えた時の差分
				reversAmtMap.put(amt, amt*zeroCount-amt * oneCount);
				sumA += amt * oneCount;
			} else {
				// そのままでいい
				sumA += amt * oneCount;
			}
		}

		// 足したら大きくなるほうから並び替え
		List<Entry<Long, Long>> reverseAmtDesc = new ArrayList<Entry<Long, Long>>(reversAmtMap.entrySet());
		Collections.sort(reverseAmtDesc, new Comparator<Entry<Long, Long>>() {
			public int compare(Entry<Long, Long> obj1, Entry<Long, Long> obj2) {
					return obj2.getValue().compareTo(obj1.getValue());
			}
		});

		long maxK = 0;
		for(Entry<Long, Long> e : reverseAmtDesc) {
			long amt = e.getValue();
			long key = e.getKey();
			if(k >= maxK + key) {
				// 1にする
				sumA += amt;
				maxK += key;
			}
		}


		System.out.println(sumA);

	}

}
