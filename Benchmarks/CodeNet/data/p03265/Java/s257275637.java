import java.util.Scanner;

public class Main {


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);


		// 整数の入力
		int x1 = sc.nextInt();
		// スペース区切りの整数の入力
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		// 文字列の入力
		//String s = sc.next();
		// 出力
		int x3 = x2-(y2-y1);
		int y3 = y2+(x2-x1);
		int x4 = x1 -(y2-y1);
		int y4 = y1+(x2-x1);

		System.out.println(x3 +" " +y3 +" " +x4+" " +y4  );


	}
}