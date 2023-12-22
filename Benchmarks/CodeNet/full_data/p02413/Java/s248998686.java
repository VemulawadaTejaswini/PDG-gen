// 表の行数rと列数c、r × c の要素を持つ表を読み込んで、各行と列の合計を挿入した新しい表を出力するプログラムを作成して下さい。
// 最初の行にrとcが空白区切りで与えられます。続くr行にそれぞれc個の整数が空白区切りで与えられます。
// 各行の最後の列としてその行の合計値を、各列の最後の行としてその列の合計値を、最後の行・列に表全体の合計値を挿入して下さい。
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int r, c;
		String str = null;

		// r, c読み込み
		str = scan.nextLine();
		String[] spl = str.split(" ");
		r = Integer.parseInt(spl[0]);
		c = Integer.parseInt(spl[1]);

		// 各行の列読み込み・変換用変数を定義
		String[] input_data = new String[c];
		int[][] input_trans = new int[(r+1)][(c+1)];

		int i = 0;
		int j = 0;

		// 合計値を格納する要素を初期化
		for(i=0; i<r; i++){
			input_trans[i][c] = 0;
		}
		for(j=0; j<c; j++){
			input_trans[r][j] = 0;
		}
		// r行分ループし行列読み込み
		for(i=0; i<r; i++){
			str = scan.nextLine();
			input_data = str.split(" ");
			for(j=0; j<c; j++){
				input_trans[i][j] = Integer.parseInt(input_data[j]);
				input_trans[i][c] = input_trans[i][c] + input_trans[i][j];
				input_trans[r][j] = input_trans[r][j] + input_trans[i][j];
				input_trans[r][c] = input_trans[r][c] + input_trans[i][j];
			}
		}
		// 行列と各列の合計値を出力
		for(i=0; i<(r+1); i++){
			for(j=0; j<(c+1); j++){
				if(j == c){
					System.out.println(input_trans[i][j]);
				} else{
					System.out.print(input_trans[i][j] + " ");
				}
			}
		}

	}
}
