import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int v = sc.nextInt();
		int b = sc.nextInt();
		int w = sc.nextInt();
		int t = sc.nextInt();

		// 子Bの逃げる速さが、鬼Aと同速かそれ以上だったら、永遠に追いつけない
		if (v <= w) {
			System.out.println("NO");
			return;
		}

		// ２人の距離は１秒にどれくらい縮まるか？
		int speed = v - w;

		// ２人は最初どのくらい離れているか？
		int dis = (a < b) ? (b - a) : (a - b);

		// 追いつくのに何秒かかるか？
		int need = dis / speed;

		// t秒以内に追いつけたらYES
		System.out.println((need <= t) ? "YES" : "NO");
	}

}
