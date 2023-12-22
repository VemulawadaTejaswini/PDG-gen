import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	static long mod = 998244353;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			Set<Integer> set = new TreeSet<>();
			for (int i = 0; i < K; i++) {
				int from = sc.nextInt();
				int to = sc.nextInt();
				for (int j = from; j <= to; j++) {
					set.add(j);
				}
			}
			long[] arr = new long[N + 1];
			arr[1] = 1;
			for (int i = 1; i < N; i++) {
				if (i != 1 && arr[i] == 0) {
					continue;
				}
				for (Integer e : set) {
					if (i + e > N) {
						set.remove(e);
					} else {
						arr[i + e] = (arr[i] + arr[i + e]) % mod;
					}
				}
			}
			System.out.println(arr[N]);
		}
	}
}