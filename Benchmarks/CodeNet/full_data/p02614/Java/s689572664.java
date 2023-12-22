import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		int[][] C = new int[H][W];
		int sum = 0;
		int[] HOR = new int[H];
		int[] VER = new int[W];
		for (int i = 0; i < H; i++) {
			char[] c = sc.next().toCharArray();
			for (int j = 0; j < W; j++) {
				if (c[j] == '.') {
					C[i][j] = 0; // white
				} else {
					C[i][j] = 1; // black
					sum++;
					HOR[i]++;
					VER[j]++;
				}
			}
		}
		sc.close();

		// bit全探索を2重に行う
		int ans = 0;
		// H loop
		for (int i = 0; i < (Math.pow(2, H)); i++) {
			for (int j = 0; j < H; j++) {
				int horizon = 0;
				if ((1 & i >> j) == 1) {
					horizon += HOR[j];
					// W loop
					for (int k = 0; k < (Math.pow(2, W)); k++) {
						int plus = 0;
						int vertical = 0;
						for (int l = 0; l < W; l++) {
							if ((1 & k >> l) == 1) {
								plus += C[j][l];
								vertical += VER[l];
							}
						}
						if ((sum - horizon - vertical + plus) == K) {
							ans++;
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}
