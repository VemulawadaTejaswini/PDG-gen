import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] p = new int[n];
			for(int i = 0 ; i < n ; i++) {
				p[i] = sc.nextInt();
			}
			BigDecimal max = BigDecimal.ZERO;
			for(int i = 0 ; i < k ; i++) {
				max = max.add(getEx(p[i]));
			}
			BigDecimal start = getEx(p[0]);
			BigDecimal pre = max;
			for(int i = k ; i < n ; i++) {
				BigDecimal now = pre.subtract(start).add(getEx(p[i]));
				if(now.compareTo(max) > 0) {
					max = now;
				}
				start =  getEx(p[i - k + 1]);
				pre = now;
			}
			max = max.setScale(6);
			System.out.println(max.toString());
		}

	}

	private static BigDecimal getEx(int num) {
		long sum = 0;
		for(int i = 1 ; i <= num ; i++) {
			sum += i;
		}
		return BigDecimal.valueOf(sum).divide(BigDecimal.valueOf(num), 20, BigDecimal.ROUND_HALF_UP);
	}
}
