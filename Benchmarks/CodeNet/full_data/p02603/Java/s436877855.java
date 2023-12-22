
import java.util.*;

public class Main {

	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int p[];
		p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = Integer.parseInt(sc.next());
		}

		// 所持金と所持株
		int money = 1000;
		int kabu = 0;

		// 10株持ってるけど売るのはあえて7株にして手元に3株残しておくとか、
		// 3000円持ってるけど買うのはあえて500円分にして手元に2500円残しておくとか、
		// そういうことは考えず、買うときは全購入、売るときは全売却とする。
		// このやりかたで不正解だったら考え直そう。

		// 全売却する日を決めてしまう
		boolean uru[];
		uru = new boolean[n];
		for (int i = 0; i < n; i++) {

			// 初日は全売却しない
			if (i == 0) {
				uru[i] = false;
				continue;
			}

			// 昨日より今日が高いなら、今日全売却する
			uru[i] = (p[i - 1] < p[i]);
		}

		// n日間ループ
		for (int i = 0; i <= n; i++) {

			// 次に全売却をやるのはいつなのか検索しつつ、
			// 今日からその日までの間で一番安かった株価も検索
			int saiyasu = 9999;
			for (int j = i; j < n; j++) {

				// System.out.println("j " + j);

				if (p[j] < saiyasu) {
					saiyasu = p[j];
					// System.out.println("★" + saiyasu);
				}

				if (uru[j]) {
					// 取引
					// System.out.println("取引 " + j + " " + money);
					kabu = money / saiyasu;
					money -= kabu * saiyasu;
					money += kabu * p[j];
					// System.out.println("取引 " + j + " " + kabu + " " + money);
					i = j;
					break;
				}
			}
		}
		System.out.println(money);

	}

}