import java.util.Arrays;
import java.util.Scanner;

/**
 * N 枚のカードがあり、i 枚目のカードには ai という数が書かれています。 Alice と Bob はこれらのカードを使ってゲームを行います。ゲームでは
 * 2 人が交互に 1 枚ずつカードを取っていきます。Alice が先にカードを取ります。 2
 * 人がすべてのカードを取ったときゲームは終了し、取ったカードの数の合計がその人の得点になります。2
 * 人とも自分の得点を最大化するように最適戦略をとったとき、Alice は Bob より何点多くの得点を獲得できるかを求めてください。
 *
 * @author tsuch
 *
 */
public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Main instance = new Main();
		instance.solve();
	}

	private void solve() {
		try {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);

			int b = 0;
			int c = 0;

			for (int i = n - 1; i >= 0; i--) {
				if (i % 2 == 0) {
					b = b + a[i];
				} else {
					c = c + a[i];
				}
			}
			System.out.println(Math.abs(b - c));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}