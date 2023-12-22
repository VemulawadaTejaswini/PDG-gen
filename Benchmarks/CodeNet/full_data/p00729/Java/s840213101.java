import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int N = Integer.parseInt(sc.next());
			int M = Integer.parseInt(sc.next());
			if (N == 0 && M == 0) break;
			int r = Integer.parseInt(sc.next());
			int[][] imos = new int[M][2000];
			for (int i = 0; i < r; i++) {
				int t = Integer.parseInt(sc.next());
				int n = Integer.parseInt(sc.next());
				int m = Integer.parseInt(sc.next()) - 1;
				int s = Integer.parseInt(sc.next());
				if (s == 1)
					imos[m][t]++;
				else
					imos[m][t]--;
			}
			for (int i = 0; i < M; i++) {
				for (int j = 1; j < 2000; j++) {
					imos[i][j] += imos[i][j - 1];
				}
			}
			int q = Integer.parseInt(sc.next());
			for (int i = 0; i < q; i++) {
				int s = Integer.parseInt(sc.next());
				int e = Integer.parseInt(sc.next());
				int m = Integer.parseInt(sc.next()) - 1;
				int ans = 0;
				for (int j = s; j < e; j++) {
					if (imos[m][j] != 0)
						ans++;
				}
				System.out.println(ans);
			}
		}
	}
}
