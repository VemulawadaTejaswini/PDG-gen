import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		int[][] C = new int[H][W];
		for (int i = 0; i < H; i++) {
			char[] c = sc.next().toCharArray();
			for (int j = 0; j < W; j++) {
				if (c[j] == '.') {
					C[i][j] = 0; // white
				} else {
					C[i][j] = 1; // black
				}
			}
		}
		sc.close();

		// bit全探索を2重に行う
		int ans = 0;
		// H loop
		for (int h = 0; h < (Math.pow(2, H)); h++) {
			for (int w = 0; w < (Math.pow(2, W)); w++) {
				int cnt = 0;
				for (int j = 0; j < H; j++) {
					for (int k = 0; k < W; k++) {
						if ((1 & h >> j) == 0 && (1 & w >> k) == 0 && C[j][k] == 1) {
							cnt++;
						}
					}
				}
				if (cnt == K) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
