import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] nums = new int[N];
			for (int i = 0; i < N; i++) {
				nums[i] = sc.nextInt();
			}
			long total = 0;
			long no = 0;
			for (int i = N - 1; i > 0; i--) {
				for (int j = i - 1; j >= 0; j--) {
					if (nums[j] > nums[i]) {
						total++;
					}else if(nums[j] < nums[i]) {
						no ++;
					}
				}
			}
			long div = 1000000007;

			BigDecimal k = new BigDecimal(K).multiply(new BigDecimal(K + 1)).divide(new BigDecimal(2));
			BigDecimal NO =  new BigDecimal(K).multiply(new BigDecimal(K - 1)).divide(new BigDecimal(2));
			long ans = k.multiply(new BigDecimal(total)).add(NO.multiply(new BigDecimal(no))).remainder(new BigDecimal(div)).longValue();
			System.out.println(ans);
		}
	}
}