import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//全体のボールの数
		int n = sc.nextInt();
		//青いボールの数
		int a = sc.nextInt();
		//赤いボールの数
		int b = sc.nextInt();

		//小数点切り捨てた結果
		int num = n / (a + b);

		num = num * a;

		int amari = n % (a + b);

		//numが入力した値の比較判定
		if (amari <= a) {
			num += amari;

		} else if (amari > a) {
			num += a;
		}
		System.out.println(num);

		sc.close();
	}

}
