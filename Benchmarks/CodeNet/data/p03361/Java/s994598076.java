import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

    	// ファイルからの読み込み
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in), 1);
		String strStdIn = in.readLine();


		// 行と列を取得
		int H = Integer.parseInt(strStdIn.split(" ")[0]);
		int W = Integer.parseInt(strStdIn.split(" ")[1]);

		// キャンバスを保持する配列を生成
		char[][] table = new char[W+2][H+2];


		// キャンバスを.で初期化
		for(int i = 0; i <= H+1; i++) {
			for(int j = 0; j <= W+1; j++) {
				table[i][j] = '.';
			}
		}

		// 標準入力から読み込んだ値をキャンバスに設定
		int row = 0;

		while(in.ready()){
			row++;
			strStdIn = in.readLine();
			for (int j = 1; j <= W; j++) {
				table[row][j] = strStdIn.charAt(j-1);
			}
		}

		// キャンバス描画
		for(int i = 1; i <= H; i++) {
			for(int j = 1; j <= W; j++) {
				if (table[i][j] == '#') {
					if (table[i-1][j] == '.' && table[i+1][j] == '.' && table[i][j-1] == '.' && table[i][j+1] == '.') {
						System.out.println("No");
						return;
					}
				}
			}
		}
		System.out.println("Yes");
    }
}