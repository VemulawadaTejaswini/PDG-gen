import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static class Range{
		long low;
		long high;
		public Range(long l , long h) {
			low =  Math.min(l, h);
			high = Math.max(l, h);
		}
		@Override
		public String toString() {
			return low + ":" + high;
		}
	}
	static long solve(int N , long X , long D) {
		if(D == 0) {
			return X != 0 ? N + 1: 0;
		}
		if(D < 0) {
			return solve(N , - X , - D);
		}
		Map<Long, List<Range>> ranges = new HashMap<Long, List<Range>>();
		for(long k = 0 ; k <= N ; ++k) {
			long low = (k - 1) * k / 2;
			long high = k * (- 1 + 2 * N - k) / 2;
			long m = (k * X) % D;
			if(!ranges.containsKey(m)) {
				List<Range> lst = new ArrayList<Range>();
				ranges.put(m, lst);
			}
			List<Range> lst = ranges.get(m);
			lst.add(new Range(low * D + k * X, high * D + k * X));
		}
		long S = 0;
		for(long k : ranges.keySet()) {
			List<Range> lst = ranges.get(k);
			if(X < 0) {
				Collections.reverse(lst);
			}
			Range cur = lst.get(0);
			for(int i = 1 ; i < lst.size() ; ++i) {
				Range li = lst.get(i);
				if(cur.high < li.low) {
					S += (cur.high - cur.low + D) / D;
					cur = li;
				}else {
					cur.high = li.high;
				}
			}
			S += (cur.high - cur.low + D) / D;
		}
		return S;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long X = sc.nextLong();
		long D = sc.nextLong();
		System.out.println(solve(N , X , D));
	}
}
