
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] c = new char[H][W];

		for (int i = 0; i < H;  i++){
				c[i] = sc.next().toCharArray();

		}


		for (int i = 0; i < W + 2 ;i++) {

				System.out.print("#");


		}
		System.out.println("");

//		for (int i = 1; i < H -1 ;i++) {
//			for (int j = 0; j < W + 2;j++) {
//				System.out.print("#");
//			}
//			System.out.println("");
//		}


		for (int i = 0; i < H;i++) {
			System.out.print("#");
			for (int j = 0; j < W; j++) {
			System.out.print(c[i][j]);
			}
			System.out.println("#");
		}
		for (int i = 0; i < W + 2 ;i++) {

				System.out.print("#");

		}

		System.out.println("");

	}

}
