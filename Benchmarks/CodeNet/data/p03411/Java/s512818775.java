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

		for (int i = 2 * N - 1; i > -1; i--) {
			for (int j = 2 * N - 1; j > -1; j--) {
				if (map[i][j] != 1) {
					continue;
				}
				for (int k = i - 1; k > -1; k--) {
					tmp = 0;
					for (int l = j - 1; l > -1; l--) {
						if (map[k][l] == -1) {
							ans += 1;
							map[k][l] = 0;
							tmp = 1;
							break;
						}
					}
					if (tmp == 1) {
						break;
					}
				}
			}
		}

		System.out.println(ans);
	}
}