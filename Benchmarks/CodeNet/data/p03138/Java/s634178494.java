import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextInt();
		long k = sc.nextLong();

		Map<Long, Long> zeroCountMap = new HashMap<Long, Long>();
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
				if(c[j] == '0') {
					if(zeroCountMap.containsKey(key)) {
						zeroCountMap.put(key, zeroCountMap.get(key) + 1);
					} else {
						zeroCountMap.put(key, 1L);
					}
				} else {
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

		long maxK = 0;
		long sumA = 0;
		// 一番上をあきらめたやつ
		long sumB = 0;
		for(long i = maxMapSize; i > 0; i--) {
			long amt = (long) Math.pow(2, i-1);
			long zeroCount = 0;
			long oneCount = 0;
			if(oneCountMap.containsKey(i)) {
				oneCount = oneCountMap.get(i);
			}
			if(zeroCountMap.containsKey(i)) {
				zeroCount = zeroCountMap.get(i);
			} else {
				zeroCount = n-oneCount;
			}

			if(zeroCount > oneCount) {
				if(maxK+amt <= k) {
					// ZEROを1にしてたす
					sumA += amt * zeroCount;
					maxK += amt;
				}
				if(i >= s.length()) {
					sumB += amt * oneCount;
				} else {
					sumB += amt * zeroCount;
				}
			} else {
				sumA += amt * oneCount;
				sumB += amt * oneCount;
			}
		}


		System.out.println(Math.max(sumA, sumB));

	}

}
