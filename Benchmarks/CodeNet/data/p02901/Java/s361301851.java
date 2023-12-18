import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {

			int N = scan.nextInt();
			int M = scan.nextInt();

			int[] dp = new int[1 << N];

			for (int i = 0; i < 1 << N; ++i)
				dp[i] = 1001001;

			List<List<Integer>> key = new ArrayList<>();

			for (int i = 0; i < M; i++) {
				int v = scan.nextInt();
				int keyNum = scan.nextInt();
				int s = 0;
				for (int j = 0; j < keyNum; j++) {
					int c = scan.nextInt();
					c--;
					s |= 1 << c;
				}
				List<Integer> a = Arrays.asList(v, s);
				key.add(a);
			}

			dp[0] = 0;
			for (int s = 0; s < 1 << N; s++) {
				for (int i = 0; i < M; i++) {
					int t = s | key.get(i).get(1);
					int v = key.get(i).get(0);
					dp[t] = Math.min(dp[t], v + dp[s]);
				}
			}

			int ans = dp[(1 << N)-1];

			if (ans == 1001001) {
				System.out.println(-1);
			} else {
				System.out.println(ans);
			}

		}
	}
}