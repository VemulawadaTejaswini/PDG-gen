import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0, diffValue;
		int number = sc.nextInt();
		//探す文字
		String seekChara = sc.next();
		char chr[][] = new char[number][100];
		
		int numberOfChara [] = new int [number];
		String signboard [] = new String [number];
		//それぞれの看板の文字を保存
		for (int i = 0; i < number; i++) {
			signboard[i] = sc.next();
		}
		//ぞれぞれの看板の文字列数を保存
		for (int i = 0; i < number; i++) {
			numberOfChara[i] = signboard[i].length();
		}
		
		//看板の数だけ繰り返す
		for (int nowBoard = 0; nowBoard < number; nowBoard++) {
			//インデックス格納用
			boolean index [][] = new boolean [seekChara.length()][numberOfChara[nowBoard]];
			
			//合致する文字の場所をインデックスとして保存
			for (int i = 0; i < seekChara.length(); i++) {
				for (int j = 0; j < numberOfChara[nowBoard]; j++) {
					//i番目の文字が看板のj番目の文字と同じならインデックスのi,j番目をtrueに、違うならfalseに
					if (signboard[nowBoard].substring(j, j + 1).equals(seekChara.substring(i, i + 1))) {
						index[i][j] = true;
					}else {
						index[i][j] = false;
					}
				}
			}
			//確認用
			/*
			for (int i = 0; i < seekChara.length(); i++) {
				for (int j = 0; j < numberOfChara[nowBoard]; j++) {
					if (index[i][j]) {
						System.out.printf("1");
					}else {
						System.out.printf("0");
					}
					
				}
				System.out.println();
			}*/
			
			boolean flag = false;
			//インデックスを比較し、すべての文字の間隔が同じ看板があれば数える
			for (int i = 0; i < numberOfChara[nowBoard] && !flag; i++) {
				//最初の文字の場所を見つけたら
				if (index[0][i]) {
					for (int j = 0; j < numberOfChara[nowBoard] && !flag; j++) {
						if (index[1][j] && j > i) {
							diffValue = j - i;
							//この差を残りの文字列でも探す
							flag = seekEqualDiffer(2, j, diffValue, index, seekChara.length(), numberOfChara[nowBoard]);
						}
					}
				}
			}
			//trueならカウント
			if (flag) {
				count++;
			}
			flag = false;
		}
		System.out.println(count);
	}
	
	/*差が同じものを再帰で探していく
	*最後まであればtrueを、なければflaseを返す
	文字番号k開始点j文字差diffValue該当文字かどうかindex配列の長さnumberとnumberOfChara
	*/
	static boolean seekEqualDiffer(int k, int j, int diffValue, boolean index[][], int number, int numberOfChara){
		for (int p = j + 1; p < numberOfChara && k < number; p++) {
			if (index[k][p] && p - j == diffValue) {
				if (k < number - 1) {
					return seekEqualDiffer(k + 1, p , diffValue, index, number, numberOfChara);
				}else {
					return true;
				}	
			}
		}
		return false;
	}
}