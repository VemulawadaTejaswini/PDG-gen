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
		//長さがnになるまで
		int count = n % (a + b);

		//numが入力した値の比較判定
		if(num <= a) {
			System.out.println(a * num + count);
		}
		else {
			System.out.println(a * num + a);
		}

		sc.close();
	}

}
