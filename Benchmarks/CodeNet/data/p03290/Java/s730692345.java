import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 値を取得
		int d = sc.nextInt();
		int g = sc.nextInt();
		int[] p = new int[d];
		int[] c = new int[d];
		// 組み合わせの2進数用
		int bin = 0;
		// 最終的に出力する結果
		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < d; i++) {
			p[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}

		// 全てのパターンを網羅するために
		bin = (int) Math.pow(2, d);
		for (int i = 0; i < bin; i++) {
			// 計算中の点数
			int point = 0;
			// 計算中の問題数
			int cnt = 0;
			// 完全に解かない問題の中で最も採点の高いものの点数
			int max = 0;

			for (int j = d - 1; j > 0 ; j--) {
				if (Integer.toBinaryString(i).substring(j).startsWith("1")) {
					point += p[j] * (j + 1) * 100 + c[j];
					cnt += p[j];
				} else if (max < j) {
					max = j;
				}
			}
			if (g <= point) {
				if (cnt < ans) {
					ans = cnt;
				}
			} else {
				int x = p[max];
				while (0 < x) {
					point += (max + 1) * 100;
					cnt++;
					x--;
					if (g <= point) {
						if (cnt < ans) {
							ans = cnt;
							break;
						}
					}
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
