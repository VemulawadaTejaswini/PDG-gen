
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//入力データを変数で受け取る
		int n = sc.nextInt();

		int a = sc.nextInt();
		int b = sc.nextInt();


		//入力データを処理して、結果を出力
		int d = Math.abs(a - b);
		if(d % 2 == 0) {
			System.out.println("Alice");
		} else {
			System.out.println("Borys");
		}

	}
}
