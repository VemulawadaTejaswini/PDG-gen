import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();// 箱の数
		int x = sc.nextInt();// 飴の合計の最大値
		int a[] = new int[N];
		int result = 0;

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i > N; i++) {
			int s = a[i] + a[i + 1] - x;// 飴の合計値-最大値(ｘ)=最大値をオーバーした数値ｓ

			if (s > 0 && a[i] + a[i + 1] > x) {// 飴の合計がオーバーした場合
				if (a[i + 1] >= s) {// オーバーした数値が右隣の値の方が大きい場合
					a[i + 1] = a[i + 1] - s;// 右隣の飴をｓ個食べる
				} else {
					a[i] = a[i] - (s - a[+1]);// 参照-（オーバー値-右隣）
					a[i + 1] = 0;// 右隣を0にする
				}
				result += s;// 飴を食べるカウント
			}
		}
		System.out.println(result);// 飴を食べた個数のトータル
	}

}