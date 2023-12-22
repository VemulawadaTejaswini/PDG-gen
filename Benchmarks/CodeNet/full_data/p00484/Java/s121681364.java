import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		ArrayList<ArrayList<Integer>> p = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < 10; ++i) {
			p.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < N; ++i) {
			int C = sc.nextInt();
			int G = sc.nextInt() - 1;
			p.get(G).add(C);
		}
		for (int i = 0; i < 10; ++i) {
			Collections.sort(p.get(i));
			Collections.reverse(p.get(i));
		}
		int[][] dp = new int[11][K + 1];
		for (int i = 0; i < 10; ++i) {
			ArrayList<Integer> b = p.get(i);
			int sum = 0;
			for (int j = 0; j <= Math.min(b.size(), K); ++j) {
				if (j != 0) {
					sum += b.get(j - 1);
					sum += 2 * (j - 1);
				}
				for (int k = 0; k + j <= K; ++k) {
					dp[i + 1][k + j] = Math.max(dp[i + 1][k + j], dp[i][k] + sum);
				}
			}
		}
		System.out.println(dp[10][K]);
	}
}