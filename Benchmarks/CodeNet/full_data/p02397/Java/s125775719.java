import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//キーボード入力メソッド
		Scanner sc = new Scanner(System.in);

		int x = 1;
		int y = 1;

		while(true) {
			x = sc.nextInt();
			y = sc.nextInt();

			//xが0のとき、終了
			if(x == 0 && y == 0) {
				break;
			}

			//処理　xとyを小大の順で並べる
			if(x > y) {
				System.out.println(y + " " + x);
			}else {
				System.out.println(x + " " + y);
			}

		}
	}

}

