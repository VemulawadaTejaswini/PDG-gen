/**
*/

//スキャナつかうため

import java.util.Scanner;

public class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成
		Scanner sc = new Scanner(System.in);
		//文字列を受け取る
		String moji = sc.nextLine();
		//受け取った文字数の配列の宣言
		char [] chmoji = new char [moji.length()];
		//受け取った文字の数処理を繰り返す
		for (int i =0; i<moji.length(); i++){
			// chmoji[i]   = moji.charAt(i);
			  boolean kekka = Character.isUpperCase(chmoji[i]);
			 if (kekka == true ){
				 chmoji[i] = Character.toLowerCase(chmoji[i]);
			 }else {
				 chmoji[i] = Character.toUpperCase(chmoji[i]);
			 }
			 System.out.print(chmoji[i]);

		}
		System.out.println();
	}
}