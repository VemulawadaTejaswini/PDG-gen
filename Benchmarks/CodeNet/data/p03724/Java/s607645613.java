
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] t = new int[N + 1][N + 1];
		int[][] n = new int[N + 1][N + 1];
		int M = in.nextInt();
		for (int i = 0; i < M; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			if (a > b) {
				int c = a;
				a = b;
				b = c;
			}
			List<Integer> route = new ArrayList<>();
			route.add(a);
			route = search(n, M, a, b, route);
			for (int j = 0; j < route.size() - 1; j++) {
				int l = route.get(j);
				int r = route.get(j + 1);
				if (l > r) {
					int c = l;
					l = r;
					r = c;
				}
				t[l][r]++;
				n[l][r] = 1;
				n[r][l] = 1;
			}
		}

		boolean valid = true;
		for (int i = 1; i <= M; i++) {
			for (int j = 1; j <= M; j++) {
				if (t[i][j] != 0 && t[i][j] % 2 != 0) {
					valid = false;
				}
			}
		}
		System.out.println(valid ? "YES" : "NO");
	}

	private static List<Integer> search(int[][] n, int M, int a, int b, List<Integer> route) {
		if (a == b)
			return route;
		for (int i = 1; i <= M; i++) {
			if (n[a][i] > 0) {
				if (!route.contains(i)) {
					route.add(i);
					search(n, M, i, b, route);
					if (!route.contains(b)) {
						route.remove(Integer.valueOf(i));
						continue;
					} else {
						break;
					}
				}
			}
		}
		if (route.size() == 1) {
			route.add(b);
		}
		return route;
	}

}
