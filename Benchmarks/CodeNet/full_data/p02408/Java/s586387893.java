import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String[] tramp = { "S", "D", "H", "C" };

		// トランプの各図柄の配列を作る
		try {
			int[] S;
			S = new int[12];
			int[] D;
			D = new int[12];
			int[] H;
			H = new int[12];
			int[] C;
			C = new int[12];

			Main fmc = new Main();

			// テキスト入力
			Scanner sc = new Scanner(System.in);
			// タローが持っているカードの数
			int taro_card_number = sc.nextInt();
			// ループ処理
			for (int i = 0; i < taro_card_number; i++) {
				// 図柄
				String design = sc.next();
				// 数
				int number = sc.nextInt();

				// 図柄の指定に従い、数字を配列に格納
				if (design.equals("S")) {
					//
					fmc.set_property(S, number);
				}
				if (design.equals("H")) {
					fmc.set_property(H, number);
				}
				if (design.equals("D")) {
					fmc.set_property(D, number);
				}
				if (design.equals("C")) {
					fmc.set_property(C, number);
				}
			}
			// //配列に入力情報が格納されたので、入力情報にないものをピックアップして出力

			// スペードから順にないものを出力
			for (int i = 0; i < 13; i++) {

				// ないものをピックアップ
				if (S[i] == 0) {
					System.out.println("S " + i + 1);
				}
			}

			for (int i = 0; i < 13; i++) {

				// ないものをピックアップ
				if (H[i] == 0) {
					System.out.println("H " + i + 1);
				}
			}

			for (int i = 0; i < 13; i++) {

				// ないものをピックアップ
				if (C[i] == 0) {
					System.out.println("C " + i + 1);
				}
			}

			for (int i = 0; i < 13; i++) {

				// ないものをピックアップ
				if (D[i] == 0) {
					System.out.println("D " + i + 1);
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("");
		}

	}

	// 図柄の属性と数を取ってきて、配列に格納する
	public void set_property(int[] design, int number) {
		design[number] = 1;
	}

	// //配列に格納しなかったものを表示する
	// public void output_result(int[] design,int i){
	// if(design[i] == 0){
	// System.out.println()
	// }
	// }

}