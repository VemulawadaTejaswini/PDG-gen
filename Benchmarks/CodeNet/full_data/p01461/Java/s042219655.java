import java.util.*;

public class Main {
	static long[] U;
	static long[] T;
	static long[] S;
	static long[] D;
	static int N;
	static ArrayList<Integer>[] g;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		g = new ArrayList[N];
		for (int i = 0; i < N; ++i)
			g[i] = new ArrayList<>();

		for (int i = 0; i < N - 1; ++i) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			g[i].add(a);
			g[i].add(b);
		}

		U = new long[N];
		T = new long[N];
		S = new long[N];
		D = new long[N];

		U[N - 1] = 1;
		for (int i = N - 2; i >= 0; --i) {
			for (int dst : g[i]) {
				U[i] += U[dst];
			}
		}
		for (int i = N - 2; i >= 0; --i) {
			for (int dst : g[i]) {
				T[i] += T[dst] + U[dst];
			}
		}
		for (int i = 0; i < N; ++i) {
			for (int dst : g[i]) {
				D[dst] = D[i] + 1;
			}
		}
		for (int i = N - 2; i >= 0; --i) {
			int l = g[i].get(0);
			int r = g[i].get(1);
			S[i] = U[l] + U[r] + T[l] + T[r];
			S[i] = Math.min(S[i], U[l] + T[l] + D[r] + S[r]);
			S[i] = Math.min(S[i], U[r] + T[r] + D[l] + S[l]);
			S[i] = Math.min(S[i], 2 + D[i] + S[r] + S[l]);
		}

		System.out.println(S[0]);

	}
}