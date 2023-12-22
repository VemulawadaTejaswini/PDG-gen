import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		//	Scanner sc = new Scanner(System.in);//入力
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		//渡される定数
		String[] Aandb = (input.readLine()).split("\\s");//入力数値をスペース前後で分割
		int n = Integer.parseInt(Aandb[0]);//配列n(前)
		int m = Integer.parseInt(Aandb[1]);//配列m(後)

		//CはAとbの掛け算
		//for(int i =1;i<m;i++){
		//C +=A*b}

		//n*mである行列Aの計算
		int[][] A = new int[n][m];//Aの要素nとm
		String[] z = null; //実行データ用　文字列として使っているため0でなくnull
		for (int i = 0; i < n; i++) {//nのループ
			z = (input.readLine()).split("\\s");//入力を半角スペースで分轄
			for (int j = 0; j < m; j++) {//mのループ
				A[i][j] = Integer.parseInt(z[j]);//文字列から数値に変換
			}
		}

		//m*1であるベクトルbの計算
		int[] b = new int[m];//bの要素m
		for (int k = 0; k < m; k++) {
			b[k] = Integer.parseInt(input.readLine());//文字列から数値に変換

		}

		//A*bの積C
		for (int l = 0; l < n; l++) {
			int C = 0;//合計の初期化
			for (int s = 0; s < m; s++){
				C += (A[l][s] * b[s]);
			}
			System.out.println(C);//出力
		}
	}
}
