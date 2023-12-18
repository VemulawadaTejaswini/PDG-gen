import java.util.*;
 
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(), k = sc.nextLong();
		List<Long> positive = new ArrayList<>();
		List<Long> negative = new ArrayList<>();
		for(long i = 0; i < n; i++) {
			long x = sc.nextLong();
			if(x < 0) {
				negative.add(x);
			} else {
				positive.add(x);
			}
		}
		Collections.sort(negative, Comparator.reverseOrder());
		long ans = Long.MAX_VALUE;
		for(long i = 0; i < k - 1 && i < negative.size() && positive.size() >= k - i - 1; i++) {
			ans = Math.min(ans, positive.get(k - i - 2) - 2 * negative.get(i));
		}
		if(negative.size() > 0 && negative.size() >= k) {
			ans = Math.min(ans, -negative.get(k - 1));
		}
		for(long i = 0; i < k - 1 && i < positive.size() && negative.size() >= k - i - 1; i++) {
			ans = Math.min(ans, 2 * positive.get(i) - negative.get(k - i - 2));
		}
		if(positive.size() > 0 && positive.size() >= k) {
			ans = Math.min(ans, positive.get(k - 1));
		}
		System.out.println(ans);
	}
}