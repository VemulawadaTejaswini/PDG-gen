import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//xとyの値を入力
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		//昇順に出力
		while (true) {

			//xとyに0が入力されたら終了
			if ((x == 0) && (y == 0)) break;

			//xとyを昇順に出力
			if (x > y) {
				System.out.println(y + " " + x);
			} else {
				System.out.println(x + " " + y);
			}

			//xとyを入力
			x = sc.nextInt();
			y = sc.nextInt();
		}

	}

}