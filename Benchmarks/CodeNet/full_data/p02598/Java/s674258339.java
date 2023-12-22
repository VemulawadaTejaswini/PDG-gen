import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Shojin
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long k = sc.nextLong();
			Long[] A = new Long[n];
			long tmp = 0;
			for (int i = 0; i < n; i++) {
				long next = sc.nextLong();
				A[i] = next;
				tmp += next;
			}
			final long sum = tmp;
			Arrays.sort(A, (x, y) -> x / ((x * k / sum) + 1) > y / ((y * k / sum) + 1) ? 1 : -1);
			if (k == 0) {
				System.out.println(A[n - 1]);
				return;
			}
			int[] cutCnt = new int[n];
			int cutCntSum = 0;
			for (int i = 0; i < n; i++) {
				long cnt = A[i] * k / sum;
				cutCnt[i] = (int) cnt;
				cutCntSum += (int) cnt;
			}
			long ans = 0;
			for (int i = n - 1; i >= 0; i--) {
				if (cutCntSum < k) {
					cutCnt[i]++;
					cutCntSum++;
				}
				if (cutCnt[i] == 0) {
					ans = Math.max(ans, A[i]);
					continue;
				}
				if (A[i] % cutCnt[i] == 0) {
					ans = Math.max(ans, A[i] / (cutCnt[i] + 1));
				} else {
					ans = Math.max(ans, A[i] / (cutCnt[i] + 1) + 1);
				}
			}
			System.out.println(ans);
		}
	}
}