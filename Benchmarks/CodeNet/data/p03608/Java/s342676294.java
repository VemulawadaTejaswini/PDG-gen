import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int R = sc.nextInt();
		int[] r = new int[R];
		for (int i = 0; i < R; i++) {
			r[i] = sc.nextInt() - 1;
		}

		int[] A = new int[M];
		int[] B = new int[M];
		int[] C = new int[M];
		for (int i = 0; i < M; i++) {
			A[i] = sc.nextInt() - 1;
			B[i] = sc.nextInt() - 1;
			C[i] = sc.nextInt();
		}

		sc.close();

		int INF = Integer.MAX_VALUE / 2;

		int[][] d = new int[N][N];
		for (int i = 0; i < N; i++) {
			Arrays.fill(d[i], INF);
			d[i][i] = 0;
		}

		for (int i = 0; i < M; i++) {
			d[A[i]][B[i]] = C[i];
			d[B[i]][A[i]] = C[i];
		}

		for (int k = 0; k < N; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
				}
			}
		}

		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < R; i++) {
			a.add(r[i]);
		}

		int ans = Integer.MAX_VALUE;
		for (List<Integer> l : permutations(a, a.size())) {
			int dist = 0;
			for (int i = 1; i < R; i++) {
				dist += d[l.get(i - 1)][l.get(i)];
			}

			ans = Math.min(dist, ans);
		}

		out.println(ans);

	}

	private static <T> List<List<T>> permutations(List<T> l, int r) {
		if (r == 0) {
			return new ArrayList<List<T>>() {
				{
					add(new ArrayList<T>());
				}
			};
		}

		List<List<T>> result = new ArrayList<>();

		for (int i = 0; i < l.size(); i++) {
			T a = l.get(i);
			List<T> ll = new ArrayList<>(l);
			ll.remove(i);

			List<List<T>> s = permutations(ll, r - 1);
			for (List<T> ss : s) {
				List<T> z = new ArrayList<>();
				z.add(a);
				z.addAll(ss);
				result.add(z);
			}

		}

		return result;
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
