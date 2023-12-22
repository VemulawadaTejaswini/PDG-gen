import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			N = sc.nextInt();
			if (N == 0) {
				sc.close();
				break;
			}

			long[] sat = new long[N];// 満足度
			@SuppressWarnings("unchecked")
			ArrayList<Integer[]>[] guys = new ArrayList[N];
			for (int i = 0; i < guys.length; i++) {
				guys[i] = new ArrayList<Integer[]>();
				int M = sc.nextInt();
				sat[i] = sc.nextLong();
				for (int j = 0; j < M; j++) {
					int S = sc.nextInt();
					int E = sc.nextInt();
					Integer[] put = { S, E };
					guys[i].add(put);
				}
			}
			int[] time = new int[24];
			System.out.println(dfs(0, 0, time, guys, sat));
		}

	}

	static long dfs(int guy, long maxsat, int[] time,
			ArrayList<Integer[]>[] guys, long[] sat) {
		long ans = 0;
		// guyまで入れた時のsatとtime
		if (guy == N) {
			return maxsat;
		}

		// guyを入れられるか
		int[] clone = time.clone();
		for (Integer[] integers : guys[guy]) {
			int S = integers[0];
			int E = integers[1];
			clone[S]++;
			clone[E]--;
		}
		boolean appliable = true;
		int test = 0;
		for (int i = 0; i < clone.length; i++) {
			test += clone[i];
			if (test < 0 || test > 1) {
				appliable = false;
				break;
			}
		}
		if (appliable) {
			ans = dfs(guy + 1, maxsat + sat[guy], clone, guys, sat);
		}
		long notapply = dfs(guy + 1, maxsat, time.clone(), guys, sat);

		return Math.max(ans, notapply);

	}
}