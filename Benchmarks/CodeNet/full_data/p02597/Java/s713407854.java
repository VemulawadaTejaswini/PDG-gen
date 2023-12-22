import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//
		// 入力
		//
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] cArray = sc.next().toCharArray();

		//
		// 処理
		// WRを無くす最短操作を求める
		// 左からWを見つける
		// 見つかったら右からRを見つける（場所はセーブしておくこと）
		// WとRをswap
		// 操作数 countをインクリメント
		//
		// テスト
		// 3
		// RRR
		// 3
		// WWW
		// 6
		// RRRWWW
		// 6
		// WWWRRR
		// 8
		// WRWWRWRR
		// 9
		// RWWRWRRWW
		//
		int count = 0;
		int j_save = N - 1;
		outside: for(int i = 0; i < j_save; i++) {
			// 左からWを探す
			if(cArray[i] == 'W') {
				for(int j = j_save; j >= i; j--) { // あえてj=iを実施
					// 右からRを探す
					if(cArray[j] == 'R') {
						swap(cArray, i, j);
						count++;
						j_save = j;
						break;
					}

					if(j==i) {
						// 多重ループ抜ける
						break outside;
					}
				}
			}
		}

		System.out.println(count);
	}

	public static void swap(char[] cArray, int i, int j) {
		char tmp = cArray[i];
		cArray[i] = cArray[j];
		cArray[j] = tmp;
	}

}
