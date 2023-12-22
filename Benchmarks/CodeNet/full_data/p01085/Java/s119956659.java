import java.util.Scanner;

public class Main
{

	// 絶対値を求める関数
	static int abs(int a)
	{
		if (a < 0) {
			a = -a;
		}
		return a;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int p[] = new int[200];

		int m = sc.nextInt();
		int nMin = sc.nextInt();
		int nMax = sc.nextInt();

		while (m + nMin + nMax > 0) {

			// 得点を入力
			for (int i = 0;i < m;i++) {
				p[i] = sc.nextInt();
			}

			// ギャップの最大値（最初は0を入れておく）
			int bestGap = 0;

			// ギャップが最大になるときの合格者数
			int bestN = nMin;

			for (int n = nMin;n <= nMax;++n) {
				// 合格者の中の最低点
				int x = p[n - 1];

				// 不合格者の中の最高点
				int y = p[n];

				// ギャップが最大ならば更新
				// （タイの場合も合格者数を最大にしたいので更新）
				if (x - y >= bestGap) {
					bestGap = x - y;
					bestN = n;
				}
			}

			System.out.println(bestN);

			m = sc.nextInt();
			nMin = sc.nextInt();
			nMax = sc.nextInt();
		}
	}
}

