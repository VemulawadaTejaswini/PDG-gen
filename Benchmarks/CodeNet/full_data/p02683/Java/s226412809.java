import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int[] C = new int[N];
		int[][] A = new int[N][M];
		int[] S = new int[M];
		int ans = 0;
		for (int j = 0; j < M; j++) {
			S[j] = 0;
		}
		for (int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
			for (int j = 0; j < M; j++) {
				A[i][j] = sc.nextInt();
				S[j] += A[i][j];
			}
			ans += C[i];
		}
		if (!overX(S, X)) {
			System.out.println("-1");
			return;
		}
		for (List<Integer> list : getPermutations(N - 1)) {
			for (int j = 0; j < M; j++) {
				S[j] = 0;
			}
			int cost = 0;
			for (int i : list) {
				cost += C[i];
				for (int k = 0; k < M; k++) {
					S[k] += A[i][k];
				}
				if (cost < ans && overX(S, X)) {
					ans = cost;
					break;
				}
				if (cost >= ans) {
					break;
				}
			}
		}
		System.out.println(ans);
	}

	public static boolean overX(int[] S, int X) {
		for (int i = 0; i < S.length; i++) {
			if (S[i] < X) {
				return false;
			}
		}
		return true;
	}

	private static List<List<Integer>> getPermutations(Integer n) {
		if (n == null || n < 0)
			return null;
		List<List<Integer>> results = new ArrayList<List<Integer>>();

		if (n == 0) {
			results.add(new ArrayList<Integer>(Arrays.asList(0)));
			return results;
		}

		List<List<Integer>> prevResults = getPermutations(n - 1);

		for (List<Integer> permutation : prevResults) {
			for (int i = 0; i <= n; ++i) {
				permutation.add(i, n);
				results.add(new ArrayList<Integer>(permutation));
				permutation.remove(n);
			}
			permutation.clear();
		}
		prevResults.clear();

		return results;
	}
}