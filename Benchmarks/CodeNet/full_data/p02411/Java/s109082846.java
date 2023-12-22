// 中間試験の点数 m、期末試験の点数 f、再試験の点数 r
// 試験を受けていない場合は点数を -1
/*
	中間試験、期末試験のいずれかを欠席した場合成績は F。
	中間試験と期末試験の合計点数が 80 以上ならば成績は A 。
	中間試験と期末試験の合計点数が 65 以上 80 未満ならば成績は B。
	中間試験と期末試験の合計点数が 50 以上 65 未満ならば成績は C。
	中間試験と期末試験の合計点数が 30 以上 50 未満ならば成績は D。 ただし、再試験の点数が 50 以上ならば成績は C。
	中間試験と期末試験の合計点数が 30 未満ならば成績は F。

	m、f、r がすべて -1 のとき入力の終わりとします。

	データセットの数（生徒の数）は 50 を超えません。
*/

import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = null;
		String[] input = new String[3];
		int m, f, r;

		for(int i=0; i<50; i++){
			// 読み込み・変換
			str = scan.nextLine();
			input = str.split(" ");
			m = Integer.parseInt(input[0]);
			f = Integer.parseInt(input[1]);
			r = Integer.parseInt(input[2]);

			// m, f, rが全て-1のとき処理終了
			if(m == -1 && f == -1 && r == -1){
				break;
			} else if( m == -1 || f == -1 ){
				// 以下、出力
				System.out.println("F");
			}  else if( 80 <= (m + f) ){
				System.out.println("A");
			} else if( 65 <= (m + f) && (m + f) < 80){
				System.out.println("B");
			} else if( 50 <= (m + f) && (m + f) < 65){
				System.out.println("C");
			} else if( 30 <= (m + f) && (m + f) < 50 && 50 <= r){
				System.out.println("C");
			} else if( 30 <= (m + f) && (m + f) < 50 && r < 50){
				System.out.println("D");
			} else{
				System.out.println("F");
			}
		}
	}
}
