import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static long[] nums;
	public static Set<Integer> S = new HashSet<>();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		nums = new long[N + 1];
		for (int i = 0; i <=N; i++) {
			nums[i] = -1;
		}
		nums[1] = 1;

		for (int i = 0; i < K; i++) {
			int L = scan.nextInt();
			int R = scan.nextInt();

			for (int k = L; k <= R; k++) {
				S.add(k);
			}
		}

		System.out.println(sum(N) % 998244353);
	}

	public static long sum(int i) {
		nums[i] = 0;
		for (int k : S) {
			if (i - k > 0) {
				nums[i] += nums[i - k] != -1 ? nums[i - k] : sum(i - k);
				nums[i] %= 998244353;
			}
			else break;
		}
		return nums[i];
	}
}