import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		final int[] C = new int[N];
		int[][] A = new int[N][M];
		int[] T = new int[M];
		int ans = 0;
		for (int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
			ans += C[i];
			for (int j = 0; j < M; j++) {
				A[i][j] = sc.nextInt();
				T[j] += A[i][j];
			}
		}
		sc.close();

		// 作れないパターン
		for (int i = 0; i < M; i++) {
			if (T[i] < X) {
				System.out.println(-1);
				return;
			}
		}

		// コスト順に並べたindexリストを作成
		ArrayList<Integer> index = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			index.add(i);
		}
		Collections.sort(index, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return C[o2] - C[o1];
			}
		});

		for (int i = 0; i < N; i++) {
			boolean isOk = true;
			for (int j = 0; j < M; j++) {
				if (T[j] - A[index.get(i)][j] < X) {
					isOk = false;
					break;
				}
			}
			if (isOk) {
				ans -= C[index.get(i)];
				for (int j = 0; j < M; j++) {
					T[j] -= A[index.get(i)][j];
				}
			}
		}

		System.out.println(ans);
	}
}
