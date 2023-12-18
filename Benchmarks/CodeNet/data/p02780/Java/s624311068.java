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
			int max = 0;
			for(int i = 0 ; i < k ; i++) {
				max += p[i];
			}
			int start = 0;
			for(int i = k ; i < n ; i++) {
				int now = max - p[i - k] + p[i];
				if(now > max) {
					max = now;
					start = i - k + 1;
				}
			}
			double ans = 0.0;
			for(int i = start ; i < start + k ; i++) {
				ans += getEx(p[i]);
			}
//			ans = ans.setScale(6);
			System.out.println(ans);
		}

	}

	private static double getEx(int num) {
		long sum = 0;
		double a = num;
		for(int i = 1 ; i <= num ; i++) {
			sum += i;
		}
		return sum / a;
	}
//	private static BigDecimal getEx(int num) {
//		long sum = 0;
//		for(int i = 1 ; i <= num ; i++) {
//			sum += i;
//		}
//		return BigDecimal.valueOf(sum).divide(BigDecimal.valueOf(num), 20, BigDecimal.ROUND_HALF_UP);
//	}
}
