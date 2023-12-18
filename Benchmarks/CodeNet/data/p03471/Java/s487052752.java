
import java.util.Scanner;

/**
 * C - Otoshidama<br>
 * https://atcoder.jp/contests/abc085/tasks/abc085_c<br>
 * https://qiita.com/drken/items/e77685614f3c6bf86f44
 */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int Y = in.nextInt();

		int man = Y / 10000;
		int gosen = 0;
		int sen = 0;

		int work = Y - man * 10000;
		if (work >= 5000) {
			gosen++;
			work -= 5000;
		}

		if (work >= 1000) {
			sen = work / 1000;
		}

		int minCnt = man + gosen + sen;
		if (N < minCnt) {
			System.out.println("-1 -1 -1");
			return;
		}

		// 歩幅は限定される 1, 5, 9
		int diff = N - minCnt;
		while (man > 0 && diff > 0) {
			if (diff >= 9) {
				diff -= 9;
				man -= 1;
				sen += 10;
			} else if (diff >= 5) {
				diff -= 5;
				man -= 1;
				gosen += 1;
				sen += 5;
			} else if (diff >= 1) {
				diff -= 1;
				man -= 1;
				gosen += 2;
			}
		}

		// 5000 -> -1 + 5 = 4
		while (gosen > 0 && diff > 0) {
			diff -= 4;
			gosen -= 1;
			sen += 5;
		}

		if (diff == 0) {
			System.out.println(man + " " + gosen + " " + sen);
		} else {
			System.out.println("-1 -1 -1");
		}
	}
}
