import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

	private static final Map<Integer, Long> numValMap = new HashMap<>();

	private static long evaluate(int mask, boolean filterOutMatched) {
		long result = 0;
		Iterator<Integer> iter = numValMap.keySet().iterator();
		while (iter.hasNext()) {
			int a = iter.next();
			long b = numValMap.get(a);
			if ((a | mask) == mask) {
				result += b;
				if (filterOutMatched) {
					iter.remove();
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		try (Scanner  in = new Scanner(System.in)) {
			final int N = in.nextInt();
			final int K = in.nextInt();
			for (int i = 0; i < N; ++i) {
				int a = in.nextInt();
				int b = in.nextInt();
				if (a <= K) {
					numValMap.putIfAbsent(a, 0L);
					numValMap.put(a, b + numValMap.get(a));
				}
			}

			int lowMask = Integer.highestOneBit(K) - 1;
			int hiMask = ~lowMask;

			long result = 0;
			long resSaved = 0;
			while (lowMask != 0) {
				long r1 = resSaved + evaluate(((hiMask << 1) & K) | lowMask, false);
				long r2 = resSaved + evaluate(hiMask & K, true);
				resSaved = r2;
				result = Math.max(result, r1);
				result = Math.max(result, r2);
				do {
					lowMask >>= 1;
					hiMask >>= 1;
				} while (lowMask != 0 && ((lowMask + 1) & K) == 0);
			}
			if ((K & 1) == 1) {
				result = Math.max(result, resSaved + evaluate(K, true));
			}

			System.out.println(result);
		}
	}
}
