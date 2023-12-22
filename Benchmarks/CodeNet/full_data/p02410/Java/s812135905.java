import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		// 配列の縦横入力
		String str = scan.nextLine();
		String[] spl = str.split(" ");
		// 入力した文字列を数値に変換
		int n = Integer.parseInt(spl[0]);
		int m = Integer.parseInt(spl[1]);
		// カウンタ変数
		int i=0;
		int j=0;

		String[] input = new String[m];
		int[][] a = new int[n][m];
		int[] b = new int[m];
		int[] c = new int[n];


		// a行列を入力
		for(i=0; i<n; i++){
			str = scan.nextLine();
			input = str.split(" ");
			for(j=0; j<m; j++){
				a[i][j] = Integer.parseInt(input[j]);
			}
		}
		// b行を入力
		for(i=0; i<m; i++){
			str = scan.nextLine();
			b[i] = Integer.parseInt(str);
		}


		// 行列計算（ループか？）
		for(i=0; i<n; i++){
			for(j=0; j<m; j++){
				c[i] = c[i] + (a[i][j] * b[j]);
			}
			System.out.println(c[i]);
		}

	}
}
