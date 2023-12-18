import java.util.Scanner;

public class Main {
	public static int searchNext(long[] x, long[] y, boolean[] tabu, long p, long q, int id) {
		for (int i = 0; i < x.length; i++) {
			if (x[i] == x[id] + p && y[i] == y[id] + q && tabu[i] == true) {
				tabu[i] = false;
				return searchNext(x, y, tabu, p, q, i) + 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] x = new long[N];
		long[] y = new long[N];
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
		}
		sc.close();

		if (N == 1 || N == 2) {
			System.out.println(1);
			return;
		}

		boolean[] tabu = new boolean[N];

		int minCnt = Integer.MAX_VALUE;

		for (int pqi = 0; pqi < N - 1; pqi++) {
			for (int pqj = pqi + 1; pqj < N; pqj++) {
				for (int i = 0; i < N; i++) {
					tabu[i] = true;
				}
				int cnt = N;

				long p = x[pqi] - x[pqj];
				long q = y[pqi] - y[pqj];

				for (int j = 0; j < N; j++) {
					if (tabu[j] == true) {
						tabu[j] = false;
						for (int i = 0; i < N; i++) {
							if (x[i] == x[j] - p && y[i] == y[j] - q && tabu[i] == true) {
								tabu[i] = false;
								cnt -= searchNext(x, y, tabu, -p, -q, i) + 1;
							}
							if (x[i] == x[j] + p && y[i] == y[j] + q && tabu[i] == true) {
								tabu[i] = false;
								cnt -= searchNext(x, y, tabu, p, q, i) + 1;
							}
						}
					}
				}

				if (minCnt > cnt)
					minCnt = cnt;
			}
		}
		System.out.println(minCnt);
	}
}