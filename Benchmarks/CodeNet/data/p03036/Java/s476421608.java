import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int r = sc.nextInt();
		int D = sc.nextInt();
		int X2000 = sc.nextInt();

		int X = X2000 ;
		for( int i = 0 ; i < 10 ; i ++ ) {
			X = r * X - D ;
			// 出力
			System.out.println(X);
		}

	}

}
