import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long k = sc.nextLong();

		Map<Integer, Integer> zeroCountMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> oneCountMap = new HashMap<Integer, Integer>();

		int maxLength = 0;
		for(int i= 0; i < n; i++) {
			// 01 に変換する
			String s = Long.toBinaryString(sc.nextLong());

			char[] c = s.toCharArray();
			if(maxLength < c.length) {
				maxLength = c.length;
			}

			for(int j = c.length - 1; j >= 0; j--) {
				int key = c.length - j;
				if(c[j] == '0') {
					if(zeroCountMap.containsKey(key)) {
						zeroCountMap.put(key, zeroCountMap.get(key) + 1);
					} else {
						zeroCountMap.put(key, 1);
					}
				} else {
					if(oneCountMap.containsKey(key)) {
						oneCountMap.put(key, oneCountMap.get(key) + 1);
					} else {
						oneCountMap.put(key, 1);
					}
				}
			}
		}

		String s = Long.toBinaryString(k);
		int maxMapSize = Math.max(maxLength, s.length());

		long maxK = 0;
		long sum = 0;
		for(int i = maxMapSize; i > 0; i--) {
			long amt = (long) Math.pow(2, i-1);
			int zeroCount = 0;
			int oneCount = 0;
			if(oneCountMap.containsKey(i)) {
				oneCount = oneCountMap.get(i);
			}
			if(zeroCountMap.containsKey(i)) {
				zeroCount = zeroCountMap.get(i);
			} else {
				zeroCount = n-oneCount;
			}

			if(((zeroCount ==0 && oneCount==0) || zeroCount > oneCount) && maxK+amt <= k) {
				// ZEROを1にしてたす
				sum += amt * zeroCount;
				maxK += amt;
			} else {
				sum += amt * oneCount;
			}
		}


		System.out.println(sum);

	}

}
