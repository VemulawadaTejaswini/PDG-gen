import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int map[][] = new int[N * 2][N * 2];
		int tmpx = 0;
		int tmpy = 0;
		for (int i = 0; i < N; i++) {
			tmpx = sc.nextInt();
			tmpy = sc.nextInt();
			map[tmpx][tmpy] = -1;
		}
		for (int i = 0; i < N; i++) {
			tmpx = sc.nextInt();
			tmpy = sc.nextInt();
			map[tmpx][tmpy] = 1;
		}
		int ans = 0;
		int tmp = 0;
		int diff = 0;
		int tmpk = 0;
		int tmpl = 0;

		for (int i = 0; i < 2 * N; i++) {
			for (int j = 0; j < 2 * N; j++) {
				if (map[i][j] != 1) {
					continue;
				}
				diff = 40000;
				tmp = 0;
				for (int k = i - 1; k > -1; k--) {
					for (int l = j - 1; l > -1; l--) {
						if (map[k][l] == -1) {
							if (diff > j - l) {
								diff = j - l;
								tmpk = k;
								tmpl = l;
								tmp = 1;
							}
						}
					}
				}
				if (tmp == 1) {
					ans += 1;
					map[tmpk][tmpl] = 0;
				}
			}
		}

		System.out.println(ans);
	}
}
